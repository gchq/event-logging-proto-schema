// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/install_complex_type.proto
// Protobuf Java Version: 4.26.1

package uk.gov.gchq.event_logging.v4;

public final class InstallComplexTypeProto {
  private InstallComplexTypeProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      InstallComplexTypeProto.class.getName());
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
    internal_static_event_logging_v4_InstallComplexType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_InstallComplexType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+event_logging/v4/install_complex_type." +
      "proto\022\020event_logging.v4\032(event_logging/v" +
      "4/data_complex_type.proto\032,event_logging" +
      "/v4/hardware_complex_type.proto\032)event_l" +
      "ogging/v4/media_complex_type.proto\032+even" +
      "t_logging/v4/outcome_complex_type.proto\032" +
      ",event_logging/v4/software_complex_type." +
      "proto\032\033buf/validate/validate.proto\"\355\002\n\022I" +
      "nstallComplexType\022I\n\010software\030\001 \001(\0132%.ev" +
      "ent_logging.v4.SoftwareComplexTypeB\006\272H\003\310" +
      "\001\001R\010software\022I\n\010hardware\030\002 \001(\0132%.event_l" +
      "ogging.v4.HardwareComplexTypeB\006\272H\003\310\001\001R\010h" +
      "ardware\022@\n\005media\030\003 \001(\0132\".event_logging.v" +
      "4.MediaComplexTypeB\006\272H\003\310\001\001R\005media\022>\n\007out" +
      "come\030\013 \001(\0132$.event_logging.v4.OutcomeCom" +
      "plexTypeR\007outcome\022?\n\004data\030\014 \003(\0132!.event_" +
      "logging.v4.DataComplexTypeB\010\272H\005\222\001\002\010\000R\004da" +
      "taB\333\001\n\034uk.gov.gchq.event_logging.v4B\027Ins" +
      "tallComplexTypeProtoP\001ZEgithub.com/gchq/" +
      "event-logging-schema/event_logging/v4;ev" +
      "ent_loggingv4\242\002\003EXX\252\002\017EventLogging.V4\312\002\017" +
      "EventLogging\\V4\342\002\033EventLogging\\V4\\GPBMet" +
      "adata\352\002\020EventLogging::V4b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          uk.gov.gchq.event_logging.v4.DataComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.HardwareComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.MediaComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.OutcomeComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.SoftwareComplexTypeProto.getDescriptor(),
          build.buf.validate.ValidateProto.getDescriptor(),
        });
    internal_static_event_logging_v4_InstallComplexType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_event_logging_v4_InstallComplexType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_InstallComplexType_descriptor,
        new java.lang.String[] { "Software", "Hardware", "Media", "Outcome", "Data", });
    descriptor.resolveAllFeaturesImmutable();
    uk.gov.gchq.event_logging.v4.DataComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.HardwareComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.MediaComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.OutcomeComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.SoftwareComplexTypeProto.getDescriptor();
    build.buf.validate.ValidateProto.getDescriptor();
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(build.buf.validate.ValidateProto.field);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
  }

  // @@protoc_insertion_point(outer_class_scope)
}