//2.	Write a Java program to sum values of an array.


public class SumArray {
    public static void main(String[] args) {
        int arr[]= {10,20,30,40,50};
        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum=sum+arr[i];}
        System.out.println("sum of array="+sum);
    }

}

