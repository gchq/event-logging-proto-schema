// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/receive_complex_type.proto
// Protobuf Java Version: 4.26.1

package uk.gov.gchq.event_logging.v4;

public final class ReceiveComplexTypeProto {
  private ReceiveComplexTypeProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      ReceiveComplexTypeProto.class.getName());
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
    internal_static_event_logging_v4_ReceiveComplexType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_ReceiveComplexType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_event_logging_v4_ReceiveComplexType_SourceType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_ReceiveComplexType_SourceType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_event_logging_v4_ReceiveComplexType_SourceType_ChoiceWrapperSourceType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_ReceiveComplexType_SourceType_ChoiceWrapperSourceType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_event_logging_v4_ReceiveComplexType_DestinationType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_ReceiveComplexType_DestinationType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_event_logging_v4_ReceiveComplexType_DestinationType_ChoiceWrapperDestinationType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_ReceiveComplexType_DestinationType_ChoiceWrapperDestinationType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+event_logging/v4/receive_complex_type." +
      "proto\022\020event_logging.v4\032(event_logging/v" +
      "4/data_complex_type.proto\032*event_logging" +
      "/v4/device_complex_type.proto\0320event_log" +
      "ging/v4/multi_object_complex_type.proto\032" +
      "+event_logging/v4/outcome_complex_type.p" +
      "roto\032(event_logging/v4/user_complex_type" +
      ".proto\032\033buf/validate/validate.proto\"\361\007\n\022" +
      "ReceiveComplexType\022O\n\006source\030\001 \001(\0132/.eve" +
      "nt_logging.v4.ReceiveComplexType.SourceT" +
      "ypeB\006\272H\003\310\001\001R\006source\022^\n\013destination\030\002 \001(\013" +
      "24.event_logging.v4.ReceiveComplexType.D" +
      "estinationTypeB\006\272H\003\310\001\001R\013destination\022B\n\007p" +
      "ayload\030\003 \001(\0132(.event_logging.v4.MultiObj" +
      "ectComplexTypeR\007payload\022>\n\007outcome\030\004 \001(\013" +
      "2$.event_logging.v4.OutcomeComplexTypeR\007" +
      "outcome\022?\n\004data\030\005 \003(\0132!.event_logging.v4" +
      ".DataComplexTypeB\010\272H\005\222\001\002\010\000R\004data\032\246\002\n\nSou" +
      "rceType\022x\n\016choice_wrapper\030\001 \003(\0132G.event_" +
      "logging.v4.ReceiveComplexType.SourceType" +
      ".ChoiceWrapperSourceTypeB\010\272H\005\222\001\002\010\001R\rchoi" +
      "ceWrapper\032\235\001\n\027ChoiceWrapperSourceType\022=\n" +
      "\004user\030\001 \001(\0132!.event_logging.v4.UserCompl" +
      "exTypeB\006\272H\003\310\001\001R\004user\022C\n\006device\030\002 \001(\0132#.e" +
      "vent_logging.v4.DeviceComplexTypeB\006\272H\003\310\001" +
      "\001R\006device\032\273\002\n\017DestinationType\022\202\001\n\016choice" +
      "_wrapper\030\001 \003(\0132Q.event_logging.v4.Receiv" +
      "eComplexType.DestinationType.ChoiceWrapp" +
      "erDestinationTypeB\010\272H\005\222\001\002\010\001R\rchoiceWrapp" +
      "er\032\242\001\n\034ChoiceWrapperDestinationType\022=\n\004u" +
      "ser\030\001 \001(\0132!.event_logging.v4.UserComplex" +
      "TypeB\006\272H\003\310\001\001R\004user\022C\n\006device\030\002 \001(\0132#.eve" +
      "nt_logging.v4.DeviceComplexTypeB\006\272H\003\310\001\001R" +
      "\006deviceB\333\001\n\034uk.gov.gchq.event_logging.v4" +
      "B\027ReceiveComplexTypeProtoP\001ZEgithub.com/" +
      "gchq/event-logging-schema/event_logging/" +
      "v4;event_loggingv4\242\002\003EXX\252\002\017EventLogging." +
      "V4\312\002\017EventLogging\\V4\342\002\033EventLogging\\V4\\G" +
      "PBMetadata\352\002\020EventLogging::V4b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          uk.gov.gchq.event_logging.v4.DataComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.DeviceComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.MultiObjectComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.OutcomeComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.UserComplexTypeProto.getDescriptor(),
          build.buf.validate.ValidateProto.getDescriptor(),
        });
    internal_static_event_logging_v4_ReceiveComplexType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_event_logging_v4_ReceiveComplexType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_ReceiveComplexType_descriptor,
        new java.lang.String[] { "Source", "Destination", "Payload", "Outcome", "Data", });
    internal_static_event_logging_v4_ReceiveComplexType_SourceType_descriptor =
      internal_static_event_logging_v4_ReceiveComplexType_descriptor.getNestedTypes().get(0);
    internal_static_event_logging_v4_ReceiveComplexType_SourceType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_ReceiveComplexType_SourceType_descriptor,
        new java.lang.String[] { "ChoiceWrapper", });
    internal_static_event_logging_v4_ReceiveComplexType_SourceType_ChoiceWrapperSourceType_descriptor =
      internal_static_event_logging_v4_ReceiveComplexType_SourceType_descriptor.getNestedTypes().get(0);
    internal_static_event_logging_v4_ReceiveComplexType_SourceType_ChoiceWrapperSourceType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_ReceiveComplexType_SourceType_ChoiceWrapperSourceType_descriptor,
        new java.lang.String[] { "User", "Device", });
    internal_static_event_logging_v4_ReceiveComplexType_DestinationType_descriptor =
      internal_static_event_logging_v4_ReceiveComplexType_descriptor.getNestedTypes().get(1);
    internal_static_event_logging_v4_ReceiveComplexType_DestinationType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_ReceiveComplexType_DestinationType_descriptor,
        new java.lang.String[] { "ChoiceWrapper", });
    internal_static_event_logging_v4_ReceiveComplexType_DestinationType_ChoiceWrapperDestinationType_descriptor =
      internal_static_event_logging_v4_ReceiveComplexType_DestinationType_descriptor.getNestedTypes().get(0);
    internal_static_event_logging_v4_ReceiveComplexType_DestinationType_ChoiceWrapperDestinationType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_ReceiveComplexType_DestinationType_ChoiceWrapperDestinationType_descriptor,
        new java.lang.String[] { "User", "Device", });
    descriptor.resolveAllFeaturesImmutable();
    uk.gov.gchq.event_logging.v4.DataComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.DeviceComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.MultiObjectComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.OutcomeComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.UserComplexTypeProto.getDescriptor();
    build.buf.validate.ValidateProto.getDescriptor();
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(build.buf.validate.ValidateProto.field);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
  }

  // @@protoc_insertion_point(outer_class_scope)
}