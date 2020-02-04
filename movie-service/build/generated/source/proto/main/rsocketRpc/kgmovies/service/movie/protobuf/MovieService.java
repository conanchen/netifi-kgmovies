package kgmovies.service.movie.protobuf;

/**
 */
@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler",
    comments = "Source: kgmovies.service.movie/movie-service.proto")
public interface MovieService {
  String SERVICE = "kgmovies.service.movie.MovieService";
  String METHOD_GET_MOVIE_INFO = "GetMovieInfo";

  /**
   * <pre>
   * Gets movie information.
   * </pre>
   */
  reactor.core.publisher.Mono<kgmovies.service.movie.protobuf.MovieInfoResponse> getMovieInfo(kgmovies.service.movie.protobuf.MovieInfoRequest message, io.netty.buffer.ByteBuf metadata);
}
