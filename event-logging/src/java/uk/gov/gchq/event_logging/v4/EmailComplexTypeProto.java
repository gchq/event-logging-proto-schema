// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/email_complex_type.proto
// Protobuf Java Version: 4.26.1

package uk.gov.gchq.event_logging.v4;

public final class EmailComplexTypeProto {
  private EmailComplexTypeProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      EmailComplexTypeProto.class.getName());
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
    internal_static_event_logging_v4_EmailComplexType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_EmailComplexType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_event_logging_v4_EmailComplexType_PermissionsType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_EmailComplexType_PermissionsType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_event_logging_v4_EmailComplexType_PermissionsType_PermissionType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_EmailComplexType_PermissionsType_PermissionType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)event_logging/v4/email_complex_type.pr" +
      "oto\022\020event_logging.v4\032/event_logging/v4/" +
      "any_content_complex_type.proto\0322event_lo" +
      "gging/v4/classification_complex_type.pro" +
      "to\032(event_logging/v4/data_complex_type.p" +
      "roto\0322event_logging/v4/meta_data_tags_co" +
      "mplex_type.proto\0327event_logging/v4/permi" +
      "ssion_attribute_simple_type.proto\032(event" +
      "_logging/v4/user_complex_type.proto\032\033buf" +
      "/validate/validate.proto\"\265\n\n\020EmailComple" +
      "xType\022E\n\004meta\030\001 \003(\0132\'.event_logging.v4.A" +
      "nyContentComplexTypeB\010\272H\005\222\001\002\010\000R\004meta\022\022\n\004" +
      "type\030\002 \001(\tR\004type\022\016\n\002id\030\003 \001(\tR\002id\022\022\n\004name" +
      "\030\004 \001(\tR\004name\022 \n\013description\030\005 \001(\tR\013descr" +
      "iption\022S\n\016classification\030\006 \001(\0132+.event_l" +
      "ogging.v4.ClassificationComplexTypeR\016cla" +
      "ssification\022\024\n\005state\030\007 \001(\tR\005state\022;\n\006gro" +
      "ups\030\010 \001(\0132#.event_logging.v4.GroupsCompl" +
      "exTypeR\006groups\022T\n\013permissions\030\t \001(\01322.ev" +
      "ent_logging.v4.EmailComplexType.Permissi" +
      "onsTypeR\013permissions\022=\n\004tags\030\n \001(\0132).eve" +
      "nt_logging.v4.MetaDataTagsComplexTypeR\004t" +
      "ags\0225\n\004from\030\013 \001(\0132!.event_logging.v4.Use" +
      "rComplexTypeR\004from\022;\n\002to\030\014 \003(\0132!.event_l" +
      "ogging.v4.UserComplexTypeB\010\272H\005\222\001\002\010\000R\002to\022" +
      ";\n\002cc\030\r \003(\0132!.event_logging.v4.UserCompl" +
      "exTypeB\010\272H\005\222\001\002\010\000R\002cc\022=\n\003bcc\030\016 \003(\0132!.even" +
      "t_logging.v4.UserComplexTypeB\010\272H\005\222\001\002\010\000R\003" +
      "bcc\022\030\n\007subject\030\017 \001(\tR\007subject\022\030\n\007content" +
      "\030\020 \001(\tR\007content\022\033\n\tmime_type\030\021 \001(\tR\010mime" +
      "Type\022?\n\004data\030\022 \003(\0132!.event_logging.v4.Da" +
      "taComplexTypeB\010\272H\005\222\001\002\010\000R\004data\032\300\003\n\017Permis" +
      "sionsType\022k\n\npermission\030\001 \003(\0132A.event_lo" +
      "gging.v4.EmailComplexType.PermissionsTyp" +
      "e.PermissionTypeB\010\272H\005\222\001\002\010\001R\npermission\032\277" +
      "\002\n\016PermissionType\022=\n\004user\030\001 \001(\0132!.event_" +
      "logging.v4.UserComplexTypeB\006\272H\003\310\001\001R\004user" +
      "\022@\n\005group\030\002 \001(\0132\".event_logging.v4.Group" +
      "ComplexTypeB\006\272H\003\310\001\001R\005group\022V\n\005allow\030\013 \003(" +
      "\0162/.event_logging.v4.PermissionAttribute" +
      "SimpleTypeB\017\272H\014\222\001\t\010\000\"\005\202\001\002\020\001R\005allow\022T\n\004de" +
      "ny\030\014 \003(\0162/.event_logging.v4.PermissionAt" +
      "tributeSimpleTypeB\017\272H\014\222\001\t\010\000\"\005\202\001\002\020\001R\004deny" +
      "B\331\001\n\034uk.gov.gchq.event_logging.v4B\025Email" +
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
          uk.gov.gchq.event_logging.v4.MetaDataTagsComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.PermissionAttributeSimpleTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.UserComplexTypeProto.getDescriptor(),
          build.buf.validate.ValidateProto.getDescriptor(),
        });
    internal_static_event_logging_v4_EmailComplexType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_event_logging_v4_EmailComplexType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_EmailComplexType_descriptor,
        new java.lang.String[] { "Meta", "Type", "Id", "Name", "Description", "Classification", "State", "Groups", "Permissions", "Tags", "From", "To", "Cc", "Bcc", "Subject", "Content", "MimeType", "Data", });
    internal_static_event_logging_v4_EmailComplexType_PermissionsType_descriptor =
      internal_static_event_logging_v4_EmailComplexType_descriptor.getNestedTypes().get(0);
    internal_static_event_logging_v4_EmailComplexType_PermissionsType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_EmailComplexType_PermissionsType_descriptor,
        new java.lang.String[] { "Permission", });
    internal_static_event_logging_v4_EmailComplexType_PermissionsType_PermissionType_descriptor =
      internal_static_event_logging_v4_EmailComplexType_PermissionsType_descriptor.getNestedTypes().get(0);
    internal_static_event_logging_v4_EmailComplexType_PermissionsType_PermissionType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_EmailComplexType_PermissionsType_PermissionType_descriptor,
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
