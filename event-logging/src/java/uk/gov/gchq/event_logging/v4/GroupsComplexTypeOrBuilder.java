// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/user_complex_type.proto

// Protobuf Java Version: 4.26.1
package uk.gov.gchq.event_logging.v4;

public interface GroupsComplexTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:event_logging.v4.GroupsComplexType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * One or more group entities, e.g. user groups or access control groups.
   * </pre>
   *
   * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
   */
  java.util.List<uk.gov.gchq.event_logging.v4.GroupComplexType> 
      getGroupList();
  /**
   * <pre>
   * One or more group entities, e.g. user groups or access control groups.
   * </pre>
   *
   * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.GroupComplexType getGroup(int index);
  /**
   * <pre>
   * One or more group entities, e.g. user groups or access control groups.
   * </pre>
   *
   * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
   */
  int getGroupCount();
  /**
   * <pre>
   * One or more group entities, e.g. user groups or access control groups.
   * </pre>
   *
   * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
   */
  java.util.List<? extends uk.gov.gchq.event_logging.v4.GroupComplexTypeOrBuilder> 
      getGroupOrBuilderList();
  /**
   * <pre>
   * One or more group entities, e.g. user groups or access control groups.
   * </pre>
   *
   * <code>repeated .event_logging.v4.GroupComplexType group = 1 [json_name = "group", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.GroupComplexTypeOrBuilder getGroupOrBuilder(
      int index);
}
