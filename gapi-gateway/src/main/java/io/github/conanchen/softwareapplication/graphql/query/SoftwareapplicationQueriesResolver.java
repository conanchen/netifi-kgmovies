package io.github.conanchen.softwareapplication.graphql.query;

import com.google.common.collect.Lists;
import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.relay.Connection;
import graphql.relay.SimpleListConnection;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.softwareapplication.graphql.api.Query;
import io.github.conanchen.softwareapplication.graphql.model.*;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class SoftwareapplicationQueriesResolver implements Query, GraphQLQueryResolver {


    @Override
    public Connection<SoftwareApplicationGQO> softwareapplicationSearch(String after, Integer first, String before, Integer last, DataFetchingEnvironment env) {
        SoftwareApplicationGQO sw1 = SoftwareApplicationGQO.builder().id("id1").name("swname1").downloadUrl("https://www.baidu.com/111.zip").build();
        SoftwareApplicationGQO sw2 = SoftwareApplicationGQO.builder().id("id2").name("swname2").downloadUrl("https://www.baidu.com/112.zip").build();
        SoftwareApplicationGQO sw3 = SoftwareApplicationGQO.builder().id("id3").name("swname3").downloadUrl("https://www.baidu.com/113.zip").build();
        SoftwareApplicationGQO sw4 = SoftwareApplicationGQO.builder().id("id4").name("swname4").downloadUrl("https://www.baidu.com/114.zip").isMiniAppOf(sw1).build();
        SoftwareApplicationGQO sw5 = SoftwareApplicationGQO.builder().id("id5").name("swname5").downloadUrl("https://www.baidu.com/115.zip").isMiniAppOf(sw1).build();
        SoftwareApplicationGQO sw6 = SoftwareApplicationGQO.builder().id("id6").name("swname6").downloadUrl("https://www.baidu.com/116.zip").isMiniAppOf(sw1).build();

        sw1.setHasMiniApps(Lists.newArrayList(sw4, sw5, sw6));

        return new SimpleListConnection<SoftwareApplicationGQO>(
                Lists.newArrayList(
                        sw1, sw2, sw3, sw4, sw5, sw6
                )
        ).get(env);
    }

    @Override
    public SoftwareApplicationGQO softwareapplicationFind(String id, String softwareApplicationID, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public WebhookGQO webhookFind(String id, String webhookID, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public Connection<WebhookGQO> webhookSearch(WebhookFilterGQO filter, WebhookOrderGQO order, Integer first, Integer offset, DataFetchingEnvironment env) {
        return null;
    }
}