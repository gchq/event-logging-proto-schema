// event_logging/v4/user_details_complex_type.proto at 0:0

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.33.0
// 	protoc        (unknown)
// source: event_logging/v4/user_details_complex_type.proto

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

// Describes the person represented by a user account or identity.
type UserDetailsComplexType struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// A unique identifier used across the business to identify this person.
	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	// A person's staff number.
	StaffNumber string `protobuf:"bytes,2,opt,name=staff_number,json=staffNumber,proto3" json:"staff_number,omitempty"`
	// The person's surname.
	Surname string `protobuf:"bytes,3,opt,name=surname,proto3" json:"surname,omitempty"`
	// The person's initials.
	Initials string `protobuf:"bytes,4,opt,name=initials,proto3" json:"initials,omitempty"`
	// The person's title.
	Title string `protobuf:"bytes,5,opt,name=title,proto3" json:"title,omitempty"`
	// The person's given name. If a preferred name also exists then use KnownAs for this preferred name, otherwise use the same name for both elements.
	GivenName string `protobuf:"bytes,6,opt,name=given_name,json=givenName,proto3" json:"given_name,omitempty"`
	// The name that this person is known as.
	KnownAs string `protobuf:"bytes,7,opt,name=known_as,json=knownAs,proto3" json:"known_as,omitempty"`
	// Is the person an employee or a contractor.
	PersonType string `protobuf:"bytes,8,opt,name=person_type,json=personType,proto3" json:"person_type,omitempty"`
	// The business group.
	Group string `protobuf:"bytes,9,opt,name=group,proto3" json:"group,omitempty"`
	// The business unit within the business group.
	Unit string `protobuf:"bytes,10,opt,name=unit,proto3" json:"unit,omitempty"`
	// The position within the business unit.
	Position string `protobuf:"bytes,11,opt,name=position,proto3" json:"position,omitempty"`
	// The role that the person is in.
	Role string `protobuf:"bytes,12,opt,name=role,proto3" json:"role,omitempty"`
	// The grade required for the current post.
	GradeOfPost string `protobuf:"bytes,13,opt,name=grade_of_post,json=gradeOfPost,proto3" json:"grade_of_post,omitempty"`
	// Is the person full-time, part-time etc.
	EmploymentType string `protobuf:"bytes,14,opt,name=employment_type,json=employmentType,proto3" json:"employment_type,omitempty"`
	// The employment status of the person, e.g. Active, Retired, Maternity Leave, Sabbatical Leave, etc.
	EmploymentStatus string `protobuf:"bytes,15,opt,name=employment_status,json=employmentStatus,proto3" json:"employment_status,omitempty"`
	// The person's nationality.
	Nationality string `protobuf:"bytes,16,opt,name=nationality,proto3" json:"nationality,omitempty"`
	// The building that the person usually works in.
	Location string `protobuf:"bytes,17,opt,name=location,proto3" json:"location,omitempty"`
	// The room number or name that the person usually works in.
	RoomNumber string `protobuf:"bytes,18,opt,name=room_number,json=roomNumber,proto3" json:"room_number,omitempty"`
	// The person's primary or internal phone number or extension.
	Phone string `protobuf:"bytes,19,opt,name=phone,proto3" json:"phone,omitempty"`
	// The person's secondary phone number or extension.
	SecondaryPhone string `protobuf:"bytes,20,opt,name=secondary_phone,json=secondaryPhone,proto3" json:"secondary_phone,omitempty"`
	// The staff number of the person's supervisor or line manager.
	SupervisorStaffNumber string `protobuf:"bytes,21,opt,name=supervisor_staff_number,json=supervisorStaffNumber,proto3" json:"supervisor_staff_number,omitempty"`
	// When this person's current position is scheduled to end, e.g. the end date of a fixed term employment contract.
	OccupancyEndDate uint32 `protobuf:"varint,22,opt,name=occupancy_end_date,json=occupancyEndDate,proto3" json:"occupancy_end_date,omitempty"`
	// Describes a person's main employing organisation irrespective of who they are contracted or seconded to, or are performing an internship with.
	Organisation string `protobuf:"bytes,23,opt,name=organisation,proto3" json:"organisation,omitempty"`
	// Describes which organisation is currently hosting a person if they are on secondment, internship or are contracted to work for.
	HostOrganisation string `protobuf:"bytes,24,opt,name=host_organisation,json=hostOrganisation,proto3" json:"host_organisation,omitempty"`
	// Any other user data that does not fit into a schema element but may be useful for the purpose of audit.
	Data []*DataComplexType `protobuf:"bytes,25,rep,name=data,proto3" json:"data,omitempty"`
}

