// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/view_complex_type.proto

// Protobuf Java Version: 4.26.1
package uk.gov.gchq.event_logging.v4;

public interface ViewComplexTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:event_logging.v4.ViewComplexType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .event_logging.v4.ViewComplexType.ChoiceWrapperViewComplexType choice_wrapper = 1 [json_name = "choiceWrapper", (.buf.validate.field) = { ... }</code>
   */
  java.util.List<uk.gov.gchq.event_logging.v4.ViewComplexType.ChoiceWrapperViewComplexType> 
      getChoiceWrapperList();
  /**
   * <code>repeated .event_logging.v4.ViewComplexType.ChoiceWrapperViewComplexType choice_wrapper = 1 [json_name = "choiceWrapper", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.ViewComplexType.ChoiceWrapperViewComplexType getChoiceWrapper(int index);
  /**
   * <code>repeated .event_logging.v4.ViewComplexType.ChoiceWrapperViewComplexType choice_wrapper = 1 [json_name = "choiceWrapper", (.buf.validate.field) = { ... }</code>
   */
  int getChoiceWrapperCount();
  /**
   * <code>repeated .event_logging.v4.ViewComplexType.ChoiceWrapperViewComplexType choice_wrapper = 1 [json_name = "choiceWrapper", (.buf.validate.field) = { ... }</code>
   */
  java.util.List<? extends uk.gov.gchq.event_logging.v4.ViewComplexType.ChoiceWrapperViewComplexTypeOrBuilder> 
      getChoiceWrapperOrBuilderList();
  /**
   * <code>repeated .event_logging.v4.ViewComplexType.ChoiceWrapperViewComplexType choice_wrapper = 1 [json_name = "choiceWrapper", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.ViewComplexType.ChoiceWrapperViewComplexTypeOrBuilder getChoiceWrapperOrBuilder(
      int index);

  /**
   * <pre>
   * Used to determine if the action was successful. If omitted it is assumed that the event was successful and was permitted.
   * </pre>
   *
   * <code>.event_logging.v4.OutcomeComplexType outcome = 11 [json_name = "outcome"];</code>
   * @return Whether the outcome field is set.
   */
  boolean hasOutcome();
  /**
   * <pre>
   * Used to determine if the action was successful. If omitted it is assumed that the event was successful and was permitted.
   * </pre>
   *
   * <code>.event_logging.v4.OutcomeComplexType outcome = 11 [json_name = "outcome"];</code>
   * @return The outcome.
   */
  uk.gov.gchq.event_logging.v4.OutcomeComplexType getOutcome();
  /**
   * <pre>
   * Used to determine if the action was successful. If omitted it is assumed that the event was successful and was permitted.
   * </pre>
   *
   * <code>.event_logging.v4.OutcomeComplexType outcome = 11 [json_name = "outcome"];</code>
   */
  uk.gov.gchq.event_logging.v4.OutcomeComplexTypeOrBuilder getOutcomeOrBuilder();

  /**
   * <pre>
   * Any other event data that does not fit into a schema element but may be useful for the purpose of audit.
   * </pre>
   *
   * <code>repeated .event_logging.v4.DataComplexType data = 12 [json_name = "data", (.buf.validate.field) = { ... }</code>
   */
  java.util.List<uk.gov.gchq.event_logging.v4.DataComplexType> 
      getDataList();
  /**
   * <pre>
   * Any other event data that does not fit into a schema element but may be useful for the purpose of audit.
   * </pre>
   *
   * <code>repeated .event_logging.v4.DataComplexType data = 12 [json_name = "data", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.DataComplexType getData(int index);
  /**
   * <pre>
   * Any other event data that does not fit into a schema element but may be useful for the purpose of audit.
   * </pre>
   *
   * <code>repeated .event_logging.v4.DataComplexType data = 12 [json_name = "data", (.buf.validate.field) = { ... }</code>
   */
  int getDataCount();
  /**
   * <pre>
   * Any other event data that does not fit into a schema element but may be useful for the purpose of audit.
   * </pre>
   *
   * <code>repeated .event_logging.v4.DataComplexType data = 12 [json_name = "data", (.buf.validate.field) = { ... }</code>
   */
  java.util.List<? extends uk.gov.gchq.event_logging.v4.DataComplexTypeOrBuilder> 
      getDataOrBuilderList();
  /**
   * <pre>
   * Any other event data that does not fit into a schema element but may be useful for the purpose of audit.
   * </pre>
   *
   * <code>repeated .event_logging.v4.DataComplexType data = 12 [json_name = "data", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.DataComplexTypeOrBuilder getDataOrBuilder(
      int index);
}
