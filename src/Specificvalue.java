//	Write a Java program to test if an array contains a specific value.

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Specificvalue {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
        //convert integer array to list
        List<Integer> list = Arrays.asList(a);

        if (list.contains("s"))
        {
            System.out.println("hello");
        }
    }
}
