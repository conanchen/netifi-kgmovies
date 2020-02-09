# product-service
Service that returns product information (name, price, description, etc.) for a product. The production information can be accessed will by authorized by business logic logic , e.g. manager can view employyees's salary. 

## API
The API for this service is defined as a [Protobuf](https://developers.google.com/protocol-buffers) contract in [product-service.proto](../product-service-idl/src/main/proto/acmeshoes.service.product/product-service.proto).

## Bisiness Logic Policy
[Stop using a different policy language, policy model, and policy API for every movie and service you use. Use OPA for a unified toolset and framework for policy across the cloud native stack.](https://www.openpolicyagent.org/)