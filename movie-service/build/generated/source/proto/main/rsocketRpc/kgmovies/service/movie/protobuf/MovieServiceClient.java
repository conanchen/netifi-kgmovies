package kgmovies.service.movie.protobuf;

@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler",
    comments = "Source: kgmovies.service.movie/movie-service.proto")
@io.rsocket.rpc.annotations.internal.Generated(
    type = io.rsocket.rpc.annotations.internal.ResourceType.CLIENT,
    idlClass = MovieService.class)
public final class MovieServiceClient implements MovieService {
  private final io.rsocket.RSocket rSocket;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<kgmovies.service.movie.protobuf.MovieInfoResponse>, ? extends org.reactivestreams.Publisher<kgmovies.service.movie.protobuf.MovieInfoResponse>> getMovieInfo;
  private final java.util.function.Function<java.util.Map<String, String>, java.util.function.Function<? super org.reactivestreams.Publisher<kgmovies.service.movie.protobuf.MovieInfoResponse>, ? extends org.reactivestreams.Publisher<kgmovies.service.movie.protobuf.MovieInfoResponse>>> getMovieInfoTrace;

  public MovieServiceClient(io.rsocket.RSocket rSocket) {
    this.rSocket = rSocket;
    this.getMovieInfo = java.util.function.Function.identity();
    this.getMovieInfoTrace = io.rsocket.rpc.tracing.Tracing.trace();
  }

  public MovieServiceClient(io.rsocket.RSocket rSocket, io.micrometer.core.instrument.MeterRegistry registry) {
    this.rSocket = rSocket;
    this.getMovieInfo = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", MovieService.SERVICE, "method", MovieService.METHOD_GET_MOVIE_INFO);
    this.getMovieInfoTrace = io.rsocket.rpc.tracing.Tracing.trace();
  }


  public MovieServiceClient(io.rsocket.RSocket rSocket, io.opentracing.Tracer tracer) {
    this.rSocket = rSocket;
    this.getMovieInfo = java.util.function.Function.identity();
    this.getMovieInfoTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, MovieService.METHOD_GET_MOVIE_INFO, io.rsocket.rpc.tracing.Tag.of("rsocket.service", MovieService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
  }


  public MovieServiceClient(io.rsocket.RSocket rSocket, io.micrometer.core.instrument.MeterRegistry registry, io.opentracing.Tracer tracer) {
    this.rSocket = rSocket;
    this.getMovieInfo = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", MovieService.SERVICE, "method", MovieService.METHOD_GET_MOVIE_INFO);
    this.getMovieInfoTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, MovieService.METHOD_GET_MOVIE_INFO, io.rsocket.rpc.tracing.Tag.of("rsocket.service", MovieService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = kgmovies.service.movie.protobuf.MovieInfoResponse.class)
  public reactor.core.publisher.Mono<kgmovies.service.movie.protobuf.MovieInfoResponse> getMovieInfo(kgmovies.service.movie.protobuf.MovieInfoRequest message) {
    return getMovieInfo(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = kgmovies.service.movie.protobuf.MovieInfoResponse.class)
  public reactor.core.publisher.Mono<kgmovies.service.movie.protobuf.MovieInfoResponse> getMovieInfo(kgmovies.service.movie.protobuf.MovieInfoRequest message, io.netty.buffer.ByteBuf metadata) {
  java.util.Map<String, String> map = new java.util.HashMap<>();
    return reactor.core.publisher.Mono.defer(new java.util.function.Supplier<reactor.core.publisher.Mono<io.rsocket.Payload>>() {
      @java.lang.Override
      public reactor.core.publisher.Mono<io.rsocket.Payload> get() {
        final io.netty.buffer.ByteBuf data = serialize(message);
        final io.netty.buffer.ByteBuf tracing = io.rsocket.rpc.tracing.Tracing.mapToByteBuf(io.netty.buffer.ByteBufAllocator.DEFAULT, map);
        final io.netty.buffer.ByteBuf metadataBuf = io.rsocket.rpc.frames.Metadata.encode(io.netty.buffer.ByteBufAllocator.DEFAULT, MovieService.SERVICE, MovieService.METHOD_GET_MOVIE_INFO, tracing, metadata);
        tracing.release();
        metadata.release();
        return rSocket.requestResponse(io.rsocket.util.ByteBufPayload.create(data, metadataBuf));
      }
    }).map(deserializer(kgmovies.service.movie.protobuf.MovieInfoResponse.parser())).transform(getMovieInfo).transform(getMovieInfoTrace.apply(map));
  }

  private static io.netty.buffer.ByteBuf serialize(final com.google.protobuf.MessageLite message) {
    int length = message.getSerializedSize();
    io.netty.buffer.ByteBuf byteBuf = io.netty.buffer.ByteBufAllocator.DEFAULT.buffer(length);
    try {
      message.writeTo(com.google.protobuf.CodedOutputStream.newInstance(byteBuf.internalNioBuffer(0, length)));
      byteBuf.writerIndex(length);
      return byteBuf;
    } catch (Throwable t) {
      byteBuf.release();
      throw new RuntimeException(t);
    }
  }

  private static <T> java.util.function.Function<io.rsocket.Payload, T> deserializer(final com.google.protobuf.Parser<T> parser) {
    return new java.util.function.Function<io.rsocket.Payload, T>() {
      @java.lang.Override
      public T apply(io.rsocket.Payload payload) {
        try {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          return parser.parseFrom(is);
        } catch (Throwable t) {
          throw new RuntimeException(t);
        } finally {
          payload.release();
        }
      }
    };
  }
}
