# 喝了咱的酒啊,喝了咱的酒啊,喝了咱的酒啊,喝了咱的酒啊
## storeSearch() 示例
```
{
  storeSearch(filter: {name: {eq: "afasd", regexp: "%s"}}, 
    order: {asc: name, then: {desc: dateCreated}}, 
    first: 3, offset: 3) {
    pageInfo {
      hasNextPage
    }
    totalCount
  }
}

```