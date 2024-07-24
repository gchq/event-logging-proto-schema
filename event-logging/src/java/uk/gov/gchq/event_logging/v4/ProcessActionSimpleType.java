// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/process_action_simple_type.proto

// Protobuf Java Version: 4.26.1
package uk.gov.gchq.event_logging.v4;

/**
 * <pre>
 * The types of action in a process event, e.g. executing a shell script.
 * </pre>
 *
 * Protobuf enum {@code event_logging.v4.ProcessActionSimpleType}
 */
public enum ProcessActionSimpleType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Default
   * </pre>
   *
   * <code>PROCESS_ACTION_SIMPLE_TYPE_UNSPECIFIED = 0;</code>
   */
  PROCESS_ACTION_SIMPLE_TYPE_UNSPECIFIED(0),
  /**
   * <code>PROCESS_ACTION_SIMPLE_TYPE_STARTUP = 1;</code>
   */
  PROCESS_ACTION_SIMPLE_TYPE_STARTUP(1),
  /**
   * <code>PROCESS_ACTION_SIMPLE_TYPE_SHUTDOWN = 2;</code>
   */
  PROCESS_ACTION_SIMPLE_TYPE_SHUTDOWN(2),
  /**
   * <code>PROCESS_ACTION_SIMPLE_TYPE_EXECUTE = 3;</code>
   */
  PROCESS_ACTION_SIMPLE_TYPE_EXECUTE(3),
  /**
   * <code>PROCESS_ACTION_SIMPLE_TYPE_TERMINATE = 4;</code>
   */
  PROCESS_ACTION_SIMPLE_TYPE_TERMINATE(4),
  /**
   * <code>PROCESS_ACTION_SIMPLE_TYPE_CHANGE_DIR = 5;</code>
   */
  PROCESS_ACTION_SIMPLE_TYPE_CHANGE_DIR(5),
  /**
   * <code>PROCESS_ACTION_SIMPLE_TYPE_CALL = 6;</code>
   */
  PROCESS_ACTION_SIMPLE_TYPE_CALL(6),
  /**
   * <code>PROCESS_ACTION_SIMPLE_TYPE_ACCESS = 7;</code>
   */
  PROCESS_ACTION_SIMPLE_TYPE_ACCESS(7),
  /**
   * <code>PROCESS_ACTION_SIMPLE_TYPE_REQUEST_OBJECT_HANDLE = 8;</code>
   */
  PROCESS_ACTION_SIMPLE_TYPE_REQUEST_OBJECT_HANDLE(8),
  /**
   * <code>PROCESS_ACTION_SIMPLE_TYPE_REGISTER = 9;</code>
   */
  PROCESS_ACTION_SIMPLE_TYPE_REGISTER(9),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      ProcessActionSimpleType.class.getName());
  }
  /**
   * <pre>
   * Default
   * </pre>
   *
   * <code>PROCESS_ACTION_SIMPLE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int PROCESS_ACTION_SIMPLE_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>PROCESS_ACTION_SIMPLE_TYPE_STARTUP = 1;</code>
   */
  public static final int PROCESS_ACTION_SIMPLE_TYPE_STARTUP_VALUE = 1;
  /**
   * <code>PROCESS_ACTION_SIMPLE_TYPE_SHUTDOWN = 2;</code>
   */
  public static final int PROCESS_ACTION_SIMPLE_TYPE_SHUTDOWN_VALUE = 2;
  /**
   * <code>PROCESS_ACTION_SIMPLE_TYPE_EXECUTE = 3;</code>
   */
  public static final int PROCESS_ACTION_SIMPLE_TYPE_EXECUTE_VALUE = 3;
  /**
   * <code>PROCESS_ACTION_SIMPLE_TYPE_TERMINATE = 4;</code>
   */
  public static final int PROCESS_ACTION_SIMPLE_TYPE_TERMINATE_VALUE = 4;
  /**
   * <code>PROCESS_ACTION_SIMPLE_TYPE_CHANGE_DIR = 5;</code>
   */
  public static final int PROCESS_ACTION_SIMPLE_TYPE_CHANGE_DIR_VALUE = 5;
  /**
   * <code>PROCESS_ACTION_SIMPLE_TYPE_CALL = 6;</code>
   */
  public static final int PROCESS_ACTION_SIMPLE_TYPE_CALL_VALUE = 6;
  /**
   * <code>PROCESS_ACTION_SIMPLE_TYPE_ACCESS = 7;</code>
   */
  public static final int PROCESS_ACTION_SIMPLE_TYPE_ACCESS_VALUE = 7;
  /**
   * <code>PROCESS_ACTION_SIMPLE_TYPE_REQUEST_OBJECT_HANDLE = 8;</code>
   */
  public static final int PROCESS_ACTION_SIMPLE_TYPE_REQUEST_OBJECT_HANDLE_VALUE = 8;
  /**
   * <code>PROCESS_ACTION_SIMPLE_TYPE_REGISTER = 9;</code>
   */
  public static final int PROCESS_ACTION_SIMPLE_TYPE_REGISTER_VALUE = 9;


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
  public static ProcessActionSimpleType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ProcessActionSimpleType forNumber(int value) {
    switch (value) {
      case 0: return PROCESS_ACTION_SIMPLE_TYPE_UNSPECIFIED;
      case 1: return PROCESS_ACTION_SIMPLE_TYPE_STARTUP;
      case 2: return PROCESS_ACTION_SIMPLE_TYPE_SHUTDOWN;
      case 3: return PROCESS_ACTION_SIMPLE_TYPE_EXECUTE;
      case 4: return PROCESS_ACTION_SIMPLE_TYPE_TERMINATE;
      case 5: return PROCESS_ACTION_SIMPLE_TYPE_CHANGE_DIR;
      case 6: return PROCESS_ACTION_SIMPLE_TYPE_CALL;
      case 7: return PROCESS_ACTION_SIMPLE_TYPE_ACCESS;
      case 8: return PROCESS_ACTION_SIMPLE_TYPE_REQUEST_OBJECT_HANDLE;
      case 9: return PROCESS_ACTION_SIMPLE_TYPE_REGISTER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ProcessActionSimpleType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ProcessActionSimpleType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ProcessActionSimpleType>() {
          public ProcessActionSimpleType findValueByNumber(int number) {
            return ProcessActionSimpleType.forNumber(number);
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
    return uk.gov.gchq.event_logging.v4.ProcessActionSimpleTypeProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ProcessActionSimpleType[] VALUES = values();

  public static ProcessActionSimpleType valueOf(
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

  private ProcessActionSimpleType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:event_logging.v4.ProcessActionSimpleType)
}