func (x *UserDetailsComplexType) Reset() {
	*x = UserDetailsComplexType{}
	if protoimpl.UnsafeEnabled {
		mi := &file_event_logging_v4_user_details_complex_type_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UserDetailsComplexType) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UserDetailsComplexType) ProtoMessage() {}

func (x *UserDetailsComplexType) ProtoReflect() protoreflect.Message {
	mi := &file_event_logging_v4_user_details_complex_type_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UserDetailsComplexType.ProtoReflect.Descriptor instead.
func (*UserDetailsComplexType) Descriptor() ([]byte, []int) {
	return file_event_logging_v4_user_details_complex_type_proto_rawDescGZIP(), []int{0}
}

func (x *UserDetailsComplexType) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *UserDetailsComplexType) GetStaffNumber() string {
	if x != nil {
		return x.StaffNumber
	}
	return ""
}

func (x *UserDetailsComplexType) GetSurname() string {
	if x != nil {
		return x.Surname
	}
	return ""
}

func (x *UserDetailsComplexType) GetInitials() string {
	if x != nil {
		return x.Initials
	}
	return ""
}

func (x *UserDetailsComplexType) GetTitle() string {
	if x != nil {
		return x.Title
	}
	return ""
}

func (x *UserDetailsComplexType) GetGivenName() string {
	if x != nil {
		return x.GivenName
	}
	return ""
}

func (x *UserDetailsComplexType) GetKnownAs() string {
	if x != nil {
		return x.KnownAs
	}
	return ""
}

func (x *UserDetailsComplexType) GetPersonType() string {
	if x != nil {
		return x.PersonType
	}
	return ""
}

func (x *UserDetailsComplexType) GetGroup() string {
	if x != nil {
		return x.Group
	}
	return ""
}

func (x *UserDetailsComplexType) GetUnit() string {
	if x != nil {
		return x.Unit
	}
	return ""
}

func (x *UserDetailsComplexType) GetPosition() string {
	if x != nil {
		return x.Position
	}
	return ""
}

func (x *UserDetailsComplexType) GetRole() string {
	if x != nil {
		return x.Role
	}
	return ""
}

func (x *UserDetailsComplexType) GetGradeOfPost() string {
	if x != nil {
		return x.GradeOfPost
	}
	return ""
}

func (x *UserDetailsComplexType) GetEmploymentType() string {
	if x != nil {
		return x.EmploymentType
	}
	return ""
}

func (x *UserDetailsComplexType) GetEmploymentStatus() string {
	if x != nil {
		return x.EmploymentStatus
	}
	return ""
}

func (x *UserDetailsComplexType) GetNationality() string {
	if x != nil {
		return x.Nationality
	}
	return ""
}

func (x *UserDetailsComplexType) GetLocation() string {
	if x != nil {
		return x.Location
	}
	return ""
}

func (x *UserDetailsComplexType) GetRoomNumber() string {
	if x != nil {
		return x.RoomNumber
	}
	return ""
}

func (x *UserDetailsComplexType) GetPhone() string {
	if x != nil {
		return x.Phone
	}
	return ""
}

func (x *UserDetailsComplexType) GetSecondaryPhone() string {
	if x != nil {
		return x.SecondaryPhone
	}
	return ""
}

func (x *UserDetailsComplexType) GetSupervisorStaffNumber() string {
	if x != nil {
		return x.SupervisorStaffNumber
	}
	return ""
}

func (x *UserDetailsComplexType) GetOccupancyEndDate() uint32 {
	if x != nil {
		return x.OccupancyEndDate
	}
	return 0
}

func (x *UserDetailsComplexType) GetOrganisation() string {
	if x != nil {
		return x.Organisation
	}
	return ""
}

func (x *UserDetailsComplexType) GetHostOrganisation() string {
	if x != nil {
		return x.HostOrganisation
	}
	return ""
}

func (x *UserDetailsComplexType) GetData() []*DataComplexType {
	if x != nil {
		return x.Data
	}
	return nil
}

