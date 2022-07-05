package tictactoe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        System.out.print("Enter cells: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        System.out.println("---------");
        System.out.println("| " + s.charAt(0) + " " + s.charAt(1) + " " + s.charAt(2) + " |");
        System.out.println("| " + s.charAt(3) + " " + s.charAt(4) + " " + s.charAt(5) + " |");
        System.out.println("| " + s.charAt(6) + " " + s.charAt(7) + " " + s.charAt(8) + " |");
        System.out.println("---------");

    }
}