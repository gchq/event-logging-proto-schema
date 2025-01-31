// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/activity_complex_type.proto

// Protobuf Java Version: 4.26.1
package uk.gov.gchq.event_logging.v4;

public interface ActivityComplexTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:event_logging.v4.ActivityComplexType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The unique identifier of the event that is being referenced. This will be the value of Event/EventSource/EventId on the referenced event. E.g. where an event with Event/EventSource/EventId=101 is a child of an event with Event/EventSource/EventId=99, the value in this element would be 99.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * The unique identifier of the event that is being referenced. This will be the value of Event/EventSource/EventId on the referenced event. E.g. where an event with Event/EventSource/EventId=101 is a child of an event with Event/EventSource/EventId=99, the value in this element would be 99.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * A descriptive name for the referenced event.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * A descriptive name for the referenced event.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The details of the event that is the parent of this referenced event. E.g. if event C is a child of event B which is a child of event A, this element would record an Id of A.
   * </pre>
   *
   * <code>.event_logging.v4.ActivityComplexType parent = 3 [json_name = "parent"];</code>
   * @return Whether the parent field is set.
   */
  boolean hasParent();
  /**
   * <pre>
   * The details of the event that is the parent of this referenced event. E.g. if event C is a child of event B which is a child of event A, this element would record an Id of A.
   * </pre>
   *
   * <code>.event_logging.v4.ActivityComplexType parent = 3 [json_name = "parent"];</code>
   * @return The parent.
   */
  uk.gov.gchq.event_logging.v4.ActivityComplexType getParent();
  /**
   * <pre>
   * The details of the event that is the parent of this referenced event. E.g. if event C is a child of event B which is a child of event A, this element would record an Id of A.
   * </pre>
   *
   * <code>.event_logging.v4.ActivityComplexType parent = 3 [json_name = "parent"];</code>
   */
  uk.gov.gchq.event_logging.v4.ActivityComplexTypeOrBuilder getParentOrBuilder();
}
