//17.	WAP to input any number and check if it is Palindrome or not

import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value for check palindrom or not ");
        int n= scanner.nextInt();

            int r,sum=0,temp;

            temp=n;
            while(n>0){
                r=n%10;  //getting remainder
                sum=(sum*10)+r;
                n=n/10;
            }
            if(temp==sum)
                System.out.println("palindrome number ");
            else
                System.out.println("not palindrome");
        }
    }