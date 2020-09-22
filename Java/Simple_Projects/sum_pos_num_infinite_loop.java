import java.util.Scanner;
public class sum_pos_num_infinite_loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, sum = 0;

        while (true){
            System.out.print("Enter a positive number :");
            num = in.nextInt();
            if (num >= 0)   sum += num;
            else {break;}
        }
        System.out.println("Sum = " + sum);
    }
}
