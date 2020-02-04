package acmeshoes.service.inventory.protobuf;

@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler",
    comments = "Source: acmeshoes.service.inventory/inventory-service.proto")
@io.rsocket.rpc.annotations.internal.Generated(
    type = io.rsocket.rpc.annotations.internal.ResourceType.CLIENT,
    idlClass = InventoryService.class)
public final class InventoryServiceClient implements InventoryService {
  private final io.rsocket.RSocket rSocket;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<acmeshoes.service.inventory.protobuf.ProductInventoryResponse>, ? extends org.reactivestreams.Publisher<acmeshoes.service.inventory.protobuf.ProductInventoryResponse>> getProductInventory;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<acmeshoes.service.inventory.protobuf.SkuInventoryResponse>, ? extends org.reactivestreams.Publisher<acmeshoes.service.inventory.protobuf.SkuInventoryResponse>> getSkuInventory;
  private final java.util.function.Function<java.util.Map<String, String>, java.util.function.Function<? super org.reactivestreams.Publisher<acmeshoes.service.inventory.protobuf.ProductInventoryResponse>, ? extends org.reactivestreams.Publisher<acmeshoes.service.inventory.protobuf.ProductInventoryResponse>>> getProductInventoryTrace;
  private final java.util.function.Function<java.util.Map<String, String>, java.util.function.Function<? super org.reactivestreams.Publisher<acmeshoes.service.inventory.protobuf.SkuInventoryResponse>, ? extends org.reactivestreams.Publisher<acmeshoes.service.inventory.protobuf.SkuInventoryResponse>>> getSkuInventoryTrace;

  public InventoryServiceClient(io.rsocket.RSocket rSocket) {
    this.rSocket = rSocket;
    this.getProductInventory = java.util.function.Function.identity();
    this.getSkuInventory = java.util.function.Function.identity();
    this.getProductInventoryTrace = io.rsocket.rpc.tracing.Tracing.trace();
    this.getSkuInventoryTrace = io.rsocket.rpc.tracing.Tracing.trace();
  }

  public InventoryServiceClient(io.rsocket.RSocket rSocket, io.micrometer.core.instrument.MeterRegistry registry) {
    this.rSocket = rSocket;
    this.getProductInventory = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", InventoryService.SERVICE, "method", InventoryService.METHOD_GET_PRODUCT_INVENTORY);
    this.getSkuInventory = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", InventoryService.SERVICE, "method", InventoryService.METHOD_GET_SKU_INVENTORY);
    this.getProductInventoryTrace = io.rsocket.rpc.tracing.Tracing.trace();
    this.getSkuInventoryTrace = io.rsocket.rpc.tracing.Tracing.trace();
  }


