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

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.dgraph.DgraphClient;
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
		// TODO Auto-generated method stub
		return null;
	}

    
}
