// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/virtual_session_complex_type.proto

// Protobuf Java Version: 4.26.1
package uk.gov.gchq.event_logging.v4;

public interface VirtualSessionComplexTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:event_logging.v4.VirtualSessionComplexType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This element can be used to supply any metadata relating to an object as long as it conforms to an allowed format/specification (defined outside this XML Schema). This can be used for adding metadata to the event after receipt.
   * </pre>
   *
   * <code>repeated .event_logging.v4.AnyContentComplexType meta = 1 [json_name = "meta", (.buf.validate.field) = { ... }</code>
   */
  java.util.List<uk.gov.gchq.event_logging.v4.AnyContentComplexType> 
      getMetaList();
  /**
   * <pre>
   * This element can be used to supply any metadata relating to an object as long as it conforms to an allowed format/specification (defined outside this XML Schema). This can be used for adding metadata to the event after receipt.
   * </pre>
   *
   * <code>repeated .event_logging.v4.AnyContentComplexType meta = 1 [json_name = "meta", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.AnyContentComplexType getMeta(int index);
  /**
   * <pre>
   * This element can be used to supply any metadata relating to an object as long as it conforms to an allowed format/specification (defined outside this XML Schema). This can be used for adding metadata to the event after receipt.
   * </pre>
   *
   * <code>repeated .event_logging.v4.AnyContentComplexType meta = 1 [json_name = "meta", (.buf.validate.field) = { ... }</code>
   */
  int getMetaCount();
  /**
   * <pre>
   * This element can be used to supply any metadata relating to an object as long as it conforms to an allowed format/specification (defined outside this XML Schema). This can be used for adding metadata to the event after receipt.
   * </pre>
   *
   * <code>repeated .event_logging.v4.AnyContentComplexType meta = 1 [json_name = "meta", (.buf.validate.field) = { ... }</code>
   */
  java.util.List<? extends uk.gov.gchq.event_logging.v4.AnyContentComplexTypeOrBuilder> 
      getMetaOrBuilderList();
  /**
   * <pre>
   * This element can be used to supply any metadata relating to an object as long as it conforms to an allowed format/specification (defined outside this XML Schema). This can be used for adding metadata to the event after receipt.
   * </pre>
   *
   * <code>repeated .event_logging.v4.AnyContentComplexType meta = 1 [json_name = "meta", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.AnyContentComplexTypeOrBuilder getMetaOrBuilder(
      int index);

  /**
   * <pre>
   * The type of the object in question and specific to the object type from the list above, e.g. a 'Resource' object may have a type such as 'image' or 'script'.
   * </pre>
   *
   * <code>string type = 2 [json_name = "type"];</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * The type of the object in question and specific to the object type from the list above, e.g. a 'Resource' object may have a type such as 'image' or 'script'.
   * </pre>
   *
   * <code>string type = 2 [json_name = "type"];</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * An identifier for the object, e.g a document ID in a document management system. This ID is likely to be specific to the system that generated the event.
   * </pre>
   *
   * <code>string id = 3 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * An identifier for the object, e.g a document ID in a document management system. This ID is likely to be specific to the system that generated the event.
   * </pre>
   *
   * <code>string id = 3 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The name of the object, e.g. a filename.
   * </pre>
   *
   * <code>string name = 4 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the object, e.g. a filename.
   * </pre>
   *
   * <code>string name = 4 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Human readable description of what the object is.
   * </pre>
   *
   * <code>string description = 5 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Human readable description of what the object is.
   * </pre>
   *
   * <code>string description = 5 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Any classification, protective marking or restrictions placed on the object, e.g. for commercially sensitive reports or user health records.
   * </pre>
   *
   * <code>.event_logging.v4.ClassificationComplexType classification = 6 [json_name = "classification"];</code>
   * @return Whether the classification field is set.
   */
  boolean hasClassification();
  /**
   * <pre>
   * Any classification, protective marking or restrictions placed on the object, e.g. for commercially sensitive reports or user health records.
   * </pre>
   *
   * <code>.event_logging.v4.ClassificationComplexType classification = 6 [json_name = "classification"];</code>
   * @return The classification.
   */
  uk.gov.gchq.event_logging.v4.ClassificationComplexType getClassification();
  /**
   * <pre>
   * Any classification, protective marking or restrictions placed on the object, e.g. for commercially sensitive reports or user health records.
   * </pre>
   *
   * <code>.event_logging.v4.ClassificationComplexType classification = 6 [json_name = "classification"];</code>
   */
  uk.gov.gchq.event_logging.v4.ClassificationComplexTypeOrBuilder getClassificationOrBuilder();

  /**
   * <pre>
   * Any state information about the object, e.g. 'Archived'.
   * </pre>
   *
   * <code>string state = 7 [json_name = "state"];</code>
   * @return The state.
   */
  java.lang.String getState();
  /**
   * <pre>
   * Any state information about the object, e.g. 'Archived'.
   * </pre>
   *
   * <code>string state = 7 [json_name = "state"];</code>
   * @return The bytes for state.
   */
  com.google.protobuf.ByteString
      getStateBytes();

  /**
   * <pre>
   * Any groups associated with the object, e.g. group membership of a user account.
   * </pre>
   *
   * <code>.event_logging.v4.GroupsComplexType groups = 8 [json_name = "groups"];</code>
   * @return Whether the groups field is set.
   */
  boolean hasGroups();
  /**
   * <pre>
   * Any groups associated with the object, e.g. group membership of a user account.
   * </pre>
   *
   * <code>.event_logging.v4.GroupsComplexType groups = 8 [json_name = "groups"];</code>
   * @return The groups.
   */
  uk.gov.gchq.event_logging.v4.GroupsComplexType getGroups();
  /**
   * <pre>
   * Any groups associated with the object, e.g. group membership of a user account.
   * </pre>
   *
   * <code>.event_logging.v4.GroupsComplexType groups = 8 [json_name = "groups"];</code>
   */
  uk.gov.gchq.event_logging.v4.GroupsComplexTypeOrBuilder getGroupsOrBuilder();

  /**
   * <pre>
   * The collection of permissions associated with the object, e.g. write access being granted to a list of named users.
   * </pre>
   *
   * <code>.event_logging.v4.VirtualSessionComplexType.PermissionsType permissions = 9 [json_name = "permissions"];</code>
   * @return Whether the permissions field is set.
   */
  boolean hasPermissions();
  /**
   * <pre>
   * The collection of permissions associated with the object, e.g. write access being granted to a list of named users.
   * </pre>
   *
   * <code>.event_logging.v4.VirtualSessionComplexType.PermissionsType permissions = 9 [json_name = "permissions"];</code>
   * @return The permissions.
   */
  uk.gov.gchq.event_logging.v4.VirtualSessionComplexType.PermissionsType getPermissions();
  /**
   * <pre>
   * The collection of permissions associated with the object, e.g. write access being granted to a list of named users.
   * </pre>
   *
   * <code>.event_logging.v4.VirtualSessionComplexType.PermissionsType permissions = 9 [json_name = "permissions"];</code>
   */
  uk.gov.gchq.event_logging.v4.VirtualSessionComplexType.PermissionsTypeOrBuilder getPermissionsOrBuilder();

  /**
   * <pre>
   * Metadata tags that can be used for additional object tagging or categorisation. Object tagging allows for the labelling (or filtering) of objects using words that label, categorise or group similar items, using a taxonomy defined outside this schema. For example, an email could be tagged with tags like 'internal', 'spam', 'external', 'rich-content', etc.
   * </pre>
   *
   * <code>.event_logging.v4.MetaDataTagsComplexType tags = 10 [json_name = "tags"];</code>
   * @return Whether the tags field is set.
   */
  boolean hasTags();
  /**
   * <pre>
   * Metadata tags that can be used for additional object tagging or categorisation. Object tagging allows for the labelling (or filtering) of objects using words that label, categorise or group similar items, using a taxonomy defined outside this schema. For example, an email could be tagged with tags like 'internal', 'spam', 'external', 'rich-content', etc.
   * </pre>
   *
   * <code>.event_logging.v4.MetaDataTagsComplexType tags = 10 [json_name = "tags"];</code>
   * @return The tags.
   */
  uk.gov.gchq.event_logging.v4.MetaDataTagsComplexType getTags();
  /**
   * <pre>
   * Metadata tags that can be used for additional object tagging or categorisation. Object tagging allows for the labelling (or filtering) of objects using words that label, categorise or group similar items, using a taxonomy defined outside this schema. For example, an email could be tagged with tags like 'internal', 'spam', 'external', 'rich-content', etc.
   * </pre>
   *
   * <code>.event_logging.v4.MetaDataTagsComplexType tags = 10 [json_name = "tags"];</code>
   */
  uk.gov.gchq.event_logging.v4.MetaDataTagsComplexTypeOrBuilder getTagsOrBuilder();

  /**
   * <pre>
   * The state of the virtual session at the time of the event.
   * </pre>
   *
   * <code>.event_logging.v4.VirtualSessionSessionStateSimpleType session_state = 11 [json_name = "sessionState", (.buf.validate.field) = { ... }</code>
   * @return The enum numeric value on the wire for sessionState.
   */
  int getSessionStateValue();
  /**
   * <pre>
   * The state of the virtual session at the time of the event.
   * </pre>
   *
   * <code>.event_logging.v4.VirtualSessionSessionStateSimpleType session_state = 11 [json_name = "sessionState", (.buf.validate.field) = { ... }</code>
   * @return The sessionState.
   */
  uk.gov.gchq.event_logging.v4.VirtualSessionSessionStateSimpleType getSessionState();

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
