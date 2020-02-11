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
package acmeshoes.service.product.service;

import java.time.Duration;
import java.util.function.Function;
import com.netifi.spring.core.annotation.Group;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import acmeshoes.service.product.data.ProductRepositoryLocal;
import acmeshoes.service.product.data.model.Product;
import acmeshoes.service.product.service.error.ProductNotFoundException;
import kgis.datalake.product.protobuf.ProductInfoRequest;
import kgis.datalake.product.protobuf.ProductInfoResponse;
import kgis.datalake.product.protobuf.ProductRepositoryClient;
import reactor.core.publisher.Mono;

/**
 * Service that retrieves product information.
 */
@Service
public class ProductReposervice {
    private static final Logger LOG = LoggerFactory.getLogger(ProductReposervice.class);

    @Autowired
    private ProductRepositoryLocal repo;

    @Group("kgis.datalake")
    private ProductRepositoryClient productRepositoryClient;

    public Mono<Product> getProduct(String productId) {
        Mono<ProductInfoResponse >pir1 =   productRepositoryClient.getProductInfo(ProductInfoRequest.newBuilder().setProductId("001").build());

        Mono<Product> prd =  repo.findOne(productId)
        // .zipWith(pir1,(product,pir)->{ 
        //     if (product!=null && pir !=null){
        //         product.setDescription(product.getDescription()+pir.getDescription());
        //     }
        //     return product;
        // })
        .switchIfEmpty(Mono.error(new ProductNotFoundException(productId)));

        Mono<Product> p2=  Mono.zip(pir1,prd).map(
            objects->{
                ProductInfoResponse pi = objects.getT1();
                Product p = objects.getT2();
                p.setDescription(p.getDescription()+pi.getDescription());
            return p;
        });
        return p2;

    }
}
