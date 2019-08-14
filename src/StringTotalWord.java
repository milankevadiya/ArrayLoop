//12.	WAP to enter any String and count how many total number of words and total number of spaces in that sentence


import java.util.Scanner;

public class StringTotalWord {
    public static void main(String[] args) {
        int count = 0;
        int space = 0;
        int b = 'a';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string value");
        String name = scanner.nextLine();
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ' && (name.charAt(i + 1) != ' '))
                count++;
        }
        System.out.println("Total number of words = "+ (count + 1));

        for (int j = 0; j < name.length(); j++) {
            if (name.charAt(j) == ' ')
                space++;
        }
            System.out.println("Total space in sentance = " + space);
        }
    }
