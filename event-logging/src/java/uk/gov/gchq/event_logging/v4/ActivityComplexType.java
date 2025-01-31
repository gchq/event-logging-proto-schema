// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/activity_complex_type.proto

// Protobuf Java Version: 4.26.1
package uk.gov.gchq.event_logging.v4;

/**
 * <pre>
 * Type that describes relationships between different events. For example in an asynchronous search the viewing of the results of the search may be a separate event from the execution of the query. In this instance the view event would be a child of the execution event.
 * </pre>
 *
 * Protobuf type {@code event_logging.v4.ActivityComplexType}
 */
public final class ActivityComplexType extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:event_logging.v4.ActivityComplexType)
    ActivityComplexTypeOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      ActivityComplexType.class.getName());
  }
  // Use ActivityComplexType.newBuilder() to construct.
  private ActivityComplexType(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ActivityComplexType() {
    id_ = "";
    name_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return uk.gov.gchq.event_logging.v4.ActivityComplexTypeProto.internal_static_event_logging_v4_ActivityComplexType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return uk.gov.gchq.event_logging.v4.ActivityComplexTypeProto.internal_static_event_logging_v4_ActivityComplexType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            uk.gov.gchq.event_logging.v4.ActivityComplexType.class, uk.gov.gchq.event_logging.v4.ActivityComplexType.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object id_ = "";
  /**
   * <pre>
   * The unique identifier of the event that is being referenced. This will be the value of Event/EventSource/EventId on the referenced event. E.g. where an event with Event/EventSource/EventId=101 is a child of an event with Event/EventSource/EventId=99, the value in this element would be 99.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The unique identifier of the event that is being referenced. This will be the value of Event/EventSource/EventId on the referenced event. E.g. where an event with Event/EventSource/EventId=101 is a child of an event with Event/EventSource/EventId=99, the value in this element would be 99.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * A descriptive name for the referenced event.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A descriptive name for the referenced event.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARENT_FIELD_NUMBER = 3;
  private uk.gov.gchq.event_logging.v4.ActivityComplexType parent_;
  /**
   * <pre>
   * The details of the event that is the parent of this referenced event. E.g. if event C is a child of event B which is a child of event A, this element would record an Id of A.
   * </pre>
   *
   * <code>.event_logging.v4.ActivityComplexType parent = 3 [json_name = "parent"];</code>
   * @return Whether the parent field is set.
   */
  @java.lang.Override
  public boolean hasParent() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The details of the event that is the parent of this referenced event. E.g. if event C is a child of event B which is a child of event A, this element would record an Id of A.
   * </pre>
   *
   * <code>.event_logging.v4.ActivityComplexType parent = 3 [json_name = "parent"];</code>
   * @return The parent.
   */
  @java.lang.Override
  public uk.gov.gchq.event_logging.v4.ActivityComplexType getParent() {
    return parent_ == null ? uk.gov.gchq.event_logging.v4.ActivityComplexType.getDefaultInstance() : parent_;
  }
  /**
   * <pre>
   * The details of the event that is the parent of this referenced event. E.g. if event C is a child of event B which is a child of event A, this element would record an Id of A.
   * </pre>
   *
   * <code>.event_logging.v4.ActivityComplexType parent = 3 [json_name = "parent"];</code>
   */
  @java.lang.Override
  public uk.gov.gchq.event_logging.v4.ActivityComplexTypeOrBuilder getParentOrBuilder() {
    return parent_ == null ? uk.gov.gchq.event_logging.v4.ActivityComplexType.getDefaultInstance() : parent_;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, id_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getParent());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getParent());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof uk.gov.gchq.event_logging.v4.ActivityComplexType)) {
      return super.equals(obj);
    }
    uk.gov.gchq.event_logging.v4.ActivityComplexType other = (uk.gov.gchq.event_logging.v4.ActivityComplexType) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (hasParent() != other.hasParent()) return false;
    if (hasParent()) {
      if (!getParent()
          .equals(other.getParent())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasParent()) {
      hash = (37 * hash) + PARENT_FIELD_NUMBER;
      hash = (53 * hash) + getParent().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static uk.gov.gchq.event_logging.v4.ActivityComplexType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static uk.gov.gchq.event_logging.v4.ActivityComplexType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static uk.gov.gchq.event_logging.v4.ActivityComplexType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static uk.gov.gchq.event_logging.v4.ActivityComplexType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static uk.gov.gchq.event_logging.v4.ActivityComplexType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static uk.gov.gchq.event_logging.v4.ActivityComplexType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static uk.gov.gchq.event_logging.v4.ActivityComplexType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static uk.gov.gchq.event_logging.v4.ActivityComplexType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static uk.gov.gchq.event_logging.v4.ActivityComplexType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static uk.gov.gchq.event_logging.v4.ActivityComplexType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static uk.gov.gchq.event_logging.v4.ActivityComplexType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static uk.gov.gchq.event_logging.v4.ActivityComplexType parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(uk.gov.gchq.event_logging.v4.ActivityComplexType prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Type that describes relationships between different events. For example in an asynchronous search the viewing of the results of the search may be a separate event from the execution of the query. In this instance the view event would be a child of the execution event.
   * </pre>
   *
   * Protobuf type {@code event_logging.v4.ActivityComplexType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:event_logging.v4.ActivityComplexType)
      uk.gov.gchq.event_logging.v4.ActivityComplexTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return uk.gov.gchq.event_logging.v4.ActivityComplexTypeProto.internal_static_event_logging_v4_ActivityComplexType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return uk.gov.gchq.event_logging.v4.ActivityComplexTypeProto.internal_static_event_logging_v4_ActivityComplexType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              uk.gov.gchq.event_logging.v4.ActivityComplexType.class, uk.gov.gchq.event_logging.v4.ActivityComplexType.Builder.class);
    }

    // Construct using uk.gov.gchq.event_logging.v4.ActivityComplexType.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getParentFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      id_ = "";
      name_ = "";
      parent_ = null;
      if (parentBuilder_ != null) {
        parentBuilder_.dispose();
        parentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return uk.gov.gchq.event_logging.v4.ActivityComplexTypeProto.internal_static_event_logging_v4_ActivityComplexType_descriptor;
    }

    @java.lang.Override
    public uk.gov.gchq.event_logging.v4.ActivityComplexType getDefaultInstanceForType() {
      return uk.gov.gchq.event_logging.v4.ActivityComplexType.getDefaultInstance();
    }

    @java.lang.Override
    public uk.gov.gchq.event_logging.v4.ActivityComplexType build() {
      uk.gov.gchq.event_logging.v4.ActivityComplexType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public uk.gov.gchq.event_logging.v4.ActivityComplexType buildPartial() {
      uk.gov.gchq.event_logging.v4.ActivityComplexType result = new uk.gov.gchq.event_logging.v4.ActivityComplexType(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(uk.gov.gchq.event_logging.v4.ActivityComplexType result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.parent_ = parentBuilder_ == null
            ? parent_
            : parentBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof uk.gov.gchq.event_logging.v4.ActivityComplexType) {
        return mergeFrom((uk.gov.gchq.event_logging.v4.ActivityComplexType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(uk.gov.gchq.event_logging.v4.ActivityComplexType other) {
      if (other == uk.gov.gchq.event_logging.v4.ActivityComplexType.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasParent()) {
        mergeParent(other.getParent());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              id_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getParentFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object id_ = "";
    /**
     * <pre>
     * The unique identifier of the event that is being referenced. This will be the value of Event/EventSource/EventId on the referenced event. E.g. where an event with Event/EventSource/EventId=101 is a child of an event with Event/EventSource/EventId=99, the value in this element would be 99.
     * </pre>
     *
     * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The unique identifier of the event that is being referenced. This will be the value of Event/EventSource/EventId on the referenced event. E.g. where an event with Event/EventSource/EventId=101 is a child of an event with Event/EventSource/EventId=99, the value in this element would be 99.
     * </pre>
     *
     * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The unique identifier of the event that is being referenced. This will be the value of Event/EventSource/EventId on the referenced event. E.g. where an event with Event/EventSource/EventId=101 is a child of an event with Event/EventSource/EventId=99, the value in this element would be 99.
     * </pre>
     *
     * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique identifier of the event that is being referenced. This will be the value of Event/EventSource/EventId on the referenced event. E.g. where an event with Event/EventSource/EventId=101 is a child of an event with Event/EventSource/EventId=99, the value in this element would be 99.
     * </pre>
     *
     * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = getDefaultInstance().getId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique identifier of the event that is being referenced. This will be the value of Event/EventSource/EventId on the referenced event. E.g. where an event with Event/EventSource/EventId=101 is a child of an event with Event/EventSource/EventId=99, the value in this element would be 99.
     * </pre>
     *
     * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * A descriptive name for the referenced event.
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A descriptive name for the referenced event.
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A descriptive name for the referenced event.
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A descriptive name for the referenced event.
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A descriptive name for the referenced event.
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private uk.gov.gchq.event_logging.v4.ActivityComplexType parent_;
    private com.google.protobuf.SingleFieldBuilder<
        uk.gov.gchq.event_logging.v4.ActivityComplexType, uk.gov.gchq.event_logging.v4.ActivityComplexType.Builder, uk.gov.gchq.event_logging.v4.ActivityComplexTypeOrBuilder> parentBuilder_;
    /**
     * <pre>
     * The details of the event that is the parent of this referenced event. E.g. if event C is a child of event B which is a child of event A, this element would record an Id of A.
     * </pre>
     *
     * <code>.event_logging.v4.ActivityComplexType parent = 3 [json_name = "parent"];</code>
     * @return Whether the parent field is set.
     */
    public boolean hasParent() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The details of the event that is the parent of this referenced event. E.g. if event C is a child of event B which is a child of event A, this element would record an Id of A.
     * </pre>
     *
     * <code>.event_logging.v4.ActivityComplexType parent = 3 [json_name = "parent"];</code>
     * @return The parent.
     */
    public uk.gov.gchq.event_logging.v4.ActivityComplexType getParent() {
      if (parentBuilder_ == null) {
        return parent_ == null ? uk.gov.gchq.event_logging.v4.ActivityComplexType.getDefaultInstance() : parent_;
      } else {
        return parentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The details of the event that is the parent of this referenced event. E.g. if event C is a child of event B which is a child of event A, this element would record an Id of A.
     * </pre>
     *
     * <code>.event_logging.v4.ActivityComplexType parent = 3 [json_name = "parent"];</code>
     */
    public Builder setParent(uk.gov.gchq.event_logging.v4.ActivityComplexType value) {
      if (parentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        parent_ = value;
      } else {
        parentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The details of the event that is the parent of this referenced event. E.g. if event C is a child of event B which is a child of event A, this element would record an Id of A.
     * </pre>
     *
     * <code>.event_logging.v4.ActivityComplexType parent = 3 [json_name = "parent"];</code>
     */
    public Builder setParent(
        uk.gov.gchq.event_logging.v4.ActivityComplexType.Builder builderForValue) {
      if (parentBuilder_ == null) {
        parent_ = builderForValue.build();
      } else {
        parentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The details of the event that is the parent of this referenced event. E.g. if event C is a child of event B which is a child of event A, this element would record an Id of A.
     * </pre>
     *
     * <code>.event_logging.v4.ActivityComplexType parent = 3 [json_name = "parent"];</code>
     */
    public Builder mergeParent(uk.gov.gchq.event_logging.v4.ActivityComplexType value) {
      if (parentBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          parent_ != null &&
          parent_ != uk.gov.gchq.event_logging.v4.ActivityComplexType.getDefaultInstance()) {
          getParentBuilder().mergeFrom(value);
        } else {
          parent_ = value;
        }
      } else {
        parentBuilder_.mergeFrom(value);
      }
      if (parent_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The details of the event that is the parent of this referenced event. E.g. if event C is a child of event B which is a child of event A, this element would record an Id of A.
     * </pre>
     *
     * <code>.event_logging.v4.ActivityComplexType parent = 3 [json_name = "parent"];</code>
     */
    public Builder clearParent() {
      bitField0_ = (bitField0_ & ~0x00000004);
      parent_ = null;
      if (parentBuilder_ != null) {
        parentBuilder_.dispose();
        parentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The details of the event that is the parent of this referenced event. E.g. if event C is a child of event B which is a child of event A, this element would record an Id of A.
     * </pre>
     *
     * <code>.event_logging.v4.ActivityComplexType parent = 3 [json_name = "parent"];</code>
     */
    public uk.gov.gchq.event_logging.v4.ActivityComplexType.Builder getParentBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getParentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The details of the event that is the parent of this referenced event. E.g. if event C is a child of event B which is a child of event A, this element would record an Id of A.
     * </pre>
     *
     * <code>.event_logging.v4.ActivityComplexType parent = 3 [json_name = "parent"];</code>
     */
    public uk.gov.gchq.event_logging.v4.ActivityComplexTypeOrBuilder getParentOrBuilder() {
      if (parentBuilder_ != null) {
        return parentBuilder_.getMessageOrBuilder();
      } else {
        return parent_ == null ?
            uk.gov.gchq.event_logging.v4.ActivityComplexType.getDefaultInstance() : parent_;
      }
    }
    /**
     * <pre>
     * The details of the event that is the parent of this referenced event. E.g. if event C is a child of event B which is a child of event A, this element would record an Id of A.
     * </pre>
     *
     * <code>.event_logging.v4.ActivityComplexType parent = 3 [json_name = "parent"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        uk.gov.gchq.event_logging.v4.ActivityComplexType, uk.gov.gchq.event_logging.v4.ActivityComplexType.Builder, uk.gov.gchq.event_logging.v4.ActivityComplexTypeOrBuilder> 
        getParentFieldBuilder() {
      if (parentBuilder_ == null) {
        parentBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            uk.gov.gchq.event_logging.v4.ActivityComplexType, uk.gov.gchq.event_logging.v4.ActivityComplexType.Builder, uk.gov.gchq.event_logging.v4.ActivityComplexTypeOrBuilder>(
                getParent(),
                getParentForChildren(),
                isClean());
        parent_ = null;
      }
      return parentBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:event_logging.v4.ActivityComplexType)
  }

  // @@protoc_insertion_point(class_scope:event_logging.v4.ActivityComplexType)
  private static final uk.gov.gchq.event_logging.v4.ActivityComplexType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new uk.gov.gchq.event_logging.v4.ActivityComplexType();
  }

  public static uk.gov.gchq.event_logging.v4.ActivityComplexType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ActivityComplexType>
      PARSER = new com.google.protobuf.AbstractParser<ActivityComplexType>() {
    @java.lang.Override
    public ActivityComplexType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ActivityComplexType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ActivityComplexType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public uk.gov.gchq.event_logging.v4.ActivityComplexType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

