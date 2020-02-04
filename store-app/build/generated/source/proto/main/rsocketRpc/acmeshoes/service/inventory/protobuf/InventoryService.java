package acmeshoes.service.inventory.protobuf;

/**
 */
@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler",
    comments = "Source: acmeshoes.service.inventory/inventory-service.proto")
public interface InventoryService {
  String SERVICE = "acmeshoes.service.inventory.InventoryService";
  String METHOD_GET_PRODUCT_INVENTORY = "GetProductInventory";
  String METHOD_GET_SKU_INVENTORY = "GetSkuInventory";

  /**
   * <pre>
   * Gets inventory for a product.
   * </pre>
   */
  reactor.core.publisher.Mono<acmeshoes.service.inventory.protobuf.ProductInventoryResponse> getProductInventory(acmeshoes.service.inventory.protobuf.ProductInventoryRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   * <pre>
   * Gets inventory for a sku.
   * </pre>
   */
  reactor.core.publisher.Mono<acmeshoes.service.inventory.protobuf.SkuInventoryResponse> getSkuInventory(acmeshoes.service.inventory.protobuf.SkuInventoryRequest message, io.netty.buffer.ByteBuf metadata);
}
