// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/user_complex_type.proto

// Protobuf Java Version: 4.26.1
package uk.gov.gchq.event_logging.v4;

/**
 * <pre>
 * Describes a collection of group entities, e.g. user groups or access control groups.
 * </pre>
 *
 * Protobuf type {@code event_logging.v4.GroupsComplexType}
 */
public final class GroupsComplexType extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:event_logging.v4.GroupsComplexType)
    GroupsComplexTypeOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      GroupsComplexType.class.getName());
  }
  // Use GroupsComplexType.newBuilder() to construct.
  private GroupsComplexType(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GroupsComplexType() {
    group_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return uk.gov.gchq.event_logging.v4.UserComplexTypeProto.internal_static_event_logging_v4_GroupsComplexType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return uk.gov.gchq.event_logging.v4.UserComplexTypeProto.internal_static_event_logging_v4_GroupsComplexType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            uk.gov.gchq.event_logging.v4.GroupsComplexType.class, uk.gov.gchq.event_logging.v4.GroupsComplexType.Builder.class);
  }

  public static final int GROUP_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<uk.gov.gchq.event_logging.v4.GroupComplexType> group_;
  /**
   * <pre>
   * One or more group entities, e.g. user groups or access control groups.
   * </pre>
   *
   * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public java.util.List<uk.gov.gchq.event_logging.v4.GroupComplexType> getGroupList() {
    return group_;
  }
  /**
   * <pre>
   * One or more group entities, e.g. user groups or access control groups.
   * </pre>
   *
   * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public java.util.List<? extends uk.gov.gchq.event_logging.v4.GroupComplexTypeOrBuilder> 
      getGroupOrBuilderList() {
    return group_;
  }
  /**
   * <pre>
   * One or more group entities, e.g. user groups or access control groups.
   * </pre>
   *
   * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public int getGroupCount() {
    return group_.size();
  }
  /**
   * <pre>
   * One or more group entities, e.g. user groups or access control groups.
   * </pre>
   *
   * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public uk.gov.gchq.event_logging.v4.GroupComplexType getGroup(int index) {
    return group_.get(index);
  }
  /**
   * <pre>
   * One or more group entities, e.g. user groups or access control groups.
   * </pre>
   *
   * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public uk.gov.gchq.event_logging.v4.GroupComplexTypeOrBuilder getGroupOrBuilder(
      int index) {
    return group_.get(index);
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
    for (int i = 0; i < group_.size(); i++) {
      output.writeMessage(1, group_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < group_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, group_.get(i));
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
    if (!(obj instanceof uk.gov.gchq.event_logging.v4.GroupsComplexType)) {
      return super.equals(obj);
    }
    uk.gov.gchq.event_logging.v4.GroupsComplexType other = (uk.gov.gchq.event_logging.v4.GroupsComplexType) obj;

    if (!getGroupList()
        .equals(other.getGroupList())) return false;
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
    if (getGroupCount() > 0) {
      hash = (37 * hash) + GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getGroupList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static uk.gov.gchq.event_logging.v4.GroupsComplexType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static uk.gov.gchq.event_logging.v4.GroupsComplexType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static uk.gov.gchq.event_logging.v4.GroupsComplexType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static uk.gov.gchq.event_logging.v4.GroupsComplexType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static uk.gov.gchq.event_logging.v4.GroupsComplexType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static uk.gov.gchq.event_logging.v4.GroupsComplexType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static uk.gov.gchq.event_logging.v4.GroupsComplexType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static uk.gov.gchq.event_logging.v4.GroupsComplexType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static uk.gov.gchq.event_logging.v4.GroupsComplexType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static uk.gov.gchq.event_logging.v4.GroupsComplexType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static uk.gov.gchq.event_logging.v4.GroupsComplexType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static uk.gov.gchq.event_logging.v4.GroupsComplexType parseFrom(
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
  public static Builder newBuilder(uk.gov.gchq.event_logging.v4.GroupsComplexType prototype) {
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
   * Describes a collection of group entities, e.g. user groups or access control groups.
   * </pre>
   *
   * Protobuf type {@code event_logging.v4.GroupsComplexType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:event_logging.v4.GroupsComplexType)
      uk.gov.gchq.event_logging.v4.GroupsComplexTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return uk.gov.gchq.event_logging.v4.UserComplexTypeProto.internal_static_event_logging_v4_GroupsComplexType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return uk.gov.gchq.event_logging.v4.UserComplexTypeProto.internal_static_event_logging_v4_GroupsComplexType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              uk.gov.gchq.event_logging.v4.GroupsComplexType.class, uk.gov.gchq.event_logging.v4.GroupsComplexType.Builder.class);
    }

    // Construct using uk.gov.gchq.event_logging.v4.GroupsComplexType.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (groupBuilder_ == null) {
        group_ = java.util.Collections.emptyList();
      } else {
        group_ = null;
        groupBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return uk.gov.gchq.event_logging.v4.UserComplexTypeProto.internal_static_event_logging_v4_GroupsComplexType_descriptor;
    }

    @java.lang.Override
    public uk.gov.gchq.event_logging.v4.GroupsComplexType getDefaultInstanceForType() {
      return uk.gov.gchq.event_logging.v4.GroupsComplexType.getDefaultInstance();
    }

    @java.lang.Override
    public uk.gov.gchq.event_logging.v4.GroupsComplexType build() {
      uk.gov.gchq.event_logging.v4.GroupsComplexType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public uk.gov.gchq.event_logging.v4.GroupsComplexType buildPartial() {
      uk.gov.gchq.event_logging.v4.GroupsComplexType result = new uk.gov.gchq.event_logging.v4.GroupsComplexType(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(uk.gov.gchq.event_logging.v4.GroupsComplexType result) {
      if (groupBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          group_ = java.util.Collections.unmodifiableList(group_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.group_ = group_;
      } else {
        result.group_ = groupBuilder_.build();
      }
    }

    private void buildPartial0(uk.gov.gchq.event_logging.v4.GroupsComplexType result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof uk.gov.gchq.event_logging.v4.GroupsComplexType) {
        return mergeFrom((uk.gov.gchq.event_logging.v4.GroupsComplexType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(uk.gov.gchq.event_logging.v4.GroupsComplexType other) {
      if (other == uk.gov.gchq.event_logging.v4.GroupsComplexType.getDefaultInstance()) return this;
      if (groupBuilder_ == null) {
        if (!other.group_.isEmpty()) {
          if (group_.isEmpty()) {
            group_ = other.group_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGroupIsMutable();
            group_.addAll(other.group_);
          }
          onChanged();
        }
      } else {
        if (!other.group_.isEmpty()) {
          if (groupBuilder_.isEmpty()) {
            groupBuilder_.dispose();
            groupBuilder_ = null;
            group_ = other.group_;
            bitField0_ = (bitField0_ & ~0x00000001);
            groupBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getGroupFieldBuilder() : null;
          } else {
            groupBuilder_.addAllMessages(other.group_);
          }
        }
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
              uk.gov.gchq.event_logging.v4.GroupComplexType m =
                  input.readMessage(
                      uk.gov.gchq.event_logging.v4.GroupComplexType.parser(),
                      extensionRegistry);
              if (groupBuilder_ == null) {
                ensureGroupIsMutable();
                group_.add(m);
              } else {
                groupBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<uk.gov.gchq.event_logging.v4.GroupComplexType> group_ =
      java.util.Collections.emptyList();
    private void ensureGroupIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        group_ = new java.util.ArrayList<uk.gov.gchq.event_logging.v4.GroupComplexType>(group_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        uk.gov.gchq.event_logging.v4.GroupComplexType, uk.gov.gchq.event_logging.v4.GroupComplexType.Builder, uk.gov.gchq.event_logging.v4.GroupComplexTypeOrBuilder> groupBuilder_;

    /**
     * <pre>
     * One or more group entities, e.g. user groups or access control groups.
     * </pre>
     *
     * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
     */
    public java.util.List<uk.gov.gchq.event_logging.v4.GroupComplexType> getGroupList() {
      if (groupBuilder_ == null) {
        return java.util.Collections.unmodifiableList(group_);
      } else {
        return groupBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * One or more group entities, e.g. user groups or access control groups.
     * </pre>
     *
     * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
     */
    public int getGroupCount() {
      if (groupBuilder_ == null) {
        return group_.size();
      } else {
        return groupBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * One or more group entities, e.g. user groups or access control groups.
     * </pre>
     *
     * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
     */
    public uk.gov.gchq.event_logging.v4.GroupComplexType getGroup(int index) {
      if (groupBuilder_ == null) {
        return group_.get(index);
      } else {
        return groupBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * One or more group entities, e.g. user groups or access control groups.
     * </pre>
     *
     * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
     */
    public Builder setGroup(
        int index, uk.gov.gchq.event_logging.v4.GroupComplexType value) {
      if (groupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupIsMutable();
        group_.set(index, value);
        onChanged();
      } else {
        groupBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * One or more group entities, e.g. user groups or access control groups.
     * </pre>
     *
     * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
     */
    public Builder setGroup(
        int index, uk.gov.gchq.event_logging.v4.GroupComplexType.Builder builderForValue) {
      if (groupBuilder_ == null) {
        ensureGroupIsMutable();
        group_.set(index, builderForValue.build());
        onChanged();
      } else {
        groupBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * One or more group entities, e.g. user groups or access control groups.
     * </pre>
     *
     * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
     */
    public Builder addGroup(uk.gov.gchq.event_logging.v4.GroupComplexType value) {
      if (groupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupIsMutable();
        group_.add(value);
        onChanged();
      } else {
        groupBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * One or more group entities, e.g. user groups or access control groups.
     * </pre>
     *
     * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
     */
    public Builder addGroup(
        int index, uk.gov.gchq.event_logging.v4.GroupComplexType value) {
      if (groupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupIsMutable();
        group_.add(index, value);
        onChanged();
      } else {
        groupBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * One or more group entities, e.g. user groups or access control groups.
     * </pre>
     *
     * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
     */
    public Builder addGroup(
        uk.gov.gchq.event_logging.v4.GroupComplexType.Builder builderForValue) {
      if (groupBuilder_ == null) {
        ensureGroupIsMutable();
        group_.add(builderForValue.build());
        onChanged();
      } else {
        groupBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * One or more group entities, e.g. user groups or access control groups.
     * </pre>
     *
     * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
     */
    public Builder addGroup(
        int index, uk.gov.gchq.event_logging.v4.GroupComplexType.Builder builderForValue) {
      if (groupBuilder_ == null) {
        ensureGroupIsMutable();
        group_.add(index, builderForValue.build());
        onChanged();
      } else {
        groupBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * One or more group entities, e.g. user groups or access control groups.
     * </pre>
     *
     * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
     */
    public Builder addAllGroup(
        java.lang.Iterable<? extends uk.gov.gchq.event_logging.v4.GroupComplexType> values) {
      if (groupBuilder_ == null) {
        ensureGroupIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, group_);
        onChanged();
      } else {
        groupBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * One or more group entities, e.g. user groups or access control groups.
     * </pre>
     *
     * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
     */
    public Builder clearGroup() {
      if (groupBuilder_ == null) {
        group_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        groupBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * One or more group entities, e.g. user groups or access control groups.
     * </pre>
     *
     * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
     */
    public Builder removeGroup(int index) {
      if (groupBuilder_ == null) {
        ensureGroupIsMutable();
        group_.remove(index);
        onChanged();
      } else {
        groupBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * One or more group entities, e.g. user groups or access control groups.
     * </pre>
     *
     * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
     */
    public uk.gov.gchq.event_logging.v4.GroupComplexType.Builder getGroupBuilder(
        int index) {
      return getGroupFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * One or more group entities, e.g. user groups or access control groups.
     * </pre>
     *
     * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
     */
    public uk.gov.gchq.event_logging.v4.GroupComplexTypeOrBuilder getGroupOrBuilder(
        int index) {
      if (groupBuilder_ == null) {
        return group_.get(index);  } else {
        return groupBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * One or more group entities, e.g. user groups or access control groups.
     * </pre>
     *
     * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
     */
    public java.util.List<? extends uk.gov.gchq.event_logging.v4.GroupComplexTypeOrBuilder> 
         getGroupOrBuilderList() {
      if (groupBuilder_ != null) {
        return groupBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(group_);
      }
    }
    /**
     * <pre>
     * One or more group entities, e.g. user groups or access control groups.
     * </pre>
     *
     * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
     */
    public uk.gov.gchq.event_logging.v4.GroupComplexType.Builder addGroupBuilder() {
      return getGroupFieldBuilder().addBuilder(
          uk.gov.gchq.event_logging.v4.GroupComplexType.getDefaultInstance());
    }
    /**
     * <pre>
     * One or more group entities, e.g. user groups or access control groups.
     * </pre>
     *
     * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
     */
    public uk.gov.gchq.event_logging.v4.GroupComplexType.Builder addGroupBuilder(
        int index) {
      return getGroupFieldBuilder().addBuilder(
          index, uk.gov.gchq.event_logging.v4.GroupComplexType.getDefaultInstance());
    }
    /**
     * <pre>
     * One or more group entities, e.g. user groups or access control groups.
     * </pre>
     *
     * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
     */
    public java.util.List<uk.gov.gchq.event_logging.v4.GroupComplexType.Builder> 
         getGroupBuilderList() {
      return getGroupFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        uk.gov.gchq.event_logging.v4.GroupComplexType, uk.gov.gchq.event_logging.v4.GroupComplexType.Builder, uk.gov.gchq.event_logging.v4.GroupComplexTypeOrBuilder> 
        getGroupFieldBuilder() {
      if (groupBuilder_ == null) {
        groupBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            uk.gov.gchq.event_logging.v4.GroupComplexType, uk.gov.gchq.event_logging.v4.GroupComplexType.Builder, uk.gov.gchq.event_logging.v4.GroupComplexTypeOrBuilder>(
                group_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        group_ = null;
      }
      return groupBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:event_logging.v4.GroupsComplexType)
  }

  // @@protoc_insertion_point(class_scope:event_logging.v4.GroupsComplexType)
  private static final uk.gov.gchq.event_logging.v4.GroupsComplexType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new uk.gov.gchq.event_logging.v4.GroupsComplexType();
  }

  public static uk.gov.gchq.event_logging.v4.GroupsComplexType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GroupsComplexType>
      PARSER = new com.google.protobuf.AbstractParser<GroupsComplexType>() {
    @java.lang.Override
    public GroupsComplexType parsePartialFrom(
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

  public static com.google.protobuf.Parser<GroupsComplexType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GroupsComplexType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public uk.gov.gchq.event_logging.v4.GroupsComplexType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
