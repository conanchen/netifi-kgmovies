package acmeshoes.service.inventory.protobuf;

/**
 */
@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler (version 0.2.18)",
    comments = "Source: acmeshoes.service.inventory/inventory-service.proto")
public interface BlockingInventoryService {
  String SERVICE_ID = "acmeshoes.service.inventory.InventoryService";
  String METHOD_GET_PRODUCT_INVENTORY = "GetProductInventory";
  String METHOD_GET_SKU_INVENTORY = "GetSkuInventory";

  /**
   * <pre>
   * Gets inventory for a product.
   * </pre>
   */
  acmeshoes.service.inventory.protobuf.ProductInventoryResponse getProductInventory(acmeshoes.service.inventory.protobuf.ProductInventoryRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   * <pre>
   * Gets inventory for a sku.
   * </pre>
   */
  acmeshoes.service.inventory.protobuf.SkuInventoryResponse getSkuInventory(acmeshoes.service.inventory.protobuf.SkuInventoryRequest message, io.netty.buffer.ByteBuf metadata);
}
