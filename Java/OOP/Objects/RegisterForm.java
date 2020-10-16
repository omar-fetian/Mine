package com.MyClass;

enum Gender{Male, Female}
enum Course{Math, Science, English}
enum Semester{Fall, Winter, Spring, Summer}

public class RegisterForm {
    private String StdName;
    private Gender StdGender;
    private Course CourseName;
    private Semester SrsSemesters;

    public RegisterForm() {
    }

    public RegisterForm(String stdName) {
        StdName = stdName;
    }

    public RegisterForm(String stdName, Gender stdGender, Course courseName, Semester srsSemesters) {
        StdName = stdName;
        StdGender = stdGender;
        CourseName = courseName;
        SrsSemesters = srsSemesters;
    }

    public String getStdName() {
        return StdName;
    }

    public void setStdName(String stdName) {
        StdName = stdName;
    }

    public Gender getStdGender() {
        return StdGender;
    }

    public void setStdGender(Gender stdGender) {
        StdGender = stdGender;
    }

    public Course getCourseName() {
        return CourseName;
    }

    public void setCourseName(Course courseName) {
        CourseName = courseName;
    }

    public Semester getSrsSemesters() {
        return SrsSemesters;
    }

    public void setSrsSemesters(Semester srsSemesters) {
        SrsSemesters = srsSemesters;
    }

    public String toString() {
        return "RegisterForm{" +
                "StdName='" + StdName + '\'' +
                ", StdGender=" + StdGender +
                ", CourseName=" + CourseName +
                ", SrsSemesters=" + SrsSemesters +
                '}';
    }
}
