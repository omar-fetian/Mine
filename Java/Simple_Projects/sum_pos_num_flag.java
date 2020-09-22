import java.util.Scanner;
public class sum_pos_num_flag {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, sum = 0, counter = 0;
        boolean flag_positive = true;

        while (flag_positive){
            System.out.print("Enter a positive number :");
            num = in.nextInt();
            if (num >= 0)   sum += num;
            else {flag_positive = false;}
        }
        System.out.println("Sum = " + sum);
    }
}
