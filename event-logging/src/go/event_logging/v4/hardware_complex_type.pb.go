// event_logging/v4/hardware_complex_type.proto at 0:0

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.33.0
// 	protoc        (unknown)
// source: event_logging/v4/hardware_complex_type.proto

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

// Used to describe a hardware item that may be added or removed from a system.
type HardwareComplexType struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The type of hardware, e.g. hard disk drive.
	Type HardwareTypeSimpleType `protobuf:"varint,1,opt,name=type,proto3,enum=event_logging.v4.HardwareTypeSimpleType" json:"type,omitempty"`
	// A unique identifier for the piece of hardware, e.g. an asset number.
	Id string `protobuf:"bytes,2,opt,name=id,proto3" json:"id,omitempty"`
	// A friendly name for the hardware, e.g. a name that has been defined in an asset management or device monitoring system.
	Name string `protobuf:"bytes,3,opt,name=name,proto3" json:"name,omitempty"`
	// The model name as defined by the manufacturer.
	Model string `protobuf:"bytes,4,opt,name=model,proto3" json:"model,omitempty"`
	// The manufacturer of the piece of hardware.
	Manufacturer string `protobuf:"bytes,5,opt,name=manufacturer,proto3" json:"manufacturer,omitempty"`
	// The capacity of the device in bytes.
	Capacity uint32 `protobuf:"varint,6,opt,name=capacity,proto3" json:"capacity,omitempty"`
	// Any other event data that does not fit into a schema element but may be useful for the purpose of audit.
	Data []*DataComplexType `protobuf:"bytes,7,rep,name=data,proto3" json:"data,omitempty"`
}

func (x *HardwareComplexType) Reset() {
	*x = HardwareComplexType{}
	if protoimpl.UnsafeEnabled {
		mi := &file_event_logging_v4_hardware_complex_type_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *HardwareComplexType) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*HardwareComplexType) ProtoMessage() {}

func (x *HardwareComplexType) ProtoReflect() protoreflect.Message {
	mi := &file_event_logging_v4_hardware_complex_type_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use HardwareComplexType.ProtoReflect.Descriptor instead.
func (*HardwareComplexType) Descriptor() ([]byte, []int) {
	return file_event_logging_v4_hardware_complex_type_proto_rawDescGZIP(), []int{0}
}

func (x *HardwareComplexType) GetType() HardwareTypeSimpleType {
	if x != nil {
		return x.Type
	}
	return HardwareTypeSimpleType_HARDWARE_TYPE_SIMPLE_TYPE_UNSPECIFIED
}

func (x *HardwareComplexType) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *HardwareComplexType) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *HardwareComplexType) GetModel() string {
	if x != nil {
		return x.Model
	}
	return ""
}

func (x *HardwareComplexType) GetManufacturer() string {
	if x != nil {
		return x.Manufacturer
	}
	return ""
}

func (x *HardwareComplexType) GetCapacity() uint32 {
	if x != nil {
		return x.Capacity
	}
	return 0
}

func (x *HardwareComplexType) GetData() []*DataComplexType {
	if x != nil {
		return x.Data
	}
	return nil
}

var File_event_logging_v4_hardware_complex_type_proto protoreflect.FileDescriptor

