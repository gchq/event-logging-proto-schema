// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/authenticate_outcome_complex_type.proto
// Protobuf Java Version: 4.26.1

package uk.gov.gchq.event_logging.v4;

public final class AuthenticateOutcomeComplexTypeProto {
  private AuthenticateOutcomeComplexTypeProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      AuthenticateOutcomeComplexTypeProto.class.getName());
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
    internal_static_event_logging_v4_AuthenticateOutcomeComplexType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_AuthenticateOutcomeComplexType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_event_logging_v4_AuthenticateOutcomeComplexType_AuthServiceType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_AuthenticateOutcomeComplexType_AuthServiceType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8event_logging/v4/authenticate_outcome_" +
      "complex_type.proto\022\020event_logging.v4\032>ev" +
      "ent_logging/v4/authenticate_outcome_reas" +
      "on_simple_type.proto\032(event_logging/v4/d" +
      "ata_complex_type.proto\032\033buf/validate/val" +
      "idate.proto\"\312\003\n\036AuthenticateOutcomeCompl" +
      "exType\022\030\n\007success\030\001 \001(\010R\007success\022\034\n\tperm" +
      "itted\030\002 \001(\010R\tpermitted\022c\n\014auth_service\030\003" +
      " \001(\0132@.event_logging.v4.AuthenticateOutc" +
      "omeComplexType.AuthServiceTypeR\013authServ" +
      "ice\022 \n\013description\030\004 \001(\tR\013description\022W\n" +
      "\006reason\030\005 \001(\01625.event_logging.v4.Authent" +
      "icateOutcomeReasonSimpleTypeB\010\272H\005\202\001\002\020\001R\006" +
      "reason\022?\n\004data\030\006 \003(\0132!.event_logging.v4." +
      "DataComplexTypeB\010\272H\005\222\001\002\010\000R\004data\032O\n\017AuthS" +
      "erviceType\022\016\n\002id\030\001 \001(\tR\002id\022,\n\rcache_time" +
      "out\030\002 \001(\rB\007\272H\004*\002 \000R\014cacheTimeoutB\347\001\n\034uk." +
      "gov.gchq.event_logging.v4B#AuthenticateO" +
      "utcomeComplexTypeProtoP\001ZEgithub.com/gch" +
      "q/event-logging-schema/event_logging/v4;" +
      "event_loggingv4\242\002\003EXX\252\002\017EventLogging.V4\312" +
      "\002\017EventLogging\\V4\342\002\033EventLogging\\V4\\GPBM" +
      "etadata\352\002\020EventLogging::V4b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          uk.gov.gchq.event_logging.v4.AuthenticateOutcomeReasonSimpleTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.DataComplexTypeProto.getDescriptor(),
          build.buf.validate.ValidateProto.getDescriptor(),
        });
    internal_static_event_logging_v4_AuthenticateOutcomeComplexType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_event_logging_v4_AuthenticateOutcomeComplexType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_AuthenticateOutcomeComplexType_descriptor,
        new java.lang.String[] { "Success", "Permitted", "AuthService", "Description", "Reason", "Data", });
    internal_static_event_logging_v4_AuthenticateOutcomeComplexType_AuthServiceType_descriptor =
      internal_static_event_logging_v4_AuthenticateOutcomeComplexType_descriptor.getNestedTypes().get(0);
    internal_static_event_logging_v4_AuthenticateOutcomeComplexType_AuthServiceType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_AuthenticateOutcomeComplexType_AuthServiceType_descriptor,
        new java.lang.String[] { "Id", "CacheTimeout", });
    descriptor.resolveAllFeaturesImmutable();
    uk.gov.gchq.event_logging.v4.AuthenticateOutcomeReasonSimpleTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.DataComplexTypeProto.getDescriptor();
    build.buf.validate.ValidateProto.getDescriptor();
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(build.buf.validate.ValidateProto.field);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
  }

  // @@protoc_insertion_point(outer_class_scope)
}