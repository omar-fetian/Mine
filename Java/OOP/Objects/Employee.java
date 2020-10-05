package com.MyClass;

public class Employee {
    private int Emp_ID;
    private String Name, Depart;
    private double Salary, Bonus;
    private boolean Resident;

    public Employee(){
        Emp_ID = 0;     Name = null;      Depart =  null;     Salary = 0;     Bonus = 0;      Resident = false;
    }
    public Employee(int emp_ID, String name){
        Emp_ID = emp_ID;        Name = name;
    }
    public Employee(int emp_ID, String name, boolean resident){
        this(emp_ID, name);//instead of writing the whole code we can call the last constructor code using this
        Resident = resident;
    }
    public Employee(int emp_ID, String name, String depart, double salary, double bonus, boolean resident){
        this(emp_ID, name, resident);    Depart = depart;    Salary = salary;    Bonus = bonus;
    }
    public void setSalary(double salary){
        Salary = salary;
    }
    public void setSalary(double salary, double bonus){
        this.setSalary(salary);    Bonus = bonus;
    }
    public void setDepart(String depart){
        Depart = depart;
    }
    public void setEmp_ID(int emp_ID){
        Emp_ID = emp_ID;
    }
    public void printEmployeeData(){
        System.out.printf("Employee ID: %d\nEmployee name : %s\nDepartment : %s\nSalary : %1.2f\nBonus : %1.2f\nResident :%b\n",
                Emp_ID, Name, Depart, Salary, Bonus, Resident);
    }
}
