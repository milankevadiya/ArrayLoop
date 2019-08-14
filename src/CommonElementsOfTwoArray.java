//8.	Write a Java program to find the common elements between two arrays (string values)

import java.util.Arrays;

public class CommonElementsOfTwoArray {
    public static void main(String[] args) {
        String a[]={"apple","mango","banana","orange","Grapes"};
        String b[]={"cherry","almond","mango","nut","orange"};

        System.out.println("array1 of value = "+ Arrays.toString(a));
        System.out.println("array2 of value = "+Arrays.toString(b));

        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<b.length; j++)
            {
                if(a[i]==b[j]){
                    System.out.println("Common elements of two Arrays = "+a[i]);
                }
            }
        }
    }
}
