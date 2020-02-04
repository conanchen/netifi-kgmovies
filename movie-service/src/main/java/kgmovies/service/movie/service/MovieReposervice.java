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

import kgmovies.service.movie.data.MovieRepository;
import kgmovies.service.movie.data.model.Movie;
import kgmovies.service.movie.service.error.MovieNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * Service that retrieves movie information.
 */
@Service
public class MovieReposervice {
    private static final Logger LOG = LoggerFactory.getLogger(MovieReposervice.class);

    @Autowired
    private MovieRepository repo;

    public Mono<Movie> getMovie(String movieId) {
        return repo.findOne(movieId)
                .switchIfEmpty(Mono.error(new MovieNotFoundException(movieId)));
    }
}
