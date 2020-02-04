package kgmovies.service.movie.protobuf;

/**
 */
@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler (version 0.2.18)",
    comments = "Source: kgmovies.service.movie/movie-service.proto")
public interface BlockingMovieService {
  String SERVICE_ID = "kgmovies.service.movie.MovieService";
  String METHOD_GET_MOVIE_INFO = "GetMovieInfo";

  /**
   * <pre>
   * Gets movie information.
   * </pre>
   */
  kgmovies.service.movie.protobuf.MovieInfoResponse getMovieInfo(kgmovies.service.movie.protobuf.MovieInfoRequest message, io.netty.buffer.ByteBuf metadata);
}
