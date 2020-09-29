package com.MyClass;
import java.util.Scanner;
public class Main {
    public static void find_employee_name(String[] args) {
        Scanner in = new Scanner(System.in);
        int employees_no, user_input;
        System.out.print("Enter the  number of Employees:");    employees_no = in.nextInt();
        int[] employees_HR_ID = new int[employees_no];
        String[] employees_names = new String[employees_no];
        System.out.println("Enter the employees names and HR ID");
        for (int i = 0; i < employees_no; i++){
            System.out.printf("Enter employee no %d name:", i+1);
            in.nextLine();
            employees_names[i] = in.nextLine();
            System.out.printf("Enter %s HR ID:",employees_names[i]);
            employees_HR_ID[i] = in.nextInt();
        }
        System.out.print("Enter the employee HR ID to find his name:");     user_input = in.nextInt();
        System.out.println("the employee name is " + employees_names[arr_1D_search(employees_HR_ID, user_input)]);

    }
    public static int arr_1D_search(int[] arr, int item){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == item) return i;
        }
        return -1;
    }


}
