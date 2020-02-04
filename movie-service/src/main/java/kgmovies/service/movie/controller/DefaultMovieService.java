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
package kgmovies.service.movie.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kgmovies.service.movie.protobuf.PriceInfo;
import kgmovies.service.movie.protobuf.SkuInfo;
import io.netty.buffer.ByteBuf;
import kgmovies.service.movie.protobuf.MovieInfoRequest;
import kgmovies.service.movie.protobuf.MovieInfoResponse;
import kgmovies.service.movie.protobuf.MovieService;
import kgmovies.service.movie.service.MovieReposervice;
import reactor.core.publisher.Mono;

/**
 * Movie Service implmentation responsible for returning movie information.
 */
@Component
public class DefaultMovieService implements MovieService {

    @Autowired
    private MovieReposervice ps;
    

    @Override
    public Mono<MovieInfoResponse> getMovieInfo(MovieInfoRequest message, ByteBuf metadata) {
        return ps.getMovie(message.getMovieId())
                .map(movieInfo -> {
                    List<SkuInfo> skuInfos = new ArrayList<>();
                    movieInfo.getSkus().forEach(si -> skuInfos.add(SkuInfo.newBuilder()
                            .setSku(si.getSku())
                            .setActive(si.isActive())
                            .setSize(si.getSize())
                            .setPrices(PriceInfo.newBuilder()
                                    .setList(si.getPrices().getList())
                                    .setMsrp(si.getPrices().getMsrp())
                                    .setSale(si.getPrices().getSale())
                                    .setFormattedList(si.getPrices().getFormattedList())
                                    .setFormattedMsrp(si.getPrices().getFormattedMsrp())
                                    .setFormattedSale(si.getPrices().getFormattedSale())
                                    .build())
                            .build()));

                    return MovieInfoResponse.newBuilder()
                            .setMovieId(movieInfo.getMovieId())
                            .setShortName(movieInfo.getShortName())
                            .setLongName(movieInfo.getLongName())
                            .setActive(movieInfo.isActive())
                            .setDescription(String.format("%s From %s",movieInfo.getDescription(),DefaultMovieService.class.getName()))
                            .addAllSkus(skuInfos)
                            .build();
                });
    }
}
