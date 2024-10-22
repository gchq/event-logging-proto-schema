// event_logging/v4/create_complex_type.proto at 0:0

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.33.0
// 	protoc        (unknown)
// source: event_logging/v4/create_complex_type.proto

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

// Describes an event action relating to creating data, files, documents, etc.
type CreateComplexType struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	ChoiceWrapper []*CreateComplexType_ChoiceWrapperCreateComplexType `protobuf:"bytes,1,rep,name=choice_wrapper,json=choiceWrapper,proto3" json:"choice_wrapper,omitempty"`
	// Used to determine if the action was successful. If omitted it is assumed that the event was successful and was permitted.
	Outcome *OutcomeComplexType `protobuf:"bytes,11,opt,name=outcome,proto3" json:"outcome,omitempty"`
	// Any other event data that does not fit into a schema element but may be useful for the purpose of audit.
	Data []*DataComplexType `protobuf:"bytes,12,rep,name=data,proto3" json:"data,omitempty"`
}

func (x *CreateComplexType) Reset() {
	*x = CreateComplexType{}
	if protoimpl.UnsafeEnabled {
		mi := &file_event_logging_v4_create_complex_type_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateComplexType) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateComplexType) ProtoMessage() {}

func (x *CreateComplexType) ProtoReflect() protoreflect.Message {
	mi := &file_event_logging_v4_create_complex_type_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateComplexType.ProtoReflect.Descriptor instead.
func (*CreateComplexType) Descriptor() ([]byte, []int) {
	return file_event_logging_v4_create_complex_type_proto_rawDescGZIP(), []int{0}
}

func (x *CreateComplexType) GetChoiceWrapper() []*CreateComplexType_ChoiceWrapperCreateComplexType {
	if x != nil {
		return x.ChoiceWrapper
	}
	return nil
}

func (x *CreateComplexType) GetOutcome() *OutcomeComplexType {
	if x != nil {
		return x.Outcome
	}
	return nil
}

func (x *CreateComplexType) GetData() []*DataComplexType {
	if x != nil {
		return x.Data
	}
	return nil
}

type CreateComplexType_ChoiceWrapperCreateComplexType struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Describes the association or link between two or more entities, e.g. the link between two web resources.
	Association *AssociationComplexType `protobuf:"bytes,1,opt,name=association,proto3" json:"association,omitempty"`
	// Describes a banner or message presented to a user, e.g. an acceptable use policy message shown on system login.
	Banner *BannerComplexType `protobuf:"bytes,2,opt,name=banner,proto3" json:"banner,omitempty"`
	// Describes part of a chat session between a user and one or more other users, e.g. in an instant messaging application.
	Chat *ChatComplexType `protobuf:"bytes,3,opt,name=chat,proto3" json:"chat,omitempty"`
	// Describes the configuration of entity, e.g. it can be used to describe the update to the configuration of a network device.
	Configuration *ConfigurationComplexType `protobuf:"bytes,4,opt,name=configuration,proto3" json:"configuration,omitempty"`
	// Structure used to describe a criteria used to filter or limit the scope of something, e.g. in a search, view, update or delete event.
	Criteria *CriteriaComplexType `protobuf:"bytes,5,opt,name=criteria,proto3" json:"criteria,omitempty"`
	// Describes a document that may be stored electronically or in hard-copy form.
	Document *DocumentComplexType `protobuf:"bytes,6,opt,name=document,proto3" json:"document,omitempty"`
	// Describes an email sent from one user to one or more recipients.
	Email *EmailComplexType `protobuf:"bytes,7,opt,name=email,proto3" json:"email,omitempty"`
	// A file object, e.g. a text file on file system
	File *FileComplexType `protobuf:"bytes,8,opt,name=file,proto3" json:"file,omitempty"`
	// A folder object, e.g. a directory or folder on file system.
	Folder *FolderComplexType `protobuf:"bytes,9,opt,name=folder,proto3" json:"folder,omitempty"`
	// A group entity, e.g. a user group, an access control group or a named group of some kind that ties together a collection of entities/objects of some kind.
	Group *GroupComplexType `protobuf:"bytes,10,opt,name=group,proto3" json:"group,omitempty"`
	// Describes the details of a chat event within a chat room or group.
	GroupChat *GroupChatComplexType `protobuf:"bytes,11,opt,name=group_chat,json=groupChat,proto3" json:"group_chat,omitempty"`
	// A generic object or entity that cannot be described using any of the other more specific object types.
	Object *ObjectComplexType `protobuf:"bytes,12,opt,name=object,proto3" json:"object,omitempty"`
	// A set of search results from a query where the results are viewed or interacted with in a separate event to the execution of the query. E.g. for long-running queries where the results are stored for later viewing/processing. The Search schema action should be used to describe the event for the execution of the search. Query/Id or Query/Name can be used to associate the results event with the query event.
	SearchResults *SearchResultsComplexType `protobuf:"bytes,13,opt,name=search_results,json=searchResults,proto3" json:"search_results,omitempty"`
	// A shortcut to another file/object, such as a Windows Shortcut or linux symbolic link.
	Shortcut *ShortcutComplexType `protobuf:"bytes,14,opt,name=shortcut,proto3" json:"shortcut,omitempty"`
	// A user entity which may represent a person or some form of non-human processing user.
	User *UserComplexType `protobuf:"bytes,15,opt,name=user,proto3" json:"user,omitempty"`
	// This is used to describe the session used when viewing another user's session, e.g. screen sharing or remote assistance type activities.
	VirtualSession *VirtualSessionComplexType `protobuf:"bytes,16,opt,name=virtual_session,json=virtualSession,proto3" json:"virtual_session,omitempty"`
	// Describes a Voice Over Internet Protocol call.
	Voip *VoipComplexType `protobuf:"bytes,17,opt,name=voip,proto3" json:"voip,omitempty"`
	// This is used to describe a resource within a website or web application, such as an HTML file, image file or script, along with the details of that resource such as size or response codes. It can represent both successful and failed access to the resource object.
	Resource *ResourceComplexType `protobuf:"bytes,18,opt,name=resource,proto3" json:"resource,omitempty"`
}

