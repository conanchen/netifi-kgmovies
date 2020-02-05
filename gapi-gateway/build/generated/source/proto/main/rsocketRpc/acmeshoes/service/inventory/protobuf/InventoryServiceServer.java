package acmeshoes.service.inventory.protobuf;

@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler",
    comments = "Source: acmeshoes.service.inventory/inventory-service.proto")
@io.rsocket.rpc.annotations.internal.Generated(
    type = io.rsocket.rpc.annotations.internal.ResourceType.SERVICE,
    idlClass = InventoryService.class)
@javax.inject.Named(
    value ="InventoryServiceServer")
public final class InventoryServiceServer extends io.rsocket.rpc.AbstractRSocketService {
  private final InventoryService service;
  private final io.opentracing.Tracer tracer;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>> getProductInventory;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>> getSkuInventory;
  private final java.util.function.Function<io.opentracing.SpanContext, java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>>> getProductInventoryTrace;
  private final java.util.function.Function<io.opentracing.SpanContext, java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>>> getSkuInventoryTrace;
  @javax.inject.Inject
  public InventoryServiceServer(InventoryService service, java.util.Optional<io.micrometer.core.instrument.MeterRegistry> registry, java.util.Optional<io.opentracing.Tracer> tracer) {
    this.service = service;
    if (!registry.isPresent()) {
      this.getProductInventory = java.util.function.Function.identity();
      this.getSkuInventory = java.util.function.Function.identity();
    } else {
      this.getProductInventory = io.rsocket.rpc.metrics.Metrics.timed(registry.get(), "rsocket.server", "service", InventoryService.SERVICE, "method", InventoryService.METHOD_GET_PRODUCT_INVENTORY);
      this.getSkuInventory = io.rsocket.rpc.metrics.Metrics.timed(registry.get(), "rsocket.server", "service", InventoryService.SERVICE, "method", InventoryService.METHOD_GET_SKU_INVENTORY);
    }

    if (!tracer.isPresent()) {
      this.tracer = null;
      this.getProductInventoryTrace = (ignored) -> java.util.function.Function.identity();
      this.getSkuInventoryTrace = (ignored) -> java.util.function.Function.identity();
    } else {
      this.tracer = tracer.get();
      this.getProductInventoryTrace = io.rsocket.rpc.tracing.Tracing.traceAsChild(this.tracer, InventoryService.METHOD_GET_PRODUCT_INVENTORY, io.rsocket.rpc.tracing.Tag.of("rsocket.service", InventoryService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "server"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
      this.getSkuInventoryTrace = io.rsocket.rpc.tracing.Tracing.traceAsChild(this.tracer, InventoryService.METHOD_GET_SKU_INVENTORY, io.rsocket.rpc.tracing.Tag.of("rsocket.service", InventoryService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "server"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    }

  }

  @java.lang.Override
  public String getService() {
    return InventoryService.SERVICE;
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
        case InventoryService.METHOD_GET_PRODUCT_INVENTORY: {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          return service.getProductInventory(acmeshoes.service.inventory.protobuf.ProductInventoryRequest.parseFrom(is), metadata).map(serializer).transform(getProductInventory).transform(getProductInventoryTrace.apply(spanContext));
        }
        case InventoryService.METHOD_GET_SKU_INVENTORY: {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          return service.getSkuInventory(acmeshoes.service.inventory.protobuf.SkuInventoryRequest.parseFrom(is), metadata).map(serializer).transform(getSkuInventory).transform(getSkuInventoryTrace.apply(spanContext));
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
