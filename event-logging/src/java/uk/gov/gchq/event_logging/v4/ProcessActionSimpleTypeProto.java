// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/process_action_simple_type.proto
// Protobuf Java Version: 4.26.1

package uk.gov.gchq.event_logging.v4;

public final class ProcessActionSimpleTypeProto {
  private ProcessActionSimpleTypeProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      ProcessActionSimpleTypeProto.class.getName());
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
      "\n1event_logging/v4/process_action_simple" +
      "_type.proto\022\020event_logging.v4\032\033buf/valid" +
      "ate/validate.proto*\276\003\n\027ProcessActionSimp" +
      "leType\022*\n&PROCESS_ACTION_SIMPLE_TYPE_UNS" +
      "PECIFIED\020\000\022&\n\"PROCESS_ACTION_SIMPLE_TYPE" +
      "_STARTUP\020\001\022\'\n#PROCESS_ACTION_SIMPLE_TYPE" +
      "_SHUTDOWN\020\002\022&\n\"PROCESS_ACTION_SIMPLE_TYP" +
      "E_EXECUTE\020\003\022(\n$PROCESS_ACTION_SIMPLE_TYP" +
      "E_TERMINATE\020\004\022)\n%PROCESS_ACTION_SIMPLE_T" +
      "YPE_CHANGE_DIR\020\005\022#\n\037PROCESS_ACTION_SIMPL" +
      "E_TYPE_CALL\020\006\022%\n!PROCESS_ACTION_SIMPLE_T" +
      "YPE_ACCESS\020\007\0224\n0PROCESS_ACTION_SIMPLE_TY" +
      "PE_REQUEST_OBJECT_HANDLE\020\010\022\'\n#PROCESS_AC" +
      "TION_SIMPLE_TYPE_REGISTER\020\tB\340\001\n\034uk.gov.g" +
      "chq.event_logging.v4B\034ProcessActionSimpl" +
      "eTypeProtoP\001ZEgithub.com/gchq/event-logg" +
      "ing-schema/event_logging/v4;event_loggin" +
      "gv4\242\002\003EXX\252\002\017EventLogging.V4\312\002\017EventLoggi" +
      "ng\\V4\342\002\033EventLogging\\V4\\GPBMetadata\352\002\020Ev" +
      "entLogging::V4b\006proto3"
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
