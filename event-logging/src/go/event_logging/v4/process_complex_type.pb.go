// event_logging/v4/process_complex_type.proto at 0:0

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.33.0
// 	protoc        (unknown)
// source: event_logging/v4/process_complex_type.proto

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

// Describes various actions such as the startup/shutdown/install of operating systems, services, applications. It also describes the execution of operating system commands, shell scripts and batch processes.
type ProcessComplexType struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The action that the process event is capturing, e.g. Startup, Shutdown.
	Action ProcessActionSimpleType `protobuf:"varint,1,opt,name=action,proto3,enum=event_logging.v4.ProcessActionSimpleType" json:"action,omitempty"`
	// The type of process, e.g. Application, OS, Service.
	Type ProcessTypeSimpleType `protobuf:"varint,2,opt,name=type,proto3,enum=event_logging.v4.ProcessTypeSimpleType" json:"type,omitempty"`
	// The name of the process.
	Command string `protobuf:"bytes,3,opt,name=command,proto3" json:"command,omitempty"`
	// The process command arguments/parameters.
	Arguments string `protobuf:"bytes,4,opt,name=arguments,proto3" json:"arguments,omitempty"`
	// The system identifier for the process.
	ProcessId string `protobuf:"bytes,5,opt,name=process_id,json=processId,proto3" json:"process_id,omitempty"`
	// The thread identifier for the process.
	ThreadId uint32 `protobuf:"varint,6,opt,name=thread_id,json=threadId,proto3" json:"thread_id,omitempty"`
	// The rule that was triggered when this process event happened.
	Rule string `protobuf:"bytes,7,opt,name=rule,proto3" json:"rule,omitempty"`
	// Any objects used as input to the process.
	Input *MultiObjectComplexType `protobuf:"bytes,8,opt,name=input,proto3" json:"input,omitempty"`
	// Any objects output by the process
	Output *MultiObjectComplexType `protobuf:"bytes,9,opt,name=output,proto3" json:"output,omitempty"`
	// Used to determine if the action was successful. If omitted it is assumed that the event was successful and was permitted.
	Outcome *OutcomeComplexType `protobuf:"bytes,10,opt,name=outcome,proto3" json:"outcome,omitempty"`
	// Any other event data that does not fit into a schema element but may be useful for the purpose of audit.
	Data []*DataComplexType `protobuf:"bytes,11,rep,name=data,proto3" json:"data,omitempty"`
}

func (x *ProcessComplexType) Reset() {
	*x = ProcessComplexType{}
	if protoimpl.UnsafeEnabled {
		mi := &file_event_logging_v4_process_complex_type_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ProcessComplexType) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ProcessComplexType) ProtoMessage() {}

