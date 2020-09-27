import java.util.Scanner;
public class Extra_weight_Determination {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char dept; int weight, extra_charge = 0;
        System.out.print("Enter Your class F, B, E:");  dept = in.next().charAt(0);
        System.out.print("Enter Your Luggage weight (Kg):");  weight = in.nextInt();
        switch (dept){
            case 'f':
            case 'F':
                if (weight > 30)    extra_charge = (weight - 30) * 10;
                break;
            case 'b':
            case 'B':
                if (weight > 25)    extra_charge = (weight - 25) * 10;
                break;
            case 'e':
            case 'E':
                if (weight > 20)    extra_charge = (weight - 20) * 10;
                break;
            default:
                System.out.println("Invalid input");
        }
        System.out.println("You have to pay for extra " + extra_charge + " SR");
        System.out.println("Have a safe trip");

    }
}
