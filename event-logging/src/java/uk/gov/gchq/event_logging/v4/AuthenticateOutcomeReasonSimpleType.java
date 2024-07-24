// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/authenticate_outcome_reason_simple_type.proto

// Protobuf Java Version: 4.26.1
package uk.gov.gchq.event_logging.v4;

/**
 * <pre>
 * The types of outcome from an authentication event.
 * </pre>
 *
 * Protobuf enum {@code event_logging.v4.AuthenticateOutcomeReasonSimpleType}
 */
public enum AuthenticateOutcomeReasonSimpleType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Default
   * </pre>
   *
   * <code>AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_UNSPECIFIED = 0;</code>
   */
  AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_UNSPECIFIED(0),
  /**
   * <code>AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_INCORRECT_USERNAME_OR_PASSWORD = 1;</code>
   */
  AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_INCORRECT_USERNAME_OR_PASSWORD(1),
  /**
   * <code>AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_INCORRECT_USERNAME = 2;</code>
   */
  AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_INCORRECT_USERNAME(2),
  /**
   * <code>AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_INCORRECT_PASSWORD = 3;</code>
   */
  AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_INCORRECT_PASSWORD(3),
  /**
   * <code>AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_EXPIRED_CERTIFICATE = 4;</code>
   */
  AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_EXPIRED_CERTIFICATE(4),
  /**
   * <code>AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_REVOKED_CERTIFICATE = 5;</code>
   */
  AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_REVOKED_CERTIFICATE(5),
  /**
   * <code>AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_INCORRECT_CA = 6;</code>
   */
  AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_INCORRECT_CA(6),
  /**
   * <code>AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_EXPIRED_CA = 7;</code>
   */
  AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_EXPIRED_CA(7),
  /**
   * <code>AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_ACCOUNT_LOCKED = 8;</code>
   */
  AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_ACCOUNT_LOCKED(8),
  /**
   * <code>AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_ACCOUNT_NOT_VALID_FOR_LOGIN_TYPE = 9;</code>
   */
  AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_ACCOUNT_NOT_VALID_FOR_LOGIN_TYPE(9),
  /**
   * <code>AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_OTHER = 10;</code>
   */
  AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_OTHER(10),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      AuthenticateOutcomeReasonSimpleType.class.getName());
  }
  /**
   * <pre>
   * Default
   * </pre>
   *
   * <code>AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_INCORRECT_USERNAME_OR_PASSWORD = 1;</code>
   */
  public static final int AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_INCORRECT_USERNAME_OR_PASSWORD_VALUE = 1;
  /**
   * <code>AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_INCORRECT_USERNAME = 2;</code>
   */
  public static final int AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_INCORRECT_USERNAME_VALUE = 2;
  /**
   * <code>AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_INCORRECT_PASSWORD = 3;</code>
   */
  public static final int AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_INCORRECT_PASSWORD_VALUE = 3;
  /**
   * <code>AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_EXPIRED_CERTIFICATE = 4;</code>
   */
  public static final int AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_EXPIRED_CERTIFICATE_VALUE = 4;
  /**
   * <code>AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_REVOKED_CERTIFICATE = 5;</code>
   */
  public static final int AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_REVOKED_CERTIFICATE_VALUE = 5;
  /**
   * <code>AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_INCORRECT_CA = 6;</code>
   */
  public static final int AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_INCORRECT_CA_VALUE = 6;
  /**
   * <code>AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_EXPIRED_CA = 7;</code>
   */
  public static final int AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_EXPIRED_CA_VALUE = 7;
  /**
   * <code>AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_ACCOUNT_LOCKED = 8;</code>
   */
  public static final int AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_ACCOUNT_LOCKED_VALUE = 8;
  /**
   * <code>AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_ACCOUNT_NOT_VALID_FOR_LOGIN_TYPE = 9;</code>
   */
  public static final int AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_ACCOUNT_NOT_VALID_FOR_LOGIN_TYPE_VALUE = 9;
  /**
   * <code>AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_OTHER = 10;</code>
   */
  public static final int AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_OTHER_VALUE = 10;


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
  public static AuthenticateOutcomeReasonSimpleType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AuthenticateOutcomeReasonSimpleType forNumber(int value) {
    switch (value) {
      case 0: return AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_UNSPECIFIED;
      case 1: return AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_INCORRECT_USERNAME_OR_PASSWORD;
      case 2: return AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_INCORRECT_USERNAME;
      case 3: return AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_INCORRECT_PASSWORD;
      case 4: return AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_EXPIRED_CERTIFICATE;
      case 5: return AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_REVOKED_CERTIFICATE;
      case 6: return AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_INCORRECT_CA;
      case 7: return AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_EXPIRED_CA;
      case 8: return AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_ACCOUNT_LOCKED;
      case 9: return AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_ACCOUNT_NOT_VALID_FOR_LOGIN_TYPE;
      case 10: return AUTHENTICATE_OUTCOME_REASON_SIMPLE_TYPE_OTHER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AuthenticateOutcomeReasonSimpleType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AuthenticateOutcomeReasonSimpleType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AuthenticateOutcomeReasonSimpleType>() {
          public AuthenticateOutcomeReasonSimpleType findValueByNumber(int number) {
            return AuthenticateOutcomeReasonSimpleType.forNumber(number);
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
    return uk.gov.gchq.event_logging.v4.AuthenticateOutcomeReasonSimpleTypeProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final AuthenticateOutcomeReasonSimpleType[] VALUES = values();

  public static AuthenticateOutcomeReasonSimpleType valueOf(
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

  private AuthenticateOutcomeReasonSimpleType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:event_logging.v4.AuthenticateOutcomeReasonSimpleType)
}

