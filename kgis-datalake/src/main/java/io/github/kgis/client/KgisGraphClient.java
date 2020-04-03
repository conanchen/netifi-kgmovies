package io.github.kgis.client;


import io.github.kgis.graphql.*;
import okhttp3.OkHttpClient;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Map;

import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;


public class KgisGraphClient {
    private HttpResponseParser httpResponseParser;

    private KgisGraphClient() {
        httpResponseParser = new HttpResponseParser();
    }

    private String url;
    private Map<String, String> headers;
    private OkHttpClient okHttpClient;

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private static KgisGraphClient kgisGraphClient;

        private Builder() {
            kgisGraphClient = new KgisGraphClient();
        }

        public Builder setUrl(String url) {
            kgisGraphClient.url = url;
            return this;
        }

        public Builder setHttpClient(OkHttpClient client) {
            kgisGraphClient.okHttpClient = client;
            OkHttpUtils.getInstance().setClient(client);
            return this;
        }

        public Builder setHeaders(Map<String, String> headers) {
            kgisGraphClient.headers = headers;
            return this;
        }

        public KgisGraphClient build() {
            return kgisGraphClient;
        }
    }


    public Single<QueryRoot> queryGraph(final QueryRootQuery queryRootQuery) {

        return Single.create(new SingleOnSubscribe<QueryRoot>() {
            @Override
            public void subscribe(final SingleEmitter<QueryRoot> singleEmitter) throws Exception {

                String queryString = queryRootQuery.toString();
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("query", queryString);

                OkHttpUtils.doRequestBody(headers, url, jsonObject.toString(), new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        singleEmitter.onError(e);
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        try {
                            QueryRoot root = httpResponseParser.parseQueryRoot(response);
                            singleEmitter.onSuccess(root);
                        } catch (Exception e) {
                            e.printStackTrace();
                            singleEmitter.onError(e);
                        }
                    }
                });
            }
        });
    }

    public QueryRoot queryGraphSynchronize(final QueryRootQuery queryRootQuery) throws Exception {
        String queryString = queryRootQuery.toString();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("query", queryString);
        Response response = OkHttpUtils.doRequestBody(headers, url, jsonObject.toString());
        return httpResponseParser.parseQueryRoot(response);

    }

    public Mutation mutateGraphSynchronize(MutationQuery mutationQuery) throws Exception {
        String queryString = mutationQuery.toString();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("query", queryString);
        Response response = OkHttpUtils.doRequestBody(headers, url, jsonObject.toString());
        return httpResponseParser.parseMutation(response);
    }

    public Single<Mutation> mutateGraph(MutationQuery mutationQuery) {
        return Single.create(new SingleOnSubscribe<Mutation>() {
            @Override
            public void subscribe(SingleEmitter<Mutation> singleEmitter) throws Exception {

                String queryString = mutationQuery.toString();
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("query", queryString);

                OkHttpUtils.doRequestBody(headers, url, jsonObject.toString(), new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        singleEmitter.onError(e);
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {

                        try {
                            Mutation mutation = httpResponseParser.parseMutation(response);
                            singleEmitter.onSuccess(mutation);
                        } catch (Exception e) {
                            e.printStackTrace();
                            singleEmitter.onError(e);
                        }
                    }
                });
            }
        });
    }
}
