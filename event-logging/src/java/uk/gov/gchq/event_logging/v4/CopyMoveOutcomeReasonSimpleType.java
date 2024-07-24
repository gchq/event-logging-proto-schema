// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/copy_move_outcome_reason_simple_type.proto

// Protobuf Java Version: 4.26.1
package uk.gov.gchq.event_logging.v4;

/**
 * <pre>
 * The types of reason for failure during copy or move operations.
 * </pre>
 *
 * Protobuf enum {@code event_logging.v4.CopyMoveOutcomeReasonSimpleType}
 */
public enum CopyMoveOutcomeReasonSimpleType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Default
   * </pre>
   *
   * <code>COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_UNSPECIFIED = 0;</code>
   */
  COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_UNSPECIFIED(0),
  /**
   * <code>COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_DEVICE_FULL = 1;</code>
   */
  COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_DEVICE_FULL(1),
  /**
   * <code>COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_IO_ERROR = 2;</code>
   */
  COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_IO_ERROR(2),
  /**
   * <code>COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_INVALID_PATH = 3;</code>
   */
  COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_INVALID_PATH(3),
  /**
   * <code>COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_PERMISSION_DENIED = 4;</code>
   */
  COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_PERMISSION_DENIED(4),
  /**
   * <code>COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_READ_ONLY = 5;</code>
   */
  COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_READ_ONLY(5),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      CopyMoveOutcomeReasonSimpleType.class.getName());
  }
  /**
   * <pre>
   * Default
   * </pre>
   *
   * <code>COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_DEVICE_FULL = 1;</code>
   */
  public static final int COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_DEVICE_FULL_VALUE = 1;
  /**
   * <code>COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_IO_ERROR = 2;</code>
   */
  public static final int COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_IO_ERROR_VALUE = 2;
  /**
   * <code>COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_INVALID_PATH = 3;</code>
   */
  public static final int COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_INVALID_PATH_VALUE = 3;
  /**
   * <code>COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_PERMISSION_DENIED = 4;</code>
   */
  public static final int COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_PERMISSION_DENIED_VALUE = 4;
  /**
   * <code>COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_READ_ONLY = 5;</code>
   */
  public static final int COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_READ_ONLY_VALUE = 5;


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
  public static CopyMoveOutcomeReasonSimpleType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CopyMoveOutcomeReasonSimpleType forNumber(int value) {
    switch (value) {
      case 0: return COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_UNSPECIFIED;
      case 1: return COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_DEVICE_FULL;
      case 2: return COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_IO_ERROR;
      case 3: return COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_INVALID_PATH;
      case 4: return COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_PERMISSION_DENIED;
      case 5: return COPY_MOVE_OUTCOME_REASON_SIMPLE_TYPE_READ_ONLY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CopyMoveOutcomeReasonSimpleType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CopyMoveOutcomeReasonSimpleType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CopyMoveOutcomeReasonSimpleType>() {
          public CopyMoveOutcomeReasonSimpleType findValueByNumber(int number) {
            return CopyMoveOutcomeReasonSimpleType.forNumber(number);
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
    return uk.gov.gchq.event_logging.v4.CopyMoveOutcomeReasonSimpleTypeProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final CopyMoveOutcomeReasonSimpleType[] VALUES = values();

  public static CopyMoveOutcomeReasonSimpleType valueOf(
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

  private CopyMoveOutcomeReasonSimpleType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:event_logging.v4.CopyMoveOutcomeReasonSimpleType)
}
