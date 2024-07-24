// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/outcome_complex_type.proto

// Protobuf Java Version: 4.26.1
package uk.gov.gchq.event_logging.v4;

public interface OutcomeComplexTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:event_logging.v4.OutcomeComplexType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If the outcome of an event was successful then 'true', 'false' otherwise. Can be omitted if true as this is the default. The main exception to this default would be if there were many varied Descriptions for the success criteria and such Descriptions could provide additional context to the event.
   * </pre>
   *
   * <code>bool success = 1 [json_name = "success"];</code>
   * @return The success.
   */
  boolean getSuccess();

  /**
   * <pre>
   * If an action was permitted then 'true', 'false' otherwise. Can be omitted if true as this is the default. The main exception to this default would be if there were many varied Descriptions for the success criteria and such Descriptions could provide additional context to the event.
   * </pre>
   *
   * <code>bool permitted = 2 [json_name = "permitted"];</code>
   * @return The permitted.
   */
  boolean getPermitted();

  /**
   * <pre>
   * A description of the authorisation service that was used to decide if the action was permitted.
   * </pre>
   *
   * <code>.event_logging.v4.OutcomeComplexType.AuthServiceType auth_service = 3 [json_name = "authService"];</code>
   * @return Whether the authService field is set.
   */
  boolean hasAuthService();
  /**
   * <pre>
   * A description of the authorisation service that was used to decide if the action was permitted.
   * </pre>
   *
   * <code>.event_logging.v4.OutcomeComplexType.AuthServiceType auth_service = 3 [json_name = "authService"];</code>
   * @return The authService.
   */
  uk.gov.gchq.event_logging.v4.OutcomeComplexType.AuthServiceType getAuthService();
  /**
   * <pre>
   * A description of the authorisation service that was used to decide if the action was permitted.
   * </pre>
   *
   * <code>.event_logging.v4.OutcomeComplexType.AuthServiceType auth_service = 3 [json_name = "authService"];</code>
   */
  uk.gov.gchq.event_logging.v4.OutcomeComplexType.AuthServiceTypeOrBuilder getAuthServiceOrBuilder();

  /**
   * <pre>
   * Human readable text that describes the outcome.
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Human readable text that describes the outcome.
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Any other event data that does not fit into a schema element but may be useful for the purpose of audit.
   * </pre>
   *
   * <code>repeated .event_logging.v4.DataComplexType data = 5 [json_name = "data", (.buf.validate.field) = { ... }</code>
   */
  java.util.List<uk.gov.gchq.event_logging.v4.DataComplexType> 
      getDataList();
  /**
   * <pre>
   * Any other event data that does not fit into a schema element but may be useful for the purpose of audit.
   * </pre>
   *
   * <code>repeated .event_logging.v4.DataComplexType data = 5 [json_name = "data", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.DataComplexType getData(int index);
  /**
   * <pre>
   * Any other event data that does not fit into a schema element but may be useful for the purpose of audit.
   * </pre>
   *
   * <code>repeated .event_logging.v4.DataComplexType data = 5 [json_name = "data", (.buf.validate.field) = { ... }</code>
   */
  int getDataCount();
  /**
   * <pre>
   * Any other event data that does not fit into a schema element but may be useful for the purpose of audit.
   * </pre>
   *
   * <code>repeated .event_logging.v4.DataComplexType data = 5 [json_name = "data", (.buf.validate.field) = { ... }</code>
   */
  java.util.List<? extends uk.gov.gchq.event_logging.v4.DataComplexTypeOrBuilder> 
      getDataOrBuilderList();
  /**
   * <pre>
   * Any other event data that does not fit into a schema element but may be useful for the purpose of audit.
   * </pre>
   *
   * <code>repeated .event_logging.v4.DataComplexType data = 5 [json_name = "data", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.DataComplexTypeOrBuilder getDataOrBuilder(
      int index);
}