var File_event_logging_v4_user_details_complex_type_proto protoreflect.FileDescriptor

var file_event_logging_v4_user_details_complex_type_proto_rawDesc = []byte{
	0x0a, 0x30, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f,
	0x76, 0x34, 0x2f, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x64, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x73, 0x5f,
	0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x12, 0x10, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e,
	0x67, 0x2e, 0x76, 0x34, 0x1a, 0x28, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67,
	0x69, 0x6e, 0x67, 0x2f, 0x76, 0x34, 0x2f, 0x64, 0x61, 0x74, 0x61, 0x5f, 0x63, 0x6f, 0x6d, 0x70,
	0x6c, 0x65, 0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1b,
	0x62, 0x75, 0x66, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x2f, 0x76, 0x61, 0x6c,
	0x69, 0x64, 0x61, 0x74, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xdc, 0x06, 0x0a, 0x16,
	0x55, 0x73, 0x65, 0x72, 0x44, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x73, 0x43, 0x6f, 0x6d, 0x70, 0x6c,
	0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x12, 0x21, 0x0a, 0x0c, 0x73, 0x74, 0x61, 0x66, 0x66, 0x5f,
	0x6e, 0x75, 0x6d, 0x62, 0x65, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x73, 0x74,
	0x61, 0x66, 0x66, 0x4e, 0x75, 0x6d, 0x62, 0x65, 0x72, 0x12, 0x18, 0x0a, 0x07, 0x73, 0x75, 0x72,
	0x6e, 0x61, 0x6d, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x73, 0x75, 0x72, 0x6e,
	0x61, 0x6d, 0x65, 0x12, 0x1a, 0x0a, 0x08, 0x69, 0x6e, 0x69, 0x74, 0x69, 0x61, 0x6c, 0x73, 0x18,
	0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x69, 0x6e, 0x69, 0x74, 0x69, 0x61, 0x6c, 0x73, 0x12,
	0x14, 0x0a, 0x05, 0x74, 0x69, 0x74, 0x6c, 0x65, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05,
	0x74, 0x69, 0x74, 0x6c, 0x65, 0x12, 0x1d, 0x0a, 0x0a, 0x67, 0x69, 0x76, 0x65, 0x6e, 0x5f, 0x6e,
	0x61, 0x6d, 0x65, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x67, 0x69, 0x76, 0x65, 0x6e,
	0x4e, 0x61, 0x6d, 0x65, 0x12, 0x19, 0x0a, 0x08, 0x6b, 0x6e, 0x6f, 0x77, 0x6e, 0x5f, 0x61, 0x73,
	0x18, 0x07, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x6b, 0x6e, 0x6f, 0x77, 0x6e, 0x41, 0x73, 0x12,
	0x1f, 0x0a, 0x0b, 0x70, 0x65, 0x72, 0x73, 0x6f, 0x6e, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x18, 0x08,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x70, 0x65, 0x72, 0x73, 0x6f, 0x6e, 0x54, 0x79, 0x70, 0x65,
	0x12, 0x14, 0x0a, 0x05, 0x67, 0x72, 0x6f, 0x75, 0x70, 0x18, 0x09, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x05, 0x67, 0x72, 0x6f, 0x75, 0x70, 0x12, 0x12, 0x0a, 0x04, 0x75, 0x6e, 0x69, 0x74, 0x18, 0x0a,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x75, 0x6e, 0x69, 0x74, 0x12, 0x1a, 0x0a, 0x08, 0x70, 0x6f,
	0x73, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x0b, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x70, 0x6f,
	0x73, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x12, 0x0a, 0x04, 0x72, 0x6f, 0x6c, 0x65, 0x18, 0x0c,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x72, 0x6f, 0x6c, 0x65, 0x12, 0x22, 0x0a, 0x0d, 0x67, 0x72,
	0x61, 0x64, 0x65, 0x5f, 0x6f, 0x66, 0x5f, 0x70, 0x6f, 0x73, 0x74, 0x18, 0x0d, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x0b, 0x67, 0x72, 0x61, 0x64, 0x65, 0x4f, 0x66, 0x50, 0x6f, 0x73, 0x74, 0x12, 0x27,
	0x0a, 0x0f, 0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x6d, 0x65, 0x6e, 0x74, 0x5f, 0x74, 0x79, 0x70,
	0x65, 0x18, 0x0e, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0e, 0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x6d,
	0x65, 0x6e, 0x74, 0x54, 0x79, 0x70, 0x65, 0x12, 0x2b, 0x0a, 0x11, 0x65, 0x6d, 0x70, 0x6c, 0x6f,
	0x79, 0x6d, 0x65, 0x6e, 0x74, 0x5f, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x18, 0x0f, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x10, 0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x6d, 0x65, 0x6e, 0x74, 0x53, 0x74,
	0x61, 0x74, 0x75, 0x73, 0x12, 0x20, 0x0a, 0x0b, 0x6e, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x61, 0x6c,
	0x69, 0x74, 0x79, 0x18, 0x10, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x6e, 0x61, 0x74, 0x69, 0x6f,
	0x6e, 0x61, 0x6c, 0x69, 0x74, 0x79, 0x12, 0x1a, 0x0a, 0x08, 0x6c, 0x6f, 0x63, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x18, 0x11, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x6c, 0x6f, 0x63, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x12, 0x1f, 0x0a, 0x0b, 0x72, 0x6f, 0x6f, 0x6d, 0x5f, 0x6e, 0x75, 0x6d, 0x62, 0x65,
	0x72, 0x18, 0x12, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x72, 0x6f, 0x6f, 0x6d, 0x4e, 0x75, 0x6d,
	0x62, 0x65, 0x72, 0x12, 0x14, 0x0a, 0x05, 0x70, 0x68, 0x6f, 0x6e, 0x65, 0x18, 0x13, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x05, 0x70, 0x68, 0x6f, 0x6e, 0x65, 0x12, 0x27, 0x0a, 0x0f, 0x73, 0x65, 0x63,
	0x6f, 0x6e, 0x64, 0x61, 0x72, 0x79, 0x5f, 0x70, 0x68, 0x6f, 0x6e, 0x65, 0x18, 0x14, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x0e, 0x73, 0x65, 0x63, 0x6f, 0x6e, 0x64, 0x61, 0x72, 0x79, 0x50, 0x68, 0x6f,
	0x6e, 0x65, 0x12, 0x36, 0x0a, 0x17, 0x73, 0x75, 0x70, 0x65, 0x72, 0x76, 0x69, 0x73, 0x6f, 0x72,
	0x5f, 0x73, 0x74, 0x61, 0x66, 0x66, 0x5f, 0x6e, 0x75, 0x6d, 0x62, 0x65, 0x72, 0x18, 0x15, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x15, 0x73, 0x75, 0x70, 0x65, 0x72, 0x76, 0x69, 0x73, 0x6f, 0x72, 0x53,
	0x74, 0x61, 0x66, 0x66, 0x4e, 0x75, 0x6d, 0x62, 0x65, 0x72, 0x12, 0x2c, 0x0a, 0x12, 0x6f, 0x63,
	0x63, 0x75, 0x70, 0x61, 0x6e, 0x63, 0x79, 0x5f, 0x65, 0x6e, 0x64, 0x5f, 0x64, 0x61, 0x74, 0x65,
	0x18, 0x16, 0x20, 0x01, 0x28, 0x0d, 0x52, 0x10, 0x6f, 0x63, 0x63, 0x75, 0x70, 0x61, 0x6e, 0x63,
	0x79, 0x45, 0x6e, 0x64, 0x44, 0x61, 0x74, 0x65, 0x12, 0x22, 0x0a, 0x0c, 0x6f, 0x72, 0x67, 0x61,
	0x6e, 0x69, 0x73, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x17, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0c,
	0x6f, 0x72, 0x67, 0x61, 0x6e, 0x69, 0x73, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x2b, 0x0a, 0x11,
	0x68, 0x6f, 0x73, 0x74, 0x5f, 0x6f, 0x72, 0x67, 0x61, 0x6e, 0x69, 0x73, 0x61, 0x74, 0x69, 0x6f,
	0x6e, 0x18, 0x18, 0x20, 0x01, 0x28, 0x09, 0x52, 0x10, 0x68, 0x6f, 0x73, 0x74, 0x4f, 0x72, 0x67,
	0x61, 0x6e, 0x69, 0x73, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x3f, 0x0a, 0x04, 0x64, 0x61, 0x74,
	0x61, 0x18, 0x19, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x21, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f,
	0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x2e, 0x44, 0x61, 0x74, 0x61, 0x43,
	0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54, 0x79, 0x70, 0x65, 0x42, 0x08, 0xba, 0x48, 0x05, 0x92,
	0x01, 0x02, 0x08, 0x00, 0x52, 0x04, 0x64, 0x61, 0x74, 0x61, 0x42, 0xdf, 0x01, 0x0a, 0x1c, 0x75,
	0x6b, 0x2e, 0x67, 0x6f, 0x76, 0x2e, 0x67, 0x63, 0x68, 0x71, 0x2e, 0x65, 0x76, 0x65, 0x6e, 0x74,
	0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x76, 0x34, 0x42, 0x1b, 0x55, 0x73, 0x65,
	0x72, 0x44, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x73, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x78, 0x54,
	0x79, 0x70, 0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x45, 0x67, 0x69, 0x74, 0x68,
	0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x67, 0x63, 0x68, 0x71, 0x2f, 0x65, 0x76, 0x65, 0x6e,
	0x74, 0x2d, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2d, 0x73, 0x63, 0x68, 0x65, 0x6d, 0x61,
	0x2f, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x76,
	0x34, 0x3b, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x76,
	0x34, 0xa2, 0x02, 0x03, 0x45, 0x58, 0x58, 0xaa, 0x02, 0x0f, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x4c,
	0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x56, 0x34, 0xca, 0x02, 0x0f, 0x45, 0x76, 0x65, 0x6e,
	0x74, 0x4c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x5c, 0x56, 0x34, 0xe2, 0x02, 0x1b, 0x45, 0x76,
	0x65, 0x6e, 0x74, 0x4c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x5c, 0x56, 0x34, 0x5c, 0x47, 0x50,
	0x42, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0xea, 0x02, 0x10, 0x45, 0x76, 0x65, 0x6e,
	0x74, 0x4c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x3a, 0x3a, 0x56, 0x34, 0x62, 0x06, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_event_logging_v4_user_details_complex_type_proto_rawDescOnce sync.Once
	file_event_logging_v4_user_details_complex_type_proto_rawDescData = file_event_logging_v4_user_details_complex_type_proto_rawDesc
)

