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
package kgmovies.service.movie.service.error;

/**
 * Exception thrown when a movie cannot be found.
 */
public class MovieNotFoundException extends RuntimeException {

    private String movieId;

    public MovieNotFoundException(final String movieId) {
        super("Movie not found: " + movieId);
    }

    public String getMovieId() {
        return movieId;
    }
}
