// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/classification_complex_type.proto
// Protobuf Java Version: 4.26.1

package uk.gov.gchq.event_logging.v4;

public final class ClassificationComplexTypeProto {
  private ClassificationComplexTypeProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      ClassificationComplexTypeProto.class.getName());
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
    internal_static_event_logging_v4_ClassificationComplexType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_ClassificationComplexType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_event_logging_v4_ClassificationComplexType_DescriptorsType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_ClassificationComplexType_DescriptorsType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_event_logging_v4_ClassificationComplexType_PermittedNationalitiesType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_ClassificationComplexType_PermittedNationalitiesType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_event_logging_v4_ClassificationComplexType_PermittedOrganisationsType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_ClassificationComplexType_PermittedOrganisationsType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_event_logging_v4_ClassificationComplexType_DisseminationControlsType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_ClassificationComplexType_DisseminationControlsType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_event_logging_v4_ClassificationComplexType_DispositionType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_event_logging_v4_ClassificationComplexType_DispositionType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2event_logging/v4/classification_comple" +
      "x_type.proto\022\020event_logging.v4\0329event_lo" +
      "gging/v4/access_control_groups_complex_t" +
      "ype.proto\032(event_logging/v4/data_complex" +
      "_type.proto\0320event_logging/v4/organisati" +
      "on_complex_type.proto\032\037google/protobuf/t" +
      "imestamp.proto\032\033buf/validate/validate.pr" +
      "oto\"\363\013\n\031ClassificationComplexType\022\022\n\004tex" +
      "t\030\001 \001(\tR\004text\022I\n\noriginator\030\002 \001(\0132).even" +
      "t_logging.v4.OrganisationComplexTypeR\nor" +
      "iginator\022G\n\tcustodian\030\003 \001(\0132).event_logg" +
      "ing.v4.OrganisationComplexTypeR\tcustodia" +
      "n\022&\n\016classification\030\004 \001(\tR\016classificatio" +
      "n\022]\n\013descriptors\030\005 \001(\0132;.event_logging.v" +
      "4.ClassificationComplexType.DescriptorsT" +
      "ypeR\013descriptors\022M\n\tor_groups\030\006 \001(\01320.ev" +
      "ent_logging.v4.AccessControlGroupsComple" +
      "xTypeR\010orGroups\022O\n\nand_groups\030\007 \001(\01320.ev" +
      "ent_logging.v4.AccessControlGroupsComple" +
      "xTypeR\tandGroups\022\177\n\027permitted_nationalit" +
      "ies\030\010 \001(\0132F.event_logging.v4.Classificat" +
      "ionComplexType.PermittedNationalitiesTyp" +
      "eR\026permittedNationalities\022\177\n\027permitted_o" +
      "rganisations\030\t \001(\0132F.event_logging.v4.Cl" +
      "assificationComplexType.PermittedOrganis" +
      "ationsTypeR\026permittedOrganisations\022|\n\026di" +
      "ssemination_controls\030\n \001(\0132E.event_loggi" +
      "ng.v4.ClassificationComplexType.Dissemin" +
      "ationControlsTypeR\025disseminationControls" +
      "\022]\n\013disposition\030\013 \001(\0132;.event_logging.v4" +
      ".ClassificationComplexType.DispositionTy" +
      "peR\013disposition\022?\n\004data\030\014 \003(\0132!.event_lo" +
      "gging.v4.DataComplexTypeB\010\272H\005\222\001\002\010\000R\004data" +
      "\032;\n\017DescriptorsType\022(\n\ndescriptor\030\001 \003(\tB" +
      "\010\272H\005\222\001\002\010\001R\ndescriptor\032X\n\032PermittedNation" +
      "alitiesType\022:\n\013nationality\030\001 \003(\tB\030\272H\025\222\001\022" +
      "\010\001\"\016r\0142\n([A-Z]{3})R\013nationality\032\206\001\n\032Perm" +
      "ittedOrganisationsType\022h\n\026permitted_orga" +
      "nisation\030\001 \001(\0132).event_logging.v4.Organi" +
      "sationComplexTypeB\006\272H\003\310\001\001R\025permittedOrga" +
      "nisation\032Z\n\031DisseminationControlsType\022=\n" +
      "\025dissemination_control\030\001 \003(\tB\010\272H\005\222\001\002\010\001R\024" +
      "disseminationControl\032k\n\017DispositionType\022" +
      "6\n\004date\030\001 \001(\0132\032.google.protobuf.Timestam" +
      "pB\006\272H\003\310\001\001R\004date\022 \n\007process\030\002 \001(\tB\006\272H\003\310\001\001" +
      "R\007processB\342\001\n\034uk.gov.gchq.event_logging." +
      "v4B\036ClassificationComplexTypeProtoP\001ZEgi" +
      "thub.com/gchq/event-logging-schema/event" +
      "_logging/v4;event_loggingv4\242\002\003EXX\252\002\017Even" +
      "tLogging.V4\312\002\017EventLogging\\V4\342\002\033EventLog" +
      "ging\\V4\\GPBMetadata\352\002\020EventLogging::V4b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          uk.gov.gchq.event_logging.v4.AccessControlGroupsComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.DataComplexTypeProto.getDescriptor(),
          uk.gov.gchq.event_logging.v4.OrganisationComplexTypeProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          build.buf.validate.ValidateProto.getDescriptor(),
        });
    internal_static_event_logging_v4_ClassificationComplexType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_event_logging_v4_ClassificationComplexType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_ClassificationComplexType_descriptor,
        new java.lang.String[] { "Text", "Originator", "Custodian", "Classification", "Descriptors", "OrGroups", "AndGroups", "PermittedNationalities", "PermittedOrganisations", "DisseminationControls", "Disposition", "Data", });
    internal_static_event_logging_v4_ClassificationComplexType_DescriptorsType_descriptor =
      internal_static_event_logging_v4_ClassificationComplexType_descriptor.getNestedTypes().get(0);
    internal_static_event_logging_v4_ClassificationComplexType_DescriptorsType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_ClassificationComplexType_DescriptorsType_descriptor,
        new java.lang.String[] { "Descriptor", });
    internal_static_event_logging_v4_ClassificationComplexType_PermittedNationalitiesType_descriptor =
      internal_static_event_logging_v4_ClassificationComplexType_descriptor.getNestedTypes().get(1);
    internal_static_event_logging_v4_ClassificationComplexType_PermittedNationalitiesType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_ClassificationComplexType_PermittedNationalitiesType_descriptor,
        new java.lang.String[] { "Nationality", });
    internal_static_event_logging_v4_ClassificationComplexType_PermittedOrganisationsType_descriptor =
      internal_static_event_logging_v4_ClassificationComplexType_descriptor.getNestedTypes().get(2);
    internal_static_event_logging_v4_ClassificationComplexType_PermittedOrganisationsType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_ClassificationComplexType_PermittedOrganisationsType_descriptor,
        new java.lang.String[] { "PermittedOrganisation", });
    internal_static_event_logging_v4_ClassificationComplexType_DisseminationControlsType_descriptor =
      internal_static_event_logging_v4_ClassificationComplexType_descriptor.getNestedTypes().get(3);
    internal_static_event_logging_v4_ClassificationComplexType_DisseminationControlsType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_ClassificationComplexType_DisseminationControlsType_descriptor,
        new java.lang.String[] { "DisseminationControl", });
    internal_static_event_logging_v4_ClassificationComplexType_DispositionType_descriptor =
      internal_static_event_logging_v4_ClassificationComplexType_descriptor.getNestedTypes().get(4);
    internal_static_event_logging_v4_ClassificationComplexType_DispositionType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_event_logging_v4_ClassificationComplexType_DispositionType_descriptor,
        new java.lang.String[] { "Date", "Process", });
    descriptor.resolveAllFeaturesImmutable();
    uk.gov.gchq.event_logging.v4.AccessControlGroupsComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.DataComplexTypeProto.getDescriptor();
    uk.gov.gchq.event_logging.v4.OrganisationComplexTypeProto.getDescriptor();
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
