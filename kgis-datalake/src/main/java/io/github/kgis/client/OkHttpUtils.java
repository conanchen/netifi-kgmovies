package io.github.kgis.client;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.*;


public class OkHttpUtils {
    public static long CONNECTTIMEOUT = 10;
    public static long READTIMEOUT = 10;
    public static long WRITETIMEOUT = 10;

    private OkHttpUtils() {
        if (client == null) {
            client = new OkHttpClient.Builder()
                    .connectTimeout(CONNECTTIMEOUT, TimeUnit.SECONDS)
                    .readTimeout(READTIMEOUT, TimeUnit.SECONDS)
                    .writeTimeout(WRITETIMEOUT, TimeUnit.SECONDS)
                    .build();
        }
    }

    private static OkHttpClient defaultClient() {
        return new OkHttpClient.Builder()
                .connectTimeout(CONNECTTIMEOUT, TimeUnit.SECONDS)
                .readTimeout(READTIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(WRITETIMEOUT, TimeUnit.SECONDS)
                .build();
    }


    private static OkHttpClient client;

    private static final OkHttpUtils instance = new OkHttpUtils();

    public static OkHttpUtils getInstance() {
        return instance;
    }

    public void setClient(OkHttpClient client) {
        this.client = client;
    }

    public static void doGet(Map<String, String> headers, String url, Callback callback) {
        Request.Builder request = new Request.Builder();
        if (headers != null) {
            for (String k : headers.keySet()) {
                request.addHeader(k, headers.get(k));
            }
        }

        //创建Request
        request.url(url);
        //得到Call对象
        Call call = client.newCall(request.build());
        //执行异步请求
        call.enqueue(callback);
    }


    public static void doPost(
            Map<String, String> headers,
            String url,
            Map<String, String> params,
            Callback callback) {
        Request.Builder request = new Request.Builder();
        if (headers != null) {
            for (String k : headers.keySet()) {
                request.addHeader(k, headers.get(k));
            }
        }
        request.url(url);

        FormBody.Builder builder = new FormBody.Builder();

        for (String key : params.keySet()) {
            builder.add(key, params.get(key));
        }
        request.post(builder.build());
        if (client == null) {
            client = defaultClient();
        }
        client.newCall(request.build()).enqueue(callback);
    }


    public static void doRequestBody(
            Map<String, String> headers,
            String url,
            String body,
            Callback callback) {
        Request.Builder request = new Request.Builder();
        if (headers != null) {
            for (String k : headers.keySet()) {
                request.addHeader(k, headers.get(k));
            }
        }
        request.url(url);
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), body);
        request.post(requestBody);
        if (client == null) {
            client = defaultClient();
        }
        client.newCall(request.build()).enqueue(callback);
    }

    public static Response doRequestBody(
            Map<String, String> headers,
            String url,
            String body) throws IOException {
        Request.Builder request = new Request.Builder();
        if (headers != null) {
            for (String k : headers.keySet()) {
                request.addHeader(k, headers.get(k));
            }
        }
        request.url(url);
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), body);
        request.post(requestBody);
        if (client == null) {
            client = defaultClient();
        }

        return client.newCall(request.build()).execute();
    }
}