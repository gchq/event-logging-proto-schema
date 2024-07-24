// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/organisation_complex_type.proto
// Protobuf Java Version: 4.26.1

package event_logging.v4;

public final class OrganisationComplexTypeOuterClass {
  private OrganisationComplexTypeOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      OrganisationComplexTypeOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OrganisationComplexTypeOrBuilder extends
      // @@protoc_insertion_point(interface_extends:event_logging.v4.OrganisationComplexType)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * An ISO 3166 alpha-3 trigraph for the country the organisation belongs to. E.g. 'GBR'.
     * </pre>
     *
     * <code>string country = 1 [(.buf.validate.field) = { ... }</code>
     * @return The country.
     */
    java.lang.String getCountry();
    /**
     * <pre>
     * An ISO 3166 alpha-3 trigraph for the country the organisation belongs to. E.g. 'GBR'.
     * </pre>
     *
     * <code>string country = 1 [(.buf.validate.field) = { ... }</code>
     * @return The bytes for country.
     */
    com.google.protobuf.ByteString
        getCountryBytes();

    /**
     * <pre>
     * The code or name for the organisation. E.g. 'Group HQ', 'Telecoms Division', etc.
     * </pre>
     *
     * <code>string organisation = 2 [(.buf.validate.field) = { ... }</code>
     * @return The organisation.
     */
    java.lang.String getOrganisation();
    /**
     * <pre>
     * The code or name for the organisation. E.g. 'Group HQ', 'Telecoms Division', etc.
     * </pre>
     *
     * <code>string organisation = 2 [(.buf.validate.field) = { ... }</code>
     * @return The bytes for organisation.
     */
    com.google.protobuf.ByteString
        getOrganisationBytes();
  }
  /**
   * <pre>
   * Describes an organisation optionally qualified by its country
   * </pre>
   *
   * Protobuf type {@code event_logging.v4.OrganisationComplexType}
   */
  public static final class OrganisationComplexType extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:event_logging.v4.OrganisationComplexType)
      OrganisationComplexTypeOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 26,
        /* patch= */ 1,
        /* suffix= */ "",
        OrganisationComplexType.class.getName());
    }
    // Use OrganisationComplexType.newBuilder() to construct.
    private OrganisationComplexType(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private OrganisationComplexType() {
      country_ = "";
      organisation_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return event_logging.v4.OrganisationComplexTypeOuterClass.internal_static_event_logging_v4_OrganisationComplexType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return event_logging.v4.OrganisationComplexTypeOuterClass.internal_static_event_logging_v4_OrganisationComplexType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType.class, event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType.Builder.class);
    }

    public static final int COUNTRY_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object country_ = "";
    /**
     * <pre>
     * An ISO 3166 alpha-3 trigraph for the country the organisation belongs to. E.g. 'GBR'.
     * </pre>
     *
     * <code>string country = 1 [(.buf.validate.field) = { ... }</code>
     * @return The country.
     */
    @java.lang.Override
    public java.lang.String getCountry() {
      java.lang.Object ref = country_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        country_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * An ISO 3166 alpha-3 trigraph for the country the organisation belongs to. E.g. 'GBR'.
     * </pre>
     *
     * <code>string country = 1 [(.buf.validate.field) = { ... }</code>
     * @return The bytes for country.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCountryBytes() {
      java.lang.Object ref = country_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        country_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ORGANISATION_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object organisation_ = "";
    /**
     * <pre>
     * The code or name for the organisation. E.g. 'Group HQ', 'Telecoms Division', etc.
     * </pre>
     *
     * <code>string organisation = 2 [(.buf.validate.field) = { ... }</code>
     * @return The organisation.
     */
    @java.lang.Override
    public java.lang.String getOrganisation() {
      java.lang.Object ref = organisation_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        organisation_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * The code or name for the organisation. E.g. 'Group HQ', 'Telecoms Division', etc.
     * </pre>
     *
     * <code>string organisation = 2 [(.buf.validate.field) = { ... }</code>
     * @return The bytes for organisation.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getOrganisationBytes() {
      java.lang.Object ref = organisation_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        organisation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(country_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 1, country_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(organisation_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 2, organisation_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(country_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, country_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(organisation_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(2, organisation_);
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
      if (!(obj instanceof event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType)) {
        return super.equals(obj);
      }
      event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType other = (event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType) obj;

      if (!getCountry()
          .equals(other.getCountry())) return false;
      if (!getOrganisation()
          .equals(other.getOrganisation())) return false;
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
      hash = (37 * hash) + COUNTRY_FIELD_NUMBER;
      hash = (53 * hash) + getCountry().hashCode();
      hash = (37 * hash) + ORGANISATION_FIELD_NUMBER;
      hash = (53 * hash) + getOrganisation().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType parseFrom(
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
    public static Builder newBuilder(event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType prototype) {
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
     * Describes an organisation optionally qualified by its country
     * </pre>
     *
     * Protobuf type {@code event_logging.v4.OrganisationComplexType}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:event_logging.v4.OrganisationComplexType)
        event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexTypeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return event_logging.v4.OrganisationComplexTypeOuterClass.internal_static_event_logging_v4_OrganisationComplexType_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return event_logging.v4.OrganisationComplexTypeOuterClass.internal_static_event_logging_v4_OrganisationComplexType_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType.class, event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType.Builder.class);
      }

      // Construct using event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType.newBuilder()
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
        country_ = "";
        organisation_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return event_logging.v4.OrganisationComplexTypeOuterClass.internal_static_event_logging_v4_OrganisationComplexType_descriptor;
      }

      @java.lang.Override
      public event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType getDefaultInstanceForType() {
        return event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType.getDefaultInstance();
      }

      @java.lang.Override
      public event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType build() {
        event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType buildPartial() {
        event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType result = new event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.country_ = country_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.organisation_ = organisation_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType) {
          return mergeFrom((event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType other) {
        if (other == event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType.getDefaultInstance()) return this;
        if (!other.getCountry().isEmpty()) {
          country_ = other.country_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getOrganisation().isEmpty()) {
          organisation_ = other.organisation_;
          bitField0_ |= 0x00000002;
          onChanged();
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
                country_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                organisation_ = input.readStringRequireUtf8();
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

      private java.lang.Object country_ = "";
      /**
       * <pre>
       * An ISO 3166 alpha-3 trigraph for the country the organisation belongs to. E.g. 'GBR'.
       * </pre>
       *
       * <code>string country = 1 [(.buf.validate.field) = { ... }</code>
       * @return The country.
       */
      public java.lang.String getCountry() {
        java.lang.Object ref = country_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          country_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * An ISO 3166 alpha-3 trigraph for the country the organisation belongs to. E.g. 'GBR'.
       * </pre>
       *
       * <code>string country = 1 [(.buf.validate.field) = { ... }</code>
       * @return The bytes for country.
       */
      public com.google.protobuf.ByteString
          getCountryBytes() {
        java.lang.Object ref = country_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          country_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * An ISO 3166 alpha-3 trigraph for the country the organisation belongs to. E.g. 'GBR'.
       * </pre>
       *
       * <code>string country = 1 [(.buf.validate.field) = { ... }</code>
       * @param value The country to set.
       * @return This builder for chaining.
       */
      public Builder setCountry(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        country_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * An ISO 3166 alpha-3 trigraph for the country the organisation belongs to. E.g. 'GBR'.
       * </pre>
       *
       * <code>string country = 1 [(.buf.validate.field) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearCountry() {
        country_ = getDefaultInstance().getCountry();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * An ISO 3166 alpha-3 trigraph for the country the organisation belongs to. E.g. 'GBR'.
       * </pre>
       *
       * <code>string country = 1 [(.buf.validate.field) = { ... }</code>
       * @param value The bytes for country to set.
       * @return This builder for chaining.
       */
      public Builder setCountryBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        country_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object organisation_ = "";
      /**
       * <pre>
       * The code or name for the organisation. E.g. 'Group HQ', 'Telecoms Division', etc.
       * </pre>
       *
       * <code>string organisation = 2 [(.buf.validate.field) = { ... }</code>
       * @return The organisation.
       */
      public java.lang.String getOrganisation() {
        java.lang.Object ref = organisation_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          organisation_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * The code or name for the organisation. E.g. 'Group HQ', 'Telecoms Division', etc.
       * </pre>
       *
       * <code>string organisation = 2 [(.buf.validate.field) = { ... }</code>
       * @return The bytes for organisation.
       */
      public com.google.protobuf.ByteString
          getOrganisationBytes() {
        java.lang.Object ref = organisation_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          organisation_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * The code or name for the organisation. E.g. 'Group HQ', 'Telecoms Division', etc.
       * </pre>
       *
       * <code>string organisation = 2 [(.buf.validate.field) = { ... }</code>
       * @param value The organisation to set.
       * @return This builder for chaining.
       */
      public Builder setOrganisation(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        organisation_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The code or name for the organisation. E.g. 'Group HQ', 'Telecoms Division', etc.
       * </pre>
       *
       * <code>string organisation = 2 [(.buf.validate.field) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearOrganisation() {
        organisation_ = getDefaultInstance().getOrganisation();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The code or name for the organisation. E.g. 'Group HQ', 'Telecoms Division', etc.
       * </pre>
       *
       * <code>string organisation = 2 [(.buf.validate.field) = { ... }</code>
       * @param value The bytes for organisation to set.
       * @return This builder for chaining.
       */
      public Builder setOrganisationBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        organisation_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:event_logging.v4.OrganisationComplexType)
    }

    // @@protoc_insertion_point(class_scope:event_logging.v4.OrganisationComplexType)
    private static final event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType();
    }

    public static event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OrganisationComplexType>
        PARSER = new com.google.protobuf.AbstractParser<OrganisationComplexType>() {
      @java.lang.Override
      public OrganisationComplexType parsePartialFrom(
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

    public static com.google.protobuf.Parser<OrganisationComplexType> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OrganisationComplexType> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public event_logging.v4.OrganisationComplexTypeOuterClass.OrganisationComplexType getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_event_logging_v4_OrganisationComplexType_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_OrganisationComplexType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0event_logging/v4/organisation_complex_" +
      "type.proto\022\020event_logging.v4\032\033buf/valida" +
      "te/validate.proto\"[\n\027OrganisationComplex" +
      "Type\022\"\n\007country\030\001 \001(\tB\021\272H\016r\0142\n([A-Z]{3})" +
      "\022\034\n\014organisation\030\002 \001(\tB\006\272H\003\310\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          build.buf.validate.ValidateProto.getDescriptor(),
        });
    internal_static_event_logging_v4_OrganisationComplexType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_event_logging_v4_OrganisationComplexType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_OrganisationComplexType_descriptor,
        new java.lang.String[] { "Country", "Organisation", });
    descriptor.resolveAllFeaturesImmutable();
    build.buf.validate.ValidateProto.getDescriptor();
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(build.buf.validate.ValidateProto.field);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