func file_event_logging_v4_user_details_complex_type_proto_rawDescGZIP() []byte {
	file_event_logging_v4_user_details_complex_type_proto_rawDescOnce.Do(func() {
		file_event_logging_v4_user_details_complex_type_proto_rawDescData = protoimpl.X.CompressGZIP(file_event_logging_v4_user_details_complex_type_proto_rawDescData)
	})
	return file_event_logging_v4_user_details_complex_type_proto_rawDescData
}

var file_event_logging_v4_user_details_complex_type_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_event_logging_v4_user_details_complex_type_proto_goTypes = []interface{}{
	(*UserDetailsComplexType)(nil), // 0: event_logging.v4.UserDetailsComplexType
	(*DataComplexType)(nil),        // 1: event_logging.v4.DataComplexType
}
var file_event_logging_v4_user_details_complex_type_proto_depIdxs = []int32{
	1, // 0: event_logging.v4.UserDetailsComplexType.data:type_name -> event_logging.v4.DataComplexType
	1, // [1:1] is the sub-list for method output_type
	1, // [1:1] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_event_logging_v4_user_details_complex_type_proto_init() }
func file_event_logging_v4_user_details_complex_type_proto_init() {
	if File_event_logging_v4_user_details_complex_type_proto != nil {
		return
	}
	file_event_logging_v4_data_complex_type_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_event_logging_v4_user_details_complex_type_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UserDetailsComplexType); i {
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
			RawDescriptor: file_event_logging_v4_user_details_complex_type_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_event_logging_v4_user_details_complex_type_proto_goTypes,
		DependencyIndexes: file_event_logging_v4_user_details_complex_type_proto_depIdxs,
		MessageInfos:      file_event_logging_v4_user_details_complex_type_proto_msgTypes,
	}.Build()
	File_event_logging_v4_user_details_complex_type_proto = out.File
	file_event_logging_v4_user_details_complex_type_proto_rawDesc = nil
	file_event_logging_v4_user_details_complex_type_proto_goTypes = nil
	file_event_logging_v4_user_details_complex_type_proto_depIdxs = nil
}
