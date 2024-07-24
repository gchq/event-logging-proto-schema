// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/change_action_simple_type.proto

// Protobuf Java Version: 4.26.1
package uk.gov.gchq.event_logging.v4;

/**
 * <pre>
 * The action performed by the file/directory monitor, e.g. starting to scan files for changes, or the detection of a file change.
 * </pre>
 *
 * Protobuf enum {@code event_logging.v4.ChangeActionSimpleType}
 */
public enum ChangeActionSimpleType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Default
   * </pre>
   *
   * <code>CHANGE_ACTION_SIMPLE_TYPE_UNSPECIFIED = 0;</code>
   */
  CHANGE_ACTION_SIMPLE_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * The file/directory monitor is started.
   * </pre>
   *
   * <code>CHANGE_ACTION_SIMPLE_TYPE_START_SCAN = 1;</code>
   */
  CHANGE_ACTION_SIMPLE_TYPE_START_SCAN(1),
  /**
   * <pre>
   * The file/directory monitor is stopped.
   * </pre>
   *
   * <code>CHANGE_ACTION_SIMPLE_TYPE_STOP_SCAN = 2;</code>
   */
  CHANGE_ACTION_SIMPLE_TYPE_STOP_SCAN(2),
  /**
   * <pre>
   * A new file had been added to the monitored directory.
   * </pre>
   *
   * <code>CHANGE_ACTION_SIMPLE_TYPE_FILE_ADDED = 3;</code>
   */
  CHANGE_ACTION_SIMPLE_TYPE_FILE_ADDED(3),
  /**
   * <pre>
   * A file has been removed from the monitored directory.
   * </pre>
   *
   * <code>CHANGE_ACTION_SIMPLE_TYPE_FILE_REMOVED = 4;</code>
   */
  CHANGE_ACTION_SIMPLE_TYPE_FILE_REMOVED(4),
  /**
   * <pre>
   * A monitored file has been modified.
   * </pre>
   *
   * <code>CHANGE_ACTION_SIMPLE_TYPE_FILE_MODIFIED = 5;</code>
   */
  CHANGE_ACTION_SIMPLE_TYPE_FILE_MODIFIED(5),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      ChangeActionSimpleType.class.getName());
  }
  /**
   * <pre>
   * Default
   * </pre>
   *
   * <code>CHANGE_ACTION_SIMPLE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int CHANGE_ACTION_SIMPLE_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * The file/directory monitor is started.
   * </pre>
   *
   * <code>CHANGE_ACTION_SIMPLE_TYPE_START_SCAN = 1;</code>
   */
  public static final int CHANGE_ACTION_SIMPLE_TYPE_START_SCAN_VALUE = 1;
  /**
   * <pre>
   * The file/directory monitor is stopped.
   * </pre>
   *
   * <code>CHANGE_ACTION_SIMPLE_TYPE_STOP_SCAN = 2;</code>
   */
  public static final int CHANGE_ACTION_SIMPLE_TYPE_STOP_SCAN_VALUE = 2;
  /**
   * <pre>
   * A new file had been added to the monitored directory.
   * </pre>
   *
   * <code>CHANGE_ACTION_SIMPLE_TYPE_FILE_ADDED = 3;</code>
   */
  public static final int CHANGE_ACTION_SIMPLE_TYPE_FILE_ADDED_VALUE = 3;
  /**
   * <pre>
   * A file has been removed from the monitored directory.
   * </pre>
   *
   * <code>CHANGE_ACTION_SIMPLE_TYPE_FILE_REMOVED = 4;</code>
   */
  public static final int CHANGE_ACTION_SIMPLE_TYPE_FILE_REMOVED_VALUE = 4;
  /**
   * <pre>
   * A monitored file has been modified.
   * </pre>
   *
   * <code>CHANGE_ACTION_SIMPLE_TYPE_FILE_MODIFIED = 5;</code>
   */
  public static final int CHANGE_ACTION_SIMPLE_TYPE_FILE_MODIFIED_VALUE = 5;


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
  public static ChangeActionSimpleType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ChangeActionSimpleType forNumber(int value) {
    switch (value) {
      case 0: return CHANGE_ACTION_SIMPLE_TYPE_UNSPECIFIED;
      case 1: return CHANGE_ACTION_SIMPLE_TYPE_START_SCAN;
      case 2: return CHANGE_ACTION_SIMPLE_TYPE_STOP_SCAN;
      case 3: return CHANGE_ACTION_SIMPLE_TYPE_FILE_ADDED;
      case 4: return CHANGE_ACTION_SIMPLE_TYPE_FILE_REMOVED;
      case 5: return CHANGE_ACTION_SIMPLE_TYPE_FILE_MODIFIED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ChangeActionSimpleType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ChangeActionSimpleType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ChangeActionSimpleType>() {
          public ChangeActionSimpleType findValueByNumber(int number) {
            return ChangeActionSimpleType.forNumber(number);
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
    return uk.gov.gchq.event_logging.v4.ChangeActionSimpleTypeProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ChangeActionSimpleType[] VALUES = values();

  public static ChangeActionSimpleType valueOf(
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

  private ChangeActionSimpleType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:event_logging.v4.ChangeActionSimpleType)
}
