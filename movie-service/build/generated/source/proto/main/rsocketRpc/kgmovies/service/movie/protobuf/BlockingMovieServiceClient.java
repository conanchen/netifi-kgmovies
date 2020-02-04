package kgmovies.service.movie.protobuf;

@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler (version 0.2.18)",
    comments = "Source: kgmovies.service.movie/movie-service.proto")
@io.rsocket.rpc.annotations.internal.Generated(
    type = io.rsocket.rpc.annotations.internal.ResourceType.CLIENT,
    idlClass = BlockingMovieService.class)
public final class BlockingMovieServiceClient implements BlockingMovieService {
  private final kgmovies.service.movie.protobuf.MovieServiceClient delegate;

  public BlockingMovieServiceClient(io.rsocket.RSocket rSocket) {
    this.delegate = new kgmovies.service.movie.protobuf.MovieServiceClient(rSocket);
  }

  public BlockingMovieServiceClient(io.rsocket.RSocket rSocket, io.micrometer.core.instrument.MeterRegistry registry) {
    this.delegate = new kgmovies.service.movie.protobuf.MovieServiceClient(rSocket, registry);
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = kgmovies.service.movie.protobuf.MovieInfoResponse.class)
  public kgmovies.service.movie.protobuf.MovieInfoResponse getMovieInfo(kgmovies.service.movie.protobuf.MovieInfoRequest message) {
    return getMovieInfo(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = kgmovies.service.movie.protobuf.MovieInfoResponse.class)
  public kgmovies.service.movie.protobuf.MovieInfoResponse getMovieInfo(kgmovies.service.movie.protobuf.MovieInfoRequest message, io.netty.buffer.ByteBuf metadata) {
    return delegate.getMovieInfo(message, metadata).block();
  }

}

