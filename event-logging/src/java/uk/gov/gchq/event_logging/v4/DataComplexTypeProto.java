// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/data_complex_type.proto
// Protobuf Java Version: 4.26.1

package uk.gov.gchq.event_logging.v4;

public final class DataComplexTypeProto {
  private DataComplexTypeProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      DataComplexTypeProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_event_logging_v4_DataComplexType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_DataComplexType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(event_logging/v4/data_complex_type.pro" +
      "to\022\020event_logging.v4\032\033buf/validate/valid" +
      "ate.proto\"|\n\017DataComplexType\022\022\n\004name\030\001 \001" +
      "(\tR\004name\022\024\n\005value\030\002 \001(\tR\005value\022?\n\004data\030\003" +
      " \003(\0132!.event_logging.v4.DataComplexTypeB" +
      "\010\272H\005\222\001\002\010\000R\004dataB\330\001\n\034uk.gov.gchq.event_lo" +
      "gging.v4B\024DataComplexTypeProtoP\001ZEgithub" +
      ".com/gchq/event-logging-schema/event_log" +
      "ging/v4;event_loggingv4\242\002\003EXX\252\002\017EventLog" +
      "ging.V4\312\002\017EventLogging\\V4\342\002\033EventLogging" +
      "\\V4\\GPBMetadata\352\002\020EventLogging::V4b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          build.buf.validate.ValidateProto.getDescriptor(),
        });
    internal_static_event_logging_v4_DataComplexType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_event_logging_v4_DataComplexType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_DataComplexType_descriptor,
        new java.lang.String[] { "Name", "Value", "Data", });
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
