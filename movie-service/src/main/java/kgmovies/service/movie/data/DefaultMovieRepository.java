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
package kgmovies.service.movie.data;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import kgmovies.service.movie.data.model.Movie;
import kgmovies.service.movie.data.model.Prices;
import kgmovies.service.movie.data.model.Sku;
import reactor.core.publisher.Mono;

@Component
public class DefaultMovieRepository implements MovieRepositoryLocal {
    private static final Random RAND = new Random(System.currentTimeMillis());

    private final Map<String, Movie> movieInfos = new HashMap<>();

    @PostConstruct
    public void init() {
        for (int i = 1; i <= 10; i++) {
            String movieId = String.format("%03d", i);

            Movie movieInfo = new Movie();
            movieInfo.setMovieId(movieId);
            movieInfo.setShortName("Simple Shoe " + i);
            movieInfo.setLongName("The Simple Shoe - " + i);
            movieInfo.setDescription(String.format("（数睿）This is some type of shoe - %s, that you can't live without!", i));
            movieInfo.setActive(true);

            for (int x = 0; x < 3; x++) {
                Prices priceInfo = new Prices();
                priceInfo.setSale(generateDummyPrice(10.0));
                priceInfo.setList(generateDummyPrice(priceInfo.getSale()));
                priceInfo.setMsrp(generateDummyPrice(priceInfo.getList()));

                Sku s = new Sku();
                s.setSku(movieId + "-" + String.format("%03d", x));
                s.setActive(true);

                if (x == 0) {
                    s.setSize("Small");
                } else if (x == 1) {
                    s.setSize("Medium");
                } else if (x == 2) {
                    s.setSize("Large");
                } else {
                    s.setSize("One-Size");
                }

                s.setPrices(priceInfo);

                movieInfo.addSkuInfo(s);
            }

            movieInfos.put(movieId, movieInfo);
        }
    }

    @Override
    public Mono<Movie> findOne(String movieId) {
        if (movieInfos.containsKey(movieId)) {
            return Mono.fromSupplier(() -> movieInfos.get(movieId));
        } else {
            return Mono.empty();
        }
    }

    private double generateDummyPrice(double min) {
        double randomValue = min + RAND.nextDouble();
        double tempRes = Math.floor(randomValue * 10) + 1;

        return tempRes/10;
    }
}
