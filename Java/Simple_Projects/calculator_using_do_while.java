import java.util.Scanner;
public class calculator_using_do_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char choice;    int num1, num2; float result = 0;
        System.out.print("Enter 2 numbers\n>>");    num1 = in.nextInt();
        System.out.print(">>");   num2 = in.nextInt();
        do {
            System.out.println("Choose the operation number from the following menu:");
            System.out.println("1- sum 2 numbers");
            System.out.println("2- subtract 2 numbers");
            System.out.println("3- divide 2 numbers");
            //System.out.println("change the 2 values");
            System.out.println("0- exit");
            System.out.print(">>");     choice = in.next().charAt(0);
            switch (choice){
                case '1':   result = num1 + num2;   break;
                case '2':    result = num1 - num2;   break;
                case '3':    {if (num2 == 0) {System.out.println("Div by 0!");break;}  result = (float) num1 / num2;   break;} 
                    //error the result last value will be printed so we've to stop this using Labels
                case '0':   break;
                default:    System.out.println("Invalid choice");
            }
            System.out.printf("The Result is %1.2f\n\n\n\n", result);
        }while (choice != '0');

    }
}
