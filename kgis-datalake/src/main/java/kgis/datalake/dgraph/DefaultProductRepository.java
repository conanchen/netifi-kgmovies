/**
 * Copyright 2019 Greg Whitaker
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package kgis.datalake.dgraph;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import com.google.gson.Gson;
import com.google.protobuf.ByteString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import io.dgraph.DgraphClient;
import io.dgraph.DgraphProto.Response;
import io.netty.buffer.ByteBuf;
import kgis.datalake.product.protobuf.ProductInfoRequest;
import kgis.datalake.product.protobuf.ProductInfoResponse;
import kgis.datalake.product.protobuf.ProductRepository;
import reactor.core.publisher.Mono;

@Component
public class DefaultProductRepository implements ProductRepository {
    private static final Random RAND = new Random(System.currentTimeMillis());

	@Autowired
	DgraphClient dgraphClient;
	
	@Override
	public Mono<ProductInfoResponse> getProductInfo(ProductInfoRequest message, ByteBuf metadata) {
		// ByteString resJson = dgraphClient.newReadOnlyTransaction().query(queryForPerson).getJson();
		ByteString resJson = ByteString.EMPTY;
		
		// Query
		String query ="query all($a: string){\n" + "all(func: eq(name, $a)) {\n" + "    name\n" + "  }\n" + "}";
		Map<String, String> vars = Collections.singletonMap("$a", "Alice");
		Response res = dgraphClient.newTransaction().queryWithVars(query, vars);

		Gson gson = new Gson(); // For JSON encode/decode
		// Deserialize
		People ppl = gson.fromJson(res.getJson().toStringUtf8(), People.class);
  
		
		return  Mono.just(ProductInfoResponse.newBuilder()
		.setProductId(message.getProductId())
		.setDescription(String.format("Product[%s] Description From [%s] and resJson [%s]", message.getProductId(), this.getClass().getName(),resJson.toString()))
		.setJson(resJson).build());
	}

	private static String queryForPerson =
		"{ \n" +
			"everyone(func: anyofterms(name, \"Michael Catalina\")) { \n" +
			"name\n" +
			"uid\n" +
			"}\n" +
		"}";

	static class Person {
		String name;

		Person() {}
	}
	
	static class People {
		List<Person> all;

		People() {}
	}

    
}
