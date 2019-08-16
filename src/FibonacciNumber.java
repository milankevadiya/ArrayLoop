//20.	Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number) – limitation is n

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter digit for find fibonacci");
        int n=scanner.nextInt();
        int a=0,b=1,c;

        for(int i=1; i<n; i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
