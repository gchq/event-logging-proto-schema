// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/media_type_simple_type.proto
// Protobuf Java Version: 4.26.1

package uk.gov.gchq.event_logging.v4;

public final class MediaTypeSimpleTypeProto {
  private MediaTypeSimpleTypeProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      MediaTypeSimpleTypeProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-event_logging/v4/media_type_simple_typ" +
      "e.proto\022\020event_logging.v4\032\033buf/validate/" +
      "validate.proto*\206\003\n\023MediaTypeSimpleType\022&" +
      "\n\"MEDIA_TYPE_SIMPLE_TYPE_UNSPECIFIED\020\000\022$" +
      "\n MEDIA_TYPE_SIMPLE_TYPE_HARD_DISK\020\001\022+\n\'" +
      "MEDIA_TYPE_SIMPLE_TYPE_USB_MASS_STORAGE\020" +
      "\002\022\"\n\036MEDIA_TYPE_SIMPLE_TYPE_BLU_RAY\020\003\022\036\n" +
      "\032MEDIA_TYPE_SIMPLE_TYPE_DVD\020\004\022\035\n\031MEDIA_T" +
      "YPE_SIMPLE_TYPE_CD\020\005\022&\n\"MEDIA_TYPE_SIMPL" +
      "E_TYPE_FLOPPY_DISK\020\006\022\037\n\033MEDIA_TYPE_SIMPL" +
      "E_TYPE_TAPE\020\007\022&\n\"MEDIA_TYPE_SIMPLE_TYPE_" +
      "MEMORY_CARD\020\010\022 \n\034MEDIA_TYPE_SIMPLE_TYPE_" +
      "OTHER\020\tB\334\001\n\034uk.gov.gchq.event_logging.v4" +
      "B\030MediaTypeSimpleTypeProtoP\001ZEgithub.com" +
      "/gchq/event-logging-schema/event_logging" +
      "/v4;event_loggingv4\242\002\003EXX\252\002\017EventLogging" +
      ".V4\312\002\017EventLogging\\V4\342\002\033EventLogging\\V4\\" +
      "GPBMetadata\352\002\020EventLogging::V4b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          build.buf.validate.ValidateProto.getDescriptor(),
        });
    descriptor.resolveAllFeaturesImmutable();
    build.buf.validate.ValidateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}