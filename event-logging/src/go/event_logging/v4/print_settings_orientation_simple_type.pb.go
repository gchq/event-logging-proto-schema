// event_logging/v4/print_settings_orientation_simple_type.proto at 0:0

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.33.0
// 	protoc        (unknown)
// source: event_logging/v4/print_settings_orientation_simple_type.proto

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

// The orientation types of a document when it is printed.
type PrintSettingsOrientationSimpleType int32

const (
	// Default
	PrintSettingsOrientationSimpleType_PRINT_SETTINGS_ORIENTATION_SIMPLE_TYPE_UNSPECIFIED PrintSettingsOrientationSimpleType = 0
	PrintSettingsOrientationSimpleType_PRINT_SETTINGS_ORIENTATION_SIMPLE_TYPE_PORTRAIT    PrintSettingsOrientationSimpleType = 1
	PrintSettingsOrientationSimpleType_PRINT_SETTINGS_ORIENTATION_SIMPLE_TYPE_LANDSCAPE   PrintSettingsOrientationSimpleType = 2
)

// Enum value maps for PrintSettingsOrientationSimpleType.
var (
	PrintSettingsOrientationSimpleType_name = map[int32]string{
		0: "PRINT_SETTINGS_ORIENTATION_SIMPLE_TYPE_UNSPECIFIED",
		1: "PRINT_SETTINGS_ORIENTATION_SIMPLE_TYPE_PORTRAIT",
		2: "PRINT_SETTINGS_ORIENTATION_SIMPLE_TYPE_LANDSCAPE",
	}
	PrintSettingsOrientationSimpleType_value = map[string]int32{
		"PRINT_SETTINGS_ORIENTATION_SIMPLE_TYPE_UNSPECIFIED": 0,
		"PRINT_SETTINGS_ORIENTATION_SIMPLE_TYPE_PORTRAIT":    1,
		"PRINT_SETTINGS_ORIENTATION_SIMPLE_TYPE_LANDSCAPE":   2,
	}
)

func (x PrintSettingsOrientationSimpleType) Enum() *PrintSettingsOrientationSimpleType {
	p := new(PrintSettingsOrientationSimpleType)
	*p = x
	return p
}

func (x PrintSettingsOrientationSimpleType) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (PrintSettingsOrientationSimpleType) Descriptor() protoreflect.EnumDescriptor {
	return file_event_logging_v4_print_settings_orientation_simple_type_proto_enumTypes[0].Descriptor()
}

func (PrintSettingsOrientationSimpleType) Type() protoreflect.EnumType {
	return &file_event_logging_v4_print_settings_orientation_simple_type_proto_enumTypes[0]
}

func (x PrintSettingsOrientationSimpleType) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use PrintSettingsOrientationSimpleType.Descriptor instead.
func (PrintSettingsOrientationSimpleType) EnumDescriptor() ([]byte, []int) {
	return file_event_logging_v4_print_settings_orientation_simple_type_proto_rawDescGZIP(), []int{0}
}

var File_event_logging_v4_print_settings_orientation_simple_type_proto protoreflect.FileDescriptor

