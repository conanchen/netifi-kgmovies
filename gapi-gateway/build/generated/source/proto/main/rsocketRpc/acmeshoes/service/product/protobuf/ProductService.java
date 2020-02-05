package acmeshoes.service.product.protobuf;

/**
 */
@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler",
    comments = "Source: acmeshoes.service.product/product-service.proto")
public interface ProductService {
  String SERVICE = "acmeshoes.service.product.ProductService";
  String METHOD_GET_PRODUCT_INFO = "GetProductInfo";

  /**
   * <pre>
   * Gets product information.
   * </pre>
   */
  reactor.core.publisher.Mono<acmeshoes.service.product.protobuf.ProductInfoResponse> getProductInfo(acmeshoes.service.product.protobuf.ProductInfoRequest message, io.netty.buffer.ByteBuf metadata);
}
