import java.util.Scanner;

public class Draw_Line_Of_chars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num; char symbol;
        System.out.print("Enter the symbol :");
        symbol = in.next().charAt(0);
        System.out.print("Enter the number of stars:");
        num = in.nextInt();

        DrawLine(symbol ,num);

    }
    public static void DrawLine(char x, int y){
        int i;
        for (i = 0; i++ < y;)
            System.out.print(x);
        System.out.println();
    }
}
