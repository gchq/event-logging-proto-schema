// event_logging/v4/classification_complex_type.proto at 0:0

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.33.0
// 	protoc        (unknown)
// source: event_logging/v4/classification_complex_type.proto

package event_loggingv4

import (
	_ "buf.build/gen/go/bufbuild/protovalidate/protocolbuffers/go/buf/validate"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	timestamppb "google.golang.org/protobuf/types/known/timestamppb"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// Describes the classification and access controls for an item such as a document, record, file, etc.
type ClassificationComplexType struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Optional full human-readable text of the protective marking that can combine the various elements in this Classification structure, e.g 'Commercial in Confidence'.
	Text string `protobuf:"bytes,1,opt,name=text,proto3" json:"text,omitempty"`
	// The originator or creator of the protectively marked item. The originator is described by an Organisation and optionally qualified by the organisation's Country.
	Originator *OrganisationComplexType `protobuf:"bytes,2,opt,name=originator,proto3" json:"originator,omitempty"`
	// The custodian or owner of the protectively marked item. The custodian is responsible for the lifecycle of the marked item. The custodian is described by an Organisation and optionally qualified by the organisation's Country.
	Custodian *OrganisationComplexType `protobuf:"bytes,3,opt,name=custodian,proto3" json:"custodian,omitempty"`
	// The classification of the protectively marked item. E.g. 'OFFICIAL', 'COMMERCIAL IN CONFIDENCE', 'CONFIDENTIAL', 'INTERNAL' etc.
	Classification string `protobuf:"bytes,4,opt,name=classification,proto3" json:"classification,omitempty"`
	// Additional descriptors or keywords to further qualify the Classification e.g. 'PERSONAL'
	Descriptors *ClassificationComplexType_DescriptorsType `protobuf:"bytes,5,opt,name=descriptors,proto3" json:"descriptors,omitempty"`
	// The groups that a person must belong to AT LEAST ONE OF in order to be permitted to access the protectively marked item. E.g. 'HR' OR 'Auditors'.
	OrGroups *AccessControlGroupsComplexType `protobuf:"bytes,6,opt,name=or_groups,json=orGroups,proto3" json:"or_groups,omitempty"`
	// The groups that a person must belong to ALL OF in order to be permitted to access the protectively marked item. E.g. 'Sales' AND 'Management'.
	AndGroups *AccessControlGroupsComplexType `protobuf:"bytes,7,opt,name=and_groups,json=andGroups,proto3" json:"and_groups,omitempty"`
	// The nationalities of people permitted to access this protectively marked item. E.g. 'GBR', 'USA'
	PermittedNationalities *ClassificationComplexType_PermittedNationalitiesType `protobuf:"bytes,8,opt,name=permitted_nationalities,json=permittedNationalities,proto3" json:"permitted_nationalities,omitempty"`
	// The organisations permitted to access the protectively marked item.
	PermittedOrganisations *ClassificationComplexType_PermittedOrganisationsType `protobuf:"bytes,9,opt,name=permitted_organisations,json=permittedOrganisations,proto3" json:"permitted_organisations,omitempty"`
	// Controls governing the onward handling of the protectively marked item
	DisseminationControls *ClassificationComplexType_DisseminationControlsType `protobuf:"bytes,10,opt,name=dissemination_controls,json=disseminationControls,proto3" json:"dissemination_controls,omitempty"`
	// Describes the timescale and process for the disposal of the protectively marked item
	Disposition *ClassificationComplexType_DispositionType `protobuf:"bytes,11,opt,name=disposition,proto3" json:"disposition,omitempty"`
	// Any other event data that does not fit into a schema element but may be useful for the purpose of audit.
	Data []*DataComplexType `protobuf:"bytes,12,rep,name=data,proto3" json:"data,omitempty"`
}

func (x *ClassificationComplexType) Reset() {
	*x = ClassificationComplexType{}
	if protoimpl.UnsafeEnabled {
		mi := &file_event_logging_v4_classification_complex_type_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ClassificationComplexType) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ClassificationComplexType) ProtoMessage() {}

