// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/change_action_simple_type.proto
// Protobuf Java Version: 4.26.1

package uk.gov.gchq.event_logging.v4;

public final class ChangeActionSimpleTypeProto {
  private ChangeActionSimpleTypeProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      ChangeActionSimpleTypeProto.class.getName());
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
      "\n0event_logging/v4/change_action_simple_" +
      "type.proto\022\020event_logging.v4\032\033buf/valida" +
      "te/validate.proto*\231\002\n\026ChangeActionSimple" +
      "Type\022)\n%CHANGE_ACTION_SIMPLE_TYPE_UNSPEC" +
      "IFIED\020\000\022(\n$CHANGE_ACTION_SIMPLE_TYPE_STA" +
      "RT_SCAN\020\001\022\'\n#CHANGE_ACTION_SIMPLE_TYPE_S" +
      "TOP_SCAN\020\002\022(\n$CHANGE_ACTION_SIMPLE_TYPE_" +
      "FILE_ADDED\020\003\022*\n&CHANGE_ACTION_SIMPLE_TYP" +
      "E_FILE_REMOVED\020\004\022+\n\'CHANGE_ACTION_SIMPLE" +
      "_TYPE_FILE_MODIFIED\020\005B\337\001\n\034uk.gov.gchq.ev" +
      "ent_logging.v4B\033ChangeActionSimpleTypePr" +
      "otoP\001ZEgithub.com/gchq/event-logging-sch" +
      "ema/event_logging/v4;event_loggingv4\242\002\003E" +
      "XX\252\002\017EventLogging.V4\312\002\017EventLogging\\V4\342\002" +
      "\033EventLogging\\V4\\GPBMetadata\352\002\020EventLogg" +
      "ing::V4b\006proto3"
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
