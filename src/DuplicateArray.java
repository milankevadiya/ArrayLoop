//7.	Write a Java program to find the duplicate values of an array of integer values. 

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DuplicateArray {


    public static void main(String[] args) {
        int a[] = {1, 2, 3, 2, 4, 4, 6, 3, 8, 9};

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] == a[j]) && (i != j)) {
                    System.out.println("Duplicate numeric value of array "+a[j]);
                }


            }
        }
    }
}