var file_event_logging_v4_hardware_complex_type_proto_rawDesc = []byte{
	0x0a, 0x2c, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f,
	0x76, 0x34, 0x2f, 0x68, 0x61, 0x72, 0x64, 0x77, 0x61, 0x72, 0x65, 0x5f, 0x63, 0x6f, 0x6d, 0x70,
	0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x10,
	0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34,
	0x1a, 0x28, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f,
	0x76, 0x34, 0x2f, 0x64, 0x61, 0x74, 0x61, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f,
	0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x30, 0x65, 0x76, 0x65, 0x6e,
	0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x68, 0x61, 0x72,
	0x64, 0x77, 0x61, 0x72, 0x65, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x5f, 0x73, 0x69, 0x6d, 0x70, 0x6c,
	0x65, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1b, 0x62, 0x75,
	0x66, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64,
	0x61, 0x74, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x9f, 0x02, 0x0a, 0x13, 0x48, 0x61,
	0x72, 0x64, 0x77, 0x61, 0x72, 0x65, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70,
	0x65, 0x12, 0x44, 0x0a, 0x04, 0x74, 0x79, 0x70, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0e, 0x32,
	0x28, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e,
	0x76, 0x34, 0x2e, 0x48, 0x61, 0x72, 0x64, 0x77, 0x61, 0x72, 0x65, 0x54, 0x79, 0x70, 0x65, 0x53,
	0x69, 0x6d, 0x70, 0x6c, 0x65, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01,
	0x01, 0x52, 0x04, 0x74, 0x79, 0x70, 0x65, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x02, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18,
	0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x14, 0x0a, 0x05, 0x6d,
	0x6f, 0x64, 0x65, 0x6c, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x6d, 0x6f, 0x64, 0x65,
	0x6c, 0x12, 0x22, 0x0a, 0x0c, 0x6d, 0x61, 0x6e, 0x75, 0x66, 0x61, 0x63, 0x74, 0x75, 0x72, 0x65,
	0x72, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0c, 0x6d, 0x61, 0x6e, 0x75, 0x66, 0x61, 0x63,
	0x74, 0x75, 0x72, 0x65, 0x72, 0x12, 0x23, 0x0a, 0x08, 0x63, 0x61, 0x70, 0x61, 0x63, 0x69, 0x74,
	0x79, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0d, 0x42, 0x07, 0xba, 0x48, 0x04, 0x2a, 0x02, 0x20, 0x00,
	0x52, 0x08, 0x63, 0x61, 0x70, 0x61, 0x63, 0x69, 0x74, 0x79, 0x12, 0x3f, 0x0a, 0x04, 0x64, 0x61,
	0x74, 0x61, 0x18, 0x07, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x21, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74,
	0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x44, 0x61, 0x74, 0x61,
	0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x08, 0xba, 0x48, 0x05,
	0x92, 0x01, 0x02, 0x08, 0x00, 0x52, 0x04, 0x64, 0x61, 0x74, 0x61, 0x42, 0xdc, 0x01, 0x0a, 0x1c,
	0x75, 0x6b, 0x2e, 0x67, 0x6f, 0x76, 0x2e, 0x67, 0x63, 0x68, 0x71, 0x2e, 0x65, 0x76, 0x65, 0x6e,
	0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x42, 0x18, 0x48, 0x61,
	0x72, 0x64, 0x77, 0x61, 0x72, 0x65, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70,
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
	file_event_logging_v4_hardware_complex_type_proto_rawDescOnce sync.Once
	file_event_logging_v4_hardware_complex_type_proto_rawDescData = file_event_logging_v4_hardware_complex_type_proto_rawDesc
)

func file_event_logging_v4_hardware_complex_type_proto_rawDescGZIP() []byte {
	file_event_logging_v4_hardware_complex_type_proto_rawDescOnce.Do(func() {
		file_event_logging_v4_hardware_complex_type_proto_rawDescData = protoimpl.X.CompressGZIP(file_event_logging_v4_hardware_complex_type_proto_rawDescData)
	})
	return file_event_logging_v4_hardware_complex_type_proto_rawDescData
}

var file_event_logging_v4_hardware_complex_type_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_event_logging_v4_hardware_complex_type_proto_goTypes = []interface{}{
	(*HardwareComplexType)(nil), // 0: event_logging.v4.HardwareComplexType
	(HardwareTypeSimpleType)(0), // 1: event_logging.v4.HardwareTypeSimpleType
	(*DataComplexType)(nil),     // 2: event_logging.v4.DataComplexType
}
var file_event_logging_v4_hardware_complex_type_proto_depIdxs = []int32{
	1, // 0: event_logging.v4.HardwareComplexType.type:type_name -> event_logging.v4.HardwareTypeSimpleType
	2, // 1: event_logging.v4.HardwareComplexType.data:type_name -> event_logging.v4.DataComplexType
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_event_logging_v4_hardware_complex_type_proto_init() }
func file_event_logging_v4_hardware_complex_type_proto_init() {
	if File_event_logging_v4_hardware_complex_type_proto != nil {
		return
	}
	file_event_logging_v4_data_complex_type_proto_init()
	file_event_logging_v4_hardware_type_simple_type_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_event_logging_v4_hardware_complex_type_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*HardwareComplexType); i {
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
			RawDescriptor: file_event_logging_v4_hardware_complex_type_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_event_logging_v4_hardware_complex_type_proto_goTypes,
		DependencyIndexes: file_event_logging_v4_hardware_complex_type_proto_depIdxs,
		MessageInfos:      file_event_logging_v4_hardware_complex_type_proto_msgTypes,
	}.Build()
	File_event_logging_v4_hardware_complex_type_proto = out.File
	file_event_logging_v4_hardware_complex_type_proto_rawDesc = nil
	file_event_logging_v4_hardware_complex_type_proto_goTypes = nil
	file_event_logging_v4_hardware_complex_type_proto_depIdxs = nil
}