func (x *ClassificationComplexType) ProtoReflect() protoreflect.Message {
	mi := &file_event_logging_v4_classification_complex_type_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ClassificationComplexType.ProtoReflect.Descriptor instead.
func (*ClassificationComplexType) Descriptor() ([]byte, []int) {
	return file_event_logging_v4_classification_complex_type_proto_rawDescGZIP(), []int{0}
}

func (x *ClassificationComplexType) GetText() string {
	if x != nil {
		return x.Text
	}
	return ""
}

func (x *ClassificationComplexType) GetOriginator() *OrganisationComplexType {
	if x != nil {
		return x.Originator
	}
	return nil
}

func (x *ClassificationComplexType) GetCustodian() *OrganisationComplexType {
	if x != nil {
		return x.Custodian
	}
	return nil
}

func (x *ClassificationComplexType) GetClassification() string {
	if x != nil {
		return x.Classification
	}
	return ""
}

func (x *ClassificationComplexType) GetDescriptors() *ClassificationComplexType_DescriptorsType {
	if x != nil {
		return x.Descriptors
	}
	return nil
}

func (x *ClassificationComplexType) GetOrGroups() *AccessControlGroupsComplexType {
	if x != nil {
		return x.OrGroups
	}
	return nil
}

func (x *ClassificationComplexType) GetAndGroups() *AccessControlGroupsComplexType {
	if x != nil {
		return x.AndGroups
	}
	return nil
}

func (x *ClassificationComplexType) GetPermittedNationalities() *ClassificationComplexType_PermittedNationalitiesType {
	if x != nil {
		return x.PermittedNationalities
	}
	return nil
}

func (x *ClassificationComplexType) GetPermittedOrganisations() *ClassificationComplexType_PermittedOrganisationsType {
	if x != nil {
		return x.PermittedOrganisations
	}
	return nil
}

func (x *ClassificationComplexType) GetDisseminationControls() *ClassificationComplexType_DisseminationControlsType {
	if x != nil {
		return x.DisseminationControls
	}
	return nil
}

func (x *ClassificationComplexType) GetDisposition() *ClassificationComplexType_DispositionType {
	if x != nil {
		return x.Disposition
	}
	return nil
}

func (x *ClassificationComplexType) GetData() []*DataComplexType {
	if x != nil {
		return x.Data
	}
	return nil
}

// Additional descriptors or keywords to further qualify the Classification e.g. 'PERSONAL'
type ClassificationComplexType_DescriptorsType struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Descriptor or keyword to further qualify the Classification e.g. 'PERSONAL'
	Descriptor_ []string `protobuf:"bytes,1,rep,name=descriptor,proto3" json:"descriptor,omitempty"`
}

func (x *ClassificationComplexType_DescriptorsType) Reset() {
	*x = ClassificationComplexType_DescriptorsType{}
	if protoimpl.UnsafeEnabled {
		mi := &file_event_logging_v4_classification_complex_type_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ClassificationComplexType_DescriptorsType) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ClassificationComplexType_DescriptorsType) ProtoMessage() {}

func (x *ClassificationComplexType_DescriptorsType) ProtoReflect() protoreflect.Message {
	mi := &file_event_logging_v4_classification_complex_type_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ClassificationComplexType_DescriptorsType.ProtoReflect.Descriptor instead.
func (*ClassificationComplexType_DescriptorsType) Descriptor() ([]byte, []int) {
	return file_event_logging_v4_classification_complex_type_proto_rawDescGZIP(), []int{0, 0}
}

func (x *ClassificationComplexType_DescriptorsType) GetDescriptor_() []string {
	if x != nil {
		return x.Descriptor_
	}
	return nil
}

// The nationalities of people permitted to access this protectively marked item. E.g. 'GBR', 'USA'
type ClassificationComplexType_PermittedNationalitiesType struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// An ISO 3166 alpha-3 trigraph for a nationality permitted to view this protectively marked item. E.g. 'GBR'.
	Nationality []string `protobuf:"bytes,1,rep,name=nationality,proto3" json:"nationality,omitempty"`
}

func (x *ClassificationComplexType_PermittedNationalitiesType) Reset() {
	*x = ClassificationComplexType_PermittedNationalitiesType{}
	if protoimpl.UnsafeEnabled {
		mi := &file_event_logging_v4_classification_complex_type_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ClassificationComplexType_PermittedNationalitiesType) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ClassificationComplexType_PermittedNationalitiesType) ProtoMessage() {}

