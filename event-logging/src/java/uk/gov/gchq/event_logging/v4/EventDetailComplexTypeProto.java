// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/event_detail_complex_type.proto
// Protobuf Java Version: 4.26.1

package uk.gov.gchq.event_logging.v4;

public final class EventDetailComplexTypeProto {
  private EventDetailComplexTypeProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      EventDetailComplexTypeProto.class.getName());
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
    internal_static_event_logging_v4_EventDetailComplexType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_EventDetailComplexType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_event_logging_v4_EventDetailComplexType_UnknownType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_EventDetailComplexType_UnknownType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0event_logging/v4/event_detail_complex_" +
      "type.proto\022\020event_logging.v4\032)event_logg" +
      "ing/v4/alert_complex_type.proto\032,event_l" +
      "ogging/v4/approval_complex_type.proto\0320e" +
      "vent_logging/v4/authenticate_complex_typ" +
      "e.proto\032-event_logging/v4/authorise_comp" +
      "lex_type.proto\032(event_logging/v4/copy_co" +
      "mplex_type.proto\032*event_logging/v4/creat" +
      "e_complex_type.proto\032(event_logging/v4/d" +
      "ata_complex_type.proto\032*event_logging/v4" +
      "/delete_complex_type.proto\032*event_loggin" +
      "g/v4/export_complex_type.proto\032*event_lo" +
      "gging/v4/import_complex_type.proto\032+even" +
      "t_logging/v4/install_complex_type.proto\032" +
      "(event_logging/v4/move_complex_type.prot" +
      "o\0328event_logging/v4/network_event_action" +
      "_complex_type.proto\032)event_logging/v4/pr" +
      "int_complex_type.proto\032+event_logging/v4" +
      "/process_complex_type.proto\032+event_loggi" +
      "ng/v4/purpose_complex_type.proto\032+event_" +
      "logging/v4/receive_complex_type.proto\032*e" +
      "vent_logging/v4/search_complex_type.prot" +
      "o\032(event_logging/v4/send_complex_type.pr" +
      "oto\032-event_logging/v4/uninstall_complex_" +
      "type.proto\032*event_logging/v4/update_comp" +
      "lex_type.proto\032(event_logging/v4/view_co" +
      "mplex_type.proto\032\033buf/validate/validate." +
      "proto\"\325\r\n\026EventDetailComplexType\022\037\n\007type" +
      "_id\030\001 \001(\tB\006\272H\003\310\001\001R\006typeId\022 \n\013description" +
      "\030\002 \001(\tR\013description\022>\n\007purpose\030\003 \001(\0132$.e" +
      "vent_logging.v4.PurposeComplexTypeR\007purp" +
      "ose\022U\n\014authenticate\030\004 \001(\0132).event_loggin" +
      "g.v4.AuthenticateComplexTypeB\006\272H\003\310\001\001R\014au" +
      "thenticate\022L\n\tauthorise\030\005 \001(\0132&.event_lo" +
      "gging.v4.AuthoriseComplexTypeB\006\272H\003\310\001\001R\ta" +
      "uthorise\022C\n\006search\030\006 \001(\0132#.event_logging" +
      ".v4.SearchComplexTypeB\006\272H\003\310\001\001R\006search\022=\n" +
      "\004copy\030\007 \001(\0132!.event_logging.v4.CopyCompl" +
      "exTypeB\006\272H\003\310\001\001R\004copy\022=\n\004move\030\010 \001(\0132!.eve" +
      "nt_logging.v4.MoveComplexTypeB\006\272H\003\310\001\001R\004m" +
      "ove\022C\n\006create\030\t \001(\0132#.event_logging.v4.C" +
      "reateComplexTypeB\006\272H\003\310\001\001R\006create\022=\n\004view" +
      "\030\n \001(\0132!.event_logging.v4.ViewComplexTyp" +
      "eB\006\272H\003\310\001\001R\004view\022N\n\014import_field\030\013 \001(\0132#." +
      "event_logging.v4.ImportComplexTypeB\006\272H\003\310" +
      "\001\001R\013importField\022C\n\006export\030\014 \001(\0132#.event_" +
      "logging.v4.ExportComplexTypeB\006\272H\003\310\001\001R\006ex" +
      "port\022C\n\006update\030\r \001(\0132#.event_logging.v4." +
      "UpdateComplexTypeB\006\272H\003\310\001\001R\006update\022C\n\006del" +
      "ete\030\016 \001(\0132#.event_logging.v4.DeleteCompl" +
      "exTypeB\006\272H\003\310\001\001R\006delete\022F\n\007process\030\017 \001(\0132" +
      "$.event_logging.v4.ProcessComplexTypeB\006\272" +
      "H\003\310\001\001R\007process\022@\n\005print\030\020 \001(\0132\".event_lo" +
      "gging.v4.PrintComplexTypeB\006\272H\003\310\001\001R\005print" +
      "\022F\n\007install\030\021 \001(\0132$.event_logging.v4.Ins" +
      "tallComplexTypeB\006\272H\003\310\001\001R\007install\022L\n\tunin" +
      "stall\030\022 \001(\0132&.event_logging.v4.Uninstall" +
      "ComplexTypeB\006\272H\003\310\001\001R\tuninstall\022Q\n\007networ" +
      "k\030\023 \001(\0132/.event_logging.v4.NetworkEventA" +
      "ctionComplexTypeB\006\272H\003\310\001\001R\007network\022@\n\005ale" +
      "rt\030\024 \001(\0132\".event_logging.v4.AlertComplex" +
      "TypeB\006\272H\003\310\001\001R\005alert\022=\n\004send\030\025 \001(\0132!.even" +
      "t_logging.v4.SendComplexTypeB\006\272H\003\310\001\001R\004se" +
      "nd\022F\n\007receive\030\026 \001(\0132$.event_logging.v4.R" +
      "eceiveComplexTypeB\006\272H\003\310\001\001R\007receive\022I\n\010ap" +
      "proval\030\027 \001(\0132%.event_logging.v4.Approval" +
      "ComplexTypeB\006\272H\003\310\001\001R\010approval\022V\n\007unknown" +
      "\030\030 \001(\01324.event_logging.v4.EventDetailCom" +
      "plexType.UnknownTypeB\006\272H\003\310\001\001R\007unknown\032N\n" +
      "\013UnknownType\022?\n\004data\030\001 \003(\0132!.event_loggi" +
      "ng.v4.DataComplexTypeB\010\272H\005\222\001\002\010\000R\004dataB\337\001" +
      "\n\034uk.gov.gchq.event_logging.v4B\033EventDet" +
      "ailComplexTypeProtoP\001ZEgithub.com/gchq/e" +
      "vent-logging-schema/event_logging/v4;eve" +
      "nt_loggingv4\242\002\003EXX\252\002\017EventLogging.V4\312\002\017E" +
      "ventLogging\\V4\342\002\033EventLogging\\V4\\GPBMeta" +
      "data\352\002\020EventLogging::V4b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          uk.gov.gchq.event_logging.v4.AlertComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.ApprovalComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.AuthenticateComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.AuthoriseComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.CopyComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.CreateComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.DataComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.DeleteComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.ExportComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.ImportComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.InstallComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.MoveComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.NetworkEventActionComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.PrintComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.ProcessComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.PurposeComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.ReceiveComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.SearchComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.SendComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.UninstallComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.UpdateComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.ViewComplexTypeProto.getDescriptor(),
          build.buf.validate.ValidateProto.getDescriptor(),
        });
    internal_static_event_logging_v4_EventDetailComplexType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_event_logging_v4_EventDetailComplexType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_EventDetailComplexType_descriptor,
        new java.lang.String[] { "TypeId", "Description", "Purpose", "Authenticate", "Authorise", "Search", "Copy", "Move", "Create", "View", "ImportField", "Export", "Update", "Delete", "Process", "Print", "Install", "Uninstall", "Network", "Alert", "Send", "Receive", "Approval", "Unknown", });
    internal_static_event_logging_v4_EventDetailComplexType_UnknownType_descriptor =
      internal_static_event_logging_v4_EventDetailComplexType_descriptor.getNestedTypes().get(0);
    internal_static_event_logging_v4_EventDetailComplexType_UnknownType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_EventDetailComplexType_UnknownType_descriptor,
        new java.lang.String[] { "Data", });
    descriptor.resolveAllFeaturesImmutable();
    uk.gov.gchq.event_logging.v4.AlertComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.ApprovalComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.AuthenticateComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.AuthoriseComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.CopyComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.CreateComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.DataComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.DeleteComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.ExportComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.ImportComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.InstallComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.MoveComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.NetworkEventActionComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.PrintComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.ProcessComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.PurposeComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.ReceiveComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.SearchComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.SendComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.UninstallComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.UpdateComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.ViewComplexTypeProto.getDescriptor();
    build.buf.validate.ValidateProto.getDescriptor();
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(build.buf.validate.ValidateProto.field);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
  }

  // @@protoc_insertion_point(outer_class_scope)
}