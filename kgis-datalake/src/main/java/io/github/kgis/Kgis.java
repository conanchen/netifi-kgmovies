package io.github.kgis;

import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.ApolloPrefetch;
import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.response.CustomTypeAdapter;
import com.apollographql.apollo.response.CustomTypeValue;
import com.apollographql.apollo.rx2.Rx2Apollo;
import com.google.common.base.Optional;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.github.kgis.dgraph.UserQuery;
import io.reactivex.Completable;
import io.reactivex.Observable;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import org.apache.logging.log4j.util.Strings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class Kgis {

    private static final int ASYNC_COMMAND_EXECUTOR_THREADS = 3;
    private static String serverUrl = "http://localhost:8080/graphql";
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    private static CustomTypeAdapter<Date> dateCustomTypeAdapter = new CustomTypeAdapter<Date>() {
        @Override
        public Date decode(CustomTypeValue value) {
            try {
                return DATE_FORMAT.parse(value.value.toString());
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public CustomTypeValue encode(Date value) {
            return new CustomTypeValue.GraphQLString(DATE_FORMAT.format(value));
        }
    };
    private static final ThreadFactory threadFactory = new ThreadFactoryBuilder()
            .setDaemon(true)
            .setNameFormat("async-command-executor-thread-%d")
            .build();
    private static final ExecutorService asyncCommandExecutorService =
            Executors.newFixedThreadPool(ASYNC_COMMAND_EXECUTOR_THREADS, threadFactory);

    private final static ApolloClient apolloClient = ApolloClient.builder()
            .serverUrl(serverUrl)
            .okHttpClient(new OkHttpClient.Builder().dispatcher(new Dispatcher(asyncCommandExecutorService)).build())
//            .addCustomTypeAdapter(CustomType.DATE, dateCustomTypeAdapter)
            .build();

    public static ApolloClient getApolloClient() {
        return apolloClient;
    }

    public static ImmutableList<String> users() {
        //Create a query object
        UserQuery query = UserQuery.builder().first(10).build();
        ApolloCall<UserQuery.Data> apolloCall = apolloClient.query(query);

        Observable<Response<UserQuery.Data>> observable2 = Rx2Apollo.from(apolloCall);
        ImmutableList<String> result = FluentIterable
                .from(new UserQuery.Data[]{observable2.blockingFirst().data()})

                .transform(d -> d.queryUser().get(0).username()).toList();
        return result;

    }
}
