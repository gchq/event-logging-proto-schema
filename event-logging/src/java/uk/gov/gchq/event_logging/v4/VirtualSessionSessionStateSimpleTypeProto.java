// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/virtual_session_session_state_simple_type.proto
// Protobuf Java Version: 4.26.1

package uk.gov.gchq.event_logging.v4;

public final class VirtualSessionSessionStateSimpleTypeProto {
  private VirtualSessionSessionStateSimpleTypeProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      VirtualSessionSessionStateSimpleTypeProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@event_logging/v4/virtual_session_sessi" +
      "on_state_simple_type.proto\022\020event_loggin" +
      "g.v4\032\033buf/validate/validate.proto*\317\001\n$Vi" +
      "rtualSessionSessionStateSimpleType\0229\n5VI" +
      "RTUAL_SESSION_SESSION_STATE_SIMPLE_TYPE_" +
      "UNSPECIFIED\020\000\0224\n0VIRTUAL_SESSION_SESSION" +
      "_STATE_SIMPLE_TYPE_PARKED\020\001\0226\n2VIRTUAL_S" +
      "ESSION_SESSION_STATE_SIMPLE_TYPE_UNPARKE" +
      "D\020\002B\355\001\n\034uk.gov.gchq.event_logging.v4B)Vi" +
      "rtualSessionSessionStateSimpleTypeProtoP" +
      "\001ZEgithub.com/gchq/event-logging-schema/" +
      "event_logging/v4;event_loggingv4\242\002\003EXX\252\002" +
      "\017EventLogging.V4\312\002\017EventLogging\\V4\342\002\033Eve" +
      "ntLogging\\V4\\GPBMetadata\352\002\020EventLogging:" +
      ":V4b\006proto3"
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