func (x *ProcessComplexType) ProtoReflect() protoreflect.Message {
	mi := &file_event_logging_v4_process_complex_type_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ProcessComplexType.ProtoReflect.Descriptor instead.
func (*ProcessComplexType) Descriptor() ([]byte, []int) {
	return file_event_logging_v4_process_complex_type_proto_rawDescGZIP(), []int{0}
}

func (x *ProcessComplexType) GetAction() ProcessActionSimpleType {
	if x != nil {
		return x.Action
	}
	return ProcessActionSimpleType_PROCESS_ACTION_SIMPLE_TYPE_UNSPECIFIED
}

func (x *ProcessComplexType) GetType() ProcessTypeSimpleType {
	if x != nil {
		return x.Type
	}
	return ProcessTypeSimpleType_PROCESS_TYPE_SIMPLE_TYPE_UNSPECIFIED
}

func (x *ProcessComplexType) GetCommand() string {
	if x != nil {
		return x.Command
	}
	return ""
}

func (x *ProcessComplexType) GetArguments() string {
	if x != nil {
		return x.Arguments
	}
	return ""
}

func (x *ProcessComplexType) GetProcessId() string {
	if x != nil {
		return x.ProcessId
	}
	return ""
}

func (x *ProcessComplexType) GetThreadId() uint32 {
	if x != nil {
		return x.ThreadId
	}
	return 0
}

func (x *ProcessComplexType) GetRule() string {
	if x != nil {
		return x.Rule
	}
	return ""
}

func (x *ProcessComplexType) GetInput() *MultiObjectComplexType {
	if x != nil {
		return x.Input
	}
	return nil
}

func (x *ProcessComplexType) GetOutput() *MultiObjectComplexType {
	if x != nil {
		return x.Output
	}
	return nil
}

func (x *ProcessComplexType) GetOutcome() *OutcomeComplexType {
	if x != nil {
		return x.Outcome
	}
	return nil
}

func (x *ProcessComplexType) GetData() []*DataComplexType {
	if x != nil {
		return x.Data
	}
	return nil
}

var File_event_logging_v4_process_complex_type_proto protoreflect.FileDescriptor

var file_event_logging_v4_process_complex_type_proto_rawDesc = []byte{
	0x0a, 0x2b, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f,
	0x76, 0x34, 0x2f, 0x70, 0x72, 0x6f, 0x63, 0x65, 0x73, 0x73, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c,
	0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x10, 0x65,
	0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x1a,
	0x28, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76,
	0x34, 0x2f, 0x64, 0x61, 0x74, 0x61, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74,
	0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x30, 0x65, 0x76, 0x65, 0x6e, 0x74,
	0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x6d, 0x75, 0x6c, 0x74,
	0x69, 0x5f, 0x6f, 0x62, 0x6a, 0x65, 0x63, 0x74, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78,
	0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2b, 0x65, 0x76, 0x65,
	0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x6f, 0x75,
	0x74, 0x63, 0x6f, 0x6d, 0x65, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79,
	0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x31, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f,
	0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x70, 0x72, 0x6f, 0x63, 0x65,
	0x73, 0x73, 0x5f, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x73, 0x69, 0x6d, 0x70, 0x6c, 0x65,
	0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2f, 0x65, 0x76, 0x65,
	0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x70, 0x72,
	0x6f, 0x63, 0x65, 0x73, 0x73, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x5f, 0x73, 0x69, 0x6d, 0x70, 0x6c,
	0x65, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1b, 0x62, 0x75,
	0x66, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64,
	0x61, 0x74, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xc0, 0x04, 0x0a, 0x12, 0x50, 0x72,
	0x6f, 0x63, 0x65, 0x73, 0x73, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65,
	0x12, 0x49, 0x0a, 0x06, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0e,
	0x32, 0x29, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67,
	0x2e, 0x76, 0x34, 0x2e, 0x50, 0x72, 0x6f, 0x63, 0x65, 0x73, 0x73, 0x41, 0x63, 0x74, 0x69, 0x6f,
	0x6e, 0x53, 0x69, 0x6d, 0x70, 0x6c, 0x65, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03,
	0xc8, 0x01, 0x01, 0x52, 0x06, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x43, 0x0a, 0x04, 0x74,
	0x79, 0x70, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x27, 0x2e, 0x65, 0x76, 0x65, 0x6e,
	0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x50, 0x72, 0x6f,
	0x63, 0x65, 0x73, 0x73, 0x54, 0x79, 0x70, 0x65, 0x53, 0x69, 0x6d, 0x70, 0x6c, 0x65, 0x54, 0x79,
	0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52, 0x04, 0x74, 0x79, 0x70, 0x65,
	0x12, 0x20, 0x0a, 0x07, 0x63, 0x6f, 0x6d, 0x6d, 0x61, 0x6e, 0x64, 0x18, 0x03, 0x20, 0x01, 0x28,
	0x09, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52, 0x07, 0x63, 0x6f, 0x6d, 0x6d, 0x61,
	0x6e, 0x64, 0x12, 0x1c, 0x0a, 0x09, 0x61, 0x72, 0x67, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x73, 0x18,
	0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x61, 0x72, 0x67, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x73,
	0x12, 0x1d, 0x0a, 0x0a, 0x70, 0x72, 0x6f, 0x63, 0x65, 0x73, 0x73, 0x5f, 0x69, 0x64, 0x18, 0x05,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x70, 0x72, 0x6f, 0x63, 0x65, 0x73, 0x73, 0x49, 0x64, 0x12,
	0x24, 0x0a, 0x09, 0x74, 0x68, 0x72, 0x65, 0x61, 0x64, 0x5f, 0x69, 0x64, 0x18, 0x06, 0x20, 0x01,
	0x28, 0x0d, 0x42, 0x07, 0xba, 0x48, 0x04, 0x2a, 0x02, 0x20, 0x00, 0x52, 0x08, 0x74, 0x68, 0x72,
	0x65, 0x61, 0x64, 0x49, 0x64, 0x12, 0x12, 0x0a, 0x04, 0x72, 0x75, 0x6c, 0x65, 0x18, 0x07, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x04, 0x72, 0x75, 0x6c, 0x65, 0x12, 0x3e, 0x0a, 0x05, 0x69, 0x6e, 0x70,
	0x75, 0x74, 0x18, 0x08, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x28, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74,
	0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x4d, 0x75, 0x6c, 0x74,
	0x69, 0x4f, 0x62, 0x6a, 0x65, 0x63, 0x74, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79,
	0x70, 0x65, 0x52, 0x05, 0x69, 0x6e, 0x70, 0x75, 0x74, 0x12, 0x40, 0x0a, 0x06, 0x6f, 0x75, 0x74,
	0x70, 0x75, 0x74, 0x18, 0x09, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x28, 0x2e, 0x65, 0x76, 0x65, 0x6e,
	0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x4d, 0x75, 0x6c,
	0x74, 0x69, 0x4f, 0x62, 0x6a, 0x65, 0x63, 0x74, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54,
	0x79, 0x70, 0x65, 0x52, 0x06, 0x6f, 0x75, 0x74, 0x70, 0x75, 0x74, 0x12, 0x3e, 0x0a, 0x07, 0x6f,
	0x75, 0x74, 0x63, 0x6f, 0x6d, 0x65, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x24, 0x2e, 0x65,
	0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e,
	0x4f, 0x75, 0x74, 0x63, 0x6f, 0x6d, 0x65, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79,
	0x70, 0x65, 0x52, 0x07, 0x6f, 0x75, 0x74, 0x63, 0x6f, 0x6d, 0x65, 0x12, 0x3f, 0x0a, 0x04, 0x64,
	0x61, 0x74, 0x61, 0x18, 0x0b, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x21, 0x2e, 0x65, 0x76, 0x65, 0x6e,
	0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x44, 0x61, 0x74,
	0x61, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x08, 0xba, 0x48,
	0x05, 0x92, 0x01, 0x02, 0x08, 0x00, 0x52, 0x04, 0x64, 0x61, 0x74, 0x61, 0x42, 0xdb, 0x01, 0x0a,
	0x1c, 0x75, 0x6b, 0x2e, 0x67, 0x6f, 0x76, 0x2e, 0x67, 0x63, 0x68, 0x71, 0x2e, 0x65, 0x76, 0x65,
	0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x42, 0x17, 0x50,
	0x72, 0x6f, 0x63, 0x65, 0x73, 0x73, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70,
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
	file_event_logging_v4_process_complex_type_proto_rawDescOnce sync.Once
	file_event_logging_v4_process_complex_type_proto_rawDescData = file_event_logging_v4_process_complex_type_proto_rawDesc
)

func file_event_logging_v4_process_complex_type_proto_rawDescGZIP() []byte {
	file_event_logging_v4_process_complex_type_proto_rawDescOnce.Do(func() {
		file_event_logging_v4_process_complex_type_proto_rawDescData = protoimpl.X.CompressGZIP(file_event_logging_v4_process_complex_type_proto_rawDescData)
	})
	return file_event_logging_v4_process_complex_type_proto_rawDescData
}

var file_event_logging_v4_process_complex_type_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_event_logging_v4_process_complex_type_proto_goTypes = []interface{}{
	(*ProcessComplexType)(nil),     // 0: event_logging.v4.ProcessComplexType
	(ProcessActionSimpleType)(0),   // 1: event_logging.v4.ProcessActionSimpleType
	(ProcessTypeSimpleType)(0),     // 2: event_logging.v4.ProcessTypeSimpleType
	(*MultiObjectComplexType)(nil), // 3: event_logging.v4.MultiObjectComplexType
	(*OutcomeComplexType)(nil),     // 4: event_logging.v4.OutcomeComplexType
	(*DataComplexType)(nil),        // 5: event_logging.v4.DataComplexType
}
var file_event_logging_v4_process_complex_type_proto_depIdxs = []int32{
	1, // 0: event_logging.v4.ProcessComplexType.action:type_name -> event_logging.v4.ProcessActionSimpleType
	2, // 1: event_logging.v4.ProcessComplexType.type:type_name -> event_logging.v4.ProcessTypeSimpleType
	3, // 2: event_logging.v4.ProcessComplexType.input:type_name -> event_logging.v4.MultiObjectComplexType
	3, // 3: event_logging.v4.ProcessComplexType.output:type_name -> event_logging.v4.MultiObjectComplexType
	4, // 4: event_logging.v4.ProcessComplexType.outcome:type_name -> event_logging.v4.OutcomeComplexType
	5, // 5: event_logging.v4.ProcessComplexType.data:type_name -> event_logging.v4.DataComplexType
	6, // [6:6] is the sub-list for method output_type
	6, // [6:6] is the sub-list for method input_type
	6, // [6:6] is the sub-list for extension type_name
	6, // [6:6] is the sub-list for extension extendee
	0, // [0:6] is the sub-list for field type_name
}

func init() { file_event_logging_v4_process_complex_type_proto_init() }
func file_event_logging_v4_process_complex_type_proto_init() {
	if File_event_logging_v4_process_complex_type_proto != nil {
		return
	}
	file_event_logging_v4_data_complex_type_proto_init()
	file_event_logging_v4_multi_object_complex_type_proto_init()
	file_event_logging_v4_outcome_complex_type_proto_init()
	file_event_logging_v4_process_action_simple_type_proto_init()
	file_event_logging_v4_process_type_simple_type_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_event_logging_v4_process_complex_type_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ProcessComplexType); i {
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
			RawDescriptor: file_event_logging_v4_process_complex_type_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_event_logging_v4_process_complex_type_proto_goTypes,
		DependencyIndexes: file_event_logging_v4_process_complex_type_proto_depIdxs,
		MessageInfos:      file_event_logging_v4_process_complex_type_proto_msgTypes,
	}.Build()
	File_event_logging_v4_process_complex_type_proto = out.File
	file_event_logging_v4_process_complex_type_proto_rawDesc = nil
	file_event_logging_v4_process_complex_type_proto_goTypes = nil
	file_event_logging_v4_process_complex_type_proto_depIdxs = nil
}
