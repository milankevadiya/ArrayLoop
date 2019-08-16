//22.	Write a program in Java to display the multiplication table of a given integer.

import java.util.Scanner;

public class MultiplicationofTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for multiplication table");
        int a = scanner.nextInt();
        int number = 0;
        int c;
        for (int i = 0; i <= a; i++)
        {
            int c1 = i * a;
            System.out.println(a + "*"+i +"="+c1);

        }
    }
}
