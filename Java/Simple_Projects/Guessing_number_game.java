import java.util.Scanner;
public class Guessing_number_game  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int guess, rand; boolean gameon = true;
        rand = (int) (Math.random() * 100);
        System.out.println("just for testing rand is "+ rand);
        while (gameon) {
            System.out.print("Enter your guess between 1 and 100:");
            guess = in.nextInt();
            if (guess == -1) break;
            else if (Math.abs(guess - rand) == 0) { System.out.println("Congrats !!!"); gameon = false;}
            else if (Math.abs(guess - rand) < 5) System.out.println("so close");
            else if (Math.abs(guess - rand) < 10) System.out.println("close");
            else if (Math.abs(guess - rand) < 20) System.out.println("far from the correct answer");
            else if (Math.abs(guess - rand) >= 20) System.out.println("too far from the correct answer");
        }

    }
}
