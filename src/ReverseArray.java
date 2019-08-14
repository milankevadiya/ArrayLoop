import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//6.	Write a Java program to reverse an array of integer values
public class ReverseArray {
    public static void main(String[] args) {
        Integer a[]={1,2,3,4,5,6,7,8,9};
        List<Integer> list = Arrays.asList(a);
        Collections.reverse(list);
        System.out.println("Reverse Array "+list );
    }
}
