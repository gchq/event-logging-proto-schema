// event_logging/v4/event_logging.proto at 0:0

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.33.0
// 	protoc        (unknown)
// source: event_logging/v4/event_logging.proto

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

// The root element that contains multiple Event elements.
type EventsType struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The version of the schema that this document conforms to.
	Version VersionSimpleType `protobuf:"varint,1,opt,name=version,proto3,enum=event_logging.v4.VersionSimpleType" json:"version,omitempty"`
	// This element contains data relating to the sharing of a set of events between different systems or organisations. The data contained within this element will confirm to a specification defined outside of this schema.
	SharingData *AnyContentComplexType `protobuf:"bytes,2,opt,name=sharing_data,json=sharingData,proto3" json:"sharing_data,omitempty"`
	// A single event that has occurred and been recorded.
	Event []*EventsType_EventType `protobuf:"bytes,3,rep,name=event,proto3" json:"event,omitempty"`
}

func (x *EventsType) Reset() {
	*x = EventsType{}
	if protoimpl.UnsafeEnabled {
		mi := &file_event_logging_v4_event_logging_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *EventsType) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*EventsType) ProtoMessage() {}

func (x *EventsType) ProtoReflect() protoreflect.Message {
	mi := &file_event_logging_v4_event_logging_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use EventsType.ProtoReflect.Descriptor instead.
func (*EventsType) Descriptor() ([]byte, []int) {
	return file_event_logging_v4_event_logging_proto_rawDescGZIP(), []int{0}
}

func (x *EventsType) GetVersion() VersionSimpleType {
	if x != nil {
		return x.Version
	}
	return VersionSimpleType_VERSION_SIMPLE_TYPE_UNSPECIFIED
}

func (x *EventsType) GetSharingData() *AnyContentComplexType {
	if x != nil {
		return x.SharingData
	}
	return nil
}

func (x *EventsType) GetEvent() []*EventsType_EventType {
	if x != nil {
		return x.Event
	}
	return nil
}

// A single event that has occurred and been recorded.
type EventsType_EventType struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// This element can be used to supply any metadata relating to the event as long as it conforms to an allowed format/specification (defined outside this XML Schema).
	Meta []*AnyContentComplexType `protobuf:"bytes,1,rep,name=meta,proto3" json:"meta,omitempty"`
	// The classification for the event.
	Classification *ClassificationComplexType `protobuf:"bytes,2,opt,name=classification,proto3" json:"classification,omitempty"`
	// This element contains data relating to the sharing of an event between different systems or organisations. The data contained within this element will confirm to a specification defined outside of this schema.
	SharingData *AnyContentComplexType `protobuf:"bytes,3,opt,name=sharing_data,json=sharingData,proto3" json:"sharing_data,omitempty"`
	// This element contains information about the time the event was created.
	EventTime *EventTimeComplexType `protobuf:"bytes,4,opt,name=event_time,json=eventTime,proto3" json:"event_time,omitempty"`
	// This element details where the event came from, i.e. what generator created the event and on what device.
	EventSource *EventSourceComplexType `protobuf:"bytes,5,opt,name=event_source,json=eventSource,proto3" json:"event_source,omitempty"`
	// This element describes the details of what happened in the event: the type of the event, why it happened and the event action.
	EventDetail *EventDetailComplexType `protobuf:"bytes,6,opt,name=event_detail,json=eventDetail,proto3" json:"event_detail,omitempty"`
	// This element can be used to create relationships between different events, i.e. where one event is the child of another.
	EventChain *EventChainComplexType `protobuf:"bytes,7,opt,name=event_chain,json=eventChain,proto3" json:"event_chain,omitempty"`
	// Any other event data that does not fit into a schema element but may be useful for the purpose of audit. Can also be used for appending data about the event after it has been received or processed, e.g. for recording details relating to the processing of the event such as the feed name.
	Data []*DataComplexType `protobuf:"bytes,8,rep,name=data,proto3" json:"data,omitempty"`
}

func (x *EventsType_EventType) Reset() {
	*x = EventsType_EventType{}
	if protoimpl.UnsafeEnabled {
		mi := &file_event_logging_v4_event_logging_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *EventsType_EventType) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*EventsType_EventType) ProtoMessage() {}

