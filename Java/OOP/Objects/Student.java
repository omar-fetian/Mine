package com.MyClass;
public class Student extends Person {
    private String Specialization;
    private double GPA;
    private int StudyLevel;
    public Student() {
    }
    public Student(String name) {
        super(name);
    }
    public Student(String name, int age, String nationality, String address, int studyLevel, String specialization, double GPA) {
        super(name, age, nationality, address);
        StudyLevel = studyLevel;
        Specialization = specialization;
        this.GPA = GPA;
    }
    public void setStudyLevel(int studyLevel) {
        StudyLevel = studyLevel;
    }
    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    public int getStudyLevel() {
        return StudyLevel;
    }
    public String getSpecialization() {
        return Specialization;
    }
    public double getGPA() {
        return GPA;
    }
    public String toString() {
        return "Student{" +
                super.toString() +
                "Specialization='" + Specialization + '\'' +
                ", GPA=" + GPA +
                ", StudyLevel=" + StudyLevel +
                '}';
    }//overriding
}
