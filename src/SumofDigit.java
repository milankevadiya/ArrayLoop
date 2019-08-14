//13.	WAP to input any five digit number and then find sum of each digit

import java.util.Scanner;

public class SumofDigit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any digit for Sum");
        int a = scanner.nextInt();
        int Sum=0;
        int b;

        while(a > 0) {
            b = a % 10;
            Sum = Sum+ b;
            a = a/10;
        }

        System.out.println("total sum of digit = "+ Sum);

        }

    }

