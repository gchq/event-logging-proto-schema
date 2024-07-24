// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/alert_severity_simple_type.proto
// Protobuf Java Version: 4.26.1

package event_logging.v4;

public final class AlertSeveritySimpleTypeOuterClass {
  private AlertSeveritySimpleTypeOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      AlertSeveritySimpleTypeOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * The severities that can be assigned to an alert, e.g. an error in a system or the alert from the detection of malware. They indicate how far-reaching the symptoms of the cause of the alert are.
   * </pre>
   *
   * Protobuf enum {@code event_logging.v4.AlertSeveritySimpleType}
   */
  public enum AlertSeveritySimpleType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Default
     * </pre>
     *
     * <code>ALERT_SEVERITY_SIMPLE_TYPE_UNSPECIFIED = 0;</code>
     */
    ALERT_SEVERITY_SIMPLE_TYPE_UNSPECIFIED(0),
    /**
     * <code>ALERT_SEVERITY_SIMPLE_TYPE_INFO = 1;</code>
     */
    ALERT_SEVERITY_SIMPLE_TYPE_INFO(1),
    /**
     * <code>ALERT_SEVERITY_SIMPLE_TYPE_MINOR = 2;</code>
     */
    ALERT_SEVERITY_SIMPLE_TYPE_MINOR(2),
    /**
     * <code>ALERT_SEVERITY_SIMPLE_TYPE_MAJOR = 3;</code>
     */
    ALERT_SEVERITY_SIMPLE_TYPE_MAJOR(3),
    /**
     * <code>ALERT_SEVERITY_SIMPLE_TYPE_CRITICAL = 4;</code>
     */
    ALERT_SEVERITY_SIMPLE_TYPE_CRITICAL(4),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 26,
        /* patch= */ 1,
        /* suffix= */ "",
        AlertSeveritySimpleType.class.getName());
    }
    /**
     * <pre>
     * Default
     * </pre>
     *
     * <code>ALERT_SEVERITY_SIMPLE_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int ALERT_SEVERITY_SIMPLE_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     * <code>ALERT_SEVERITY_SIMPLE_TYPE_INFO = 1;</code>
     */
    public static final int ALERT_SEVERITY_SIMPLE_TYPE_INFO_VALUE = 1;
    /**
     * <code>ALERT_SEVERITY_SIMPLE_TYPE_MINOR = 2;</code>
     */
    public static final int ALERT_SEVERITY_SIMPLE_TYPE_MINOR_VALUE = 2;
    /**
     * <code>ALERT_SEVERITY_SIMPLE_TYPE_MAJOR = 3;</code>
     */
    public static final int ALERT_SEVERITY_SIMPLE_TYPE_MAJOR_VALUE = 3;
    /**
     * <code>ALERT_SEVERITY_SIMPLE_TYPE_CRITICAL = 4;</code>
     */
    public static final int ALERT_SEVERITY_SIMPLE_TYPE_CRITICAL_VALUE = 4;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AlertSeveritySimpleType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AlertSeveritySimpleType forNumber(int value) {
      switch (value) {
        case 0: return ALERT_SEVERITY_SIMPLE_TYPE_UNSPECIFIED;
        case 1: return ALERT_SEVERITY_SIMPLE_TYPE_INFO;
        case 2: return ALERT_SEVERITY_SIMPLE_TYPE_MINOR;
        case 3: return ALERT_SEVERITY_SIMPLE_TYPE_MAJOR;
        case 4: return ALERT_SEVERITY_SIMPLE_TYPE_CRITICAL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AlertSeveritySimpleType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AlertSeveritySimpleType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AlertSeveritySimpleType>() {
            public AlertSeveritySimpleType findValueByNumber(int number) {
              return AlertSeveritySimpleType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return event_logging.v4.AlertSeveritySimpleTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final AlertSeveritySimpleType[] VALUES = values();

    public static AlertSeveritySimpleType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AlertSeveritySimpleType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:event_logging.v4.AlertSeveritySimpleType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1event_logging/v4/alert_severity_simple" +
      "_type.proto\022\020event_logging.v4\032\033buf/valid" +
      "ate/validate.proto*\337\001\n\027AlertSeveritySimp" +
      "leType\022*\n&ALERT_SEVERITY_SIMPLE_TYPE_UNS" +
      "PECIFIED\020\000\022#\n\037ALERT_SEVERITY_SIMPLE_TYPE" +
      "_INFO\020\001\022$\n ALERT_SEVERITY_SIMPLE_TYPE_MI" +
      "NOR\020\002\022$\n ALERT_SEVERITY_SIMPLE_TYPE_MAJO" +
      "R\020\003\022\'\n#ALERT_SEVERITY_SIMPLE_TYPE_CRITIC" +
      "AL\020\004b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          build.buf.validate.ValidateProto.getDescriptor(),
        });
    descriptor.resolveAllFeaturesImmutable();
    build.buf.validate.ValidateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}