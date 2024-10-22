// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/network_complex_type.proto

// Protobuf Java Version: 4.26.1
package uk.gov.gchq.event_logging.v4;

public interface NetworkComplexTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:event_logging.v4.NetworkComplexType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The source device that is attempting the network action.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkLocationComplexType source = 1 [json_name = "source", (.buf.validate.field) = { ... }</code>
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   * <pre>
   * The source device that is attempting the network action.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkLocationComplexType source = 1 [json_name = "source", (.buf.validate.field) = { ... }</code>
   * @return The source.
   */
  uk.gov.gchq.event_logging.v4.NetworkLocationComplexType getSource();
  /**
   * <pre>
   * The source device that is attempting the network action.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkLocationComplexType source = 1 [json_name = "source", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.NetworkLocationComplexTypeOrBuilder getSourceOrBuilder();

  /**
   * <pre>
   * The destination device for the network action.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkLocationComplexType destination = 2 [json_name = "destination"];</code>
   * @return Whether the destination field is set.
   */
  boolean hasDestination();
  /**
   * <pre>
   * The destination device for the network action.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkLocationComplexType destination = 2 [json_name = "destination"];</code>
   * @return The destination.
   */
  uk.gov.gchq.event_logging.v4.NetworkLocationComplexType getDestination();
  /**
   * <pre>
   * The destination device for the network action.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkLocationComplexType destination = 2 [json_name = "destination"];</code>
   */
  uk.gov.gchq.event_logging.v4.NetworkLocationComplexTypeOrBuilder getDestinationOrBuilder();

  /**
   * <pre>
   * The name of the process responsible for the network action.
   * </pre>
   *
   * <code>string process_name = 3 [json_name = "processName"];</code>
   * @return The processName.
   */
  java.lang.String getProcessName();
  /**
   * <pre>
   * The name of the process responsible for the network action.
   * </pre>
   *
   * <code>string process_name = 3 [json_name = "processName"];</code>
   * @return The bytes for processName.
   */
  com.google.protobuf.ByteString
      getProcessNameBytes();

  /**
   * <pre>
   * If the network action is related to message transfer from one place to another then this element describes the message.
   * </pre>
   *
   * <code>.event_logging.v4.MultiObjectComplexType payload = 4 [json_name = "payload"];</code>
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   * <pre>
   * If the network action is related to message transfer from one place to another then this element describes the message.
   * </pre>
   *
   * <code>.event_logging.v4.MultiObjectComplexType payload = 4 [json_name = "payload"];</code>
   * @return The payload.
   */
  uk.gov.gchq.event_logging.v4.MultiObjectComplexType getPayload();
  /**
   * <pre>
   * If the network action is related to message transfer from one place to another then this element describes the message.
   * </pre>
   *
   * <code>.event_logging.v4.MultiObjectComplexType payload = 4 [json_name = "payload"];</code>
   */
  uk.gov.gchq.event_logging.v4.MultiObjectComplexTypeOrBuilder getPayloadOrBuilder();

  /**
   * <pre>
   * The network boundary filter rule that was fired to generate this event.
   * </pre>
   *
   * <code>string rule = 5 [json_name = "rule"];</code>
   * @return The rule.
   */
  java.lang.String getRule();
  /**
   * <pre>
   * The network boundary filter rule that was fired to generate this event.
   * </pre>
   *
   * <code>string rule = 5 [json_name = "rule"];</code>
   * @return The bytes for rule.
   */
  com.google.protobuf.ByteString
      getRuleBytes();
}
