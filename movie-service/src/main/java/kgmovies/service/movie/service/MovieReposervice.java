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
package kgmovies.service.movie.service;

import com.netifi.spring.core.annotation.Group;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.github.kgis.datalake.movie.protobuf.MovieRepositoryClient;
import kgmovies.service.movie.data.MovieRepositoryLocal;
import kgmovies.service.movie.data.model.Movie;
import kgmovies.service.movie.service.error.MovieNotFoundException;
import reactor.core.publisher.Mono;

/**
 * Service that retrieves movie information.
 */
@Service
public class MovieReposervice {
    private static final Logger LOG = LoggerFactory.getLogger(MovieReposervice.class);

    @Autowired
    private MovieRepositoryLocal repo;

    @Group("io.github.kgis.datalake")
    private MovieRepositoryClient movieRepositoryClient;


    public Mono<Movie> getMovie(final String movieId) {
        return repo.findOne(movieId)
                .switchIfEmpty(Mono.error(new MovieNotFoundException(movieId)));
    }
}
