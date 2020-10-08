package com.MyClass;

public class Person {
    private  String Name, Address, Nationality;
    private int Age;
    public Person(){
    }
    public Person(String name){
        Name = name;
    }
    public Person(String name, int age, String nationality, String address){
        Name = name;   Nationality = nationality;     Age = age;     Address = address;
    }
    public void setAge(int age) {
        Age = age;
    }
    public void setAddress(String address) {
        Address = address;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getAge() {
        return Age;
    }
    public String getAddress() {
        return Address;
    }
    public String getName() {
        return Name;
    }
    public String getNationality() {
        return Nationality;
    }
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Nationality='" + Nationality + '\'' +
                ", Age=" + Age +
                '}';
    }
}
