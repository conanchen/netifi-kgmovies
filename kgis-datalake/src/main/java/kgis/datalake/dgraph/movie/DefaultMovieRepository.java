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
package kgis.datalake.dgraph.movie;

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
import kgis.datalake.movie.protobuf.MovieInfoRequest;
import kgis.datalake.movie.protobuf.MovieInfoResponse;
import kgis.datalake.movie.protobuf.MovieRepository;
import reactor.core.publisher.Mono;


@Component
public class DefaultMovieRepository implements MovieRepository {
	private static final Random RAND = new Random(System.currentTimeMillis());
	
	@Autowired
	DgraphClient dgraphClient;
	

	@Override
	public Mono<MovieInfoResponse> getMovieInfo(final MovieInfoRequest message, final ByteBuf metadata) {
		ByteString resJson = dgraphClient.newReadOnlyTransaction().query(queryForPerson).getJson();
		
		// Query
		String query ="query all($a: string){\n" + "all(func: eq(name, $a)) {\n" + "    name\n" + "  }\n" + "}";
		Map<String, String> vars = Collections.singletonMap("$a", "Alice");
		Response res = dgraphClient.newTransaction().queryWithVars(query, vars);

		Gson gson = new Gson(); // For JSON encode/decode
		// Deserialize
		People ppl = gson.fromJson(res.getJson().toStringUtf8(), People.class);
  
		return  Mono.just( MovieInfoResponse.newBuilder().setJson(resJson).build());
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