func (x *ClassificationComplexType_PermittedNationalitiesType) ProtoReflect() protoreflect.Message {
	mi := &file_event_logging_v4_classification_complex_type_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ClassificationComplexType_PermittedNationalitiesType.ProtoReflect.Descriptor instead.
func (*ClassificationComplexType_PermittedNationalitiesType) Descriptor() ([]byte, []int) {
	return file_event_logging_v4_classification_complex_type_proto_rawDescGZIP(), []int{0, 1}
}

func (x *ClassificationComplexType_PermittedNationalitiesType) GetNationality() []string {
	if x != nil {
		return x.Nationality
	}
	return nil
}

// The organisations permitted to access the protectively marked item.
type ClassificationComplexType_PermittedOrganisationsType struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// An organisation permitted to access the protectively marked item. The PermittedOrganisation is described by an Organisation and optionally qualified by the organisation's country code.
	PermittedOrganisation *OrganisationComplexType `protobuf:"bytes,1,opt,name=permitted_organisation,json=permittedOrganisation,proto3" json:"permitted_organisation,omitempty"`
}

func (x *ClassificationComplexType_PermittedOrganisationsType) Reset() {
	*x = ClassificationComplexType_PermittedOrganisationsType{}
	if protoimpl.UnsafeEnabled {
		mi := &file_event_logging_v4_classification_complex_type_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ClassificationComplexType_PermittedOrganisationsType) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ClassificationComplexType_PermittedOrganisationsType) ProtoMessage() {}

func (x *ClassificationComplexType_PermittedOrganisationsType) ProtoReflect() protoreflect.Message {
	mi := &file_event_logging_v4_classification_complex_type_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ClassificationComplexType_PermittedOrganisationsType.ProtoReflect.Descriptor instead.
func (*ClassificationComplexType_PermittedOrganisationsType) Descriptor() ([]byte, []int) {
	return file_event_logging_v4_classification_complex_type_proto_rawDescGZIP(), []int{0, 2}
}

func (x *ClassificationComplexType_PermittedOrganisationsType) GetPermittedOrganisation() *OrganisationComplexType {
	if x != nil {
		return x.PermittedOrganisation
	}
	return nil
}

// Controls governing the onward handling of the protectively marked item
type ClassificationComplexType_DisseminationControlsType struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// A policy or control governing the onward handling of a protectively marked item. E.g. ORIGINATOR_CONTROLLED
	DisseminationControl []string `protobuf:"bytes,1,rep,name=dissemination_control,json=disseminationControl,proto3" json:"dissemination_control,omitempty"`
}

func (x *ClassificationComplexType_DisseminationControlsType) Reset() {
	*x = ClassificationComplexType_DisseminationControlsType{}
	if protoimpl.UnsafeEnabled {
		mi := &file_event_logging_v4_classification_complex_type_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ClassificationComplexType_DisseminationControlsType) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ClassificationComplexType_DisseminationControlsType) ProtoMessage() {}

func (x *ClassificationComplexType_DisseminationControlsType) ProtoReflect() protoreflect.Message {
	mi := &file_event_logging_v4_classification_complex_type_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ClassificationComplexType_DisseminationControlsType.ProtoReflect.Descriptor instead.
func (*ClassificationComplexType_DisseminationControlsType) Descriptor() ([]byte, []int) {
	return file_event_logging_v4_classification_complex_type_proto_rawDescGZIP(), []int{0, 3}
}

func (x *ClassificationComplexType_DisseminationControlsType) GetDisseminationControl() []string {
	if x != nil {
		return x.DisseminationControl
	}
	return nil
}

// Describes the timescale and process for the disposal of the protectively marked item
type ClassificationComplexType_DispositionType struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Date/time that the disposition process must be enacted by
	Date *timestamppb.Timestamp `protobuf:"bytes,1,opt,name=date,proto3" json:"date,omitempty"`
	// The action to be taken on expiry of the disposition date. E.g. 'DELETE' to delete the item.
	Process string `protobuf:"bytes,2,opt,name=process,proto3" json:"process,omitempty"`
}

