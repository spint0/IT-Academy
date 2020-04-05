import java.util.Arrays;
import java.util.Scanner;

public class SumMatrix {

    public static void main(String[] args) {

        // Creating the array

        Scanner input = new Scanner(System.in);
        System.out.print("What should be the size of the two matrix?: ");

        int s = input.nextInt();
        int[][] matrix1 = new int[s][s];
        int[][] matrix2 = new int[s][s];
        int sum =0;

        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                System.out.print("Please input a number for Matrix 1 " + "[" + i + "][" + j + "] ");
                matrix1[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                System.out.print("Please input a number for Matrix 2 " + "[" + i + "][" + j + "] ");
                matrix2[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                sum += matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("The total sum is: " + sum);
    }

}
