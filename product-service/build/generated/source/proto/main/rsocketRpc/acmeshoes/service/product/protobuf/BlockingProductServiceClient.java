package acmeshoes.service.product.protobuf;

@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler (version 0.2.18)",
    comments = "Source: acmeshoes.service.product/product-service.proto")
@io.rsocket.rpc.annotations.internal.Generated(
    type = io.rsocket.rpc.annotations.internal.ResourceType.CLIENT,
    idlClass = BlockingProductService.class)
public final class BlockingProductServiceClient implements BlockingProductService {
  private final acmeshoes.service.product.protobuf.ProductServiceClient delegate;

  public BlockingProductServiceClient(io.rsocket.RSocket rSocket) {
    this.delegate = new acmeshoes.service.product.protobuf.ProductServiceClient(rSocket);
  }

  public BlockingProductServiceClient(io.rsocket.RSocket rSocket, io.micrometer.core.instrument.MeterRegistry registry) {
    this.delegate = new acmeshoes.service.product.protobuf.ProductServiceClient(rSocket, registry);
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = acmeshoes.service.product.protobuf.ProductInfoResponse.class)
  public acmeshoes.service.product.protobuf.ProductInfoResponse getProductInfo(acmeshoes.service.product.protobuf.ProductInfoRequest message) {
    return getProductInfo(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = acmeshoes.service.product.protobuf.ProductInfoResponse.class)
  public acmeshoes.service.product.protobuf.ProductInfoResponse getProductInfo(acmeshoes.service.product.protobuf.ProductInfoRequest message, io.netty.buffer.ByteBuf metadata) {
    return delegate.getProductInfo(message, metadata).block();
  }

}

