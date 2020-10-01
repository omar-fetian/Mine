package com.MyClass;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Take_students_marks_print_in_2D_table {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int student_no = 3, subjects_no  = 3;
        String[] student_names = new String[student_no];
        String[] subjects_names = new String[subjects_no];
        double[][] marks = new double[student_no][subjects_no];
        System.out.println("Enter Students names:");    arr_1D_fill(student_names);
        System.out.println("Enter subjects names:");    arr_1D_fill(subjects_names);
        System.out.println("Enter Marks:");     arr_2D_fill(marks, student_names, subjects_names);
        System.out.println("Your table ");      arr_2D_print(marks, student_names, subjects_names);

    }
    public static void arr_1D_fill(String [] arr){
        for (int i = 0; i < arr.length; i++)
        {System.out.printf("Enter name item NO. %d  :", i+1);     arr[i] =  in.next();}
    }
    public static void arr_2D_fill(double[][] marks, String [] name, String [] subject){
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < subject.length; j++){
                System.out.printf("Enter %s's mark at %s :", name[i], subject[j]);  marks[i][j] = in.nextDouble();
            }
        }
    }
    public static void arr_1D_print(String[] arr){
        for (int i = 0; i < arr.length; i++)
            System.out.printf("       %s          ", arr[i]);
        System.out.println();
    }
    public static void arr_2D_print(double[][] marks, String [] name, String [] subject){
        arr_1D_print(subject);
        for (int i = 0; i < name.length; i++) {
            System.out.printf("%s               ", name[i]);
            for (int j = 0; j < subject.length; j++){
                System.out.printf("%1.2f               ", marks[i][j]);
            }
            System.out.println();
        }
    }

}
