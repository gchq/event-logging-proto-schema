// event_logging/v4/event_detail_complex_type.proto at 0:0

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.33.0
// 	protoc        (unknown)
// source: event_logging/v4/event_detail_complex_type.proto

package event_loggingv4

import (
	_ "buf.build/gen/go/bufbuild/protovalidate/protocolbuffers/go/buf/validate"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// This type describes the details of what happened in the event: the type of the event, why it happened and the event action.
type EventDetailComplexType struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// A name/code/ID to uniquely identify the logical event type within the service providing the events. E.g. a Windows eventId (i.e. representing 'Failed logon', 'Change password attempt', etc.) or for application logging: SaveRecord, ViewUserRecord, ViewSearchResults, etc. The granularity will depend on the application. Typically, the number of unique TypeIds will be in the 10s. Note, the values of the TypeId are not meant to be globally consistent, they will only be relevant within that service providing the events.
	TypeId string `protobuf:"bytes,1,opt,name=type_id,json=typeId,proto3" json:"type_id,omitempty"`
	// Some human-readable descriptive text for the event type.
	Description string `protobuf:"bytes,2,opt,name=description,proto3" json:"description,omitempty"`
	// The purpose/justification assigned to this event for user actions that are required to be justified for reasons of corporate policy, e.g. transferring data to removable media, viewing personnel records or making a high value payment.
	Purpose *PurposeComplexType `protobuf:"bytes,3,opt,name=purpose,proto3" json:"purpose,omitempty"`
	// Used to record authentication events such as logon and logoff. Also used for recording authentication by physical access controls, e.g. doors/turnstiles. All authentication events that originate from a client device should record details of the client device in the event source.
	Authenticate *AuthenticateComplexType `protobuf:"bytes,4,opt,name=authenticate,proto3" json:"authenticate,omitempty"`
	// All events related to account management such as adding and removing user and system accounts.
	Authorise *AuthoriseComplexType `protobuf:"bytes,5,opt,name=authorise,proto3" json:"authorise,omitempty"`
	// Any events related to searching for data should use this element.
	Search *SearchComplexType `protobuf:"bytes,6,opt,name=search,proto3" json:"search,omitempty"`
	// All events related to copying data, files, documents, etc. should use this element.
	Copy *CopyComplexType `protobuf:"bytes,7,opt,name=copy,proto3" json:"copy,omitempty"`
	// All events related to moving data should use this element.
	Move *MoveComplexType `protobuf:"bytes,8,opt,name=move,proto3" json:"move,omitempty"`
	// All events related to creating data should use this element.
	Create *CreateComplexType `protobuf:"bytes,9,opt,name=create,proto3" json:"create,omitempty"`
	// All events related to viewing data should use this element. Note that viewing data is subtly different from reading data. This event is to be used when data is displayed to an end user and not for data read by an application.
	View *ViewComplexType `protobuf:"bytes,10,opt,name=view,proto3" json:"view,omitempty"`
	// All events related to importing data should use this element. An import could include any batch insert of data from an external source or uploading a file.
	ImportField *ImportComplexType `protobuf:"bytes,11,opt,name=import_field,json=importField,proto3" json:"import_field,omitempty"`
	// All events related to exporting data should use this element. An export could include activities such as downloading data from an application or generating a report.
	Export *ExportComplexType `protobuf:"bytes,12,opt,name=export,proto3" json:"export,omitempty"`
	// All events related to updating data should use this element.
	Update *UpdateComplexType `protobuf:"bytes,13,opt,name=update,proto3" json:"update,omitempty"`
	// All events related to deleting data should use this element.
	Delete *DeleteComplexType `protobuf:"bytes,14,opt,name=delete,proto3" json:"delete,omitempty"`
	// Whenever processes such as applications or services are started, stopped etc., this should be recorded in this element. It also covers the running of batch processes or jobs.
	Process *ProcessComplexType `protobuf:"bytes,15,opt,name=process,proto3" json:"process,omitempty"`
	// All events related to printing should use this element.
	Print *PrintComplexType `protobuf:"bytes,16,opt,name=print,proto3" json:"print,omitempty"`
	// Details about installation of either hardware or software.
	Install *InstallComplexType `protobuf:"bytes,17,opt,name=install,proto3" json:"install,omitempty"`
	// Details about removal of either hardware or software.
	Uninstall *UninstallComplexType `protobuf:"bytes,18,opt,name=uninstall,proto3" json:"uninstall,omitempty"`
	// Any events related to network traffic, filtering or access should be recorded using this element.
	Network *NetworkEventActionComplexType `protobuf:"bytes,19,opt,name=network,proto3" json:"network,omitempty"`
	// An alert event according to the system producing the event, e.g. an event raised when an anti-malware system finds malware.
	Alert *AlertComplexType `protobuf:"bytes,20,opt,name=alert,proto3" json:"alert,omitempty"`
	// Used for send events that are at a higher level than a network/send event, e.g. sending an email
	Send *SendComplexType `protobuf:"bytes,21,opt,name=send,proto3" json:"send,omitempty"`
	// Used for receive events that are at a higher level than a network/receive event, e.g. receiving an email
	Receive *ReceiveComplexType `protobuf:"bytes,22,opt,name=receive,proto3" json:"receive,omitempty"`
	// Any events relating to the action of approving/accepting or rejecting something, e.g. an approval step in a workflow, accepting a license agreement, or acceptable use policy. The event may relate to one user approving the work/action of another user or a single user accepting something.
	Approval *ApprovalComplexType `protobuf:"bytes,23,opt,name=approval,proto3" json:"approval,omitempty"`
	// This element should be used were the type of the event cannot be described by any of the other event actions, or the event type is unknown.
	Unknown *EventDetailComplexType_UnknownType `protobuf:"bytes,24,opt,name=unknown,proto3" json:"unknown,omitempty"`
}

