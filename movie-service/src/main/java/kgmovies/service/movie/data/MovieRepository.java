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

import kgmovies.service.movie.data.model.*;
import reactor.core.publisher.Mono;

/**
 * Repository that returns movie information.
 */
public interface MovieRepository {

    /**
     * Get movie information for a single movie.
     *
     * @param movieId movie id
     * @return movie information
     */
    Mono<Movie> findOne(String movieId);
}
