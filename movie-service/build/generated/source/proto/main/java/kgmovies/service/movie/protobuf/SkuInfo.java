// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kgmovies.service.movie/movie-service.proto

package kgmovies.service.movie.protobuf;

/**
 * Protobuf type {@code kgmovies.service.movie.SkuInfo}
 */
public  final class SkuInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kgmovies.service.movie.SkuInfo)
    SkuInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SkuInfo.newBuilder() to construct.
  private SkuInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SkuInfo() {
    sku_ = "";
    active_ = false;
    size_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SkuInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            sku_ = s;
            break;
          }
          case 16: {

            active_ = input.readBool();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            size_ = s;
            break;
          }
          case 34: {
            kgmovies.service.movie.protobuf.PriceInfo.Builder subBuilder = null;
            if (prices_ != null) {
              subBuilder = prices_.toBuilder();
            }
            prices_ = input.readMessage(kgmovies.service.movie.protobuf.PriceInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(prices_);
              prices_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return kgmovies.service.movie.protobuf.MovieServiceProto.internal_static_kgmovies_service_movie_SkuInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return kgmovies.service.movie.protobuf.MovieServiceProto.internal_static_kgmovies_service_movie_SkuInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            kgmovies.service.movie.protobuf.SkuInfo.class, kgmovies.service.movie.protobuf.SkuInfo.Builder.class);
  }

  public static final int SKU_FIELD_NUMBER = 1;
  private volatile java.lang.Object sku_;
  /**
   * <code>string sku = 1;</code>
   */
  public java.lang.String getSku() {
    java.lang.Object ref = sku_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sku_ = s;
      return s;
    }
  }
  /**
   * <code>string sku = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSkuBytes() {
    java.lang.Object ref = sku_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sku_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACTIVE_FIELD_NUMBER = 2;
  private boolean active_;
  /**
   * <code>bool active = 2;</code>
   */
  public boolean getActive() {
    return active_;
  }

  public static final int SIZE_FIELD_NUMBER = 3;
  private volatile java.lang.Object size_;
  /**
   * <code>string size = 3;</code>
   */
  public java.lang.String getSize() {
    java.lang.Object ref = size_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      size_ = s;
      return s;
    }
  }
  /**
   * <code>string size = 3;</code>
   */
  public com.google.protobuf.ByteString
      getSizeBytes() {
    java.lang.Object ref = size_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      size_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRICES_FIELD_NUMBER = 4;
  private kgmovies.service.movie.protobuf.PriceInfo prices_;
  /**
   * <code>.kgmovies.service.movie.PriceInfo prices = 4;</code>
   */
  public boolean hasPrices() {
    return prices_ != null;
  }
  /**
   * <code>.kgmovies.service.movie.PriceInfo prices = 4;</code>
   */
  public kgmovies.service.movie.protobuf.PriceInfo getPrices() {
    return prices_ == null ? kgmovies.service.movie.protobuf.PriceInfo.getDefaultInstance() : prices_;
  }
  /**
   * <code>.kgmovies.service.movie.PriceInfo prices = 4;</code>
   */
  public kgmovies.service.movie.protobuf.PriceInfoOrBuilder getPricesOrBuilder() {
    return getPrices();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getSkuBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sku_);
    }
    if (active_ != false) {
      output.writeBool(2, active_);
    }
    if (!getSizeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, size_);
    }
    if (prices_ != null) {
      output.writeMessage(4, getPrices());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSkuBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sku_);
    }
    if (active_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, active_);
    }
    if (!getSizeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, size_);
    }
    if (prices_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getPrices());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof kgmovies.service.movie.protobuf.SkuInfo)) {
      return super.equals(obj);
    }
    kgmovies.service.movie.protobuf.SkuInfo other = (kgmovies.service.movie.protobuf.SkuInfo) obj;

    boolean result = true;
    result = result && getSku()
        .equals(other.getSku());
    result = result && (getActive()
        == other.getActive());
    result = result && getSize()
        .equals(other.getSize());
    result = result && (hasPrices() == other.hasPrices());
    if (hasPrices()) {
      result = result && getPrices()
          .equals(other.getPrices());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SKU_FIELD_NUMBER;
    hash = (53 * hash) + getSku().hashCode();
    hash = (37 * hash) + ACTIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getActive());
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getSize().hashCode();
    if (hasPrices()) {
      hash = (37 * hash) + PRICES_FIELD_NUMBER;
      hash = (53 * hash) + getPrices().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static kgmovies.service.movie.protobuf.SkuInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kgmovies.service.movie.protobuf.SkuInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kgmovies.service.movie.protobuf.SkuInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kgmovies.service.movie.protobuf.SkuInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kgmovies.service.movie.protobuf.SkuInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kgmovies.service.movie.protobuf.SkuInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kgmovies.service.movie.protobuf.SkuInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kgmovies.service.movie.protobuf.SkuInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static kgmovies.service.movie.protobuf.SkuInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static kgmovies.service.movie.protobuf.SkuInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static kgmovies.service.movie.protobuf.SkuInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kgmovies.service.movie.protobuf.SkuInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(kgmovies.service.movie.protobuf.SkuInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code kgmovies.service.movie.SkuInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kgmovies.service.movie.SkuInfo)
      kgmovies.service.movie.protobuf.SkuInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return kgmovies.service.movie.protobuf.MovieServiceProto.internal_static_kgmovies_service_movie_SkuInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return kgmovies.service.movie.protobuf.MovieServiceProto.internal_static_kgmovies_service_movie_SkuInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              kgmovies.service.movie.protobuf.SkuInfo.class, kgmovies.service.movie.protobuf.SkuInfo.Builder.class);
    }

    // Construct using kgmovies.service.movie.protobuf.SkuInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      sku_ = "";

      active_ = false;

      size_ = "";

      if (pricesBuilder_ == null) {
        prices_ = null;
      } else {
        prices_ = null;
        pricesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return kgmovies.service.movie.protobuf.MovieServiceProto.internal_static_kgmovies_service_movie_SkuInfo_descriptor;
    }

    @java.lang.Override
    public kgmovies.service.movie.protobuf.SkuInfo getDefaultInstanceForType() {
      return kgmovies.service.movie.protobuf.SkuInfo.getDefaultInstance();
    }

    @java.lang.Override
    public kgmovies.service.movie.protobuf.SkuInfo build() {
      kgmovies.service.movie.protobuf.SkuInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public kgmovies.service.movie.protobuf.SkuInfo buildPartial() {
      kgmovies.service.movie.protobuf.SkuInfo result = new kgmovies.service.movie.protobuf.SkuInfo(this);
      result.sku_ = sku_;
      result.active_ = active_;
      result.size_ = size_;
      if (pricesBuilder_ == null) {
        result.prices_ = prices_;
      } else {
        result.prices_ = pricesBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof kgmovies.service.movie.protobuf.SkuInfo) {
        return mergeFrom((kgmovies.service.movie.protobuf.SkuInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(kgmovies.service.movie.protobuf.SkuInfo other) {
      if (other == kgmovies.service.movie.protobuf.SkuInfo.getDefaultInstance()) return this;
      if (!other.getSku().isEmpty()) {
        sku_ = other.sku_;
        onChanged();
      }
      if (other.getActive() != false) {
        setActive(other.getActive());
      }
      if (!other.getSize().isEmpty()) {
        size_ = other.size_;
        onChanged();
      }
      if (other.hasPrices()) {
        mergePrices(other.getPrices());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      kgmovies.service.movie.protobuf.SkuInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (kgmovies.service.movie.protobuf.SkuInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object sku_ = "";
    /**
     * <code>string sku = 1;</code>
     */
    public java.lang.String getSku() {
      java.lang.Object ref = sku_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sku_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sku = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSkuBytes() {
      java.lang.Object ref = sku_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sku_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sku = 1;</code>
     */
    public Builder setSku(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sku_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sku = 1;</code>
     */
    public Builder clearSku() {
      
      sku_ = getDefaultInstance().getSku();
      onChanged();
      return this;
    }
    /**
     * <code>string sku = 1;</code>
     */
    public Builder setSkuBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sku_ = value;
      onChanged();
      return this;
    }

    private boolean active_ ;
    /**
     * <code>bool active = 2;</code>
     */
    public boolean getActive() {
      return active_;
    }
    /**
     * <code>bool active = 2;</code>
     */
    public Builder setActive(boolean value) {
      
      active_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool active = 2;</code>
     */
    public Builder clearActive() {
      
      active_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object size_ = "";
    /**
     * <code>string size = 3;</code>
     */
    public java.lang.String getSize() {
      java.lang.Object ref = size_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        size_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string size = 3;</code>
     */
    public com.google.protobuf.ByteString
        getSizeBytes() {
      java.lang.Object ref = size_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        size_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string size = 3;</code>
     */
    public Builder setSize(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      size_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string size = 3;</code>
     */
    public Builder clearSize() {
      
      size_ = getDefaultInstance().getSize();
      onChanged();
      return this;
    }
    /**
     * <code>string size = 3;</code>
     */
    public Builder setSizeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      size_ = value;
      onChanged();
      return this;
    }

    private kgmovies.service.movie.protobuf.PriceInfo prices_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        kgmovies.service.movie.protobuf.PriceInfo, kgmovies.service.movie.protobuf.PriceInfo.Builder, kgmovies.service.movie.protobuf.PriceInfoOrBuilder> pricesBuilder_;
    /**
     * <code>.kgmovies.service.movie.PriceInfo prices = 4;</code>
     */
    public boolean hasPrices() {
      return pricesBuilder_ != null || prices_ != null;
    }
    /**
     * <code>.kgmovies.service.movie.PriceInfo prices = 4;</code>
     */
    public kgmovies.service.movie.protobuf.PriceInfo getPrices() {
      if (pricesBuilder_ == null) {
        return prices_ == null ? kgmovies.service.movie.protobuf.PriceInfo.getDefaultInstance() : prices_;
      } else {
        return pricesBuilder_.getMessage();
      }
    }
    /**
     * <code>.kgmovies.service.movie.PriceInfo prices = 4;</code>
     */
    public Builder setPrices(kgmovies.service.movie.protobuf.PriceInfo value) {
      if (pricesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        prices_ = value;
        onChanged();
      } else {
        pricesBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.kgmovies.service.movie.PriceInfo prices = 4;</code>
     */
    public Builder setPrices(
        kgmovies.service.movie.protobuf.PriceInfo.Builder builderForValue) {
      if (pricesBuilder_ == null) {
        prices_ = builderForValue.build();
        onChanged();
      } else {
        pricesBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.kgmovies.service.movie.PriceInfo prices = 4;</code>
     */
    public Builder mergePrices(kgmovies.service.movie.protobuf.PriceInfo value) {
      if (pricesBuilder_ == null) {
        if (prices_ != null) {
          prices_ =
            kgmovies.service.movie.protobuf.PriceInfo.newBuilder(prices_).mergeFrom(value).buildPartial();
        } else {
          prices_ = value;
        }
        onChanged();
      } else {
        pricesBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.kgmovies.service.movie.PriceInfo prices = 4;</code>
     */
    public Builder clearPrices() {
      if (pricesBuilder_ == null) {
        prices_ = null;
        onChanged();
      } else {
        prices_ = null;
        pricesBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.kgmovies.service.movie.PriceInfo prices = 4;</code>
     */
    public kgmovies.service.movie.protobuf.PriceInfo.Builder getPricesBuilder() {
      
      onChanged();
      return getPricesFieldBuilder().getBuilder();
    }
    /**
     * <code>.kgmovies.service.movie.PriceInfo prices = 4;</code>
     */
    public kgmovies.service.movie.protobuf.PriceInfoOrBuilder getPricesOrBuilder() {
      if (pricesBuilder_ != null) {
        return pricesBuilder_.getMessageOrBuilder();
      } else {
        return prices_ == null ?
            kgmovies.service.movie.protobuf.PriceInfo.getDefaultInstance() : prices_;
      }
    }
    /**
     * <code>.kgmovies.service.movie.PriceInfo prices = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        kgmovies.service.movie.protobuf.PriceInfo, kgmovies.service.movie.protobuf.PriceInfo.Builder, kgmovies.service.movie.protobuf.PriceInfoOrBuilder> 
        getPricesFieldBuilder() {
      if (pricesBuilder_ == null) {
        pricesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            kgmovies.service.movie.protobuf.PriceInfo, kgmovies.service.movie.protobuf.PriceInfo.Builder, kgmovies.service.movie.protobuf.PriceInfoOrBuilder>(
                getPrices(),
                getParentForChildren(),
                isClean());
        prices_ = null;
      }
      return pricesBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:kgmovies.service.movie.SkuInfo)
  }

  // @@protoc_insertion_point(class_scope:kgmovies.service.movie.SkuInfo)
  private static final kgmovies.service.movie.protobuf.SkuInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new kgmovies.service.movie.protobuf.SkuInfo();
  }

  public static kgmovies.service.movie.protobuf.SkuInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SkuInfo>
      PARSER = new com.google.protobuf.AbstractParser<SkuInfo>() {
    @java.lang.Override
    public SkuInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SkuInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SkuInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SkuInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public kgmovies.service.movie.protobuf.SkuInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

