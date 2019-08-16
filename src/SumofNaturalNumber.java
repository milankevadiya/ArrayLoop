//19.	Write a program in Java to display n limit of natural numbers and their sum.
//Expected Output :
//The first n natural numbers are : 1 2 3 4 5 6 7
//The Sum of Natural Number upto n limit : 28

import java.util.Scanner;

public class SumofNaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for find sum");
        int a = scanner.nextInt();
        int i=0;

        int sum=0;
        while(i<=a)
        {
            sum=sum+i;
            i++;
            System.out.print(i+" ");
        }
        //System.out.println("The first n natural numbers ");
        System.out.println();
        System.out.println("The Sum of Natural Number = "+sum);
    }
}
