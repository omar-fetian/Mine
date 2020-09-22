import java.util.Scanner;
public class While_flag_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, sum = 0, counter = 0;
        boolean flag_positive = true;
        System.out.println("Enter a positive number :");
        while (flag_positive){
            num = in.nextInt();
            if (num >= 0)   sum += num;
            else {flag_positive = false; break;}
        }
        System.out.println("Sum = " + sum);
    }
}
