// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/classification_complex_type.proto

// Protobuf Java Version: 4.26.1
package uk.gov.gchq.event_logging.v4;

public interface ClassificationComplexTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:event_logging.v4.ClassificationComplexType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional full human-readable text of the protective marking that can combine the various elements in this Classification structure, e.g 'Commercial in Confidence'.
   * </pre>
   *
   * <code>string text = 1 [json_name = "text"];</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * Optional full human-readable text of the protective marking that can combine the various elements in this Classification structure, e.g 'Commercial in Confidence'.
   * </pre>
   *
   * <code>string text = 1 [json_name = "text"];</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * The originator or creator of the protectively marked item. The originator is described by an Organisation and optionally qualified by the organisation's Country.
   * </pre>
   *
   * <code>.event_logging.v4.OrganisationComplexType originator = 2 [json_name = "originator"];</code>
   * @return Whether the originator field is set.
   */
  boolean hasOriginator();
  /**
   * <pre>
   * The originator or creator of the protectively marked item. The originator is described by an Organisation and optionally qualified by the organisation's Country.
   * </pre>
   *
   * <code>.event_logging.v4.OrganisationComplexType originator = 2 [json_name = "originator"];</code>
   * @return The originator.
   */
  uk.gov.gchq.event_logging.v4.OrganisationComplexType getOriginator();
  /**
   * <pre>
   * The originator or creator of the protectively marked item. The originator is described by an Organisation and optionally qualified by the organisation's Country.
   * </pre>
   *
   * <code>.event_logging.v4.OrganisationComplexType originator = 2 [json_name = "originator"];</code>
   */
  uk.gov.gchq.event_logging.v4.OrganisationComplexTypeOrBuilder getOriginatorOrBuilder();

  /**
   * <pre>
   * The custodian or owner of the protectively marked item. The custodian is responsible for the lifecycle of the marked item. The custodian is described by an Organisation and optionally qualified by the organisation's Country.
   * </pre>
   *
   * <code>.event_logging.v4.OrganisationComplexType custodian = 3 [json_name = "custodian"];</code>
   * @return Whether the custodian field is set.
   */
  boolean hasCustodian();
  /**
   * <pre>
   * The custodian or owner of the protectively marked item. The custodian is responsible for the lifecycle of the marked item. The custodian is described by an Organisation and optionally qualified by the organisation's Country.
   * </pre>
   *
   * <code>.event_logging.v4.OrganisationComplexType custodian = 3 [json_name = "custodian"];</code>
   * @return The custodian.
   */
  uk.gov.gchq.event_logging.v4.OrganisationComplexType getCustodian();
  /**
   * <pre>
   * The custodian or owner of the protectively marked item. The custodian is responsible for the lifecycle of the marked item. The custodian is described by an Organisation and optionally qualified by the organisation's Country.
   * </pre>
   *
   * <code>.event_logging.v4.OrganisationComplexType custodian = 3 [json_name = "custodian"];</code>
   */
  uk.gov.gchq.event_logging.v4.OrganisationComplexTypeOrBuilder getCustodianOrBuilder();

  /**
   * <pre>
   * The classification of the protectively marked item. E.g. 'OFFICIAL', 'COMMERCIAL IN CONFIDENCE', 'CONFIDENTIAL', 'INTERNAL' etc.
   * </pre>
   *
   * <code>string classification = 4 [json_name = "classification"];</code>
   * @return The classification.
   */
  java.lang.String getClassification();
  /**
   * <pre>
   * The classification of the protectively marked item. E.g. 'OFFICIAL', 'COMMERCIAL IN CONFIDENCE', 'CONFIDENTIAL', 'INTERNAL' etc.
   * </pre>
   *
   * <code>string classification = 4 [json_name = "classification"];</code>
   * @return The bytes for classification.
   */
  com.google.protobuf.ByteString
      getClassificationBytes();

  /**
   * <pre>
   * Additional descriptors or keywords to further qualify the Classification e.g. 'PERSONAL'
   * </pre>
   *
   * <code>.event_logging.v4.ClassificationComplexType.DescriptorsType descriptors = 5 [json_name = "descriptors"];</code>
   * @return Whether the descriptors field is set.
   */
  boolean hasDescriptors();
  /**
   * <pre>
   * Additional descriptors or keywords to further qualify the Classification e.g. 'PERSONAL'
   * </pre>
   *
   * <code>.event_logging.v4.ClassificationComplexType.DescriptorsType descriptors = 5 [json_name = "descriptors"];</code>
   * @return The descriptors.
   */
  uk.gov.gchq.event_logging.v4.ClassificationComplexType.DescriptorsType getDescriptors();
  /**
   * <pre>
   * Additional descriptors or keywords to further qualify the Classification e.g. 'PERSONAL'
   * </pre>
   *
   * <code>.event_logging.v4.ClassificationComplexType.DescriptorsType descriptors = 5 [json_name = "descriptors"];</code>
   */
  uk.gov.gchq.event_logging.v4.ClassificationComplexType.DescriptorsTypeOrBuilder getDescriptorsOrBuilder();

  /**
   * <pre>
   * The groups that a person must belong to AT LEAST ONE OF in order to be permitted to access the protectively marked item. E.g. 'HR' OR 'Auditors'.
   * </pre>
   *
   * <code>.event_logging.v4.AccessControlGroupsComplexType or_groups = 6 [json_name = "orGroups"];</code>
   * @return Whether the orGroups field is set.
   */
  boolean hasOrGroups();
  /**
   * <pre>
   * The groups that a person must belong to AT LEAST ONE OF in order to be permitted to access the protectively marked item. E.g. 'HR' OR 'Auditors'.
   * </pre>
   *
   * <code>.event_logging.v4.AccessControlGroupsComplexType or_groups = 6 [json_name = "orGroups"];</code>
   * @return The orGroups.
   */
  uk.gov.gchq.event_logging.v4.AccessControlGroupsComplexType getOrGroups();
  /**
   * <pre>
   * The groups that a person must belong to AT LEAST ONE OF in order to be permitted to access the protectively marked item. E.g. 'HR' OR 'Auditors'.
   * </pre>
   *
   * <code>.event_logging.v4.AccessControlGroupsComplexType or_groups = 6 [json_name = "orGroups"];</code>
   */
  uk.gov.gchq.event_logging.v4.AccessControlGroupsComplexTypeOrBuilder getOrGroupsOrBuilder();

  /**
   * <pre>
   * The groups that a person must belong to ALL OF in order to be permitted to access the protectively marked item. E.g. 'Sales' AND 'Management'.
   * </pre>
   *
   * <code>.event_logging.v4.AccessControlGroupsComplexType and_groups = 7 [json_name = "andGroups"];</code>
   * @return Whether the andGroups field is set.
   */
  boolean hasAndGroups();
  /**
   * <pre>
   * The groups that a person must belong to ALL OF in order to be permitted to access the protectively marked item. E.g. 'Sales' AND 'Management'.
   * </pre>
   *
   * <code>.event_logging.v4.AccessControlGroupsComplexType and_groups = 7 [json_name = "andGroups"];</code>
   * @return The andGroups.
   */
  uk.gov.gchq.event_logging.v4.AccessControlGroupsComplexType getAndGroups();
  /**
   * <pre>
   * The groups that a person must belong to ALL OF in order to be permitted to access the protectively marked item. E.g. 'Sales' AND 'Management'.
   * </pre>
   *
   * <code>.event_logging.v4.AccessControlGroupsComplexType and_groups = 7 [json_name = "andGroups"];</code>
   */
  uk.gov.gchq.event_logging.v4.AccessControlGroupsComplexTypeOrBuilder getAndGroupsOrBuilder();

  /**
   * <pre>
   * The nationalities of people permitted to access this protectively marked item. E.g. 'GBR', 'USA'
   * </pre>
   *
   * <code>.event_logging.v4.ClassificationComplexType.PermittedNationalitiesType permitted_nationalities = 8 [json_name = "permittedNationalities"];</code>
   * @return Whether the permittedNationalities field is set.
   */
  boolean hasPermittedNationalities();
  /**
   * <pre>
   * The nationalities of people permitted to access this protectively marked item. E.g. 'GBR', 'USA'
   * </pre>
   *
   * <code>.event_logging.v4.ClassificationComplexType.PermittedNationalitiesType permitted_nationalities = 8 [json_name = "permittedNationalities"];</code>
   * @return The permittedNationalities.
   */
  uk.gov.gchq.event_logging.v4.ClassificationComplexType.PermittedNationalitiesType getPermittedNationalities();
  /**
   * <pre>
   * The nationalities of people permitted to access this protectively marked item. E.g. 'GBR', 'USA'
   * </pre>
   *
   * <code>.event_logging.v4.ClassificationComplexType.PermittedNationalitiesType permitted_nationalities = 8 [json_name = "permittedNationalities"];</code>
   */
  uk.gov.gchq.event_logging.v4.ClassificationComplexType.PermittedNationalitiesTypeOrBuilder getPermittedNationalitiesOrBuilder();

  /**
   * <pre>
   * The organisations permitted to access the protectively marked item.
   * </pre>
   *
   * <code>.event_logging.v4.ClassificationComplexType.PermittedOrganisationsType permitted_organisations = 9 [json_name = "permittedOrganisations"];</code>
   * @return Whether the permittedOrganisations field is set.
   */
  boolean hasPermittedOrganisations();
  /**
   * <pre>
   * The organisations permitted to access the protectively marked item.
   * </pre>
   *
   * <code>.event_logging.v4.ClassificationComplexType.PermittedOrganisationsType permitted_organisations = 9 [json_name = "permittedOrganisations"];</code>
   * @return The permittedOrganisations.
   */
  uk.gov.gchq.event_logging.v4.ClassificationComplexType.PermittedOrganisationsType getPermittedOrganisations();
  /**
   * <pre>
   * The organisations permitted to access the protectively marked item.
   * </pre>
   *
   * <code>.event_logging.v4.ClassificationComplexType.PermittedOrganisationsType permitted_organisations = 9 [json_name = "permittedOrganisations"];</code>
   */
  uk.gov.gchq.event_logging.v4.ClassificationComplexType.PermittedOrganisationsTypeOrBuilder getPermittedOrganisationsOrBuilder();

  /**
   * <pre>
   * Controls governing the onward handling of the protectively marked item
   * </pre>
   *
   * <code>.event_logging.v4.ClassificationComplexType.DisseminationControlsType dissemination_controls = 10 [json_name = "disseminationControls"];</code>
   * @return Whether the disseminationControls field is set.
   */
  boolean hasDisseminationControls();
  /**
   * <pre>
   * Controls governing the onward handling of the protectively marked item
   * </pre>
   *
   * <code>.event_logging.v4.ClassificationComplexType.DisseminationControlsType dissemination_controls = 10 [json_name = "disseminationControls"];</code>
   * @return The disseminationControls.
   */
  uk.gov.gchq.event_logging.v4.ClassificationComplexType.DisseminationControlsType getDisseminationControls();
  /**
   * <pre>
   * Controls governing the onward handling of the protectively marked item
   * </pre>
   *
   * <code>.event_logging.v4.ClassificationComplexType.DisseminationControlsType dissemination_controls = 10 [json_name = "disseminationControls"];</code>
   */
  uk.gov.gchq.event_logging.v4.ClassificationComplexType.DisseminationControlsTypeOrBuilder getDisseminationControlsOrBuilder();

  /**
   * <pre>
   * Describes the timescale and process for the disposal of the protectively marked item
   * </pre>
   *
   * <code>.event_logging.v4.ClassificationComplexType.DispositionType disposition = 11 [json_name = "disposition"];</code>
   * @return Whether the disposition field is set.
   */
  boolean hasDisposition();
  /**
   * <pre>
   * Describes the timescale and process for the disposal of the protectively marked item
   * </pre>
   *
   * <code>.event_logging.v4.ClassificationComplexType.DispositionType disposition = 11 [json_name = "disposition"];</code>
   * @return The disposition.
   */
  uk.gov.gchq.event_logging.v4.ClassificationComplexType.DispositionType getDisposition();
  /**
   * <pre>
   * Describes the timescale and process for the disposal of the protectively marked item
   * </pre>
   *
   * <code>.event_logging.v4.ClassificationComplexType.DispositionType disposition = 11 [json_name = "disposition"];</code>
   */
  uk.gov.gchq.event_logging.v4.ClassificationComplexType.DispositionTypeOrBuilder getDispositionOrBuilder();

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
