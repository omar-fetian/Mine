import java.util.Scanner;

public class Two_arrays_sum {

    public static void main(String[] args) {
        int[] arr1 = {5, -9, 4, 7, -8, 2, -6};
        int[] arr2 = {4, 9, 5, 14, 48, 12, 76};
        arr_print(arr1);System.out.println("+");arr_print(arr2);System.out.println("------------------");
        arr_print(arr_sum(arr1,arr2));

    }
    public static int[] arr_sum(int[] arr1, int[] arr2){
        int[] sum = new int[arr1.length];
        for (int i = 0; i < sum.length; i++){
            sum[i] = arr1[i] + arr2[i];
        }
        return sum;
    }
    public static void arr_print(int[] arr){
        for (int i = 0; i < arr.length; i++ )
            System.out.print(arr[i] + "  ");
        System.out.println();
    }

}
