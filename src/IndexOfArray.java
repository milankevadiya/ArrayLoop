//	Write a Java program to find the index of an array element.

import java.util.Arrays;
import java.util.List;

public class IndexOfArray {
    static int a, b, c;

    public static void main(String args[]) {
        Integer a[] = {1, 2, 3, 4, 5, 6, 7};


        for (int i = 0; i < a.length; i++) {
            List<Integer> list = Arrays.asList(a);
            System.out.println("index of " + a[i] + "=" + list.indexOf(a[i]));


            // System.out.println("index of "list.indexOf(6));

        }
    }
}


