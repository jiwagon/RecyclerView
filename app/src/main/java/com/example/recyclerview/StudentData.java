package com.example.recyclerview;

class StudentData {

    final private String studentName;
    final private int profileImage;
    final private String email;
    final private String phone;
    final private String eventInterest;

    public StudentData(String studentName, int profileImage,
                      String email, String phone, String eventInterest) {
        this.studentName = studentName;
        this.email = email;
        this.phone = phone;
        this.profileImage = profileImage;
        this.eventInterest = eventInterest;
    }


    public String getStudentName() {
        return studentName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getEventInterest() {
        return eventInterest;
    }

    public int getProfileImage() {
        return profileImage;
    }
}
