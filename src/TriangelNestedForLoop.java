//21.	Display right angle triangle of @ using nested for loops

import java.util.Scanner;

public class TriangelNestedForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row value for make triangel ");
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}


