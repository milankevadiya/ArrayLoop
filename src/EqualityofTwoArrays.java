//9.	Write a Java program to test the equality of two arrays.

import java.util.Arrays;

public class EqualityofTwoArrays {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        int b[] = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Two arrays equals to = "+Arrays.equals(a,b));
    }
}
