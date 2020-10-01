package com.MyClass;
import java.util.Scanner;
public class fill_print_search_1D_arr {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = new int[5]; char choice;
        System.out.println("Enter arr:");
        arr_1D_fill(array);
        System.out.println("Your array is");
        arr_1D_print(array);
        do {
        System.out.print("Enter a value to search:");   int search_val = in.nextInt();
        switch (arr_1D_search(array,search_val)){
            case -1: System.out.println("The value is not found"); break;
            default: System.out.printf("the value is found at position %d\n", arr_1D_search(array,search_val)+1);
        }
        System.out.print("search again y/n:");  choice = in.next().charAt(0);
        }while (choice == 'y');
    }
    public static void arr_1D_print(int[] arr){
        for (int i = 0; i < arr.length; i++)
            System.out.printf("%d  ", arr[i]);
        System.out.println();
    }
    public static void arr_1D_fill(int[] arr){
        for (int i = 0; i < arr.length; i++)
        {System.out.printf("Enter item NO. %d  :", i+1);     arr[i] =  in.nextInt();}
    }
    public static int arr_1D_search(int[] arr, int value){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value)   return i;
        }
        return -1;
    }//if the value is found it returns the index if not it returns -1
}
