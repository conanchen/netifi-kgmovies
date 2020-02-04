package acmeshoes.service.product.protobuf;

/**
 */
@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler (version 0.2.18)",
    comments = "Source: acmeshoes.service.product/product-service.proto")
public interface BlockingProductService {
  String SERVICE_ID = "acmeshoes.service.product.ProductService";
  String METHOD_GET_PRODUCT_INFO = "GetProductInfo";

  /**
   * <pre>
   * Gets product information.
   * </pre>
   */
  acmeshoes.service.product.protobuf.ProductInfoResponse getProductInfo(acmeshoes.service.product.protobuf.ProductInfoRequest message, io.netty.buffer.ByteBuf metadata);
}
