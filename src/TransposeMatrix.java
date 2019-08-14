//10.	Write a 2-D array .. and WAP to transpose a matrix.. (row value should be transposed to column and column value should
// be printed in row) 

public class TransposeMatrix {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("print orignal matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)

            System.out.print(a[i][j]);
            System.out.println();

        }

        System.out.println("Transpose matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(a[j][i]);

            }
            System.out.println();
        }

    }
}
