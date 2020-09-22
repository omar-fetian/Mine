import java.util.Scanner;
public class Average_total_for_variable_students {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0, mark, sum = 0, st_no; float avg;
        System.out.print("Enter the number of students:");
        st_no = in.nextInt();
        while (count < st_no){
            System.out.printf("Enter Student No. %d mark:", count+1);
            mark = in.nextInt();
            if (mark == -1) {System.out.println("the following average for previous students"); break;}
            sum += mark;
            count++;
        }
        avg = (float) sum / count;
        System.out.printf("the average is :%1.2f", avg);
    }
}
