import java.util.Scanner;
class check_if_vowel_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char letter;
        System.out.print("Enter a letter\n>>");
        letter = in.next().charAt(0);
        switch (letter){
            case 'a':
            case 'o':
            case 'u':
            case 'i':
            case 'e':   System.out.println("this letter is vowel"); break;
            default:    System.out.println("this letter isn't a vowel");
        }

        }
}
