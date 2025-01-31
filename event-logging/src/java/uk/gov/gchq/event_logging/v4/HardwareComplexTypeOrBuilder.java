// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/hardware_complex_type.proto

// Protobuf Java Version: 4.26.1
package uk.gov.gchq.event_logging.v4;

public interface HardwareComplexTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:event_logging.v4.HardwareComplexType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The type of hardware, e.g. hard disk drive.
   * </pre>
   *
   * <code>.event_logging.v4.HardwareTypeSimpleType type = 1 [json_name = "type", (.buf.validate.field) = { ... }</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * The type of hardware, e.g. hard disk drive.
   * </pre>
   *
   * <code>.event_logging.v4.HardwareTypeSimpleType type = 1 [json_name = "type", (.buf.validate.field) = { ... }</code>
   * @return The type.
   */
  uk.gov.gchq.event_logging.v4.HardwareTypeSimpleType getType();

  /**
   * <pre>
   * A unique identifier for the piece of hardware, e.g. an asset number.
   * </pre>
   *
   * <code>string id = 2 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * A unique identifier for the piece of hardware, e.g. an asset number.
   * </pre>
   *
   * <code>string id = 2 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * A friendly name for the hardware, e.g. a name that has been defined in an asset management or device monitoring system.
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * A friendly name for the hardware, e.g. a name that has been defined in an asset management or device monitoring system.
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The model name as defined by the manufacturer.
   * </pre>
   *
   * <code>string model = 4 [json_name = "model"];</code>
   * @return The model.
   */
  java.lang.String getModel();
  /**
   * <pre>
   * The model name as defined by the manufacturer.
   * </pre>
   *
   * <code>string model = 4 [json_name = "model"];</code>
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString
      getModelBytes();

  /**
   * <pre>
   * The manufacturer of the piece of hardware.
   * </pre>
   *
   * <code>string manufacturer = 5 [json_name = "manufacturer"];</code>
   * @return The manufacturer.
   */
  java.lang.String getManufacturer();
  /**
   * <pre>
   * The manufacturer of the piece of hardware.
   * </pre>
   *
   * <code>string manufacturer = 5 [json_name = "manufacturer"];</code>
   * @return The bytes for manufacturer.
   */
  com.google.protobuf.ByteString
      getManufacturerBytes();

  /**
   * <pre>
   * The capacity of the device in bytes.
   * </pre>
   *
   * <code>uint32 capacity = 6 [json_name = "capacity", (.buf.validate.field) = { ... }</code>
   * @return The capacity.
   */
  int getCapacity();

  /**
   * <pre>
   * Any other event data that does not fit into a schema element but may be useful for the purpose of audit.
   * </pre>
   *
   * <code>repeated .event_logging.v4.DataComplexType data = 7 [json_name = "data", (.buf.validate.field) = { ... }</code>
   */
  java.util.List<uk.gov.gchq.event_logging.v4.DataComplexType> 
      getDataList();
  /**
   * <pre>
   * Any other event data that does not fit into a schema element but may be useful for the purpose of audit.
   * </pre>
   *
   * <code>repeated .event_logging.v4.DataComplexType data = 7 [json_name = "data", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.DataComplexType getData(int index);
  /**
   * <pre>
   * Any other event data that does not fit into a schema element but may be useful for the purpose of audit.
   * </pre>
   *
   * <code>repeated .event_logging.v4.DataComplexType data = 7 [json_name = "data", (.buf.validate.field) = { ... }</code>
   */
  int getDataCount();
  /**
   * <pre>
   * Any other event data that does not fit into a schema element but may be useful for the purpose of audit.
   * </pre>
   *
   * <code>repeated .event_logging.v4.DataComplexType data = 7 [json_name = "data", (.buf.validate.field) = { ... }</code>
   */
  java.util.List<? extends uk.gov.gchq.event_logging.v4.DataComplexTypeOrBuilder> 
      getDataOrBuilderList();
  /**
   * <pre>
   * Any other event data that does not fit into a schema element but may be useful for the purpose of audit.
   * </pre>
   *
   * <code>repeated .event_logging.v4.DataComplexType data = 7 [json_name = "data", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.DataComplexTypeOrBuilder getDataOrBuilder(
      int index);
}
