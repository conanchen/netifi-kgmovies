package acmeshoes.service.inventory.protobuf;

@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler (version 0.2.18)",
    comments = "Source: acmeshoes.service.inventory/inventory-service.proto")
@io.rsocket.rpc.annotations.internal.Generated(
    type = io.rsocket.rpc.annotations.internal.ResourceType.CLIENT,
    idlClass = BlockingInventoryService.class)
public final class BlockingInventoryServiceClient implements BlockingInventoryService {
  private final acmeshoes.service.inventory.protobuf.InventoryServiceClient delegate;

  public BlockingInventoryServiceClient(io.rsocket.RSocket rSocket) {
    this.delegate = new acmeshoes.service.inventory.protobuf.InventoryServiceClient(rSocket);
  }

  public BlockingInventoryServiceClient(io.rsocket.RSocket rSocket, io.micrometer.core.instrument.MeterRegistry registry) {
    this.delegate = new acmeshoes.service.inventory.protobuf.InventoryServiceClient(rSocket, registry);
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = acmeshoes.service.inventory.protobuf.ProductInventoryResponse.class)
  public acmeshoes.service.inventory.protobuf.ProductInventoryResponse getProductInventory(acmeshoes.service.inventory.protobuf.ProductInventoryRequest message) {
    return getProductInventory(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = acmeshoes.service.inventory.protobuf.ProductInventoryResponse.class)
  public acmeshoes.service.inventory.protobuf.ProductInventoryResponse getProductInventory(acmeshoes.service.inventory.protobuf.ProductInventoryRequest message, io.netty.buffer.ByteBuf metadata) {
    return delegate.getProductInventory(message, metadata).block();
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = acmeshoes.service.inventory.protobuf.SkuInventoryResponse.class)
  public acmeshoes.service.inventory.protobuf.SkuInventoryResponse getSkuInventory(acmeshoes.service.inventory.protobuf.SkuInventoryRequest message) {
    return getSkuInventory(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = acmeshoes.service.inventory.protobuf.SkuInventoryResponse.class)
  public acmeshoes.service.inventory.protobuf.SkuInventoryResponse getSkuInventory(acmeshoes.service.inventory.protobuf.SkuInventoryRequest message, io.netty.buffer.ByteBuf metadata) {
    return delegate.getSkuInventory(message, metadata).block();
  }

}

