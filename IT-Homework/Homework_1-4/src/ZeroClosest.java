import java.util.Arrays;
import java.util.Scanner;

public class ZeroClosest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What should be the size of the first Array: ");

        int a = input.nextInt();
        int[] matrix1 = new int[a];
        for (int i = 0; i < a; i++) {

            System.out.print("Array 1 insert number: ");
            matrix1[i] = input.nextInt();
        }

        int dif = Integer.MAX_VALUE;
        int[] array = new int[2];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = i + 1; j < matrix1.length; j++) {
                int sum = Math.abs(matrix1[i] + matrix1[j]);

                if (sum < dif && sum > 0) {
                    dif = sum;
                    array[0] = matrix1[i];
                    array[1] = matrix1[j];

                }


            }
        }
        System.out.println(Arrays.toString(array));

    }
}