var file_event_logging_v4_print_settings_orientation_simple_type_proto_rawDesc = []byte{
	0x0a, 0x3d, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f,
	0x76, 0x34, 0x2f, 0x70, 0x72, 0x69, 0x6e, 0x74, 0x5f, 0x73, 0x65, 0x74, 0x74, 0x69, 0x6e, 0x67,
	0x73, 0x5f, 0x6f, 0x72, 0x69, 0x65, 0x6e, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x73, 0x69,
	0x6d, 0x70, 0x6c, 0x65, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12,
	0x10, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76,
	0x34, 0x1a, 0x1b, 0x62, 0x75, 0x66, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x2f,
	0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2a, 0xc7,
	0x01, 0x0a, 0x22, 0x50, 0x72, 0x69, 0x6e, 0x74, 0x53, 0x65, 0x74, 0x74, 0x69, 0x6e, 0x67, 0x73,
	0x4f, 0x72, 0x69, 0x65, 0x6e, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x69, 0x6d, 0x70, 0x6c,
	0x65, 0x54, 0x79, 0x70, 0x65, 0x12, 0x36, 0x0a, 0x32, 0x50, 0x52, 0x49, 0x4e, 0x54, 0x5f, 0x53,
	0x45, 0x54, 0x54, 0x49, 0x4e, 0x47, 0x53, 0x5f, 0x4f, 0x52, 0x49, 0x45, 0x4e, 0x54, 0x41, 0x54,
	0x49, 0x4f, 0x4e, 0x5f, 0x53, 0x49, 0x4d, 0x50, 0x4c, 0x45, 0x5f, 0x54, 0x59, 0x50, 0x45, 0x5f,
	0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x33, 0x0a,
	0x2f, 0x50, 0x52, 0x49, 0x4e, 0x54, 0x5f, 0x53, 0x45, 0x54, 0x54, 0x49, 0x4e, 0x47, 0x53, 0x5f,
	0x4f, 0x52, 0x49, 0x45, 0x4e, 0x54, 0x41, 0x54, 0x49, 0x4f, 0x4e, 0x5f, 0x53, 0x49, 0x4d, 0x50,
	0x4c, 0x45, 0x5f, 0x54, 0x59, 0x50, 0x45, 0x5f, 0x50, 0x4f, 0x52, 0x54, 0x52, 0x41, 0x49, 0x54,
	0x10, 0x01, 0x12, 0x34, 0x0a, 0x30, 0x50, 0x52, 0x49, 0x4e, 0x54, 0x5f, 0x53, 0x45, 0x54, 0x54,
	0x49, 0x4e, 0x47, 0x53, 0x5f, 0x4f, 0x52, 0x49, 0x45, 0x4e, 0x54, 0x41, 0x54, 0x49, 0x4f, 0x4e,
	0x5f, 0x53, 0x49, 0x4d, 0x50, 0x4c, 0x45, 0x5f, 0x54, 0x59, 0x50, 0x45, 0x5f, 0x4c, 0x41, 0x4e,
	0x44, 0x53, 0x43, 0x41, 0x50, 0x45, 0x10, 0x02, 0x42, 0xeb, 0x01, 0x0a, 0x1c, 0x75, 0x6b, 0x2e,
	0x67, 0x6f, 0x76, 0x2e, 0x67, 0x63, 0x68, 0x71, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c,
	0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x42, 0x27, 0x50, 0x72, 0x69, 0x6e, 0x74,
	0x53, 0x65, 0x74, 0x74, 0x69, 0x6e, 0x67, 0x73, 0x4f, 0x72, 0x69, 0x65, 0x6e, 0x74, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x53, 0x69, 0x6d, 0x70, 0x6c, 0x65, 0x54, 0x79, 0x70, 0x65, 0x50, 0x72, 0x6f,
	0x74, 0x6f, 0x50, 0x01, 0x5a, 0x45, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x67, 0x63, 0x68, 0x71, 0x2f, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x2d, 0x6c, 0x6f, 0x67, 0x67,
	0x69, 0x6e, 0x67, 0x2d, 0x73, 0x63, 0x68, 0x65, 0x6d, 0x61, 0x2f, 0x65, 0x76, 0x65, 0x6e, 0x74,
	0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x3b, 0x65, 0x76, 0x65, 0x6e,
	0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x76, 0x34, 0xa2, 0x02, 0x03, 0x45, 0x58,
	0x58, 0xaa, 0x02, 0x0f, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x4c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67,
	0x2e, 0x56, 0x34, 0xca, 0x02, 0x0f, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x4c, 0x6f, 0x67, 0x67, 0x69,
	0x6e, 0x67, 0x5c, 0x56, 0x34, 0xe2, 0x02, 0x1b, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x4c, 0x6f, 0x67,
	0x67, 0x69, 0x6e, 0x67, 0x5c, 0x56, 0x34, 0x5c, 0x47, 0x50, 0x42, 0x4d, 0x65, 0x74, 0x61, 0x64,
	0x61, 0x74, 0x61, 0xea, 0x02, 0x10, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x4c, 0x6f, 0x67, 0x67, 0x69,
	0x6e, 0x67, 0x3a, 0x3a, 0x56, 0x34, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_event_logging_v4_print_settings_orientation_simple_type_proto_rawDescOnce sync.Once
	file_event_logging_v4_print_settings_orientation_simple_type_proto_rawDescData = file_event_logging_v4_print_settings_orientation_simple_type_proto_rawDesc
)

func file_event_logging_v4_print_settings_orientation_simple_type_proto_rawDescGZIP() []byte {
	file_event_logging_v4_print_settings_orientation_simple_type_proto_rawDescOnce.Do(func() {
		file_event_logging_v4_print_settings_orientation_simple_type_proto_rawDescData = protoimpl.X.CompressGZIP(file_event_logging_v4_print_settings_orientation_simple_type_proto_rawDescData)
	})
	return file_event_logging_v4_print_settings_orientation_simple_type_proto_rawDescData
}

var file_event_logging_v4_print_settings_orientation_simple_type_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_event_logging_v4_print_settings_orientation_simple_type_proto_goTypes = []interface{}{
	(PrintSettingsOrientationSimpleType)(0), // 0: event_logging.v4.PrintSettingsOrientationSimpleType
}
var file_event_logging_v4_print_settings_orientation_simple_type_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_event_logging_v4_print_settings_orientation_simple_type_proto_init() }
func file_event_logging_v4_print_settings_orientation_simple_type_proto_init() {
	if File_event_logging_v4_print_settings_orientation_simple_type_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_event_logging_v4_print_settings_orientation_simple_type_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_event_logging_v4_print_settings_orientation_simple_type_proto_goTypes,
		DependencyIndexes: file_event_logging_v4_print_settings_orientation_simple_type_proto_depIdxs,
		EnumInfos:         file_event_logging_v4_print_settings_orientation_simple_type_proto_enumTypes,
	}.Build()
	File_event_logging_v4_print_settings_orientation_simple_type_proto = out.File
	file_event_logging_v4_print_settings_orientation_simple_type_proto_rawDesc = nil
	file_event_logging_v4_print_settings_orientation_simple_type_proto_goTypes = nil
	file_event_logging_v4_print_settings_orientation_simple_type_proto_depIdxs = nil
}
