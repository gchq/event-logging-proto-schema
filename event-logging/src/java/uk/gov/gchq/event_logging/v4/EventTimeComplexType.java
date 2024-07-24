// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/event_time_complex_type.proto

// Protobuf Java Version: 4.26.1
package uk.gov.gchq.event_logging.v4;

/**
 * <pre>
 * Describes the time the event was created.
 * </pre>
 *
 * Protobuf type {@code event_logging.v4.EventTimeComplexType}
 */
public final class EventTimeComplexType extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:event_logging.v4.EventTimeComplexType)
    EventTimeComplexTypeOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      EventTimeComplexType.class.getName());
  }
  // Use EventTimeComplexType.newBuilder() to construct.
  private EventTimeComplexType(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private EventTimeComplexType() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return uk.gov.gchq.event_logging.v4.EventTimeComplexTypeProto.internal_static_event_logging_v4_EventTimeComplexType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return uk.gov.gchq.event_logging.v4.EventTimeComplexTypeProto.internal_static_event_logging_v4_EventTimeComplexType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            uk.gov.gchq.event_logging.v4.EventTimeComplexType.class, uk.gov.gchq.event_logging.v4.EventTimeComplexType.Builder.class);
  }

  private int bitField0_;
  public static final int TIME_CREATED_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp timeCreated_;
  /**
   * <pre>
   * This element contains information about the time the event was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time_created = 1 [json_name = "timeCreated", (.buf.validate.field) = { ... }</code>
   * @return Whether the timeCreated field is set.
   */
  @java.lang.Override
  public boolean hasTimeCreated() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * This element contains information about the time the event was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time_created = 1 [json_name = "timeCreated", (.buf.validate.field) = { ... }</code>
   * @return The timeCreated.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getTimeCreated() {
    return timeCreated_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timeCreated_;
  }
  /**
   * <pre>
   * This element contains information about the time the event was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time_created = 1 [json_name = "timeCreated", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getTimeCreatedOrBuilder() {
    return timeCreated_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timeCreated_;
  }

  public static final int TIME_SOURCE_FIELD_NUMBER = 2;
  private uk.gov.gchq.event_logging.v4.DeviceComplexType timeSource_;
  /**
   * <pre>
   * This is an optional element to be used to indicate the time source that the event creation time has been synchronised with. In most circumstances it is assumed that the event time has been synchronised with the corporate time service where the generating device resides so the inclusion of this element is not required.
   * </pre>
   *
   * <code>.event_logging.v4.DeviceComplexType time_source = 2 [json_name = "timeSource"];</code>
   * @return Whether the timeSource field is set.
   */
  @java.lang.Override
  public boolean hasTimeSource() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * This is an optional element to be used to indicate the time source that the event creation time has been synchronised with. In most circumstances it is assumed that the event time has been synchronised with the corporate time service where the generating device resides so the inclusion of this element is not required.
   * </pre>
   *
   * <code>.event_logging.v4.DeviceComplexType time_source = 2 [json_name = "timeSource"];</code>
   * @return The timeSource.
   */
  @java.lang.Override
  public uk.gov.gchq.event_logging.v4.DeviceComplexType getTimeSource() {
    return timeSource_ == null ? uk.gov.gchq.event_logging.v4.DeviceComplexType.getDefaultInstance() : timeSource_;
  }
  /**
   * <pre>
   * This is an optional element to be used to indicate the time source that the event creation time has been synchronised with. In most circumstances it is assumed that the event time has been synchronised with the corporate time service where the generating device resides so the inclusion of this element is not required.
   * </pre>
   *
   * <code>.event_logging.v4.DeviceComplexType time_source = 2 [json_name = "timeSource"];</code>
   */
  @java.lang.Override
  public uk.gov.gchq.event_logging.v4.DeviceComplexTypeOrBuilder getTimeSourceOrBuilder() {
    return timeSource_ == null ? uk.gov.gchq.event_logging.v4.DeviceComplexType.getDefaultInstance() : timeSource_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getTimeCreated());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getTimeSource());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTimeCreated());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTimeSource());
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
    if (!(obj instanceof uk.gov.gchq.event_logging.v4.EventTimeComplexType)) {
      return super.equals(obj);
    }
    uk.gov.gchq.event_logging.v4.EventTimeComplexType other = (uk.gov.gchq.event_logging.v4.EventTimeComplexType) obj;

    if (hasTimeCreated() != other.hasTimeCreated()) return false;
    if (hasTimeCreated()) {
      if (!getTimeCreated()
          .equals(other.getTimeCreated())) return false;
    }
    if (hasTimeSource() != other.hasTimeSource()) return false;
    if (hasTimeSource()) {
      if (!getTimeSource()
          .equals(other.getTimeSource())) return false;
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
    if (hasTimeCreated()) {
      hash = (37 * hash) + TIME_CREATED_FIELD_NUMBER;
      hash = (53 * hash) + getTimeCreated().hashCode();
    }
    if (hasTimeSource()) {
      hash = (37 * hash) + TIME_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getTimeSource().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static uk.gov.gchq.event_logging.v4.EventTimeComplexType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static uk.gov.gchq.event_logging.v4.EventTimeComplexType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static uk.gov.gchq.event_logging.v4.EventTimeComplexType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static uk.gov.gchq.event_logging.v4.EventTimeComplexType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static uk.gov.gchq.event_logging.v4.EventTimeComplexType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static uk.gov.gchq.event_logging.v4.EventTimeComplexType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static uk.gov.gchq.event_logging.v4.EventTimeComplexType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static uk.gov.gchq.event_logging.v4.EventTimeComplexType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static uk.gov.gchq.event_logging.v4.EventTimeComplexType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static uk.gov.gchq.event_logging.v4.EventTimeComplexType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static uk.gov.gchq.event_logging.v4.EventTimeComplexType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static uk.gov.gchq.event_logging.v4.EventTimeComplexType parseFrom(
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
  public static Builder newBuilder(uk.gov.gchq.event_logging.v4.EventTimeComplexType prototype) {
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
   * Describes the time the event was created.
   * </pre>
   *
   * Protobuf type {@code event_logging.v4.EventTimeComplexType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:event_logging.v4.EventTimeComplexType)
      uk.gov.gchq.event_logging.v4.EventTimeComplexTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return uk.gov.gchq.event_logging.v4.EventTimeComplexTypeProto.internal_static_event_logging_v4_EventTimeComplexType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return uk.gov.gchq.event_logging.v4.EventTimeComplexTypeProto.internal_static_event_logging_v4_EventTimeComplexType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              uk.gov.gchq.event_logging.v4.EventTimeComplexType.class, uk.gov.gchq.event_logging.v4.EventTimeComplexType.Builder.class);
    }

    // Construct using uk.gov.gchq.event_logging.v4.EventTimeComplexType.newBuilder()
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
        getTimeCreatedFieldBuilder();
        getTimeSourceFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      timeCreated_ = null;
      if (timeCreatedBuilder_ != null) {
        timeCreatedBuilder_.dispose();
        timeCreatedBuilder_ = null;
      }
      timeSource_ = null;
      if (timeSourceBuilder_ != null) {
        timeSourceBuilder_.dispose();
        timeSourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return uk.gov.gchq.event_logging.v4.EventTimeComplexTypeProto.internal_static_event_logging_v4_EventTimeComplexType_descriptor;
    }

    @java.lang.Override
    public uk.gov.gchq.event_logging.v4.EventTimeComplexType getDefaultInstanceForType() {
      return uk.gov.gchq.event_logging.v4.EventTimeComplexType.getDefaultInstance();
    }

    @java.lang.Override
    public uk.gov.gchq.event_logging.v4.EventTimeComplexType build() {
      uk.gov.gchq.event_logging.v4.EventTimeComplexType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public uk.gov.gchq.event_logging.v4.EventTimeComplexType buildPartial() {
      uk.gov.gchq.event_logging.v4.EventTimeComplexType result = new uk.gov.gchq.event_logging.v4.EventTimeComplexType(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(uk.gov.gchq.event_logging.v4.EventTimeComplexType result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.timeCreated_ = timeCreatedBuilder_ == null
            ? timeCreated_
            : timeCreatedBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.timeSource_ = timeSourceBuilder_ == null
            ? timeSource_
            : timeSourceBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof uk.gov.gchq.event_logging.v4.EventTimeComplexType) {
        return mergeFrom((uk.gov.gchq.event_logging.v4.EventTimeComplexType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(uk.gov.gchq.event_logging.v4.EventTimeComplexType other) {
      if (other == uk.gov.gchq.event_logging.v4.EventTimeComplexType.getDefaultInstance()) return this;
      if (other.hasTimeCreated()) {
        mergeTimeCreated(other.getTimeCreated());
      }
      if (other.hasTimeSource()) {
        mergeTimeSource(other.getTimeSource());
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
              input.readMessage(
                  getTimeCreatedFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getTimeSourceFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private com.google.protobuf.Timestamp timeCreated_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timeCreatedBuilder_;
    /**
     * <pre>
     * This element contains information about the time the event was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time_created = 1 [json_name = "timeCreated", (.buf.validate.field) = { ... }</code>
     * @return Whether the timeCreated field is set.
     */
    public boolean hasTimeCreated() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * This element contains information about the time the event was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time_created = 1 [json_name = "timeCreated", (.buf.validate.field) = { ... }</code>
     * @return The timeCreated.
     */
    public com.google.protobuf.Timestamp getTimeCreated() {
      if (timeCreatedBuilder_ == null) {
        return timeCreated_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timeCreated_;
      } else {
        return timeCreatedBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * This element contains information about the time the event was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time_created = 1 [json_name = "timeCreated", (.buf.validate.field) = { ... }</code>
     */
    public Builder setTimeCreated(com.google.protobuf.Timestamp value) {
      if (timeCreatedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timeCreated_ = value;
      } else {
        timeCreatedBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This element contains information about the time the event was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time_created = 1 [json_name = "timeCreated", (.buf.validate.field) = { ... }</code>
     */
    public Builder setTimeCreated(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timeCreatedBuilder_ == null) {
        timeCreated_ = builderForValue.build();
      } else {
        timeCreatedBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This element contains information about the time the event was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time_created = 1 [json_name = "timeCreated", (.buf.validate.field) = { ... }</code>
     */
    public Builder mergeTimeCreated(com.google.protobuf.Timestamp value) {
      if (timeCreatedBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          timeCreated_ != null &&
          timeCreated_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getTimeCreatedBuilder().mergeFrom(value);
        } else {
          timeCreated_ = value;
        }
      } else {
        timeCreatedBuilder_.mergeFrom(value);
      }
      if (timeCreated_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * This element contains information about the time the event was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time_created = 1 [json_name = "timeCreated", (.buf.validate.field) = { ... }</code>
     */
    public Builder clearTimeCreated() {
      bitField0_ = (bitField0_ & ~0x00000001);
      timeCreated_ = null;
      if (timeCreatedBuilder_ != null) {
        timeCreatedBuilder_.dispose();
        timeCreatedBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This element contains information about the time the event was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time_created = 1 [json_name = "timeCreated", (.buf.validate.field) = { ... }</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimeCreatedBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTimeCreatedFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * This element contains information about the time the event was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time_created = 1 [json_name = "timeCreated", (.buf.validate.field) = { ... }</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimeCreatedOrBuilder() {
      if (timeCreatedBuilder_ != null) {
        return timeCreatedBuilder_.getMessageOrBuilder();
      } else {
        return timeCreated_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : timeCreated_;
      }
    }
    /**
     * <pre>
     * This element contains information about the time the event was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time_created = 1 [json_name = "timeCreated", (.buf.validate.field) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimeCreatedFieldBuilder() {
      if (timeCreatedBuilder_ == null) {
        timeCreatedBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getTimeCreated(),
                getParentForChildren(),
                isClean());
        timeCreated_ = null;
      }
      return timeCreatedBuilder_;
    }

    private uk.gov.gchq.event_logging.v4.DeviceComplexType timeSource_;
    private com.google.protobuf.SingleFieldBuilder<
        uk.gov.gchq.event_logging.v4.DeviceComplexType, uk.gov.gchq.event_logging.v4.DeviceComplexType.Builder, uk.gov.gchq.event_logging.v4.DeviceComplexTypeOrBuilder> timeSourceBuilder_;
    /**
     * <pre>
     * This is an optional element to be used to indicate the time source that the event creation time has been synchronised with. In most circumstances it is assumed that the event time has been synchronised with the corporate time service where the generating device resides so the inclusion of this element is not required.
     * </pre>
     *
     * <code>.event_logging.v4.DeviceComplexType time_source = 2 [json_name = "timeSource"];</code>
     * @return Whether the timeSource field is set.
     */
    public boolean hasTimeSource() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * This is an optional element to be used to indicate the time source that the event creation time has been synchronised with. In most circumstances it is assumed that the event time has been synchronised with the corporate time service where the generating device resides so the inclusion of this element is not required.
     * </pre>
     *
     * <code>.event_logging.v4.DeviceComplexType time_source = 2 [json_name = "timeSource"];</code>
     * @return The timeSource.
     */
    public uk.gov.gchq.event_logging.v4.DeviceComplexType getTimeSource() {
      if (timeSourceBuilder_ == null) {
        return timeSource_ == null ? uk.gov.gchq.event_logging.v4.DeviceComplexType.getDefaultInstance() : timeSource_;
      } else {
        return timeSourceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * This is an optional element to be used to indicate the time source that the event creation time has been synchronised with. In most circumstances it is assumed that the event time has been synchronised with the corporate time service where the generating device resides so the inclusion of this element is not required.
     * </pre>
     *
     * <code>.event_logging.v4.DeviceComplexType time_source = 2 [json_name = "timeSource"];</code>
     */
    public Builder setTimeSource(uk.gov.gchq.event_logging.v4.DeviceComplexType value) {
      if (timeSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timeSource_ = value;
      } else {
        timeSourceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is an optional element to be used to indicate the time source that the event creation time has been synchronised with. In most circumstances it is assumed that the event time has been synchronised with the corporate time service where the generating device resides so the inclusion of this element is not required.
     * </pre>
     *
     * <code>.event_logging.v4.DeviceComplexType time_source = 2 [json_name = "timeSource"];</code>
     */
    public Builder setTimeSource(
        uk.gov.gchq.event_logging.v4.DeviceComplexType.Builder builderForValue) {
      if (timeSourceBuilder_ == null) {
        timeSource_ = builderForValue.build();
      } else {
        timeSourceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is an optional element to be used to indicate the time source that the event creation time has been synchronised with. In most circumstances it is assumed that the event time has been synchronised with the corporate time service where the generating device resides so the inclusion of this element is not required.
     * </pre>
     *
     * <code>.event_logging.v4.DeviceComplexType time_source = 2 [json_name = "timeSource"];</code>
     */
    public Builder mergeTimeSource(uk.gov.gchq.event_logging.v4.DeviceComplexType value) {
      if (timeSourceBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          timeSource_ != null &&
          timeSource_ != uk.gov.gchq.event_logging.v4.DeviceComplexType.getDefaultInstance()) {
          getTimeSourceBuilder().mergeFrom(value);
        } else {
          timeSource_ = value;
        }
      } else {
        timeSourceBuilder_.mergeFrom(value);
      }
      if (timeSource_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * This is an optional element to be used to indicate the time source that the event creation time has been synchronised with. In most circumstances it is assumed that the event time has been synchronised with the corporate time service where the generating device resides so the inclusion of this element is not required.
     * </pre>
     *
     * <code>.event_logging.v4.DeviceComplexType time_source = 2 [json_name = "timeSource"];</code>
     */
    public Builder clearTimeSource() {
      bitField0_ = (bitField0_ & ~0x00000002);
      timeSource_ = null;
      if (timeSourceBuilder_ != null) {
        timeSourceBuilder_.dispose();
        timeSourceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is an optional element to be used to indicate the time source that the event creation time has been synchronised with. In most circumstances it is assumed that the event time has been synchronised with the corporate time service where the generating device resides so the inclusion of this element is not required.
     * </pre>
     *
     * <code>.event_logging.v4.DeviceComplexType time_source = 2 [json_name = "timeSource"];</code>
     */
    public uk.gov.gchq.event_logging.v4.DeviceComplexType.Builder getTimeSourceBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTimeSourceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * This is an optional element to be used to indicate the time source that the event creation time has been synchronised with. In most circumstances it is assumed that the event time has been synchronised with the corporate time service where the generating device resides so the inclusion of this element is not required.
     * </pre>
     *
     * <code>.event_logging.v4.DeviceComplexType time_source = 2 [json_name = "timeSource"];</code>
     */
    public uk.gov.gchq.event_logging.v4.DeviceComplexTypeOrBuilder getTimeSourceOrBuilder() {
      if (timeSourceBuilder_ != null) {
        return timeSourceBuilder_.getMessageOrBuilder();
      } else {
        return timeSource_ == null ?
            uk.gov.gchq.event_logging.v4.DeviceComplexType.getDefaultInstance() : timeSource_;
      }
    }
    /**
     * <pre>
     * This is an optional element to be used to indicate the time source that the event creation time has been synchronised with. In most circumstances it is assumed that the event time has been synchronised with the corporate time service where the generating device resides so the inclusion of this element is not required.
     * </pre>
     *
     * <code>.event_logging.v4.DeviceComplexType time_source = 2 [json_name = "timeSource"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        uk.gov.gchq.event_logging.v4.DeviceComplexType, uk.gov.gchq.event_logging.v4.DeviceComplexType.Builder, uk.gov.gchq.event_logging.v4.DeviceComplexTypeOrBuilder> 
        getTimeSourceFieldBuilder() {
      if (timeSourceBuilder_ == null) {
        timeSourceBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            uk.gov.gchq.event_logging.v4.DeviceComplexType, uk.gov.gchq.event_logging.v4.DeviceComplexType.Builder, uk.gov.gchq.event_logging.v4.DeviceComplexTypeOrBuilder>(
                getTimeSource(),
                getParentForChildren(),
                isClean());
        timeSource_ = null;
      }
      return timeSourceBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:event_logging.v4.EventTimeComplexType)
  }

  // @@protoc_insertion_point(class_scope:event_logging.v4.EventTimeComplexType)
  private static final uk.gov.gchq.event_logging.v4.EventTimeComplexType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new uk.gov.gchq.event_logging.v4.EventTimeComplexType();
  }

  public static uk.gov.gchq.event_logging.v4.EventTimeComplexType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventTimeComplexType>
      PARSER = new com.google.protobuf.AbstractParser<EventTimeComplexType>() {
    @java.lang.Override
    public EventTimeComplexType parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventTimeComplexType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventTimeComplexType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public uk.gov.gchq.event_logging.v4.EventTimeComplexType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

