import java.util.Scanner;
class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char choice;
        int num1, num2;
        System.out.print("Enter Your choice:\n1.Add two numbers\n2.Get subtract of two numbers\n3.Get square of a number\n>>");
        choice = in.next().charAt(0);

        switch (choice){
            case '1':
                System.out.print("Enter 2 numbers to calculate the summation\n>>");
                num1 = in.nextInt();    System.out.print(">>");     num2 = in.nextInt();
                System.out.printf("Result = %d", num1+num2); break;
            case '2':
                System.out.print("Enter 2 numbers to calculate the Subtract\n>>");
                num1 = in.nextInt();    System.out.print(">>");     num2 = in.nextInt();
                System.out.printf("Result = %d", num1-num2); break;
            case '3':
                System.out.print("Enter a number to calculate the square\n>>");
                num1 = in.nextInt();
                System.out.printf("Result = %d", num1*num1); break;
            default:    System.out.println("Invalid value");
        }



        }
}
