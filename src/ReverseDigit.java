//15.	WAP to input any five digit number and then reverse the number

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five digit number");
        int a=scanner.nextInt();
        int b=0;
        while( a != 0 )
        {
            b = b * 10;
            b = b + a%10;
            a = a/10;
        }

        System.out.println("Reverse of input number is: "+b);
    }
}