func (x *EventDetailComplexType) Reset() {
	*x = EventDetailComplexType{}
	if protoimpl.UnsafeEnabled {
		mi := &file_event_logging_v4_event_detail_complex_type_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *EventDetailComplexType) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*EventDetailComplexType) ProtoMessage() {}

func (x *EventDetailComplexType) ProtoReflect() protoreflect.Message {
	mi := &file_event_logging_v4_event_detail_complex_type_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use EventDetailComplexType.ProtoReflect.Descriptor instead.
func (*EventDetailComplexType) Descriptor() ([]byte, []int) {
	return file_event_logging_v4_event_detail_complex_type_proto_rawDescGZIP(), []int{0}
}

func (x *EventDetailComplexType) GetTypeId() string {
	if x != nil {
		return x.TypeId
	}
	return ""
}

func (x *EventDetailComplexType) GetDescription() string {
	if x != nil {
		return x.Description
	}
	return ""
}

func (x *EventDetailComplexType) GetPurpose() *PurposeComplexType {
	if x != nil {
		return x.Purpose
	}
	return nil
}

func (x *EventDetailComplexType) GetAuthenticate() *AuthenticateComplexType {
	if x != nil {
		return x.Authenticate
	}
	return nil
}

func (x *EventDetailComplexType) GetAuthorise() *AuthoriseComplexType {
	if x != nil {
		return x.Authorise
	}
	return nil
}

func (x *EventDetailComplexType) GetSearch() *SearchComplexType {
	if x != nil {
		return x.Search
	}
	return nil
}

func (x *EventDetailComplexType) GetCopy() *CopyComplexType {
	if x != nil {
		return x.Copy
	}
	return nil
}

func (x *EventDetailComplexType) GetMove() *MoveComplexType {
	if x != nil {
		return x.Move
	}
	return nil
}

func (x *EventDetailComplexType) GetCreate() *CreateComplexType {
	if x != nil {
		return x.Create
	}
	return nil
}

func (x *EventDetailComplexType) GetView() *ViewComplexType {
	if x != nil {
		return x.View
	}
	return nil
}

func (x *EventDetailComplexType) GetImportField() *ImportComplexType {
	if x != nil {
		return x.ImportField
	}
	return nil
}

func (x *EventDetailComplexType) GetExport() *ExportComplexType {
	if x != nil {
		return x.Export
	}
	return nil
}

func (x *EventDetailComplexType) GetUpdate() *UpdateComplexType {
	if x != nil {
		return x.Update
	}
	return nil
}

func (x *EventDetailComplexType) GetDelete() *DeleteComplexType {
	if x != nil {
		return x.Delete
	}
	return nil
}

func (x *EventDetailComplexType) GetProcess() *ProcessComplexType {
	if x != nil {
		return x.Process
	}
	return nil
}

func (x *EventDetailComplexType) GetPrint() *PrintComplexType {
	if x != nil {
		return x.Print
	}
	return nil
}

func (x *EventDetailComplexType) GetInstall() *InstallComplexType {
	if x != nil {
		return x.Install
	}
	return nil
}

func (x *EventDetailComplexType) GetUninstall() *UninstallComplexType {
	if x != nil {
		return x.Uninstall
	}
	return nil
}

func (x *EventDetailComplexType) GetNetwork() *NetworkEventActionComplexType {
	if x != nil {
		return x.Network
	}
	return nil
}

func (x *EventDetailComplexType) GetAlert() *AlertComplexType {
	if x != nil {
		return x.Alert
	}
	return nil
}

func (x *EventDetailComplexType) GetSend() *SendComplexType {
	if x != nil {
		return x.Send
	}
	return nil
}

func (x *EventDetailComplexType) GetReceive() *ReceiveComplexType {
	if x != nil {
		return x.Receive
	}
	return nil
}

func (x *EventDetailComplexType) GetApproval() *ApprovalComplexType {
	if x != nil {
		return x.Approval
	}
	return nil
}

func (x *EventDetailComplexType) GetUnknown() *EventDetailComplexType_UnknownType {
	if x != nil {
		return x.Unknown
	}
	return nil
}

// This type should be used were the type of the event cannot be described by any of the other event actions, or the event type is unknown.
type EventDetailComplexType_UnknownType struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Any other event data that does not fit into a schema element but may be useful for the purpose of audit.
	Data []*DataComplexType `protobuf:"bytes,1,rep,name=data,proto3" json:"data,omitempty"`
}