func (x *ClassificationComplexType_DispositionType) Reset() {
	*x = ClassificationComplexType_DispositionType{}
	if protoimpl.UnsafeEnabled {
		mi := &file_event_logging_v4_classification_complex_type_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ClassificationComplexType_DispositionType) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ClassificationComplexType_DispositionType) ProtoMessage() {}

func (x *ClassificationComplexType_DispositionType) ProtoReflect() protoreflect.Message {
	mi := &file_event_logging_v4_classification_complex_type_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ClassificationComplexType_DispositionType.ProtoReflect.Descriptor instead.
func (*ClassificationComplexType_DispositionType) Descriptor() ([]byte, []int) {
	return file_event_logging_v4_classification_complex_type_proto_rawDescGZIP(), []int{0, 4}
}

func (x *ClassificationComplexType_DispositionType) GetDate() *timestamppb.Timestamp {
	if x != nil {
		return x.Date
	}
	return nil
}

func (x *ClassificationComplexType_DispositionType) GetProcess() string {
	if x != nil {
		return x.Process
	}
	return ""
}

var File_event_logging_v4_classification_complex_type_proto protoreflect.FileDescriptor

var file_event_logging_v4_classification_complex_type_proto_rawDesc = []byte{
	0x0a, 0x32, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f,
	0x76, 0x34, 0x2f, 0x63, 0x6c, 0x61, 0x73, 0x73, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f,
	0x6e, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x12, 0x10, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67,
	0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x1a, 0x39, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f,
	0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x61, 0x63, 0x63, 0x65, 0x73, 0x73, 0x5f,
	0x63, 0x6f, 0x6e, 0x74, 0x72, 0x6f, 0x6c, 0x5f, 0x67, 0x72, 0x6f, 0x75, 0x70, 0x73, 0x5f, 0x63,
	0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x28, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67,
	0x2f, 0x76, 0x34, 0x2f, 0x64, 0x61, 0x74, 0x61, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78,
	0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x30, 0x65, 0x76, 0x65,
	0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x6f, 0x72,
	0x67, 0x61, 0x6e, 0x69, 0x73, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x6c,
	0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1f, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x74,
	0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1b,
	0x62, 0x75, 0x66, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x2f, 0x76, 0x61, 0x6c,
	0x69, 0x64, 0x61, 0x74, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xf3, 0x0b, 0x0a, 0x19,
	0x43, 0x6c, 0x61, 0x73, 0x73, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x43, 0x6f,
	0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x74, 0x65, 0x78,
	0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x74, 0x65, 0x78, 0x74, 0x12, 0x49, 0x0a,
	0x0a, 0x6f, 0x72, 0x69, 0x67, 0x69, 0x6e, 0x61, 0x74, 0x6f, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x29, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e,
	0x67, 0x2e, 0x76, 0x34, 0x2e, 0x4f, 0x72, 0x67, 0x61, 0x6e, 0x69, 0x73, 0x61, 0x74, 0x69, 0x6f,
	0x6e, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x52, 0x0a, 0x6f, 0x72,
	0x69, 0x67, 0x69, 0x6e, 0x61, 0x74, 0x6f, 0x72, 0x12, 0x47, 0x0a, 0x09, 0x63, 0x75, 0x73, 0x74,
	0x6f, 0x64, 0x69, 0x61, 0x6e, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x29, 0x2e, 0x65, 0x76,
	0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x4f,
	0x72, 0x67, 0x61, 0x6e, 0x69, 0x73, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x43, 0x6f, 0x6d, 0x70, 0x6c,
	0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x52, 0x09, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x64, 0x69, 0x61,
	0x6e, 0x12, 0x26, 0x0a, 0x0e, 0x63, 0x6c, 0x61, 0x73, 0x73, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0e, 0x63, 0x6c, 0x61, 0x73, 0x73,
	0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x5d, 0x0a, 0x0b, 0x64, 0x65, 0x73,
	0x63, 0x72, 0x69, 0x70, 0x74, 0x6f, 0x72, 0x73, 0x18, 0x05, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x3b,
	0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76,
	0x34, 0x2e, 0x43, 0x6c, 0x61, 0x73, 0x73, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x2e, 0x44, 0x65, 0x73, 0x63,
	0x72, 0x69, 0x70, 0x74, 0x6f, 0x72, 0x73, 0x54, 0x79, 0x70, 0x65, 0x52, 0x0b, 0x64, 0x65, 0x73,
	0x63, 0x72, 0x69, 0x70, 0x74, 0x6f, 0x72, 0x73, 0x12, 0x4d, 0x0a, 0x09, 0x6f, 0x72, 0x5f, 0x67,
	0x72, 0x6f, 0x75, 0x70, 0x73, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x30, 0x2e, 0x65, 0x76,
	0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x41,
	0x63, 0x63, 0x65, 0x73, 0x73, 0x43, 0x6f, 0x6e, 0x74, 0x72, 0x6f, 0x6c, 0x47, 0x72, 0x6f, 0x75,
	0x70, 0x73, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x52, 0x08, 0x6f,
	0x72, 0x47, 0x72, 0x6f, 0x75, 0x70, 0x73, 0x12, 0x4f, 0x0a, 0x0a, 0x61, 0x6e, 0x64, 0x5f, 0x67,
	0x72, 0x6f, 0x75, 0x70, 0x73, 0x18, 0x07, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x30, 0x2e, 0x65, 0x76,
	0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x41,
	0x63, 0x63, 0x65, 0x73, 0x73, 0x43, 0x6f, 0x6e, 0x74, 0x72, 0x6f, 0x6c, 0x47, 0x72, 0x6f, 0x75,
	0x70, 0x73, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x52, 0x09, 0x61,
	0x6e, 0x64, 0x47, 0x72, 0x6f, 0x75, 0x70, 0x73, 0x12, 0x7f, 0x0a, 0x17, 0x70, 0x65, 0x72, 0x6d,
	0x69, 0x74, 0x74, 0x65, 0x64, 0x5f, 0x6e, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x61, 0x6c, 0x69, 0x74,
	0x69, 0x65, 0x73, 0x18, 0x08, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x46, 0x2e, 0x65, 0x76, 0x65, 0x6e,
	0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x43, 0x6c, 0x61,
	0x73, 0x73, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x43, 0x6f, 0x6d, 0x70, 0x6c,
	0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x2e, 0x50, 0x65, 0x72, 0x6d, 0x69, 0x74, 0x74, 0x65, 0x64,
	0x4e, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x61, 0x6c, 0x69, 0x74, 0x69, 0x65, 0x73, 0x54, 0x79, 0x70,
	0x65, 0x52, 0x16, 0x70, 0x65, 0x72, 0x6d, 0x69, 0x74, 0x74, 0x65, 0x64, 0x4e, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x61, 0x6c, 0x69, 0x74, 0x69, 0x65, 0x73, 0x12, 0x7f, 0x0a, 0x17, 0x70, 0x65, 0x72,
	0x6d, 0x69, 0x74, 0x74, 0x65, 0x64, 0x5f, 0x6f, 0x72, 0x67, 0x61, 0x6e, 0x69, 0x73, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x73, 0x18, 0x09, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x46, 0x2e, 0x65, 0x76, 0x65,
	0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x43, 0x6c,
	0x61, 0x73, 0x73, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x43, 0x6f, 0x6d, 0x70,
	0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x2e, 0x50, 0x65, 0x72, 0x6d, 0x69, 0x74, 0x74, 0x65,
	0x64, 0x4f, 0x72, 0x67, 0x61, 0x6e, 0x69, 0x73, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x54, 0x79,
	0x70, 0x65, 0x52, 0x16, 0x70, 0x65, 0x72, 0x6d, 0x69, 0x74, 0x74, 0x65, 0x64, 0x4f, 0x72, 0x67,
	0x61, 0x6e, 0x69, 0x73, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x12, 0x7c, 0x0a, 0x16, 0x64, 0x69,
	0x73, 0x73, 0x65, 0x6d, 0x69, 0x6e, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x63, 0x6f, 0x6e, 0x74,
	0x72, 0x6f, 0x6c, 0x73, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x45, 0x2e, 0x65, 0x76, 0x65,
	0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x43, 0x6c,
	0x61, 0x73, 0x73, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x43, 0x6f, 0x6d, 0x70,
	0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x2e, 0x44, 0x69, 0x73, 0x73, 0x65, 0x6d, 0x69, 0x6e,
	0x61, 0x74, 0x69, 0x6f, 0x6e, 0x43, 0x6f, 0x6e, 0x74, 0x72, 0x6f, 0x6c, 0x73, 0x54, 0x79, 0x70,
	0x65, 0x52, 0x15, 0x64, 0x69, 0x73, 0x73, 0x65, 0x6d, 0x69, 0x6e, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x43, 0x6f, 0x6e, 0x74, 0x72, 0x6f, 0x6c, 0x73, 0x12, 0x5d, 0x0a, 0x0b, 0x64, 0x69, 0x73, 0x70,
	0x6f, 0x73, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x0b, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x3b, 0x2e,
	0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34,
	0x2e, 0x43, 0x6c, 0x61, 0x73, 0x73, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x43,
	0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x2e, 0x44, 0x69, 0x73, 0x70, 0x6f,
	0x73, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x54, 0x79, 0x70, 0x65, 0x52, 0x0b, 0x64, 0x69, 0x73, 0x70,
	0x6f, 0x73, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x3f, 0x0a, 0x04, 0x64, 0x61, 0x74, 0x61, 0x18,
	0x0c, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x21, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f,
	0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x44, 0x61, 0x74, 0x61, 0x43, 0x6f, 0x6d,
	0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x08, 0xba, 0x48, 0x05, 0x92, 0x01, 0x02,
	0x08, 0x00, 0x52, 0x04, 0x64, 0x61, 0x74, 0x61, 0x1a, 0x3b, 0x0a, 0x0f, 0x44, 0x65, 0x73, 0x63,
	0x72, 0x69, 0x70, 0x74, 0x6f, 0x72, 0x73, 0x54, 0x79, 0x70, 0x65, 0x12, 0x28, 0x0a, 0x0a, 0x64,
	0x65, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x6f, 0x72, 0x18, 0x01, 0x20, 0x03, 0x28, 0x09, 0x42,
	0x08, 0xba, 0x48, 0x05, 0x92, 0x01, 0x02, 0x08, 0x01, 0x52, 0x0a, 0x64, 0x65, 0x73, 0x63, 0x72,
	0x69, 0x70, 0x74, 0x6f, 0x72, 0x1a, 0x58, 0x0a, 0x1a, 0x50, 0x65, 0x72, 0x6d, 0x69, 0x74, 0x74,
	0x65, 0x64, 0x4e, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x61, 0x6c, 0x69, 0x74, 0x69, 0x65, 0x73, 0x54,
	0x79, 0x70, 0x65, 0x12, 0x3a, 0x0a, 0x0b, 0x6e, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x61, 0x6c, 0x69,
	0x74, 0x79, 0x18, 0x01, 0x20, 0x03, 0x28, 0x09, 0x42, 0x18, 0xba, 0x48, 0x15, 0x92, 0x01, 0x12,
	0x08, 0x01, 0x22, 0x0e, 0x72, 0x0c, 0x32, 0x0a, 0x28, 0x5b, 0x41, 0x2d, 0x5a, 0x5d, 0x7b, 0x33,
	0x7d, 0x29, 0x52, 0x0b, 0x6e, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x61, 0x6c, 0x69, 0x74, 0x79, 0x1a,
	0x86, 0x01, 0x0a, 0x1a, 0x50, 0x65, 0x72, 0x6d, 0x69, 0x74, 0x74, 0x65, 0x64, 0x4f, 0x72, 0x67,
	0x61, 0x6e, 0x69, 0x73, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x54, 0x79, 0x70, 0x65, 0x12, 0x68,
	0x0a, 0x16, 0x70, 0x65, 0x72, 0x6d, 0x69, 0x74, 0x74, 0x65, 0x64, 0x5f, 0x6f, 0x72, 0x67, 0x61,
	0x6e, 0x69, 0x73, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x29,
	0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76,
	0x34, 0x2e, 0x4f, 0x72, 0x67, 0x61, 0x6e, 0x69, 0x73, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x43, 0x6f,
	0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01,
	0x01, 0x52, 0x15, 0x70, 0x65, 0x72, 0x6d, 0x69, 0x74, 0x74, 0x65, 0x64, 0x4f, 0x72, 0x67, 0x61,
	0x6e, 0x69, 0x73, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x1a, 0x5a, 0x0a, 0x19, 0x44, 0x69, 0x73, 0x73,
	0x65, 0x6d, 0x69, 0x6e, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x43, 0x6f, 0x6e, 0x74, 0x72, 0x6f, 0x6c,
	0x73, 0x54, 0x79, 0x70, 0x65, 0x12, 0x3d, 0x0a, 0x15, 0x64, 0x69, 0x73, 0x73, 0x65, 0x6d, 0x69,
	0x6e, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x63, 0x6f, 0x6e, 0x74, 0x72, 0x6f, 0x6c, 0x18, 0x01,
	0x20, 0x03, 0x28, 0x09, 0x42, 0x08, 0xba, 0x48, 0x05, 0x92, 0x01, 0x02, 0x08, 0x01, 0x52, 0x14,
	0x64, 0x69, 0x73, 0x73, 0x65, 0x6d, 0x69, 0x6e, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x43, 0x6f, 0x6e,
	0x74, 0x72, 0x6f, 0x6c, 0x1a, 0x6b, 0x0a, 0x0f, 0x44, 0x69, 0x73, 0x70, 0x6f, 0x73, 0x69, 0x74,
	0x69, 0x6f, 0x6e, 0x54, 0x79, 0x70, 0x65, 0x12, 0x36, 0x0a, 0x04, 0x64, 0x61, 0x74, 0x65, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x54, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d,
	0x70, 0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52, 0x04, 0x64, 0x61, 0x74, 0x65, 0x12,
	0x20, 0x0a, 0x07, 0x70, 0x72, 0x6f, 0x63, 0x65, 0x73, 0x73, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09,
	0x42, 0x06, 0xba, 0x48, 0x03, 0xc8, 0x01, 0x01, 0x52, 0x07, 0x70, 0x72, 0x6f, 0x63, 0x65, 0x73,
	0x73, 0x42, 0xe2, 0x01, 0x0a, 0x1c, 0x75, 0x6b, 0x2e, 0x67, 0x6f, 0x76, 0x2e, 0x67, 0x63, 0x68,
	0x71, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e,
	0x76, 0x34, 0x42, 0x1e, 0x43, 0x6c, 0x61, 0x73, 0x73, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x50, 0x72, 0x6f,
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
	file_event_logging_v4_classification_complex_type_proto_rawDescOnce sync.Once
	file_event_logging_v4_classification_complex_type_proto_rawDescData = file_event_logging_v4_classification_complex_type_proto_rawDesc
)

func file_event_logging_v4_classification_complex_type_proto_rawDescGZIP() []byte {
	file_event_logging_v4_classification_complex_type_proto_rawDescOnce.Do(func() {
		file_event_logging_v4_classification_complex_type_proto_rawDescData = protoimpl.X.CompressGZIP(file_event_logging_v4_classification_complex_type_proto_rawDescData)
	})
	return file_event_logging_v4_classification_complex_type_proto_rawDescData
}

var file_event_logging_v4_classification_complex_type_proto_msgTypes = make([]protoimpl.MessageInfo, 6)
var file_event_logging_v4_classification_complex_type_proto_goTypes = []interface{}{
	(*ClassificationComplexType)(nil),                            // 0: event_logging.v4.ClassificationComplexType
	(*ClassificationComplexType_DescriptorsType)(nil),            // 1: event_logging.v4.ClassificationComplexType.DescriptorsType
	(*ClassificationComplexType_PermittedNationalitiesType)(nil), // 2: event_logging.v4.ClassificationComplexType.PermittedNationalitiesType
	(*ClassificationComplexType_PermittedOrganisationsType)(nil), // 3: event_logging.v4.ClassificationComplexType.PermittedOrganisationsType
	(*ClassificationComplexType_DisseminationControlsType)(nil),  // 4: event_logging.v4.ClassificationComplexType.DisseminationControlsType
	(*ClassificationComplexType_DispositionType)(nil),            // 5: event_logging.v4.ClassificationComplexType.DispositionType
	(*OrganisationComplexType)(nil),                              // 6: event_logging.v4.OrganisationComplexType
	(*AccessControlGroupsComplexType)(nil),                       // 7: event_logging.v4.AccessControlGroupsComplexType
	(*DataComplexType)(nil),                                      // 8: event_logging.v4.DataComplexType
	(*timestamppb.Timestamp)(nil),                                // 9: google.protobuf.Timestamp
}
var file_event_logging_v4_classification_complex_type_proto_depIdxs = []int32{
	6,  // 0: event_logging.v4.ClassificationComplexType.originator:type_name -> event_logging.v4.OrganisationComplexType
	6,  // 1: event_logging.v4.ClassificationComplexType.custodian:type_name -> event_logging.v4.OrganisationComplexType
	1,  // 2: event_logging.v4.ClassificationComplexType.descriptors:type_name -> event_logging.v4.ClassificationComplexType.DescriptorsType
	7,  // 3: event_logging.v4.ClassificationComplexType.or_groups:type_name -> event_logging.v4.AccessControlGroupsComplexType
	7,  // 4: event_logging.v4.ClassificationComplexType.and_groups:type_name -> event_logging.v4.AccessControlGroupsComplexType
	2,  // 5: event_logging.v4.ClassificationComplexType.permitted_nationalities:type_name -> event_logging.v4.ClassificationComplexType.PermittedNationalitiesType
	3,  // 6: event_logging.v4.ClassificationComplexType.permitted_organisations:type_name -> event_logging.v4.ClassificationComplexType.PermittedOrganisationsType
	4,  // 7: event_logging.v4.ClassificationComplexType.dissemination_controls:type_name -> event_logging.v4.ClassificationComplexType.DisseminationControlsType
	5,  // 8: event_logging.v4.ClassificationComplexType.disposition:type_name -> event_logging.v4.ClassificationComplexType.DispositionType
	8,  // 9: event_logging.v4.ClassificationComplexType.data:type_name -> event_logging.v4.DataComplexType
	6,  // 10: event_logging.v4.ClassificationComplexType.PermittedOrganisationsType.permitted_organisation:type_name -> event_logging.v4.OrganisationComplexType
	9,  // 11: event_logging.v4.ClassificationComplexType.DispositionType.date:type_name -> google.protobuf.Timestamp
	12, // [12:12] is the sub-list for method output_type
	12, // [12:12] is the sub-list for method input_type
	12, // [12:12] is the sub-list for extension type_name
	12, // [12:12] is the sub-list for extension extendee
	0,  // [0:12] is the sub-list for field type_name
}

func init() { file_event_logging_v4_classification_complex_type_proto_init() }
func file_event_logging_v4_classification_complex_type_proto_init() {
	if File_event_logging_v4_classification_complex_type_proto != nil {
		return
	}
	file_event_logging_v4_access_control_groups_complex_type_proto_init()
	file_event_logging_v4_data_complex_type_proto_init()
	file_event_logging_v4_organisation_complex_type_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_event_logging_v4_classification_complex_type_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ClassificationComplexType); i {
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
		file_event_logging_v4_classification_complex_type_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ClassificationComplexType_DescriptorsType); i {
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
		file_event_logging_v4_classification_complex_type_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ClassificationComplexType_PermittedNationalitiesType); i {
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
		file_event_logging_v4_classification_complex_type_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ClassificationComplexType_PermittedOrganisationsType); i {
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
		file_event_logging_v4_classification_complex_type_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ClassificationComplexType_DisseminationControlsType); i {
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
		file_event_logging_v4_classification_complex_type_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ClassificationComplexType_DispositionType); i {
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
			RawDescriptor: file_event_logging_v4_classification_complex_type_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   6,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_event_logging_v4_classification_complex_type_proto_goTypes,
		DependencyIndexes: file_event_logging_v4_classification_complex_type_proto_depIdxs,
		MessageInfos:      file_event_logging_v4_classification_complex_type_proto_msgTypes,
	}.Build()
	File_event_logging_v4_classification_complex_type_proto = out.File
	file_event_logging_v4_classification_complex_type_proto_rawDesc = nil
	file_event_logging_v4_classification_complex_type_proto_goTypes = nil
	file_event_logging_v4_classification_complex_type_proto_depIdxs = nil
}