  public InventoryServiceClient(io.rsocket.RSocket rSocket, io.opentracing.Tracer tracer) {
    this.rSocket = rSocket;
    this.getProductInventory = java.util.function.Function.identity();
    this.getSkuInventory = java.util.function.Function.identity();
    this.getProductInventoryTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, InventoryService.METHOD_GET_PRODUCT_INVENTORY, io.rsocket.rpc.tracing.Tag.of("rsocket.service", InventoryService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    this.getSkuInventoryTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, InventoryService.METHOD_GET_SKU_INVENTORY, io.rsocket.rpc.tracing.Tag.of("rsocket.service", InventoryService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
  }


  public InventoryServiceClient(io.rsocket.RSocket rSocket, io.micrometer.core.instrument.MeterRegistry registry, io.opentracing.Tracer tracer) {
    this.rSocket = rSocket;
    this.getProductInventory = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", InventoryService.SERVICE, "method", InventoryService.METHOD_GET_PRODUCT_INVENTORY);
    this.getSkuInventory = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", InventoryService.SERVICE, "method", InventoryService.METHOD_GET_SKU_INVENTORY);
    this.getProductInventoryTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, InventoryService.METHOD_GET_PRODUCT_INVENTORY, io.rsocket.rpc.tracing.Tag.of("rsocket.service", InventoryService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    this.getSkuInventoryTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, InventoryService.METHOD_GET_SKU_INVENTORY, io.rsocket.rpc.tracing.Tag.of("rsocket.service", InventoryService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = acmeshoes.service.inventory.protobuf.ProductInventoryResponse.class)
  public reactor.core.publisher.Mono<acmeshoes.service.inventory.protobuf.ProductInventoryResponse> getProductInventory(acmeshoes.service.inventory.protobuf.ProductInventoryRequest message) {
    return getProductInventory(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = acmeshoes.service.inventory.protobuf.ProductInventoryResponse.class)
  public reactor.core.publisher.Mono<acmeshoes.service.inventory.protobuf.ProductInventoryResponse> getProductInventory(acmeshoes.service.inventory.protobuf.ProductInventoryRequest message, io.netty.buffer.ByteBuf metadata) {
  java.util.Map<String, String> map = new java.util.HashMap<>();
    return reactor.core.publisher.Mono.defer(new java.util.function.Supplier<reactor.core.publisher.Mono<io.rsocket.Payload>>() {
      @java.lang.Override
      public reactor.core.publisher.Mono<io.rsocket.Payload> get() {
        final io.netty.buffer.ByteBuf data = serialize(message);
        final io.netty.buffer.ByteBuf tracing = io.rsocket.rpc.tracing.Tracing.mapToByteBuf(io.netty.buffer.ByteBufAllocator.DEFAULT, map);
        final io.netty.buffer.ByteBuf metadataBuf = io.rsocket.rpc.frames.Metadata.encode(io.netty.buffer.ByteBufAllocator.DEFAULT, InventoryService.SERVICE, InventoryService.METHOD_GET_PRODUCT_INVENTORY, tracing, metadata);
        tracing.release();
        metadata.release();
        return rSocket.requestResponse(io.rsocket.util.ByteBufPayload.create(data, metadataBuf));
      }
    }).map(deserializer(acmeshoes.service.inventory.protobuf.ProductInventoryResponse.parser())).transform(getProductInventory).transform(getProductInventoryTrace.apply(map));
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = acmeshoes.service.inventory.protobuf.SkuInventoryResponse.class)
  public reactor.core.publisher.Mono<acmeshoes.service.inventory.protobuf.SkuInventoryResponse> getSkuInventory(acmeshoes.service.inventory.protobuf.SkuInventoryRequest message) {
    return getSkuInventory(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = acmeshoes.service.inventory.protobuf.SkuInventoryResponse.class)
  public reactor.core.publisher.Mono<acmeshoes.service.inventory.protobuf.SkuInventoryResponse> getSkuInventory(acmeshoes.service.inventory.protobuf.SkuInventoryRequest message, io.netty.buffer.ByteBuf metadata) {
  java.util.Map<String, String> map = new java.util.HashMap<>();
    return reactor.core.publisher.Mono.defer(new java.util.function.Supplier<reactor.core.publisher.Mono<io.rsocket.Payload>>() {
      @java.lang.Override
      public reactor.core.publisher.Mono<io.rsocket.Payload> get() {
        final io.netty.buffer.ByteBuf data = serialize(message);
        final io.netty.buffer.ByteBuf tracing = io.rsocket.rpc.tracing.Tracing.mapToByteBuf(io.netty.buffer.ByteBufAllocator.DEFAULT, map);
        final io.netty.buffer.ByteBuf metadataBuf = io.rsocket.rpc.frames.Metadata.encode(io.netty.buffer.ByteBufAllocator.DEFAULT, InventoryService.SERVICE, InventoryService.METHOD_GET_SKU_INVENTORY, tracing, metadata);
        tracing.release();
        metadata.release();
        return rSocket.requestResponse(io.rsocket.util.ByteBufPayload.create(data, metadataBuf));
      }
    }).map(deserializer(acmeshoes.service.inventory.protobuf.SkuInventoryResponse.parser())).transform(getSkuInventory).transform(getSkuInventoryTrace.apply(map));
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
