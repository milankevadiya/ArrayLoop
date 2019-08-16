import java.util.Scanner;

public class Devideby3and5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 100 number for find value divided by 3 and 5");
        int a=scanner.nextInt();
        System.out.print("Nmmber devided by 3 = ");
        for(int i=1; i<=a; i++) {
            if (i % 3 == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.print("Nmmber devided by 5 = ");
        for(int j=1; j<=a;j++){
            if(j%5==0){
                System.out.print(j+" ");
            }

        }

    }
}