func (x *CreateComplexType_ChoiceWrapperCreateComplexType) Reset() {
	*x = CreateComplexType_ChoiceWrapperCreateComplexType{}
	if protoimpl.UnsafeEnabled {
		mi := &file_event_logging_v4_create_complex_type_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateComplexType_ChoiceWrapperCreateComplexType) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateComplexType_ChoiceWrapperCreateComplexType) ProtoMessage() {}

func (x *CreateComplexType_ChoiceWrapperCreateComplexType) ProtoReflect() protoreflect.Message {
	mi := &file_event_logging_v4_create_complex_type_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateComplexType_ChoiceWrapperCreateComplexType.ProtoReflect.Descriptor instead.
func (*CreateComplexType_ChoiceWrapperCreateComplexType) Descriptor() ([]byte, []int) {
	return file_event_logging_v4_create_complex_type_proto_rawDescGZIP(), []int{0, 0}
}

func (x *CreateComplexType_ChoiceWrapperCreateComplexType) GetAssociation() *AssociationComplexType {
	if x != nil {
		return x.Association
	}
	return nil
}

func (x *CreateComplexType_ChoiceWrapperCreateComplexType) GetBanner() *BannerComplexType {
	if x != nil {
		return x.Banner
	}
	return nil
}

func (x *CreateComplexType_ChoiceWrapperCreateComplexType) GetChat() *ChatComplexType {
	if x != nil {
		return x.Chat
	}
	return nil
}

func (x *CreateComplexType_ChoiceWrapperCreateComplexType) GetConfiguration() *ConfigurationComplexType {
	if x != nil {
		return x.Configuration
	}
	return nil
}

func (x *CreateComplexType_ChoiceWrapperCreateComplexType) GetCriteria() *CriteriaComplexType {
	if x != nil {
		return x.Criteria
	}
	return nil
}

func (x *CreateComplexType_ChoiceWrapperCreateComplexType) GetDocument() *DocumentComplexType {
	if x != nil {
		return x.Document
	}
	return nil
}

func (x *CreateComplexType_ChoiceWrapperCreateComplexType) GetEmail() *EmailComplexType {
	if x != nil {
		return x.Email
	}
	return nil
}

func (x *CreateComplexType_ChoiceWrapperCreateComplexType) GetFile() *FileComplexType {
	if x != nil {
		return x.File
	}
	return nil
}

func (x *CreateComplexType_ChoiceWrapperCreateComplexType) GetFolder() *FolderComplexType {
	if x != nil {
		return x.Folder
	}
	return nil
}

func (x *CreateComplexType_ChoiceWrapperCreateComplexType) GetGroup() *GroupComplexType {
	if x != nil {
		return x.Group
	}
	return nil
}

func (x *CreateComplexType_ChoiceWrapperCreateComplexType) GetGroupChat() *GroupChatComplexType {
	if x != nil {
		return x.GroupChat
	}
	return nil
}

func (x *CreateComplexType_ChoiceWrapperCreateComplexType) GetObject() *ObjectComplexType {
	if x != nil {
		return x.Object
	}
	return nil
}

func (x *CreateComplexType_ChoiceWrapperCreateComplexType) GetSearchResults() *SearchResultsComplexType {
	if x != nil {
		return x.SearchResults
	}
	return nil
}

func (x *CreateComplexType_ChoiceWrapperCreateComplexType) GetShortcut() *ShortcutComplexType {
	if x != nil {
		return x.Shortcut
	}
	return nil
}

func (x *CreateComplexType_ChoiceWrapperCreateComplexType) GetUser() *UserComplexType {
	if x != nil {
		return x.User
	}
	return nil
}

func (x *CreateComplexType_ChoiceWrapperCreateComplexType) GetVirtualSession() *VirtualSessionComplexType {
	if x != nil {
		return x.VirtualSession
	}
	return nil
}

func (x *CreateComplexType_ChoiceWrapperCreateComplexType) GetVoip() *VoipComplexType {
	if x != nil {
		return x.Voip
	}
	return nil
}

func (x *CreateComplexType_ChoiceWrapperCreateComplexType) GetResource() *ResourceComplexType {
	if x != nil {
		return x.Resource
	}
	return nil
}

var File_event_logging_v4_create_complex_type_proto protoreflect.FileDescriptor

var file_event_logging_v4_create_complex_type_proto_rawDesc = []byte{
	0x0a, 0x2a, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f,
	0x76, 0x34, 0x2f, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65,
	0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x10, 0x65, 0x76,
	0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x1a, 0x2a,
	0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34,
	0x2f, 0x62, 0x61, 0x6e, 0x6e, 0x65, 0x72, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f,
	0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x28, 0x65, 0x76, 0x65, 0x6e,
	0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x63, 0x68, 0x61,
	0x74, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x31, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67,
	0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x75, 0x72, 0x61,
	0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70,
	0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x28, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c,
	0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x64, 0x61, 0x74, 0x61, 0x5f, 0x63,
	0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x2c, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67,
	0x2f, 0x76, 0x34, 0x2f, 0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x5f, 0x63, 0x6f, 0x6d,
	0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a,
	0x29, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76,
	0x34, 0x2f, 0x65, 0x6d, 0x61, 0x69, 0x6c, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f,
	0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x28, 0x65, 0x76, 0x65, 0x6e,
	0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x66, 0x69, 0x6c,
	0x65, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2a, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67,
	0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x66, 0x6f, 0x6c, 0x64, 0x65, 0x72, 0x5f, 0x63, 0x6f,
	0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x1a, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f,
	0x76, 0x34, 0x2f, 0x67, 0x72, 0x6f, 0x75, 0x70, 0x5f, 0x63, 0x68, 0x61, 0x74, 0x5f, 0x63, 0x6f,
	0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x1a, 0x30, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f,
	0x76, 0x34, 0x2f, 0x6d, 0x75, 0x6c, 0x74, 0x69, 0x5f, 0x6f, 0x62, 0x6a, 0x65, 0x63, 0x74, 0x5f,
	0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x1a, 0x2a, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e,
	0x67, 0x2f, 0x76, 0x34, 0x2f, 0x6f, 0x62, 0x6a, 0x65, 0x63, 0x74, 0x5f, 0x63, 0x6f, 0x6d, 0x70,
	0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2b,
	0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34,
	0x2f, 0x6f, 0x75, 0x74, 0x63, 0x6f, 0x6d, 0x65, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78,
	0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2c, 0x65, 0x76, 0x65,
	0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x72, 0x65,
	0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74,
	0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2c, 0x65, 0x76, 0x65, 0x6e, 0x74,
	0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x73, 0x68, 0x6f, 0x72,
	0x74, 0x63, 0x75, 0x74, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70,
	0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x28, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c,
	0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x63,
	0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x33, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67,
	0x2f, 0x76, 0x34, 0x2f, 0x76, 0x69, 0x72, 0x74, 0x75, 0x61, 0x6c, 0x5f, 0x73, 0x65, 0x73, 0x73,
	0x69, 0x6f, 0x6e, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x28, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f,
	0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x76, 0x6f, 0x69, 0x70, 0x5f, 0x63, 0x6f,
	0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x1a, 0x1b, 0x62, 0x75, 0x66, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x2f, 0x76,
	0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xdd, 0x0c,
	0x0a, 0x11, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54,
	0x79, 0x70, 0x65, 0x12, 0x73, 0x0a, 0x0e, 0x63, 0x68, 0x6f, 0x69, 0x63, 0x65, 0x5f, 0x77, 0x72,
	0x61, 0x70, 0x70, 0x65, 0x72, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x42, 0x2e, 0x65, 0x76,
	0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x43,
	0x72, 0x65, 0x61, 0x74, 0x65, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65,
	0x2e, 0x43, 0x68, 0x6f, 0x69, 0x63, 0x65, 0x57, 0x72, 0x61, 0x70, 0x70, 0x65, 0x72, 0x43, 0x72,
	0x65, 0x61, 0x74, 0x65, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42,
	0x08, 0xba, 0x48, 0x05, 0x92, 0x01, 0x02, 0x08, 0x01, 0x52, 0x0d, 0x63, 0x68, 0x6f, 0x69, 0x63,
	0x65, 0x57, 0x72, 0x61, 0x70, 0x70, 0x65, 0x72, 0x12, 0x3e, 0x0a, 0x07, 0x6f, 0x75, 0x74, 0x63,
	0x6f, 0x6d, 0x65, 0x18, 0x0b, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x24, 0x2e, 0x65, 0x76, 0x65, 0x6e,
	0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x4f, 0x75, 0x74,
	0x63, 0x6f, 0x6d, 0x65, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x52,
	0x07, 0x6f, 0x75, 0x74, 0x63, 0x6f, 0x6d, 0x65, 0x12, 0x3f, 0x0a, 0x04, 0x64, 0x61, 0x74, 0x61,
	0x18, 0x0c, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x21, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c,
	0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x44, 0x61, 0x74, 0x61, 0x43, 0x6f,
	0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x08, 0xba, 0x48, 0x05, 0x92, 0x01,
	0x02, 0x08, 0x00, 0x52, 0x04, 0x64, 0x61, 0x74, 0x61, 0x1a, 0xd1, 0x0a, 0x0a, 0x1e, 0x43, 0x68,
	0x6f, 0x69, 0x63, 0x65, 0x57, 0x72, 0x61, 0x70, 0x70, 0x65, 0x72, 0x43, 0x72, 0x65, 0x61, 0x74,
	0x65, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x12, 0x52, 0x0a, 0x0b,
	0x61, 0x73, 0x73, 0x6f, 0x63, 0x69, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x28, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e,
	0x67, 0x2e, 0x76, 0x34, 0x2e, 0x41, 0x73, 0x73, 0x6f, 0x63, 0x69, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03,
	0xc8, 0x01, 0x01, 0x52, 0x0b, 0x61, 0x73, 0x73, 0x6f, 0x63, 0x69, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x12, 0x43, 0x0a, 0x06, 0x62, 0x61, 0x6e, 0x6e, 0x65, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x23, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67,
	0x2e, 0x76, 0x34, 0x2e, 0x42, 0x61, 0x6e, 0x6e, 0x65, 0x72, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65,
	0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52, 0x06, 0x62,
	0x61, 0x6e, 0x6e, 0x65, 0x72, 0x12, 0x3d, 0x0a, 0x04, 0x63, 0x68, 0x61, 0x74, 0x18, 0x03, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x21, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67,
	0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x43, 0x68, 0x61, 0x74, 0x43, 0x6f, 0x6d, 0x70, 0x6c,
	0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52, 0x04,
	0x63, 0x68, 0x61, 0x74, 0x12, 0x58, 0x0a, 0x0d, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x75, 0x72,
	0x61, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x2a, 0x2e, 0x65, 0x76,
	0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x43,
	0x6f, 0x6e, 0x66, 0x69, 0x67, 0x75, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x43, 0x6f, 0x6d, 0x70,
	0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52,
	0x0d, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x75, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x49,
	0x0a, 0x08, 0x63, 0x72, 0x69, 0x74, 0x65, 0x72, 0x69, 0x61, 0x18, 0x05, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x25, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67,
	0x2e, 0x76, 0x34, 0x2e, 0x43, 0x72, 0x69, 0x74, 0x65, 0x72, 0x69, 0x61, 0x43, 0x6f, 0x6d, 0x70,
	0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52,
	0x08, 0x63, 0x72, 0x69, 0x74, 0x65, 0x72, 0x69, 0x61, 0x12, 0x49, 0x0a, 0x08, 0x64, 0x6f, 0x63,
	0x75, 0x6d, 0x65, 0x6e, 0x74, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x25, 0x2e, 0x65, 0x76,
	0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x44,
	0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79,
	0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52, 0x08, 0x64, 0x6f, 0x63, 0x75,
	0x6d, 0x65, 0x6e, 0x74, 0x12, 0x40, 0x0a, 0x05, 0x65, 0x6d, 0x61, 0x69, 0x6c, 0x18, 0x07, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x22, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67,
	0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x45, 0x6d, 0x61, 0x69, 0x6c, 0x43, 0x6f, 0x6d, 0x70,
	0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52,
	0x05, 0x65, 0x6d, 0x61, 0x69, 0x6c, 0x12, 0x3d, 0x0a, 0x04, 0x66, 0x69, 0x6c, 0x65, 0x18, 0x08,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x21, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67,
	0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x46, 0x69, 0x6c, 0x65, 0x43, 0x6f, 0x6d, 0x70,
	0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52,
	0x04, 0x66, 0x69, 0x6c, 0x65, 0x12, 0x43, 0x0a, 0x06, 0x66, 0x6f, 0x6c, 0x64, 0x65, 0x72, 0x18,
	0x09, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x23, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f,
	0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x46, 0x6f, 0x6c, 0x64, 0x65, 0x72, 0x43,
	0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8,
	0x01, 0x01, 0x52, 0x06, 0x66, 0x6f, 0x6c, 0x64, 0x65, 0x72, 0x12, 0x40, 0x0a, 0x05, 0x67, 0x72,
	0x6f, 0x75, 0x70, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x22, 0x2e, 0x65, 0x76, 0x65, 0x6e,
	0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x47, 0x72, 0x6f,
	0x75, 0x70, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba,
	0x48, 0x03, 0xc8, 0x01, 0x01, 0x52, 0x05, 0x67, 0x72, 0x6f, 0x75, 0x70, 0x12, 0x4d, 0x0a, 0x0a,
	0x67, 0x72, 0x6f, 0x75, 0x70, 0x5f, 0x63, 0x68, 0x61, 0x74, 0x18, 0x0b, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x26, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67,
	0x2e, 0x76, 0x34, 0x2e, 0x47, 0x72, 0x6f, 0x75, 0x70, 0x43, 0x68, 0x61, 0x74, 0x43, 0x6f, 0x6d,
	0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01,
	0x52, 0x09, 0x67, 0x72, 0x6f, 0x75, 0x70, 0x43, 0x68, 0x61, 0x74, 0x12, 0x43, 0x0a, 0x06, 0x6f,
	0x62, 0x6a, 0x65, 0x63, 0x74, 0x18, 0x0c, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x23, 0x2e, 0x65, 0x76,
	0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x4f,
	0x62, 0x6a, 0x65, 0x63, 0x74, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65,
	0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52, 0x06, 0x6f, 0x62, 0x6a, 0x65, 0x63, 0x74,
	0x12, 0x59, 0x0a, 0x0e, 0x73, 0x65, 0x61, 0x72, 0x63, 0x68, 0x5f, 0x72, 0x65, 0x73, 0x75, 0x6c,
	0x74, 0x73, 0x18, 0x0d, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x2a, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74,
	0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x53, 0x65, 0x61, 0x72,
	0x63, 0x68, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x73, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78,
	0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52, 0x0d, 0x73, 0x65,
	0x61, 0x72, 0x63, 0x68, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x73, 0x12, 0x49, 0x0a, 0x08, 0x73,
	0x68, 0x6f, 0x72, 0x74, 0x63, 0x75, 0x74, 0x18, 0x0e, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x25, 0x2e,
	0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34,
	0x2e, 0x53, 0x68, 0x6f, 0x72, 0x74, 0x63, 0x75, 0x74, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78,
	0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52, 0x08, 0x73, 0x68,
	0x6f, 0x72, 0x74, 0x63, 0x75, 0x74, 0x12, 0x3d, 0x0a, 0x04, 0x75, 0x73, 0x65, 0x72, 0x18, 0x0f,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x21, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67,
	0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x43, 0x6f, 0x6d, 0x70,
	0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52,
	0x04, 0x75, 0x73, 0x65, 0x72, 0x12, 0x5c, 0x0a, 0x0f, 0x76, 0x69, 0x72, 0x74, 0x75, 0x61, 0x6c,
	0x5f, 0x73, 0x65, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x18, 0x10, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x2b,
	0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76,
	0x34, 0x2e, 0x56, 0x69, 0x72, 0x74, 0x75, 0x61, 0x6c, 0x53, 0x65, 0x73, 0x73, 0x69, 0x6f, 0x6e,
	0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03,
	0xc8, 0x01, 0x01, 0x52, 0x0e, 0x76, 0x69, 0x72, 0x74, 0x75, 0x61, 0x6c, 0x53, 0x65, 0x73, 0x73,
	0x69, 0x6f, 0x6e, 0x12, 0x3d, 0x0a, 0x04, 0x76, 0x6f, 0x69, 0x70, 0x18, 0x11, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x21, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e,
	0x67, 0x2e, 0x76, 0x34, 0x2e, 0x56, 0x6f, 0x69, 0x70, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78,
	0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52, 0x04, 0x76, 0x6f,
	0x69, 0x70, 0x12, 0x49, 0x0a, 0x08, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x18, 0x12,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x25, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67,
	0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65,
	0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03,
	0xc8, 0x01, 0x01, 0x52, 0x08, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x42, 0xda, 0x01,
	0x0a, 0x1c, 0x75, 0x6b, 0x2e, 0x67, 0x6f, 0x76, 0x2e, 0x67, 0x63, 0x68, 0x71, 0x2e, 0x65, 0x76,
	0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x42, 0x16,
	0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70,
	0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x45, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62,
	0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x67, 0x63, 0x68, 0x71, 0x2f, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x2d,
	0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2d, 0x73, 0x63, 0x68, 0x65, 0x6d, 0x61, 0x2f, 0x65,
	0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x3b,
	0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x76, 0x34, 0xa2,
	0x02, 0x03, 0x45, 0x58, 0x58, 0xaa, 0x02, 0x0f, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x4c, 0x6f, 0x67,
	0x67, 0x69, 0x6e, 0x67, 0x2e, 0x56, 0x34, 0xca, 0x02, 0x0f, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x4c,
	0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x5c, 0x56, 0x34, 0xe2, 0x02, 0x1b, 0x45, 0x76, 0x65, 0x6e,
	0x74, 0x4c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x5c, 0x56, 0x34, 0x5c, 0x47, 0x50, 0x42, 0x4d,
	0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0xea, 0x02, 0x10, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x4c,
	0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x3a, 0x3a, 0x56, 0x34, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x33,
}

var (
	file_event_logging_v4_create_complex_type_proto_rawDescOnce sync.Once
	file_event_logging_v4_create_complex_type_proto_rawDescData = file_event_logging_v4_create_complex_type_proto_rawDesc
)

func file_event_logging_v4_create_complex_type_proto_rawDescGZIP() []byte {
	file_event_logging_v4_create_complex_type_proto_rawDescOnce.Do(func() {
		file_event_logging_v4_create_complex_type_proto_rawDescData = protoimpl.X.CompressGZIP(file_event_logging_v4_create_complex_type_proto_rawDescData)
	})
	return file_event_logging_v4_create_complex_type_proto_rawDescData
}

var file_event_logging_v4_create_complex_type_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_event_logging_v4_create_complex_type_proto_goTypes = []interface{}{
	(*CreateComplexType)(nil),                                // 0: event_logging.v4.CreateComplexType
	(*CreateComplexType_ChoiceWrapperCreateComplexType)(nil), // 1: event_logging.v4.CreateComplexType.ChoiceWrapperCreateComplexType
	(*OutcomeComplexType)(nil),                               // 2: event_logging.v4.OutcomeComplexType
	(*DataComplexType)(nil),                                  // 3: event_logging.v4.DataComplexType
	(*AssociationComplexType)(nil),                           // 4: event_logging.v4.AssociationComplexType
	(*BannerComplexType)(nil),                                // 5: event_logging.v4.BannerComplexType
	(*ChatComplexType)(nil),                                  // 6: event_logging.v4.ChatComplexType
	(*ConfigurationComplexType)(nil),                         // 7: event_logging.v4.ConfigurationComplexType
	(*CriteriaComplexType)(nil),                              // 8: event_logging.v4.CriteriaComplexType
	(*DocumentComplexType)(nil),                              // 9: event_logging.v4.DocumentComplexType
	(*EmailComplexType)(nil),                                 // 10: event_logging.v4.EmailComplexType
	(*FileComplexType)(nil),                                  // 11: event_logging.v4.FileComplexType
	(*FolderComplexType)(nil),                                // 12: event_logging.v4.FolderComplexType
	(*GroupComplexType)(nil),                                 // 13: event_logging.v4.GroupComplexType
	(*GroupChatComplexType)(nil),                             // 14: event_logging.v4.GroupChatComplexType
	(*ObjectComplexType)(nil),                                // 15: event_logging.v4.ObjectComplexType
	(*SearchResultsComplexType)(nil),                         // 16: event_logging.v4.SearchResultsComplexType
	(*ShortcutComplexType)(nil),                              // 17: event_logging.v4.ShortcutComplexType
	(*UserComplexType)(nil),                                  // 18: event_logging.v4.UserComplexType
	(*VirtualSessionComplexType)(nil),                        // 19: event_logging.v4.VirtualSessionComplexType
	(*VoipComplexType)(nil),                                  // 20: event_logging.v4.VoipComplexType
	(*ResourceComplexType)(nil),                              // 21: event_logging.v4.ResourceComplexType
}
var file_event_logging_v4_create_complex_type_proto_depIdxs = []int32{
	1,  // 0: event_logging.v4.CreateComplexType.choice_wrapper:type_name -> event_logging.v4.CreateComplexType.ChoiceWrapperCreateComplexType
	2,  // 1: event_logging.v4.CreateComplexType.outcome:type_name -> event_logging.v4.OutcomeComplexType
	3,  // 2: event_logging.v4.CreateComplexType.data:type_name -> event_logging.v4.DataComplexType
	4,  // 3: event_logging.v4.CreateComplexType.ChoiceWrapperCreateComplexType.association:type_name -> event_logging.v4.AssociationComplexType
	5,  // 4: event_logging.v4.CreateComplexType.ChoiceWrapperCreateComplexType.banner:type_name -> event_logging.v4.BannerComplexType
	6,  // 5: event_logging.v4.CreateComplexType.ChoiceWrapperCreateComplexType.chat:type_name -> event_logging.v4.ChatComplexType
	7,  // 6: event_logging.v4.CreateComplexType.ChoiceWrapperCreateComplexType.configuration:type_name -> event_logging.v4.ConfigurationComplexType
	8,  // 7: event_logging.v4.CreateComplexType.ChoiceWrapperCreateComplexType.criteria:type_name -> event_logging.v4.CriteriaComplexType
	9,  // 8: event_logging.v4.CreateComplexType.ChoiceWrapperCreateComplexType.document:type_name -> event_logging.v4.DocumentComplexType
	10, // 9: event_logging.v4.CreateComplexType.ChoiceWrapperCreateComplexType.email:type_name -> event_logging.v4.EmailComplexType
	11, // 10: event_logging.v4.CreateComplexType.ChoiceWrapperCreateComplexType.file:type_name -> event_logging.v4.FileComplexType
	12, // 11: event_logging.v4.CreateComplexType.ChoiceWrapperCreateComplexType.folder:type_name -> event_logging.v4.FolderComplexType
	13, // 12: event_logging.v4.CreateComplexType.ChoiceWrapperCreateComplexType.group:type_name -> event_logging.v4.GroupComplexType
	14, // 13: event_logging.v4.CreateComplexType.ChoiceWrapperCreateComplexType.group_chat:type_name -> event_logging.v4.GroupChatComplexType
	15, // 14: event_logging.v4.CreateComplexType.ChoiceWrapperCreateComplexType.object:type_name -> event_logging.v4.ObjectComplexType
	16, // 15: event_logging.v4.CreateComplexType.ChoiceWrapperCreateComplexType.search_results:type_name -> event_logging.v4.SearchResultsComplexType
	17, // 16: event_logging.v4.CreateComplexType.ChoiceWrapperCreateComplexType.shortcut:type_name -> event_logging.v4.ShortcutComplexType
	18, // 17: event_logging.v4.CreateComplexType.ChoiceWrapperCreateComplexType.user:type_name -> event_logging.v4.UserComplexType
	19, // 18: event_logging.v4.CreateComplexType.ChoiceWrapperCreateComplexType.virtual_session:type_name -> event_logging.v4.VirtualSessionComplexType
	20, // 19: event_logging.v4.CreateComplexType.ChoiceWrapperCreateComplexType.voip:type_name -> event_logging.v4.VoipComplexType
	21, // 20: event_logging.v4.CreateComplexType.ChoiceWrapperCreateComplexType.resource:type_name -> event_logging.v4.ResourceComplexType
	21, // [21:21] is the sub-list for method output_type
	21, // [21:21] is the sub-list for method input_type
	21, // [21:21] is the sub-list for extension type_name
	21, // [21:21] is the sub-list for extension extendee
	0,  // [0:21] is the sub-list for field type_name
}

func init() { file_event_logging_v4_create_complex_type_proto_init() }
func file_event_logging_v4_create_complex_type_proto_init() {
	if File_event_logging_v4_create_complex_type_proto != nil {
		return
	}
	file_event_logging_v4_banner_complex_type_proto_init()
	file_event_logging_v4_chat_complex_type_proto_init()
	file_event_logging_v4_configuration_complex_type_proto_init()
	file_event_logging_v4_data_complex_type_proto_init()
	file_event_logging_v4_document_complex_type_proto_init()
	file_event_logging_v4_email_complex_type_proto_init()
	file_event_logging_v4_file_complex_type_proto_init()
	file_event_logging_v4_folder_complex_type_proto_init()
	file_event_logging_v4_group_chat_complex_type_proto_init()
	file_event_logging_v4_multi_object_complex_type_proto_init()
	file_event_logging_v4_object_complex_type_proto_init()
	file_event_logging_v4_outcome_complex_type_proto_init()
	file_event_logging_v4_resource_complex_type_proto_init()
	file_event_logging_v4_shortcut_complex_type_proto_init()
	file_event_logging_v4_user_complex_type_proto_init()
	file_event_logging_v4_virtual_session_complex_type_proto_init()
	file_event_logging_v4_voip_complex_type_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_event_logging_v4_create_complex_type_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateComplexType); i {
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
		file_event_logging_v4_create_complex_type_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateComplexType_ChoiceWrapperCreateComplexType); i {
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
			RawDescriptor: file_event_logging_v4_create_complex_type_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_event_logging_v4_create_complex_type_proto_goTypes,
		DependencyIndexes: file_event_logging_v4_create_complex_type_proto_depIdxs,
		MessageInfos:      file_event_logging_v4_create_complex_type_proto_msgTypes,
	}.Build()
	File_event_logging_v4_create_complex_type_proto = out.File
	file_event_logging_v4_create_complex_type_proto_rawDesc = nil
	file_event_logging_v4_create_complex_type_proto_goTypes = nil
	file_event_logging_v4_create_complex_type_proto_depIdxs = nil
}
