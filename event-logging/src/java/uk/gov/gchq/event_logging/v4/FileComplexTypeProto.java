// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/file_complex_type.proto
// Protobuf Java Version: 4.26.1

package uk.gov.gchq.event_logging.v4;

public final class FileComplexTypeProto {
  private FileComplexTypeProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      FileComplexTypeProto.class.getName());
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
    internal_static_event_logging_v4_FileComplexType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_FileComplexType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_event_logging_v4_FileComplexType_PermissionsType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_FileComplexType_PermissionsType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_event_logging_v4_FileComplexType_PermissionsType_PermissionType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_FileComplexType_PermissionsType_PermissionType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(event_logging/v4/file_complex_type.pro" +
      "to\022\020event_logging.v4\032/event_logging/v4/a" +
      "ny_content_complex_type.proto\0322event_log" +
      "ging/v4/classification_complex_type.prot" +
      "o\032(event_logging/v4/data_complex_type.pr" +
      "oto\032(event_logging/v4/hash_complex_type." +
      "proto\032)event_logging/v4/media_complex_ty" +
      "pe.proto\0322event_logging/v4/meta_data_tag" +
      "s_complex_type.proto\0327event_logging/v4/p" +
      "ermission_attribute_simple_type.proto\032(e" +
      "vent_logging/v4/user_complex_type.proto\032" +
      "\037google/protobuf/timestamp.proto\032\033buf/va" +
      "lidate/validate.proto\"\271\n\n\017FileComplexTyp" +
      "e\022E\n\004meta\030\001 \003(\0132\'.event_logging.v4.AnyCo" +
      "ntentComplexTypeB\010\272H\005\222\001\002\010\000R\004meta\022\022\n\004type" +
      "\030\002 \001(\tR\004type\022\016\n\002id\030\003 \001(\tR\002id\022\022\n\004name\030\004 \001" +
      "(\tR\004name\022 \n\013description\030\005 \001(\tR\013descripti" +
      "on\022S\n\016classification\030\006 \001(\0132+.event_loggi" +
      "ng.v4.ClassificationComplexTypeR\016classif" +
      "ication\022\024\n\005state\030\007 \001(\tR\005state\022;\n\006groups\030" +
      "\010 \001(\0132#.event_logging.v4.GroupsComplexTy" +
      "peR\006groups\022S\n\013permissions\030\t \001(\01321.event_" +
      "logging.v4.FileComplexType.PermissionsTy" +
      "peR\013permissions\022=\n\004tags\030\n \001(\0132).event_lo" +
      "gging.v4.MetaDataTagsComplexTypeR\004tags\022\022" +
      "\n\004path\030\013 \001(\tR\004path\0224\n\007created\030\014 \001(\0132\032.go" +
      "ogle.protobuf.TimestampR\007created\0226\n\010modi" +
      "fied\030\r \001(\0132\032.google.protobuf.TimestampR\010" +
      "modified\0226\n\010accessed\030\016 \001(\0132\032.google.prot" +
      "obuf.TimestampR\010accessed\022\033\n\004size\030\017 \001(\rB\007" +
      "\272H\004*\002(\000R\004size\0228\n\005media\030\020 \001(\0132\".event_log" +
      "ging.v4.MediaComplexTypeR\005media\0225\n\004hash\030" +
      "\021 \001(\0132!.event_logging.v4.HashComplexType" +
      "R\004hash\022?\n\004data\030\022 \003(\0132!.event_logging.v4." +
      "DataComplexTypeB\010\272H\005\222\001\002\010\000R\004data\032\277\003\n\017Perm" +
      "issionsType\022j\n\npermission\030\001 \003(\0132@.event_" +
      "logging.v4.FileComplexType.PermissionsTy" +
      "pe.PermissionTypeB\010\272H\005\222\001\002\010\001R\npermission\032" +
      "\277\002\n\016PermissionType\022=\n\004user\030\001 \001(\0132!.event" +
      "_logging.v4.UserComplexTypeB\006\272H\003\310\001\001R\004use" +
      "r\022@\n\005group\030\002 \001(\0132\".event_logging.v4.Grou" +
      "pComplexTypeB\006\272H\003\310\001\001R\005group\022V\n\005allow\030\013 \003" +
      "(\0162/.event_logging.v4.PermissionAttribut" +
      "eSimpleTypeB\017\272H\014\222\001\t\010\000\"\005\202\001\002\020\001R\005allow\022T\n\004d" +
      "eny\030\014 \003(\0162/.event_logging.v4.PermissionA" +
      "ttributeSimpleTypeB\017\272H\014\222\001\t\010\000\"\005\202\001\002\020\001R\004den" +
      "yB\330\001\n\034uk.gov.gchq.event_logging.v4B\024File" +
      "ComplexTypeProtoP\001ZEgithub.com/gchq/even" +
      "t-logging-schema/event_logging/v4;event_" +
      "loggingv4\242\002\003EXX\252\002\017EventLogging.V4\312\002\017Even" +
      "tLogging\\V4\342\002\033EventLogging\\V4\\GPBMetadat" +
      "a\352\002\020EventLogging::V4b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          uk.gov.gchq.event_logging.v4.AnyContentComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.ClassificationComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.DataComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.HashComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.MediaComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.MetaDataTagsComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.PermissionAttributeSimpleTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.UserComplexTypeProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          build.buf.validate.ValidateProto.getDescriptor(),
        });
    internal_static_event_logging_v4_FileComplexType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_event_logging_v4_FileComplexType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_FileComplexType_descriptor,
        new java.lang.String[] { "Meta", "Type", "Id", "Name", "Description", "Classification", "State", "Groups", "Permissions", "Tags", "Path", "Created", "Modified", "Accessed", "Size", "Media", "Hash", "Data", });
    internal_static_event_logging_v4_FileComplexType_PermissionsType_descriptor =
      internal_static_event_logging_v4_FileComplexType_descriptor.getNestedTypes().get(0);
    internal_static_event_logging_v4_FileComplexType_PermissionsType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_FileComplexType_PermissionsType_descriptor,
        new java.lang.String[] { "Permission", });
    internal_static_event_logging_v4_FileComplexType_PermissionsType_PermissionType_descriptor =
      internal_static_event_logging_v4_FileComplexType_PermissionsType_descriptor.getNestedTypes().get(0);
    internal_static_event_logging_v4_FileComplexType_PermissionsType_PermissionType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_FileComplexType_PermissionsType_PermissionType_descriptor,
        new java.lang.String[] { "User", "Group", "Allow", "Deny", });
    descriptor.resolveAllFeaturesImmutable();
    uk.gov.gchq.event_logging.v4.AnyContentComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.ClassificationComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.DataComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.HashComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.MediaComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.MetaDataTagsComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.PermissionAttributeSimpleTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.UserComplexTypeProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    build.buf.validate.ValidateProto.getDescriptor();
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(build.buf.validate.ValidateProto.field);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
