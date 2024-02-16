package model;

import java.util.ArrayList;

public class FacultyProfile {
    private String fullName;
    private String position;
    private String department;
    private ArrayList<String> topics;
    private String email;
    private String phoneNumber;
    private String fileName;

    public FacultyProfile(String fullName, String position, String department) {
        this.fullName = fullName;
        this.position = position;
        this.department = department;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public ArrayList<String> getTopics() {
        return topics;
    }

    public void setTopics(ArrayList<String> topics) {
        this.topics = topics;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void uploadImage() {
        System.out.println("Uploading image...");
    }

    public void printFacultyInfo() {
        System.out.print(fullName);
        System.out.print(", " + position);
        System.out.println(" | " + department);
    }

}
