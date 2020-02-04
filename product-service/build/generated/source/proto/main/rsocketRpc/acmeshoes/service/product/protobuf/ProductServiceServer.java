package acmeshoes.service.product.protobuf;

@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler",
    comments = "Source: acmeshoes.service.product/product-service.proto")
@io.rsocket.rpc.annotations.internal.Generated(
    type = io.rsocket.rpc.annotations.internal.ResourceType.SERVICE,
    idlClass = ProductService.class)
@javax.inject.Named(
    value ="ProductServiceServer")
public final class ProductServiceServer extends io.rsocket.rpc.AbstractRSocketService {
  private final ProductService service;
  private final io.opentracing.Tracer tracer;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>> getProductInfo;
  private final java.util.function.Function<io.opentracing.SpanContext, java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>>> getProductInfoTrace;
  @javax.inject.Inject
  public ProductServiceServer(ProductService service, java.util.Optional<io.micrometer.core.instrument.MeterRegistry> registry, java.util.Optional<io.opentracing.Tracer> tracer) {
    this.service = service;
    if (!registry.isPresent()) {
      this.getProductInfo = java.util.function.Function.identity();
    } else {
      this.getProductInfo = io.rsocket.rpc.metrics.Metrics.timed(registry.get(), "rsocket.server", "service", ProductService.SERVICE, "method", ProductService.METHOD_GET_PRODUCT_INFO);
    }

    if (!tracer.isPresent()) {
      this.tracer = null;
      this.getProductInfoTrace = (ignored) -> java.util.function.Function.identity();
    } else {
      this.tracer = tracer.get();
      this.getProductInfoTrace = io.rsocket.rpc.tracing.Tracing.traceAsChild(this.tracer, ProductService.METHOD_GET_PRODUCT_INFO, io.rsocket.rpc.tracing.Tag.of("rsocket.service", ProductService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "server"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    }

  }

  @java.lang.Override
  public String getService() {
    return ProductService.SERVICE;
  }

  @java.lang.Override
  public Class<?> getServiceClass() {
    return service.getClass();
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Void> fireAndForget(io.rsocket.Payload payload) {
    return reactor.core.publisher.Mono.error(new UnsupportedOperationException("Fire and forget not implemented."));
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<io.rsocket.Payload> requestResponse(io.rsocket.Payload payload) {
    try {
      io.netty.buffer.ByteBuf metadata = payload.sliceMetadata();
      io.opentracing.SpanContext spanContext = io.rsocket.rpc.tracing.Tracing.deserializeTracingMetadata(tracer, metadata);
      switch(io.rsocket.rpc.frames.Metadata.getMethod(metadata)) {
        case ProductService.METHOD_GET_PRODUCT_INFO: {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          return service.getProductInfo(acmeshoes.service.product.protobuf.ProductInfoRequest.parseFrom(is), metadata).map(serializer).transform(getProductInfo).transform(getProductInfoTrace.apply(spanContext));
        }
        default: {
          return reactor.core.publisher.Mono.error(new UnsupportedOperationException());
        }
      }
    } catch (Throwable t) {
      return reactor.core.publisher.Mono.error(t);
    } finally {
      payload.release();
    }
  }

  @java.lang.Override
  public reactor.core.publisher.Flux<io.rsocket.Payload> requestStream(io.rsocket.Payload payload) {
    return reactor.core.publisher.Flux.error(new UnsupportedOperationException("Request-Stream not implemented."));
  }

  @java.lang.Override
  public reactor.core.publisher.Flux<io.rsocket.Payload> requestChannel(io.rsocket.Payload payload, reactor.core.publisher.Flux<io.rsocket.Payload> publisher) {
    return reactor.core.publisher.Flux.error(new UnsupportedOperationException("Request-Channel not implemented."));
  }

  @java.lang.Override
  public reactor.core.publisher.Flux<io.rsocket.Payload> requestChannel(org.reactivestreams.Publisher<io.rsocket.Payload> payloads) {
    return reactor.core.publisher.Flux.error(new UnsupportedOperationException("Request-Channel not implemented."));
  }

  private static final java.util.function.Function<com.google.protobuf.MessageLite, io.rsocket.Payload> serializer =
    new java.util.function.Function<com.google.protobuf.MessageLite, io.rsocket.Payload>() {
      @java.lang.Override
      public io.rsocket.Payload apply(com.google.protobuf.MessageLite message) {
        int length = message.getSerializedSize();
        io.netty.buffer.ByteBuf byteBuf = io.netty.buffer.ByteBufAllocator.DEFAULT.buffer(length);
        try {
          message.writeTo(com.google.protobuf.CodedOutputStream.newInstance(byteBuf.internalNioBuffer(0, length)));
          byteBuf.writerIndex(length);
          return io.rsocket.util.ByteBufPayload.create(byteBuf);
        } catch (Throwable t) {
          byteBuf.release();
          throw new RuntimeException(t);
        }
      }
    };

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
