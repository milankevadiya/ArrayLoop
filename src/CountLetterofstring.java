//11.	WAP to enter any String and count total number of 'a' in that String. 

import java.util.Scanner;

public class CountLetterofstring {

    public static void main(String[] args) {
        int count = 0;
        int b='a';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string value");
        String name = scanner.next();
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)==b) {
                count++;


            }

        }
        System.out.println("Total number of char a in this string = "+count);
    }
}