func (x *EventsType_EventType) ProtoReflect() protoreflect.Message {
	mi := &file_event_logging_v4_event_logging_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use EventsType_EventType.ProtoReflect.Descriptor instead.
func (*EventsType_EventType) Descriptor() ([]byte, []int) {
	return file_event_logging_v4_event_logging_proto_rawDescGZIP(), []int{0, 0}
}

func (x *EventsType_EventType) GetMeta() []*AnyContentComplexType {
	if x != nil {
		return x.Meta
	}
	return nil
}

func (x *EventsType_EventType) GetClassification() *ClassificationComplexType {
	if x != nil {
		return x.Classification
	}
	return nil
}

func (x *EventsType_EventType) GetSharingData() *AnyContentComplexType {
	if x != nil {
		return x.SharingData
	}
	return nil
}

func (x *EventsType_EventType) GetEventTime() *EventTimeComplexType {
	if x != nil {
		return x.EventTime
	}
	return nil
}

func (x *EventsType_EventType) GetEventSource() *EventSourceComplexType {
	if x != nil {
		return x.EventSource
	}
	return nil
}

func (x *EventsType_EventType) GetEventDetail() *EventDetailComplexType {
	if x != nil {
		return x.EventDetail
	}
	return nil
}

func (x *EventsType_EventType) GetEventChain() *EventChainComplexType {
	if x != nil {
		return x.EventChain
	}
	return nil
}

func (x *EventsType_EventType) GetData() []*DataComplexType {
	if x != nil {
		return x.Data
	}
	return nil
}

var File_event_logging_v4_event_logging_proto protoreflect.FileDescriptor

var file_event_logging_v4_event_logging_proto_rawDesc = []byte{
	0x0a, 0x24, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f,
	0x76, 0x34, 0x2f, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x10, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f,
	0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x1a, 0x2f, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f,
	0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x61, 0x6e, 0x79, 0x5f, 0x63,
	0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74,
	0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x32, 0x65, 0x76, 0x65, 0x6e, 0x74,
	0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x63, 0x6c, 0x61, 0x73,
	0x73, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c,
	0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x28, 0x65,
	0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f,
	0x64, 0x61, 0x74, 0x61, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70,
	0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2f, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c,
	0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f,
	0x63, 0x68, 0x61, 0x69, 0x6e, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79,
	0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x30, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f,
	0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x65, 0x76, 0x65, 0x6e, 0x74,
	0x5f, 0x64, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f,
	0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x30, 0x65, 0x76, 0x65, 0x6e,
	0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x65, 0x76, 0x65,
	0x6e, 0x74, 0x5f, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65,
	0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2e, 0x65, 0x76,
	0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x65,
	0x76, 0x65, 0x6e, 0x74, 0x5f, 0x74, 0x69, 0x6d, 0x65, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65,
	0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2a, 0x65, 0x76,
	0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x76,
	0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x5f, 0x73, 0x69, 0x6d, 0x70, 0x6c, 0x65, 0x5f, 0x74, 0x79,
	0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1b, 0x62, 0x75, 0x66, 0x2f, 0x76, 0x61,
	0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xe3, 0x06, 0x0a, 0x0a, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x73,
	0x54, 0x79, 0x70, 0x65, 0x12, 0x47, 0x0a, 0x07, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x23, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f,
	0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e,
	0x53, 0x69, 0x6d, 0x70, 0x6c, 0x65, 0x54, 0x79, 0x70, 0x65, 0x42, 0x08, 0xba, 0x48, 0x05, 0x82,
	0x01, 0x02, 0x10, 0x01, 0x52, 0x07, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x4a, 0x0a,
	0x0c, 0x73, 0x68, 0x61, 0x72, 0x69, 0x6e, 0x67, 0x5f, 0x64, 0x61, 0x74, 0x61, 0x18, 0x02, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x27, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67,
	0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x41, 0x6e, 0x79, 0x43, 0x6f, 0x6e, 0x74, 0x65, 0x6e,
	0x74, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x52, 0x0b, 0x73, 0x68,
	0x61, 0x72, 0x69, 0x6e, 0x67, 0x44, 0x61, 0x74, 0x61, 0x12, 0x46, 0x0a, 0x05, 0x65, 0x76, 0x65,
	0x6e, 0x74, 0x18, 0x03, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x26, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74,
	0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x45, 0x76, 0x65, 0x6e,
	0x74, 0x73, 0x54, 0x79, 0x70, 0x65, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x54, 0x79, 0x70, 0x65,
	0x42, 0x08, 0xba, 0x48, 0x05, 0x92, 0x01, 0x02, 0x08, 0x00, 0x52, 0x05, 0x65, 0x76, 0x65, 0x6e,
	0x74, 0x1a, 0xf7, 0x04, 0x0a, 0x09, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x54, 0x79, 0x70, 0x65, 0x12,
	0x45, 0x0a, 0x04, 0x6d, 0x65, 0x74, 0x61, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x27, 0x2e,
	0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34,
	0x2e, 0x41, 0x6e, 0x79, 0x43, 0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x43, 0x6f, 0x6d, 0x70, 0x6c,
	0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x08, 0xba, 0x48, 0x05, 0x92, 0x01, 0x02, 0x08, 0x00,
	0x52, 0x04, 0x6d, 0x65, 0x74, 0x61, 0x12, 0x53, 0x0a, 0x0e, 0x63, 0x6c, 0x61, 0x73, 0x73, 0x69,
	0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x2b,
	0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76,
	0x34, 0x2e, 0x43, 0x6c, 0x61, 0x73, 0x73, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x52, 0x0e, 0x63, 0x6c, 0x61,
	0x73, 0x73, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x4a, 0x0a, 0x0c, 0x73,
	0x68, 0x61, 0x72, 0x69, 0x6e, 0x67, 0x5f, 0x64, 0x61, 0x74, 0x61, 0x18, 0x03, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x27, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e,
	0x67, 0x2e, 0x76, 0x34, 0x2e, 0x41, 0x6e, 0x79, 0x43, 0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x43,
	0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x52, 0x0b, 0x73, 0x68, 0x61, 0x72,
	0x69, 0x6e, 0x67, 0x44, 0x61, 0x74, 0x61, 0x12, 0x4d, 0x0a, 0x0a, 0x65, 0x76, 0x65, 0x6e, 0x74,
	0x5f, 0x74, 0x69, 0x6d, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x26, 0x2e, 0x65, 0x76,
	0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x45,
	0x76, 0x65, 0x6e, 0x74, 0x54, 0x69, 0x6d, 0x65, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54,
	0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52, 0x09, 0x65, 0x76, 0x65,
	0x6e, 0x74, 0x54, 0x69, 0x6d, 0x65, 0x12, 0x53, 0x0a, 0x0c, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f,
	0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x18, 0x05, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x28, 0x2e, 0x65,
	0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e,
	0x45, 0x76, 0x65, 0x6e, 0x74, 0x53, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x43, 0x6f, 0x6d, 0x70, 0x6c,
	0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52, 0x0b,
	0x65, 0x76, 0x65, 0x6e, 0x74, 0x53, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x12, 0x53, 0x0a, 0x0c, 0x65,
	0x76, 0x65, 0x6e, 0x74, 0x5f, 0x64, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x18, 0x06, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x28, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e,
	0x67, 0x2e, 0x76, 0x34, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x44, 0x65, 0x74, 0x61, 0x69, 0x6c,
	0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03,
	0xc8, 0x01, 0x01, 0x52, 0x0b, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x44, 0x65, 0x74, 0x61, 0x69, 0x6c,
	0x12, 0x48, 0x0a, 0x0b, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x63, 0x68, 0x61, 0x69, 0x6e, 0x18,
	0x07, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x27, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f,
	0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x43, 0x68,
	0x61, 0x69, 0x6e, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x52, 0x0a,
	0x65, 0x76, 0x65, 0x6e, 0x74, 0x43, 0x68, 0x61, 0x69, 0x6e, 0x12, 0x3f, 0x0a, 0x04, 0x64, 0x61,
	0x74, 0x61, 0x18, 0x08, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x21, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74,
	0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x44, 0x61, 0x74, 0x61,
	0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x08, 0xba, 0x48, 0x05,
	0x92, 0x01, 0x02, 0x08, 0x00, 0x52, 0x04, 0x64, 0x61, 0x74, 0x61, 0x42, 0xd5, 0x01, 0x0a, 0x1c,
	0x75, 0x6b, 0x2e, 0x67, 0x6f, 0x76, 0x2e, 0x67, 0x63, 0x68, 0x71, 0x2e, 0x65, 0x76, 0x65, 0x6e,
	0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x42, 0x11, 0x45, 0x76,
	0x65, 0x6e, 0x74, 0x4c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50,
	0x01, 0x5a, 0x45, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x67, 0x63,
	0x68, 0x71, 0x2f, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x2d, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67,
	0x2d, 0x73, 0x63, 0x68, 0x65, 0x6d, 0x61, 0x2f, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f,
	0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x3b, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c,
	0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x76, 0x34, 0xa2, 0x02, 0x03, 0x45, 0x58, 0x58, 0xaa, 0x02,
	0x0f, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x4c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x56, 0x34,
	0xca, 0x02, 0x0f, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x4c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x5c,
	0x56, 0x34, 0xe2, 0x02, 0x1b, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x4c, 0x6f, 0x67, 0x67, 0x69, 0x6e,
	0x67, 0x5c, 0x56, 0x34, 0x5c, 0x47, 0x50, 0x42, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61,
	0xea, 0x02, 0x10, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x4c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x3a,
	0x3a, 0x56, 0x34, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_event_logging_v4_event_logging_proto_rawDescOnce sync.Once
	file_event_logging_v4_event_logging_proto_rawDescData = file_event_logging_v4_event_logging_proto_rawDesc
)

func file_event_logging_v4_event_logging_proto_rawDescGZIP() []byte {
	file_event_logging_v4_event_logging_proto_rawDescOnce.Do(func() {
		file_event_logging_v4_event_logging_proto_rawDescData = protoimpl.X.CompressGZIP(file_event_logging_v4_event_logging_proto_rawDescData)
	})
	return file_event_logging_v4_event_logging_proto_rawDescData
}

var file_event_logging_v4_event_logging_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_event_logging_v4_event_logging_proto_goTypes = []interface{}{
	(*EventsType)(nil),                // 0: event_logging.v4.EventsType
	(*EventsType_EventType)(nil),      // 1: event_logging.v4.EventsType.EventType
	(VersionSimpleType)(0),            // 2: event_logging.v4.VersionSimpleType
	(*AnyContentComplexType)(nil),     // 3: event_logging.v4.AnyContentComplexType
	(*ClassificationComplexType)(nil), // 4: event_logging.v4.ClassificationComplexType
	(*EventTimeComplexType)(nil),      // 5: event_logging.v4.EventTimeComplexType
	(*EventSourceComplexType)(nil),    // 6: event_logging.v4.EventSourceComplexType
	(*EventDetailComplexType)(nil),    // 7: event_logging.v4.EventDetailComplexType
	(*EventChainComplexType)(nil),     // 8: event_logging.v4.EventChainComplexType
	(*DataComplexType)(nil),           // 9: event_logging.v4.DataComplexType
}
var file_event_logging_v4_event_logging_proto_depIdxs = []int32{
	2,  // 0: event_logging.v4.EventsType.version:type_name -> event_logging.v4.VersionSimpleType
	3,  // 1: event_logging.v4.EventsType.sharing_data:type_name -> event_logging.v4.AnyContentComplexType
	1,  // 2: event_logging.v4.EventsType.event:type_name -> event_logging.v4.EventsType.EventType
	3,  // 3: event_logging.v4.EventsType.EventType.meta:type_name -> event_logging.v4.AnyContentComplexType
	4,  // 4: event_logging.v4.EventsType.EventType.classification:type_name -> event_logging.v4.ClassificationComplexType
	3,  // 5: event_logging.v4.EventsType.EventType.sharing_data:type_name -> event_logging.v4.AnyContentComplexType
	5,  // 6: event_logging.v4.EventsType.EventType.event_time:type_name -> event_logging.v4.EventTimeComplexType
	6,  // 7: event_logging.v4.EventsType.EventType.event_source:type_name -> event_logging.v4.EventSourceComplexType
	7,  // 8: event_logging.v4.EventsType.EventType.event_detail:type_name -> event_logging.v4.EventDetailComplexType
	8,  // 9: event_logging.v4.EventsType.EventType.event_chain:type_name -> event_logging.v4.EventChainComplexType
	9,  // 10: event_logging.v4.EventsType.EventType.data:type_name -> event_logging.v4.DataComplexType
	11, // [11:11] is the sub-list for method output_type
	11, // [11:11] is the sub-list for method input_type
	11, // [11:11] is the sub-list for extension type_name
	11, // [11:11] is the sub-list for extension extendee
	0,  // [0:11] is the sub-list for field type_name
}

func init() { file_event_logging_v4_event_logging_proto_init() }
func file_event_logging_v4_event_logging_proto_init() {
	if File_event_logging_v4_event_logging_proto != nil {
		return
	}
	file_event_logging_v4_any_content_complex_type_proto_init()
	file_event_logging_v4_classification_complex_type_proto_init()
	file_event_logging_v4_data_complex_type_proto_init()
	file_event_logging_v4_event_chain_complex_type_proto_init()
	file_event_logging_v4_event_detail_complex_type_proto_init()
	file_event_logging_v4_event_source_complex_type_proto_init()
	file_event_logging_v4_event_time_complex_type_proto_init()
	file_event_logging_v4_version_simple_type_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_event_logging_v4_event_logging_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*EventsType); i {
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
		file_event_logging_v4_event_logging_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*EventsType_EventType); i {
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
			RawDescriptor: file_event_logging_v4_event_logging_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_event_logging_v4_event_logging_proto_goTypes,
		DependencyIndexes: file_event_logging_v4_event_logging_proto_depIdxs,
		MessageInfos:      file_event_logging_v4_event_logging_proto_msgTypes,
	}.Build()
	File_event_logging_v4_event_logging_proto = out.File
	file_event_logging_v4_event_logging_proto_rawDesc = nil
	file_event_logging_v4_event_logging_proto_goTypes = nil
	file_event_logging_v4_event_logging_proto_depIdxs = nil
}