func (x *EventDetailComplexType_UnknownType) Reset() {
	*x = EventDetailComplexType_UnknownType{}
	if protoimpl.UnsafeEnabled {
		mi := &file_event_logging_v4_event_detail_complex_type_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *EventDetailComplexType_UnknownType) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*EventDetailComplexType_UnknownType) ProtoMessage() {}

func (x *EventDetailComplexType_UnknownType) ProtoReflect() protoreflect.Message {
	mi := &file_event_logging_v4_event_detail_complex_type_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use EventDetailComplexType_UnknownType.ProtoReflect.Descriptor instead.
func (*EventDetailComplexType_UnknownType) Descriptor() ([]byte, []int) {
	return file_event_logging_v4_event_detail_complex_type_proto_rawDescGZIP(), []int{0, 0}
}

func (x *EventDetailComplexType_UnknownType) GetData() []*DataComplexType {
	if x != nil {
		return x.Data
	}
	return nil
}

var File_event_logging_v4_event_detail_complex_type_proto protoreflect.FileDescriptor

var file_event_logging_v4_event_detail_complex_type_proto_rawDesc = []byte{
	0x0a, 0x30, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f,
	0x76, 0x34, 0x2f, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x64, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x5f,
	0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x12, 0x10, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e,
	0x67, 0x2e, 0x76, 0x34, 0x1a, 0x29, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67,
	0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x61, 0x6c, 0x65, 0x72, 0x74, 0x5f, 0x63, 0x6f, 0x6d,
	0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a,
	0x2c, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76,
	0x34, 0x2f, 0x61, 0x70, 0x70, 0x72, 0x6f, 0x76, 0x61, 0x6c, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c,
	0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x30, 0x65,
	0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f,
	0x61, 0x75, 0x74, 0x68, 0x65, 0x6e, 0x74, 0x69, 0x63, 0x61, 0x74, 0x65, 0x5f, 0x63, 0x6f, 0x6d,
	0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a,
	0x2d, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76,
	0x34, 0x2f, 0x61, 0x75, 0x74, 0x68, 0x6f, 0x72, 0x69, 0x73, 0x65, 0x5f, 0x63, 0x6f, 0x6d, 0x70,
	0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x28,
	0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34,
	0x2f, 0x63, 0x6f, 0x70, 0x79, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79,
	0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2a, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f,
	0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x63, 0x72, 0x65, 0x61, 0x74,
	0x65, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x28, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67,
	0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x64, 0x61, 0x74, 0x61, 0x5f, 0x63, 0x6f, 0x6d, 0x70,
	0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2a,
	0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34,
	0x2f, 0x64, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f,
	0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2a, 0x65, 0x76, 0x65, 0x6e,
	0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x65, 0x78, 0x70,
	0x6f, 0x72, 0x74, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2a, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f,
	0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x69, 0x6d, 0x70, 0x6f, 0x72, 0x74, 0x5f,
	0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x1a, 0x2b, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e,
	0x67, 0x2f, 0x76, 0x34, 0x2f, 0x69, 0x6e, 0x73, 0x74, 0x61, 0x6c, 0x6c, 0x5f, 0x63, 0x6f, 0x6d,
	0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a,
	0x28, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76,
	0x34, 0x2f, 0x6d, 0x6f, 0x76, 0x65, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74,
	0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x38, 0x65, 0x76, 0x65, 0x6e, 0x74,
	0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x6e, 0x65, 0x74, 0x77,
	0x6f, 0x72, 0x6b, 0x5f, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e,
	0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x1a, 0x29, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69,
	0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x70, 0x72, 0x69, 0x6e, 0x74, 0x5f, 0x63, 0x6f, 0x6d, 0x70,
	0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2b,
	0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34,
	0x2f, 0x70, 0x72, 0x6f, 0x63, 0x65, 0x73, 0x73, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78,
	0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2b, 0x65, 0x76, 0x65,
	0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x70, 0x75,
	0x72, 0x70, 0x6f, 0x73, 0x65, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79,
	0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2b, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f,
	0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x72, 0x65, 0x63, 0x65, 0x69,
	0x76, 0x65, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2a, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67,
	0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x73, 0x65, 0x61, 0x72, 0x63, 0x68, 0x5f, 0x63,
	0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x28, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67,
	0x2f, 0x76, 0x34, 0x2f, 0x73, 0x65, 0x6e, 0x64, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78,
	0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2d, 0x65, 0x76, 0x65,
	0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x75, 0x6e,
	0x69, 0x6e, 0x73, 0x74, 0x61, 0x6c, 0x6c, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f,
	0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2a, 0x65, 0x76, 0x65, 0x6e,
	0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x75, 0x70, 0x64,
	0x61, 0x74, 0x65, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x28, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f,
	0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x76, 0x69, 0x65, 0x77, 0x5f, 0x63, 0x6f,
	0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x1a, 0x1b, 0x62, 0x75, 0x66, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x2f, 0x76,
	0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xd5, 0x0d,
	0x0a, 0x16, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x44, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x43, 0x6f, 0x6d,
	0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x12, 0x1f, 0x0a, 0x07, 0x74, 0x79, 0x70, 0x65,
	0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01,
	0x01, 0x52, 0x06, 0x74, 0x79, 0x70, 0x65, 0x49, 0x64, 0x12, 0x20, 0x0a, 0x0b, 0x64, 0x65, 0x73,
	0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b,
	0x64, 0x65, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x3e, 0x0a, 0x07, 0x70,
	0x75, 0x72, 0x70, 0x6f, 0x73, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x24, 0x2e, 0x65,
	0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e,
	0x50, 0x75, 0x72, 0x70, 0x6f, 0x73, 0x65, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79,
	0x70, 0x65, 0x52, 0x07, 0x70, 0x75, 0x72, 0x70, 0x6f, 0x73, 0x65, 0x12, 0x55, 0x0a, 0x0c, 0x61,
	0x75, 0x74, 0x68, 0x65, 0x6e, 0x74, 0x69, 0x63, 0x61, 0x74, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x29, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e,
	0x67, 0x2e, 0x76, 0x34, 0x2e, 0x41, 0x75, 0x74, 0x68, 0x65, 0x6e, 0x74, 0x69, 0x63, 0x61, 0x74,
	0x65, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48,
	0x03, 0xc8, 0x01, 0x01, 0x52, 0x0c, 0x61, 0x75, 0x74, 0x68, 0x65, 0x6e, 0x74, 0x69, 0x63, 0x61,
	0x74, 0x65, 0x12, 0x4c, 0x0a, 0x09, 0x61, 0x75, 0x74, 0x68, 0x6f, 0x72, 0x69, 0x73, 0x65, 0x18,
	0x05, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x26, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f,
	0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x41, 0x75, 0x74, 0x68, 0x6f, 0x72, 0x69,
	0x73, 0x65, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba,
	0x48, 0x03, 0xc8, 0x01, 0x01, 0x52, 0x09, 0x61, 0x75, 0x74, 0x68, 0x6f, 0x72, 0x69, 0x73, 0x65,
	0x12, 0x43, 0x0a, 0x06, 0x73, 0x65, 0x61, 0x72, 0x63, 0x68, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x23, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67,
	0x2e, 0x76, 0x34, 0x2e, 0x53, 0x65, 0x61, 0x72, 0x63, 0x68, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65,
	0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52, 0x06, 0x73,
	0x65, 0x61, 0x72, 0x63, 0x68, 0x12, 0x3d, 0x0a, 0x04, 0x63, 0x6f, 0x70, 0x79, 0x18, 0x07, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x21, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67,
	0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x43, 0x6f, 0x70, 0x79, 0x43, 0x6f, 0x6d, 0x70, 0x6c,
	0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52, 0x04,
	0x63, 0x6f, 0x70, 0x79, 0x12, 0x3d, 0x0a, 0x04, 0x6d, 0x6f, 0x76, 0x65, 0x18, 0x08, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x21, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69,
	0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x4d, 0x6f, 0x76, 0x65, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65,
	0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52, 0x04, 0x6d,
	0x6f, 0x76, 0x65, 0x12, 0x43, 0x0a, 0x06, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x18, 0x09, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x23, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67,
	0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x43, 0x6f, 0x6d,
	0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01,
	0x52, 0x06, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x12, 0x3d, 0x0a, 0x04, 0x76, 0x69, 0x65, 0x77,
	0x18, 0x0a, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x21, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c,
	0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x56, 0x69, 0x65, 0x77, 0x43, 0x6f,
	0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01,
	0x01, 0x52, 0x04, 0x76, 0x69, 0x65, 0x77, 0x12, 0x4e, 0x0a, 0x0c, 0x69, 0x6d, 0x70, 0x6f, 0x72,
	0x74, 0x5f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x18, 0x0b, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x23, 0x2e,
	0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34,
	0x2e, 0x49, 0x6d, 0x70, 0x6f, 0x72, 0x74, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79,
	0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52, 0x0b, 0x69, 0x6d, 0x70, 0x6f,
	0x72, 0x74, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x12, 0x43, 0x0a, 0x06, 0x65, 0x78, 0x70, 0x6f, 0x72,
	0x74, 0x18, 0x0c, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x23, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f,
	0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x45, 0x78, 0x70, 0x6f, 0x72,
	0x74, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48,
	0x03, 0xc8, 0x01, 0x01, 0x52, 0x06, 0x65, 0x78, 0x70, 0x6f, 0x72, 0x74, 0x12, 0x43, 0x0a, 0x06,
	0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x18, 0x0d, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x23, 0x2e, 0x65,
	0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e,
	0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70,
	0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52, 0x06, 0x75, 0x70, 0x64, 0x61, 0x74,
	0x65, 0x12, 0x43, 0x0a, 0x06, 0x64, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x18, 0x0e, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x23, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e,
	0x67, 0x2e, 0x76, 0x34, 0x2e, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x43, 0x6f, 0x6d, 0x70, 0x6c,
	0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52, 0x06,
	0x64, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x12, 0x46, 0x0a, 0x07, 0x70, 0x72, 0x6f, 0x63, 0x65, 0x73,
	0x73, 0x18, 0x0f, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x24, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f,
	0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x50, 0x72, 0x6f, 0x63, 0x65,
	0x73, 0x73, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba,
	0x48, 0x03, 0xc8, 0x01, 0x01, 0x52, 0x07, 0x70, 0x72, 0x6f, 0x63, 0x65, 0x73, 0x73, 0x12, 0x40,
	0x0a, 0x05, 0x70, 0x72, 0x69, 0x6e, 0x74, 0x18, 0x10, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x22, 0x2e,
	0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34,
	0x2e, 0x50, 0x72, 0x69, 0x6e, 0x74, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70,
	0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52, 0x05, 0x70, 0x72, 0x69, 0x6e, 0x74,
	0x12, 0x46, 0x0a, 0x07, 0x69, 0x6e, 0x73, 0x74, 0x61, 0x6c, 0x6c, 0x18, 0x11, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x24, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e,
	0x67, 0x2e, 0x76, 0x34, 0x2e, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6c, 0x6c, 0x43, 0x6f, 0x6d, 0x70,
	0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52,
	0x07, 0x69, 0x6e, 0x73, 0x74, 0x61, 0x6c, 0x6c, 0x12, 0x4c, 0x0a, 0x09, 0x75, 0x6e, 0x69, 0x6e,
	0x73, 0x74, 0x61, 0x6c, 0x6c, 0x18, 0x12, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x26, 0x2e, 0x65, 0x76,
	0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x55,
	0x6e, 0x69, 0x6e, 0x73, 0x74, 0x61, 0x6c, 0x6c, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54,
	0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52, 0x09, 0x75, 0x6e, 0x69,
	0x6e, 0x73, 0x74, 0x61, 0x6c, 0x6c, 0x12, 0x51, 0x0a, 0x07, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72,
	0x6b, 0x18, 0x13, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x2f, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f,
	0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x4e, 0x65, 0x74, 0x77, 0x6f,
	0x72, 0x6b, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x41, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x43, 0x6f, 0x6d,
	0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01,
	0x52, 0x07, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x12, 0x40, 0x0a, 0x05, 0x61, 0x6c, 0x65,
	0x72, 0x74, 0x18, 0x14, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x22, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74,
	0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x41, 0x6c, 0x65, 0x72,
	0x74, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48,
	0x03, 0xc8, 0x01, 0x01, 0x52, 0x05, 0x61, 0x6c, 0x65, 0x72, 0x74, 0x12, 0x3d, 0x0a, 0x04, 0x73,
	0x65, 0x6e, 0x64, 0x18, 0x15, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x21, 0x2e, 0x65, 0x76, 0x65, 0x6e,
	0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x53, 0x65, 0x6e,
	0x64, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48,
	0x03, 0xc8, 0x01, 0x01, 0x52, 0x04, 0x73, 0x65, 0x6e, 0x64, 0x12, 0x46, 0x0a, 0x07, 0x72, 0x65,
	0x63, 0x65, 0x69, 0x76, 0x65, 0x18, 0x16, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x24, 0x2e, 0x65, 0x76,
	0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x52,
	0x65, 0x63, 0x65, 0x69, 0x76, 0x65, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70,
	0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52, 0x07, 0x72, 0x65, 0x63, 0x65, 0x69,
	0x76, 0x65, 0x12, 0x49, 0x0a, 0x08, 0x61, 0x70, 0x70, 0x72, 0x6f, 0x76, 0x61, 0x6c, 0x18, 0x17,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x25, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67,
	0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x41, 0x70, 0x70, 0x72, 0x6f, 0x76, 0x61, 0x6c,
	0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03,
	0xc8, 0x01, 0x01, 0x52, 0x08, 0x61, 0x70, 0x70, 0x72, 0x6f, 0x76, 0x61, 0x6c, 0x12, 0x56, 0x0a,
	0x07, 0x75, 0x6e, 0x6b, 0x6e, 0x6f, 0x77, 0x6e, 0x18, 0x18, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x34,
	0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76,
	0x34, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x44, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x43, 0x6f, 0x6d,
	0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x2e, 0x55, 0x6e, 0x6b, 0x6e, 0x6f, 0x77, 0x6e,
	0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52, 0x07, 0x75, 0x6e,
	0x6b, 0x6e, 0x6f, 0x77, 0x6e, 0x1a, 0x4e, 0x0a, 0x0b, 0x55, 0x6e, 0x6b, 0x6e, 0x6f, 0x77, 0x6e,
	0x54, 0x79, 0x70, 0x65, 0x12, 0x3f, 0x0a, 0x04, 0x64, 0x61, 0x74, 0x61, 0x18, 0x01, 0x20, 0x03,
	0x28, 0x0b, 0x32, 0x21, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69,
	0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x44, 0x61, 0x74, 0x61, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65,
	0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x08, 0xba, 0x48, 0x05, 0x92, 0x01, 0x02, 0x08, 0x00, 0x52,
	0x04, 0x64, 0x61, 0x74, 0x61, 0x42, 0xdf, 0x01, 0x0a, 0x1c, 0x75, 0x6b, 0x2e, 0x67, 0x6f, 0x76,
	0x2e, 0x67, 0x63, 0x68, 0x71, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67,
	0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x42, 0x1b, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x44, 0x65, 0x74,
	0x61, 0x69, 0x6c, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x50, 0x72,
	0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x45, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f,
	0x6d, 0x2f, 0x67, 0x63, 0x68, 0x71, 0x2f, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x2d, 0x6c, 0x6f, 0x67,
	0x67, 0x69, 0x6e, 0x67, 0x2d, 0x73, 0x63, 0x68, 0x65, 0x6d, 0x61, 0x2f, 0x65, 0x76, 0x65, 0x6e,
	0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x3b, 0x65, 0x76, 0x65,
	0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x76, 0x34, 0xa2, 0x02, 0x03, 0x45,
	0x58, 0x58, 0xaa, 0x02, 0x0f, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x4c, 0x6f, 0x67, 0x67, 0x69, 0x6e,
	0x67, 0x2e, 0x56, 0x34, 0xca, 0x02, 0x0f, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x4c, 0x6f, 0x67, 0x67,
	0x69, 0x6e, 0x67, 0x5c, 0x56, 0x34, 0xe2, 0x02, 0x1b, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x4c, 0x6f,
	0x67, 0x67, 0x69, 0x6e, 0x67, 0x5c, 0x56, 0x34, 0x5c, 0x47, 0x50, 0x42, 0x4d, 0x65, 0x74, 0x61,
	0x64, 0x61, 0x74, 0x61, 0xea, 0x02, 0x10, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x4c, 0x6f, 0x67, 0x67,
	0x69, 0x6e, 0x67, 0x3a, 0x3a, 0x56, 0x34, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_event_logging_v4_event_detail_complex_type_proto_rawDescOnce sync.Once
	file_event_logging_v4_event_detail_complex_type_proto_rawDescData = file_event_logging_v4_event_detail_complex_type_proto_rawDesc
)

func file_event_logging_v4_event_detail_complex_type_proto_rawDescGZIP() []byte {
	file_event_logging_v4_event_detail_complex_type_proto_rawDescOnce.Do(func() {
		file_event_logging_v4_event_detail_complex_type_proto_rawDescData = protoimpl.X.CompressGZIP(file_event_logging_v4_event_detail_complex_type_proto_rawDescData)
	})
	return file_event_logging_v4_event_detail_complex_type_proto_rawDescData
}

var file_event_logging_v4_event_detail_complex_type_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_event_logging_v4_event_detail_complex_type_proto_goTypes = []interface{}{
	(*EventDetailComplexType)(nil),             // 0: event_logging.v4.EventDetailComplexType
	(*EventDetailComplexType_UnknownType)(nil), // 1: event_logging.v4.EventDetailComplexType.UnknownType
	(*PurposeComplexType)(nil),                 // 2: event_logging.v4.PurposeComplexType
	(*AuthenticateComplexType)(nil),            // 3: event_logging.v4.AuthenticateComplexType
	(*AuthoriseComplexType)(nil),               // 4: event_logging.v4.AuthoriseComplexType
	(*SearchComplexType)(nil),                  // 5: event_logging.v4.SearchComplexType
	(*CopyComplexType)(nil),                    // 6: event_logging.v4.CopyComplexType
	(*MoveComplexType)(nil),                    // 7: event_logging.v4.MoveComplexType
	(*CreateComplexType)(nil),                  // 8: event_logging.v4.CreateComplexType
	(*ViewComplexType)(nil),                    // 9: event_logging.v4.ViewComplexType
	(*ImportComplexType)(nil),                  // 10: event_logging.v4.ImportComplexType
	(*ExportComplexType)(nil),                  // 11: event_logging.v4.ExportComplexType
	(*UpdateComplexType)(nil),                  // 12: event_logging.v4.UpdateComplexType
	(*DeleteComplexType)(nil),                  // 13: event_logging.v4.DeleteComplexType
	(*ProcessComplexType)(nil),                 // 14: event_logging.v4.ProcessComplexType
	(*PrintComplexType)(nil),                   // 15: event_logging.v4.PrintComplexType
	(*InstallComplexType)(nil),                 // 16: event_logging.v4.InstallComplexType
	(*UninstallComplexType)(nil),               // 17: event_logging.v4.UninstallComplexType
	(*NetworkEventActionComplexType)(nil),      // 18: event_logging.v4.NetworkEventActionComplexType
	(*AlertComplexType)(nil),                   // 19: event_logging.v4.AlertComplexType
	(*SendComplexType)(nil),                    // 20: event_logging.v4.SendComplexType
	(*ReceiveComplexType)(nil),                 // 21: event_logging.v4.ReceiveComplexType
	(*ApprovalComplexType)(nil),                // 22: event_logging.v4.ApprovalComplexType
	(*DataComplexType)(nil),                    // 23: event_logging.v4.DataComplexType
}
var file_event_logging_v4_event_detail_complex_type_proto_depIdxs = []int32{
	2,  // 0: event_logging.v4.EventDetailComplexType.purpose:type_name -> event_logging.v4.PurposeComplexType
	3,  // 1: event_logging.v4.EventDetailComplexType.authenticate:type_name -> event_logging.v4.AuthenticateComplexType
	4,  // 2: event_logging.v4.EventDetailComplexType.authorise:type_name -> event_logging.v4.AuthoriseComplexType
	5,  // 3: event_logging.v4.EventDetailComplexType.search:type_name -> event_logging.v4.SearchComplexType
	6,  // 4: event_logging.v4.EventDetailComplexType.copy:type_name -> event_logging.v4.CopyComplexType
	7,  // 5: event_logging.v4.EventDetailComplexType.move:type_name -> event_logging.v4.MoveComplexType
	8,  // 6: event_logging.v4.EventDetailComplexType.create:type_name -> event_logging.v4.CreateComplexType
	9,  // 7: event_logging.v4.EventDetailComplexType.view:type_name -> event_logging.v4.ViewComplexType
	10, // 8: event_logging.v4.EventDetailComplexType.import_field:type_name -> event_logging.v4.ImportComplexType
	11, // 9: event_logging.v4.EventDetailComplexType.export:type_name -> event_logging.v4.ExportComplexType
	12, // 10: event_logging.v4.EventDetailComplexType.update:type_name -> event_logging.v4.UpdateComplexType
	13, // 11: event_logging.v4.EventDetailComplexType.delete:type_name -> event_logging.v4.DeleteComplexType
	14, // 12: event_logging.v4.EventDetailComplexType.process:type_name -> event_logging.v4.ProcessComplexType
	15, // 13: event_logging.v4.EventDetailComplexType.print:type_name -> event_logging.v4.PrintComplexType
	16, // 14: event_logging.v4.EventDetailComplexType.install:type_name -> event_logging.v4.InstallComplexType
	17, // 15: event_logging.v4.EventDetailComplexType.uninstall:type_name -> event_logging.v4.UninstallComplexType
	18, // 16: event_logging.v4.EventDetailComplexType.network:type_name -> event_logging.v4.NetworkEventActionComplexType
	19, // 17: event_logging.v4.EventDetailComplexType.alert:type_name -> event_logging.v4.AlertComplexType
	20, // 18: event_logging.v4.EventDetailComplexType.send:type_name -> event_logging.v4.SendComplexType
	21, // 19: event_logging.v4.EventDetailComplexType.receive:type_name -> event_logging.v4.ReceiveComplexType
	22, // 20: event_logging.v4.EventDetailComplexType.approval:type_name -> event_logging.v4.ApprovalComplexType
	1,  // 21: event_logging.v4.EventDetailComplexType.unknown:type_name -> event_logging.v4.EventDetailComplexType.UnknownType
	23, // 22: event_logging.v4.EventDetailComplexType.UnknownType.data:type_name -> event_logging.v4.DataComplexType
	23, // [23:23] is the sub-list for method output_type
	23, // [23:23] is the sub-list for method input_type
	23, // [23:23] is the sub-list for extension type_name
	23, // [23:23] is the sub-list for extension extendee
	0,  // [0:23] is the sub-list for field type_name
}

func init() { file_event_logging_v4_event_detail_complex_type_proto_init() }
func file_event_logging_v4_event_detail_complex_type_proto_init() {
	if File_event_logging_v4_event_detail_complex_type_proto != nil {
		return
	}
	file_event_logging_v4_alert_complex_type_proto_init()
	file_event_logging_v4_approval_complex_type_proto_init()
	file_event_logging_v4_authenticate_complex_type_proto_init()
	file_event_logging_v4_authorise_complex_type_proto_init()
	file_event_logging_v4_copy_complex_type_proto_init()
	file_event_logging_v4_create_complex_type_proto_init()
	file_event_logging_v4_data_complex_type_proto_init()
	file_event_logging_v4_delete_complex_type_proto_init()
	file_event_logging_v4_export_complex_type_proto_init()
	file_event_logging_v4_import_complex_type_proto_init()
	file_event_logging_v4_install_complex_type_proto_init()
	file_event_logging_v4_move_complex_type_proto_init()
	file_event_logging_v4_network_event_action_complex_type_proto_init()
	file_event_logging_v4_print_complex_type_proto_init()
	file_event_logging_v4_process_complex_type_proto_init()
	file_event_logging_v4_purpose_complex_type_proto_init()
	file_event_logging_v4_receive_complex_type_proto_init()
	file_event_logging_v4_search_complex_type_proto_init()
	file_event_logging_v4_send_complex_type_proto_init()
	file_event_logging_v4_uninstall_complex_type_proto_init()
	file_event_logging_v4_update_complex_type_proto_init()
	file_event_logging_v4_view_complex_type_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_event_logging_v4_event_detail_complex_type_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*EventDetailComplexType); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_event_logging_v4_event_detail_complex_type_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*EventDetailComplexType_UnknownType); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_event_logging_v4_event_detail_complex_type_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_event_logging_v4_event_detail_complex_type_proto_goTypes,
		DependencyIndexes: file_event_logging_v4_event_detail_complex_type_proto_depIdxs,
		MessageInfos:      file_event_logging_v4_event_detail_complex_type_proto_msgTypes,
	}.Build()
	File_event_logging_v4_event_detail_complex_type_proto = out.File
	file_event_logging_v4_event_detail_complex_type_proto_rawDesc = nil
	file_event_logging_v4_event_detail_complex_type_proto_goTypes = nil
	file_event_logging_v4_event_detail_complex_type_proto_depIdxs = nil
}
