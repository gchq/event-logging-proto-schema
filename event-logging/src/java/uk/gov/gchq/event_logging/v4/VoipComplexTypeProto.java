// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/voip_complex_type.proto
// Protobuf Java Version: 4.26.1

package uk.gov.gchq.event_logging.v4;

public final class VoipComplexTypeProto {
  private VoipComplexTypeProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      VoipComplexTypeProto.class.getName());
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
    internal_static_event_logging_v4_VoipComplexType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_VoipComplexType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_event_logging_v4_VoipComplexType_PermissionsType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_VoipComplexType_PermissionsType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_event_logging_v4_VoipComplexType_PermissionsType_PermissionType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_VoipComplexType_PermissionsType_PermissionType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(event_logging/v4/voip_complex_type.pro" +
      "to\022\020event_logging.v4\032/event_logging/v4/a" +
      "ny_content_complex_type.proto\0322event_log" +
      "ging/v4/classification_complex_type.prot" +
      "o\032(event_logging/v4/data_complex_type.pr" +
      "oto\0322event_logging/v4/meta_data_tags_com" +
      "plex_type.proto\0327event_logging/v4/permis" +
      "sion_attribute_simple_type.proto\032(event_" +
      "logging/v4/user_complex_type.proto\032\033buf/" +
      "validate/validate.proto\"\210\t\n\017VoipComplexT" +
      "ype\022E\n\004meta\030\001 \003(\0132\'.event_logging.v4.Any" +
      "ContentComplexTypeB\010\272H\005\222\001\002\010\000R\004meta\022\022\n\004ty" +
      "pe\030\002 \001(\tR\004type\022\016\n\002id\030\003 \001(\tR\002id\022\022\n\004name\030\004" +
      " \001(\tR\004name\022 \n\013description\030\005 \001(\tR\013descrip" +
      "tion\022S\n\016classification\030\006 \001(\0132+.event_log" +
      "ging.v4.ClassificationComplexTypeR\016class" +
      "ification\022\024\n\005state\030\007 \001(\tR\005state\022;\n\006group" +
      "s\030\010 \001(\0132#.event_logging.v4.GroupsComplex" +
      "TypeR\006groups\022S\n\013permissions\030\t \001(\01321.even" +
      "t_logging.v4.VoipComplexType.Permissions" +
      "TypeR\013permissions\022=\n\004tags\030\n \001(\0132).event_" +
      "logging.v4.MetaDataTagsComplexTypeR\004tags" +
      "\022!\n\014phone_number\030\013 \001(\tR\013phoneNumber\0225\n\004f" +
      "rom\030\014 \001(\0132!.event_logging.v4.UserComplex" +
      "TypeR\004from\022;\n\002to\030\r \003(\0132!.event_logging.v" +
      "4.UserComplexTypeB\010\272H\005\222\001\002\010\000R\002to\022?\n\004data\030" +
      "\016 \003(\0132!.event_logging.v4.DataComplexType" +
      "B\010\272H\005\222\001\002\010\000R\004data\032\277\003\n\017PermissionsType\022j\n\n" +
      "permission\030\001 \003(\0132@.event_logging.v4.Voip" +
      "ComplexType.PermissionsType.PermissionTy" +
      "peB\010\272H\005\222\001\002\010\001R\npermission\032\277\002\n\016PermissionT" +
      "ype\022=\n\004user\030\001 \001(\0132!.event_logging.v4.Use" +
      "rComplexTypeB\006\272H\003\310\001\001R\004user\022@\n\005group\030\002 \001(" +
      "\0132\".event_logging.v4.GroupComplexTypeB\006\272" +
      "H\003\310\001\001R\005group\022V\n\005allow\030\013 \003(\0162/.event_logg" +
      "ing.v4.PermissionAttributeSimpleTypeB\017\272H" +
      "\014\222\001\t\010\000\"\005\202\001\002\020\001R\005allow\022T\n\004deny\030\014 \003(\0162/.eve" +
      "nt_logging.v4.PermissionAttributeSimpleT" +
      "ypeB\017\272H\014\222\001\t\010\000\"\005\202\001\002\020\001R\004denyB\330\001\n\034uk.gov.gc" +
      "hq.event_logging.v4B\024VoipComplexTypeProt" +
      "oP\001ZEgithub.com/gchq/event-logging-schem" +
      "a/event_logging/v4;event_loggingv4\242\002\003EXX" +
      "\252\002\017EventLogging.V4\312\002\017EventLogging\\V4\342\002\033E" +
      "ventLogging\\V4\\GPBMetadata\352\002\020EventLoggin" +
      "g::V4b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          uk.gov.gchq.event_logging.v4.AnyContentComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.ClassificationComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.DataComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.MetaDataTagsComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.PermissionAttributeSimpleTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.UserComplexTypeProto.getDescriptor(),
          build.buf.validate.ValidateProto.getDescriptor(),
        });
    internal_static_event_logging_v4_VoipComplexType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_event_logging_v4_VoipComplexType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_VoipComplexType_descriptor,
        new java.lang.String[] { "Meta", "Type", "Id", "Name", "Description", "Classification", "State", "Groups", "Permissions", "Tags", "PhoneNumber", "From", "To", "Data", });
    internal_static_event_logging_v4_VoipComplexType_PermissionsType_descriptor =
      internal_static_event_logging_v4_VoipComplexType_descriptor.getNestedTypes().get(0);
    internal_static_event_logging_v4_VoipComplexType_PermissionsType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_VoipComplexType_PermissionsType_descriptor,
        new java.lang.String[] { "Permission", });
    internal_static_event_logging_v4_VoipComplexType_PermissionsType_PermissionType_descriptor =
      internal_static_event_logging_v4_VoipComplexType_PermissionsType_descriptor.getNestedTypes().get(0);
    internal_static_event_logging_v4_VoipComplexType_PermissionsType_PermissionType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_VoipComplexType_PermissionsType_PermissionType_descriptor,
        new java.lang.String[] { "User", "Group", "Allow", "Deny", });
    descriptor.resolveAllFeaturesImmutable();
    uk.gov.gchq.event_logging.v4.AnyContentComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.ClassificationComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.DataComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.MetaDataTagsComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.PermissionAttributeSimpleTypeProto.getDescriptor();
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
