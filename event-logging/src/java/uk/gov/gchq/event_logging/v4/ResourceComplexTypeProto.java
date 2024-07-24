// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/resource_complex_type.proto
// Protobuf Java Version: 4.26.1

package uk.gov.gchq.event_logging.v4;

public final class ResourceComplexTypeProto {
  private ResourceComplexTypeProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      ResourceComplexTypeProto.class.getName());
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
    internal_static_event_logging_v4_ResourceComplexType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_ResourceComplexType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_event_logging_v4_ResourceComplexType_PermissionsType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_ResourceComplexType_PermissionsType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_event_logging_v4_ResourceComplexType_PermissionsType_PermissionType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_ResourceComplexType_PermissionsType_PermissionType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,event_logging/v4/resource_complex_type" +
      ".proto\022\020event_logging.v4\032/event_logging/" +
      "v4/any_content_complex_type.proto\0322event" +
      "_logging/v4/classification_complex_type." +
      "proto\032(event_logging/v4/data_complex_typ" +
      "e.proto\0322event_logging/v4/meta_data_tags" +
      "_complex_type.proto\0327event_logging/v4/pe" +
      "rmission_attribute_simple_type.proto\032(ev" +
      "ent_logging/v4/user_complex_type.proto\032\033" +
      "buf/validate/validate.proto\"\320\r\n\023Resource" +
      "ComplexType\022E\n\004meta\030\001 \003(\0132\'.event_loggin" +
      "g.v4.AnyContentComplexTypeB\010\272H\005\222\001\002\010\000R\004me" +
      "ta\022\022\n\004type\030\002 \001(\tR\004type\022\016\n\002id\030\003 \001(\tR\002id\022\022" +
      "\n\004name\030\004 \001(\tR\004name\022 \n\013description\030\005 \001(\tR" +
      "\013description\022S\n\016classification\030\006 \001(\0132+.e" +
      "vent_logging.v4.ClassificationComplexTyp" +
      "eR\016classification\022\024\n\005state\030\007 \001(\tR\005state\022" +
      ";\n\006groups\030\010 \001(\0132#.event_logging.v4.Group" +
      "sComplexTypeR\006groups\022W\n\013permissions\030\t \001(" +
      "\01325.event_logging.v4.ResourceComplexType" +
      ".PermissionsTypeR\013permissions\022=\n\004tags\030\n " +
      "\001(\0132).event_logging.v4.MetaDataTagsCompl" +
      "exTypeR\004tags\022\024\n\005title\030\013 \001(\tR\005title\022\020\n\003ur" +
      "l\030\014 \001(\tR\003url\022\032\n\010referrer\030\r \001(\tR\010referrer" +
      "\022\035\n\nsession_id\030\016 \001(\tR\tsessionId\022\037\n\013http_" +
      "method\030\017 \001(\tR\nhttpMethod\022!\n\014http_version" +
      "\030\020 \001(\tR\013httpVersion\022\035\n\nuser_agent\030\021 \001(\tR" +
      "\tuserAgent\022*\n\014inbound_size\030\022 \001(\rB\007\272H\004*\002(" +
      "\000R\013inboundSize\0229\n\024inbound_content_size\030\023" +
      " \001(\rB\007\272H\004*\002(\000R\022inboundContentSize\022%\n\016inb" +
      "ound_header\030\024 \001(\tR\rinboundHeader\022,\n\routb" +
      "ound_size\030\025 \001(\rB\007\272H\004*\002(\000R\014outboundSize\022;" +
      "\n\025outbound_content_size\030\026 \001(\rB\007\272H\004*\002(\000R\023" +
      "outboundContentSize\022\'\n\017outbound_header\030\027" +
      " \001(\tR\016outboundHeader\022*\n\014request_time\030\030 \001" +
      "(\rB\007\272H\004*\002(\000R\013requestTime\022+\n\021connection_s" +
      "tatus\030\031 \001(\tR\020connectionStatus\0222\n\025initial" +
      "_response_code\030\032 \001(\tR\023initialResponseCod" +
      "e\022#\n\rresponse_code\030\033 \001(\tR\014responseCode\022\033" +
      "\n\tmime_type\030\034 \001(\tR\010mimeType\022\032\n\010category\030" +
      "\035 \001(\tR\010category\022?\n\004data\030\036 \003(\0132!.event_lo" +
      "gging.v4.DataComplexTypeB\010\272H\005\222\001\002\010\000R\004data" +
      "\032\303\003\n\017PermissionsType\022n\n\npermission\030\001 \003(\013" +
      "2D.event_logging.v4.ResourceComplexType." +
      "PermissionsType.PermissionTypeB\010\272H\005\222\001\002\010\001" +
      "R\npermission\032\277\002\n\016PermissionType\022=\n\004user\030" +
      "\001 \001(\0132!.event_logging.v4.UserComplexType" +
      "B\006\272H\003\310\001\001R\004user\022@\n\005group\030\002 \001(\0132\".event_lo" +
      "gging.v4.GroupComplexTypeB\006\272H\003\310\001\001R\005group" +
      "\022V\n\005allow\030\013 \003(\0162/.event_logging.v4.Permi" +
      "ssionAttributeSimpleTypeB\017\272H\014\222\001\t\010\000\"\005\202\001\002\020" +
      "\001R\005allow\022T\n\004deny\030\014 \003(\0162/.event_logging.v" +
      "4.PermissionAttributeSimpleTypeB\017\272H\014\222\001\t\010" +
      "\000\"\005\202\001\002\020\001R\004denyB\334\001\n\034uk.gov.gchq.event_log" +
      "ging.v4B\030ResourceComplexTypeProtoP\001ZEgit" +
      "hub.com/gchq/event-logging-schema/event_" +
      "logging/v4;event_loggingv4\242\002\003EXX\252\002\017Event" +
      "Logging.V4\312\002\017EventLogging\\V4\342\002\033EventLogg" +
      "ing\\V4\\GPBMetadata\352\002\020EventLogging::V4b\006p" +
      "roto3"
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
    internal_static_event_logging_v4_ResourceComplexType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_event_logging_v4_ResourceComplexType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_ResourceComplexType_descriptor,
        new java.lang.String[] { "Meta", "Type", "Id", "Name", "Description", "Classification", "State", "Groups", "Permissions", "Tags", "Title", "Url", "Referrer", "SessionId", "HttpMethod", "HttpVersion", "UserAgent", "InboundSize", "InboundContentSize", "InboundHeader", "OutboundSize", "OutboundContentSize", "OutboundHeader", "RequestTime", "ConnectionStatus", "InitialResponseCode", "ResponseCode", "MimeType", "Category", "Data", });
    internal_static_event_logging_v4_ResourceComplexType_PermissionsType_descriptor =
      internal_static_event_logging_v4_ResourceComplexType_descriptor.getNestedTypes().get(0);
    internal_static_event_logging_v4_ResourceComplexType_PermissionsType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_ResourceComplexType_PermissionsType_descriptor,
        new java.lang.String[] { "Permission", });
    internal_static_event_logging_v4_ResourceComplexType_PermissionsType_PermissionType_descriptor =
      internal_static_event_logging_v4_ResourceComplexType_PermissionsType_descriptor.getNestedTypes().get(0);
    internal_static_event_logging_v4_ResourceComplexType_PermissionsType_PermissionType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_ResourceComplexType_PermissionsType_PermissionType_descriptor,
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