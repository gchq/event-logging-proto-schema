// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/event_detail_complex_type.proto

// Protobuf Java Version: 4.26.1
package uk.gov.gchq.event_logging.v4;

public interface EventDetailComplexTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:event_logging.v4.EventDetailComplexType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A name/code/ID to uniquely identify the logical event type within the service providing the events. E.g. a Windows eventId (i.e. representing 'Failed logon', 'Change password attempt', etc.) or for application logging: SaveRecord, ViewUserRecord, ViewSearchResults, etc. The granularity will depend on the application. Typically, the number of unique TypeIds will be in the 10s. Note, the values of the TypeId are not meant to be globally consistent, they will only be relevant within that service providing the events.
   * </pre>
   *
   * <code>string type_id = 1 [json_name = "typeId", (.buf.validate.field) = { ... }</code>
   * @return The typeId.
   */
  java.lang.String getTypeId();
  /**
   * <pre>
   * A name/code/ID to uniquely identify the logical event type within the service providing the events. E.g. a Windows eventId (i.e. representing 'Failed logon', 'Change password attempt', etc.) or for application logging: SaveRecord, ViewUserRecord, ViewSearchResults, etc. The granularity will depend on the application. Typically, the number of unique TypeIds will be in the 10s. Note, the values of the TypeId are not meant to be globally consistent, they will only be relevant within that service providing the events.
   * </pre>
   *
   * <code>string type_id = 1 [json_name = "typeId", (.buf.validate.field) = { ... }</code>
   * @return The bytes for typeId.
   */
  com.google.protobuf.ByteString
      getTypeIdBytes();

  /**
   * <pre>
   * Some human-readable descriptive text for the event type.
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Some human-readable descriptive text for the event type.
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The purpose/justification assigned to this event for user actions that are required to be justified for reasons of corporate policy, e.g. transferring data to removable media, viewing personnel records or making a high value payment.
   * </pre>
   *
   * <code>.event_logging.v4.PurposeComplexType purpose = 3 [json_name = "purpose"];</code>
   * @return Whether the purpose field is set.
   */
  boolean hasPurpose();
  /**
   * <pre>
   * The purpose/justification assigned to this event for user actions that are required to be justified for reasons of corporate policy, e.g. transferring data to removable media, viewing personnel records or making a high value payment.
   * </pre>
   *
   * <code>.event_logging.v4.PurposeComplexType purpose = 3 [json_name = "purpose"];</code>
   * @return The purpose.
   */
  uk.gov.gchq.event_logging.v4.PurposeComplexType getPurpose();
  /**
   * <pre>
   * The purpose/justification assigned to this event for user actions that are required to be justified for reasons of corporate policy, e.g. transferring data to removable media, viewing personnel records or making a high value payment.
   * </pre>
   *
   * <code>.event_logging.v4.PurposeComplexType purpose = 3 [json_name = "purpose"];</code>
   */
  uk.gov.gchq.event_logging.v4.PurposeComplexTypeOrBuilder getPurposeOrBuilder();

  /**
   * <pre>
   * Used to record authentication events such as logon and logoff. Also used for recording authentication by physical access controls, e.g. doors/turnstiles. All authentication events that originate from a client device should record details of the client device in the event source.
   * </pre>
   *
   * <code>.event_logging.v4.AuthenticateComplexType authenticate = 4 [json_name = "authenticate", (.buf.validate.field) = { ... }</code>
   * @return Whether the authenticate field is set.
   */
  boolean hasAuthenticate();
  /**
   * <pre>
   * Used to record authentication events such as logon and logoff. Also used for recording authentication by physical access controls, e.g. doors/turnstiles. All authentication events that originate from a client device should record details of the client device in the event source.
   * </pre>
   *
   * <code>.event_logging.v4.AuthenticateComplexType authenticate = 4 [json_name = "authenticate", (.buf.validate.field) = { ... }</code>
   * @return The authenticate.
   */
  uk.gov.gchq.event_logging.v4.AuthenticateComplexType getAuthenticate();
  /**
   * <pre>
   * Used to record authentication events such as logon and logoff. Also used for recording authentication by physical access controls, e.g. doors/turnstiles. All authentication events that originate from a client device should record details of the client device in the event source.
   * </pre>
   *
   * <code>.event_logging.v4.AuthenticateComplexType authenticate = 4 [json_name = "authenticate", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.AuthenticateComplexTypeOrBuilder getAuthenticateOrBuilder();

  /**
   * <pre>
   * All events related to account management such as adding and removing user and system accounts.
   * </pre>
   *
   * <code>.event_logging.v4.AuthoriseComplexType authorise = 5 [json_name = "authorise", (.buf.validate.field) = { ... }</code>
   * @return Whether the authorise field is set.
   */
  boolean hasAuthorise();
  /**
   * <pre>
   * All events related to account management such as adding and removing user and system accounts.
   * </pre>
   *
   * <code>.event_logging.v4.AuthoriseComplexType authorise = 5 [json_name = "authorise", (.buf.validate.field) = { ... }</code>
   * @return The authorise.
   */
  uk.gov.gchq.event_logging.v4.AuthoriseComplexType getAuthorise();
  /**
   * <pre>
   * All events related to account management such as adding and removing user and system accounts.
   * </pre>
   *
   * <code>.event_logging.v4.AuthoriseComplexType authorise = 5 [json_name = "authorise", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.AuthoriseComplexTypeOrBuilder getAuthoriseOrBuilder();

  /**
   * <pre>
   * Any events related to searching for data should use this element.
   * </pre>
   *
   * <code>.event_logging.v4.SearchComplexType search = 6 [json_name = "search", (.buf.validate.field) = { ... }</code>
   * @return Whether the search field is set.
   */
  boolean hasSearch();
  /**
   * <pre>
   * Any events related to searching for data should use this element.
   * </pre>
   *
   * <code>.event_logging.v4.SearchComplexType search = 6 [json_name = "search", (.buf.validate.field) = { ... }</code>
   * @return The search.
   */
  uk.gov.gchq.event_logging.v4.SearchComplexType getSearch();
  /**
   * <pre>
   * Any events related to searching for data should use this element.
   * </pre>
   *
   * <code>.event_logging.v4.SearchComplexType search = 6 [json_name = "search", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.SearchComplexTypeOrBuilder getSearchOrBuilder();

  /**
   * <pre>
   * All events related to copying data, files, documents, etc. should use this element.
   * </pre>
   *
   * <code>.event_logging.v4.CopyComplexType copy = 7 [json_name = "copy", (.buf.validate.field) = { ... }</code>
   * @return Whether the copy field is set.
   */
  boolean hasCopy();
  /**
   * <pre>
   * All events related to copying data, files, documents, etc. should use this element.
   * </pre>
   *
   * <code>.event_logging.v4.CopyComplexType copy = 7 [json_name = "copy", (.buf.validate.field) = { ... }</code>
   * @return The copy.
   */
  uk.gov.gchq.event_logging.v4.CopyComplexType getCopy();
  /**
   * <pre>
   * All events related to copying data, files, documents, etc. should use this element.
   * </pre>
   *
   * <code>.event_logging.v4.CopyComplexType copy = 7 [json_name = "copy", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.CopyComplexTypeOrBuilder getCopyOrBuilder();

  /**
   * <pre>
   * All events related to moving data should use this element.
   * </pre>
   *
   * <code>.event_logging.v4.MoveComplexType move = 8 [json_name = "move", (.buf.validate.field) = { ... }</code>
   * @return Whether the move field is set.
   */
  boolean hasMove();
  /**
   * <pre>
   * All events related to moving data should use this element.
   * </pre>
   *
   * <code>.event_logging.v4.MoveComplexType move = 8 [json_name = "move", (.buf.validate.field) = { ... }</code>
   * @return The move.
   */
  uk.gov.gchq.event_logging.v4.MoveComplexType getMove();
  /**
   * <pre>
   * All events related to moving data should use this element.
   * </pre>
   *
   * <code>.event_logging.v4.MoveComplexType move = 8 [json_name = "move", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.MoveComplexTypeOrBuilder getMoveOrBuilder();

  /**
   * <pre>
   * All events related to creating data should use this element.
   * </pre>
   *
   * <code>.event_logging.v4.CreateComplexType create = 9 [json_name = "create", (.buf.validate.field) = { ... }</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * All events related to creating data should use this element.
   * </pre>
   *
   * <code>.event_logging.v4.CreateComplexType create = 9 [json_name = "create", (.buf.validate.field) = { ... }</code>
   * @return The create.
   */
  uk.gov.gchq.event_logging.v4.CreateComplexType getCreate();
  /**
   * <pre>
   * All events related to creating data should use this element.
   * </pre>
   *
   * <code>.event_logging.v4.CreateComplexType create = 9 [json_name = "create", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.CreateComplexTypeOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * All events related to viewing data should use this element. Note that viewing data is subtly different from reading data. This event is to be used when data is displayed to an end user and not for data read by an application.
   * </pre>
   *
   * <code>.event_logging.v4.ViewComplexType view = 10 [json_name = "view", (.buf.validate.field) = { ... }</code>
   * @return Whether the view field is set.
   */
  boolean hasView();
  /**
   * <pre>
   * All events related to viewing data should use this element. Note that viewing data is subtly different from reading data. This event is to be used when data is displayed to an end user and not for data read by an application.
   * </pre>
   *
   * <code>.event_logging.v4.ViewComplexType view = 10 [json_name = "view", (.buf.validate.field) = { ... }</code>
   * @return The view.
   */
  uk.gov.gchq.event_logging.v4.ViewComplexType getView();
  /**
   * <pre>
   * All events related to viewing data should use this element. Note that viewing data is subtly different from reading data. This event is to be used when data is displayed to an end user and not for data read by an application.
   * </pre>
   *
   * <code>.event_logging.v4.ViewComplexType view = 10 [json_name = "view", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.ViewComplexTypeOrBuilder getViewOrBuilder();

  /**
   * <pre>
   * All events related to importing data should use this element. An import could include any batch insert of data from an external source or uploading a file.
   * </pre>
   *
   * <code>.event_logging.v4.ImportComplexType import_field = 11 [json_name = "importField", (.buf.validate.field) = { ... }</code>
   * @return Whether the importField field is set.
   */
  boolean hasImportField();
  /**
   * <pre>
   * All events related to importing data should use this element. An import could include any batch insert of data from an external source or uploading a file.
   * </pre>
   *
   * <code>.event_logging.v4.ImportComplexType import_field = 11 [json_name = "importField", (.buf.validate.field) = { ... }</code>
   * @return The importField.
   */
  uk.gov.gchq.event_logging.v4.ImportComplexType getImportField();
  /**
   * <pre>
   * All events related to importing data should use this element. An import could include any batch insert of data from an external source or uploading a file.
   * </pre>
   *
   * <code>.event_logging.v4.ImportComplexType import_field = 11 [json_name = "importField", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.ImportComplexTypeOrBuilder getImportFieldOrBuilder();

  /**
   * <pre>
   * All events related to exporting data should use this element. An export could include activities such as downloading data from an application or generating a report.
   * </pre>
   *
   * <code>.event_logging.v4.ExportComplexType export = 12 [json_name = "export", (.buf.validate.field) = { ... }</code>
   * @return Whether the export field is set.
   */
  boolean hasExport();
  /**
   * <pre>
   * All events related to exporting data should use this element. An export could include activities such as downloading data from an application or generating a report.
   * </pre>
   *
   * <code>.event_logging.v4.ExportComplexType export = 12 [json_name = "export", (.buf.validate.field) = { ... }</code>
   * @return The export.
   */
  uk.gov.gchq.event_logging.v4.ExportComplexType getExport();
  /**
   * <pre>
   * All events related to exporting data should use this element. An export could include activities such as downloading data from an application or generating a report.
   * </pre>
   *
   * <code>.event_logging.v4.ExportComplexType export = 12 [json_name = "export", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.ExportComplexTypeOrBuilder getExportOrBuilder();

  /**
   * <pre>
   * All events related to updating data should use this element.
   * </pre>
   *
   * <code>.event_logging.v4.UpdateComplexType update = 13 [json_name = "update", (.buf.validate.field) = { ... }</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * All events related to updating data should use this element.
   * </pre>
   *
   * <code>.event_logging.v4.UpdateComplexType update = 13 [json_name = "update", (.buf.validate.field) = { ... }</code>
   * @return The update.
   */
  uk.gov.gchq.event_logging.v4.UpdateComplexType getUpdate();
  /**
   * <pre>
   * All events related to updating data should use this element.
   * </pre>
   *
   * <code>.event_logging.v4.UpdateComplexType update = 13 [json_name = "update", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.UpdateComplexTypeOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * All events related to deleting data should use this element.
   * </pre>
   *
   * <code>.event_logging.v4.DeleteComplexType delete = 14 [json_name = "delete", (.buf.validate.field) = { ... }</code>
   * @return Whether the delete field is set.
   */
  boolean hasDelete();
  /**
   * <pre>
   * All events related to deleting data should use this element.
   * </pre>
   *
   * <code>.event_logging.v4.DeleteComplexType delete = 14 [json_name = "delete", (.buf.validate.field) = { ... }</code>
   * @return The delete.
   */
  uk.gov.gchq.event_logging.v4.DeleteComplexType getDelete();
  /**
   * <pre>
   * All events related to deleting data should use this element.
   * </pre>
   *
   * <code>.event_logging.v4.DeleteComplexType delete = 14 [json_name = "delete", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.DeleteComplexTypeOrBuilder getDeleteOrBuilder();

  /**
   * <pre>
   * Whenever processes such as applications or services are started, stopped etc., this should be recorded in this element. It also covers the running of batch processes or jobs.
   * </pre>
   *
   * <code>.event_logging.v4.ProcessComplexType process = 15 [json_name = "process", (.buf.validate.field) = { ... }</code>
   * @return Whether the process field is set.
   */
  boolean hasProcess();
  /**
   * <pre>
   * Whenever processes such as applications or services are started, stopped etc., this should be recorded in this element. It also covers the running of batch processes or jobs.
   * </pre>
   *
   * <code>.event_logging.v4.ProcessComplexType process = 15 [json_name = "process", (.buf.validate.field) = { ... }</code>
   * @return The process.
   */
  uk.gov.gchq.event_logging.v4.ProcessComplexType getProcess();
  /**
   * <pre>
   * Whenever processes such as applications or services are started, stopped etc., this should be recorded in this element. It also covers the running of batch processes or jobs.
   * </pre>
   *
   * <code>.event_logging.v4.ProcessComplexType process = 15 [json_name = "process", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.ProcessComplexTypeOrBuilder getProcessOrBuilder();

  /**
   * <pre>
   * All events related to printing should use this element.
   * </pre>
   *
   * <code>.event_logging.v4.PrintComplexType print = 16 [json_name = "print", (.buf.validate.field) = { ... }</code>
   * @return Whether the print field is set.
   */
  boolean hasPrint();
  /**
   * <pre>
   * All events related to printing should use this element.
   * </pre>
   *
   * <code>.event_logging.v4.PrintComplexType print = 16 [json_name = "print", (.buf.validate.field) = { ... }</code>
   * @return The print.
   */
  uk.gov.gchq.event_logging.v4.PrintComplexType getPrint();
  /**
   * <pre>
   * All events related to printing should use this element.
   * </pre>
   *
   * <code>.event_logging.v4.PrintComplexType print = 16 [json_name = "print", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.PrintComplexTypeOrBuilder getPrintOrBuilder();

  /**
   * <pre>
   * Details about installation of either hardware or software.
   * </pre>
   *
   * <code>.event_logging.v4.InstallComplexType install = 17 [json_name = "install", (.buf.validate.field) = { ... }</code>
   * @return Whether the install field is set.
   */
  boolean hasInstall();
  /**
   * <pre>
   * Details about installation of either hardware or software.
   * </pre>
   *
   * <code>.event_logging.v4.InstallComplexType install = 17 [json_name = "install", (.buf.validate.field) = { ... }</code>
   * @return The install.
   */
  uk.gov.gchq.event_logging.v4.InstallComplexType getInstall();
  /**
   * <pre>
   * Details about installation of either hardware or software.
   * </pre>
   *
   * <code>.event_logging.v4.InstallComplexType install = 17 [json_name = "install", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.InstallComplexTypeOrBuilder getInstallOrBuilder();

  /**
   * <pre>
   * Details about removal of either hardware or software.
   * </pre>
   *
   * <code>.event_logging.v4.UninstallComplexType uninstall = 18 [json_name = "uninstall", (.buf.validate.field) = { ... }</code>
   * @return Whether the uninstall field is set.
   */
  boolean hasUninstall();
  /**
   * <pre>
   * Details about removal of either hardware or software.
   * </pre>
   *
   * <code>.event_logging.v4.UninstallComplexType uninstall = 18 [json_name = "uninstall", (.buf.validate.field) = { ... }</code>
   * @return The uninstall.
   */
  uk.gov.gchq.event_logging.v4.UninstallComplexType getUninstall();
  /**
   * <pre>
   * Details about removal of either hardware or software.
   * </pre>
   *
   * <code>.event_logging.v4.UninstallComplexType uninstall = 18 [json_name = "uninstall", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.UninstallComplexTypeOrBuilder getUninstallOrBuilder();

  /**
   * <pre>
   * Any events related to network traffic, filtering or access should be recorded using this element.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkEventActionComplexType network = 19 [json_name = "network", (.buf.validate.field) = { ... }</code>
   * @return Whether the network field is set.
   */
  boolean hasNetwork();
  /**
   * <pre>
   * Any events related to network traffic, filtering or access should be recorded using this element.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkEventActionComplexType network = 19 [json_name = "network", (.buf.validate.field) = { ... }</code>
   * @return The network.
   */
  uk.gov.gchq.event_logging.v4.NetworkEventActionComplexType getNetwork();
  /**
   * <pre>
   * Any events related to network traffic, filtering or access should be recorded using this element.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkEventActionComplexType network = 19 [json_name = "network", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.NetworkEventActionComplexTypeOrBuilder getNetworkOrBuilder();

  /**
   * <pre>
   * An alert event according to the system producing the event, e.g. an event raised when an anti-malware system finds malware.
   * </pre>
   *
   * <code>.event_logging.v4.AlertComplexType alert = 20 [json_name = "alert", (.buf.validate.field) = { ... }</code>
   * @return Whether the alert field is set.
   */
  boolean hasAlert();
  /**
   * <pre>
   * An alert event according to the system producing the event, e.g. an event raised when an anti-malware system finds malware.
   * </pre>
   *
   * <code>.event_logging.v4.AlertComplexType alert = 20 [json_name = "alert", (.buf.validate.field) = { ... }</code>
   * @return The alert.
   */
  uk.gov.gchq.event_logging.v4.AlertComplexType getAlert();
  /**
   * <pre>
   * An alert event according to the system producing the event, e.g. an event raised when an anti-malware system finds malware.
   * </pre>
   *
   * <code>.event_logging.v4.AlertComplexType alert = 20 [json_name = "alert", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.AlertComplexTypeOrBuilder getAlertOrBuilder();

  /**
   * <pre>
   * Used for send events that are at a higher level than a network/send event, e.g. sending an email
   * </pre>
   *
   * <code>.event_logging.v4.SendComplexType send = 21 [json_name = "send", (.buf.validate.field) = { ... }</code>
   * @return Whether the send field is set.
   */
  boolean hasSend();
  /**
   * <pre>
   * Used for send events that are at a higher level than a network/send event, e.g. sending an email
   * </pre>
   *
   * <code>.event_logging.v4.SendComplexType send = 21 [json_name = "send", (.buf.validate.field) = { ... }</code>
   * @return The send.
   */
  uk.gov.gchq.event_logging.v4.SendComplexType getSend();
  /**
   * <pre>
   * Used for send events that are at a higher level than a network/send event, e.g. sending an email
   * </pre>
   *
   * <code>.event_logging.v4.SendComplexType send = 21 [json_name = "send", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.SendComplexTypeOrBuilder getSendOrBuilder();

  /**
   * <pre>
   * Used for receive events that are at a higher level than a network/receive event, e.g. receiving an email
   * </pre>
   *
   * <code>.event_logging.v4.ReceiveComplexType receive = 22 [json_name = "receive", (.buf.validate.field) = { ... }</code>
   * @return Whether the receive field is set.
   */
  boolean hasReceive();
  /**
   * <pre>
   * Used for receive events that are at a higher level than a network/receive event, e.g. receiving an email
   * </pre>
   *
   * <code>.event_logging.v4.ReceiveComplexType receive = 22 [json_name = "receive", (.buf.validate.field) = { ... }</code>
   * @return The receive.
   */
  uk.gov.gchq.event_logging.v4.ReceiveComplexType getReceive();
  /**
   * <pre>
   * Used for receive events that are at a higher level than a network/receive event, e.g. receiving an email
   * </pre>
   *
   * <code>.event_logging.v4.ReceiveComplexType receive = 22 [json_name = "receive", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.ReceiveComplexTypeOrBuilder getReceiveOrBuilder();

  /**
   * <pre>
   * Any events relating to the action of approving/accepting or rejecting something, e.g. an approval step in a workflow, accepting a license agreement, or acceptable use policy. The event may relate to one user approving the work/action of another user or a single user accepting something.
   * </pre>
   *
   * <code>.event_logging.v4.ApprovalComplexType approval = 23 [json_name = "approval", (.buf.validate.field) = { ... }</code>
   * @return Whether the approval field is set.
   */
  boolean hasApproval();
  /**
   * <pre>
   * Any events relating to the action of approving/accepting or rejecting something, e.g. an approval step in a workflow, accepting a license agreement, or acceptable use policy. The event may relate to one user approving the work/action of another user or a single user accepting something.
   * </pre>
   *
   * <code>.event_logging.v4.ApprovalComplexType approval = 23 [json_name = "approval", (.buf.validate.field) = { ... }</code>
   * @return The approval.
   */
  uk.gov.gchq.event_logging.v4.ApprovalComplexType getApproval();
  /**
   * <pre>
   * Any events relating to the action of approving/accepting or rejecting something, e.g. an approval step in a workflow, accepting a license agreement, or acceptable use policy. The event may relate to one user approving the work/action of another user or a single user accepting something.
   * </pre>
   *
   * <code>.event_logging.v4.ApprovalComplexType approval = 23 [json_name = "approval", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.ApprovalComplexTypeOrBuilder getApprovalOrBuilder();

  /**
   * <pre>
   * This element should be used were the type of the event cannot be described by any of the other event actions, or the event type is unknown.
   * </pre>
   *
   * <code>.event_logging.v4.EventDetailComplexType.UnknownType unknown = 24 [json_name = "unknown", (.buf.validate.field) = { ... }</code>
   * @return Whether the unknown field is set.
   */
  boolean hasUnknown();
  /**
   * <pre>
   * This element should be used were the type of the event cannot be described by any of the other event actions, or the event type is unknown.
   * </pre>
   *
   * <code>.event_logging.v4.EventDetailComplexType.UnknownType unknown = 24 [json_name = "unknown", (.buf.validate.field) = { ... }</code>
   * @return The unknown.
   */
  uk.gov.gchq.event_logging.v4.EventDetailComplexType.UnknownType getUnknown();
  /**
   * <pre>
   * This element should be used were the type of the event cannot be described by any of the other event actions, or the event type is unknown.
   * </pre>
   *
   * <code>.event_logging.v4.EventDetailComplexType.UnknownType unknown = 24 [json_name = "unknown", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.EventDetailComplexType.UnknownTypeOrBuilder getUnknownOrBuilder();
}