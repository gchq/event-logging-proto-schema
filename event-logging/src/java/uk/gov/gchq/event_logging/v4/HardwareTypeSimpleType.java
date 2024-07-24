// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/hardware_type_simple_type.proto

// Protobuf Java Version: 4.26.1
package uk.gov.gchq.event_logging.v4;

/**
 * <pre>
 * The types of hardware that can be added or removed from a system.
 * </pre>
 *
 * Protobuf enum {@code event_logging.v4.HardwareTypeSimpleType}
 */
public enum HardwareTypeSimpleType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Default
   * </pre>
   *
   * <code>HARDWARE_TYPE_SIMPLE_TYPE_UNSPECIFIED = 0;</code>
   */
  HARDWARE_TYPE_SIMPLE_TYPE_UNSPECIFIED(0),
  /**
   * <code>HARDWARE_TYPE_SIMPLE_TYPE_OPTICAL_DRIVE = 1;</code>
   */
  HARDWARE_TYPE_SIMPLE_TYPE_OPTICAL_DRIVE(1),
  /**
   * <code>HARDWARE_TYPE_SIMPLE_TYPE_HARD_DISK = 2;</code>
   */
  HARDWARE_TYPE_SIMPLE_TYPE_HARD_DISK(2),
  /**
   * <code>HARDWARE_TYPE_SIMPLE_TYPE_USB_MASS_STORAGE = 3;</code>
   */
  HARDWARE_TYPE_SIMPLE_TYPE_USB_MASS_STORAGE(3),
  /**
   * <code>HARDWARE_TYPE_SIMPLE_TYPE_PRINTER = 4;</code>
   */
  HARDWARE_TYPE_SIMPLE_TYPE_PRINTER(4),
  /**
   * <code>HARDWARE_TYPE_SIMPLE_TYPE_MODEM = 5;</code>
   */
  HARDWARE_TYPE_SIMPLE_TYPE_MODEM(5),
  /**
   * <code>HARDWARE_TYPE_SIMPLE_TYPE_KEYBOARD = 6;</code>
   */
  HARDWARE_TYPE_SIMPLE_TYPE_KEYBOARD(6),
  /**
   * <code>HARDWARE_TYPE_SIMPLE_TYPE_MOUSE = 7;</code>
   */
  HARDWARE_TYPE_SIMPLE_TYPE_MOUSE(7),
  /**
   * <code>HARDWARE_TYPE_SIMPLE_TYPE_WEBCAM = 8;</code>
   */
  HARDWARE_TYPE_SIMPLE_TYPE_WEBCAM(8),
  /**
   * <code>HARDWARE_TYPE_SIMPLE_TYPE_OTHER = 9;</code>
   */
  HARDWARE_TYPE_SIMPLE_TYPE_OTHER(9),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      HardwareTypeSimpleType.class.getName());
  }
  /**
   * <pre>
   * Default
   * </pre>
   *
   * <code>HARDWARE_TYPE_SIMPLE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int HARDWARE_TYPE_SIMPLE_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>HARDWARE_TYPE_SIMPLE_TYPE_OPTICAL_DRIVE = 1;</code>
   */
  public static final int HARDWARE_TYPE_SIMPLE_TYPE_OPTICAL_DRIVE_VALUE = 1;
  /**
   * <code>HARDWARE_TYPE_SIMPLE_TYPE_HARD_DISK = 2;</code>
   */
  public static final int HARDWARE_TYPE_SIMPLE_TYPE_HARD_DISK_VALUE = 2;
  /**
   * <code>HARDWARE_TYPE_SIMPLE_TYPE_USB_MASS_STORAGE = 3;</code>
   */
  public static final int HARDWARE_TYPE_SIMPLE_TYPE_USB_MASS_STORAGE_VALUE = 3;
  /**
   * <code>HARDWARE_TYPE_SIMPLE_TYPE_PRINTER = 4;</code>
   */
  public static final int HARDWARE_TYPE_SIMPLE_TYPE_PRINTER_VALUE = 4;
  /**
   * <code>HARDWARE_TYPE_SIMPLE_TYPE_MODEM = 5;</code>
   */
  public static final int HARDWARE_TYPE_SIMPLE_TYPE_MODEM_VALUE = 5;
  /**
   * <code>HARDWARE_TYPE_SIMPLE_TYPE_KEYBOARD = 6;</code>
   */
  public static final int HARDWARE_TYPE_SIMPLE_TYPE_KEYBOARD_VALUE = 6;
  /**
   * <code>HARDWARE_TYPE_SIMPLE_TYPE_MOUSE = 7;</code>
   */
  public static final int HARDWARE_TYPE_SIMPLE_TYPE_MOUSE_VALUE = 7;
  /**
   * <code>HARDWARE_TYPE_SIMPLE_TYPE_WEBCAM = 8;</code>
   */
  public static final int HARDWARE_TYPE_SIMPLE_TYPE_WEBCAM_VALUE = 8;
  /**
   * <code>HARDWARE_TYPE_SIMPLE_TYPE_OTHER = 9;</code>
   */
  public static final int HARDWARE_TYPE_SIMPLE_TYPE_OTHER_VALUE = 9;


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
  public static HardwareTypeSimpleType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static HardwareTypeSimpleType forNumber(int value) {
    switch (value) {
      case 0: return HARDWARE_TYPE_SIMPLE_TYPE_UNSPECIFIED;
      case 1: return HARDWARE_TYPE_SIMPLE_TYPE_OPTICAL_DRIVE;
      case 2: return HARDWARE_TYPE_SIMPLE_TYPE_HARD_DISK;
      case 3: return HARDWARE_TYPE_SIMPLE_TYPE_USB_MASS_STORAGE;
      case 4: return HARDWARE_TYPE_SIMPLE_TYPE_PRINTER;
      case 5: return HARDWARE_TYPE_SIMPLE_TYPE_MODEM;
      case 6: return HARDWARE_TYPE_SIMPLE_TYPE_KEYBOARD;
      case 7: return HARDWARE_TYPE_SIMPLE_TYPE_MOUSE;
      case 8: return HARDWARE_TYPE_SIMPLE_TYPE_WEBCAM;
      case 9: return HARDWARE_TYPE_SIMPLE_TYPE_OTHER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HardwareTypeSimpleType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      HardwareTypeSimpleType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<HardwareTypeSimpleType>() {
          public HardwareTypeSimpleType findValueByNumber(int number) {
            return HardwareTypeSimpleType.forNumber(number);
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
    return uk.gov.gchq.event_logging.v4.HardwareTypeSimpleTypeProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final HardwareTypeSimpleType[] VALUES = values();

  public static HardwareTypeSimpleType valueOf(
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

  private HardwareTypeSimpleType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:event_logging.v4.HardwareTypeSimpleType)
}
