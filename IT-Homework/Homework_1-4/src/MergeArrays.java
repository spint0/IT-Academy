import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {

    public static void main(String[] args) {

        // Creating the arrays that will store the numbers

        Scanner input = new Scanner(System.in);
        System.out.print("What should be the size of the first Array: ");

        int a = input.nextInt();
        int[] matrix1 = new int[a];
        for (int i = 0; i < a; i++) {

            System.out.print("Array 1 insert number: ");
            matrix1[i] = input.nextInt();
        }

        System.out.print("What should be the size of the second Array: ");
        int b = input.nextInt();
        int[] matrix2 = new int[b];

        for (int i = 0; i < b; i++) {

            System.out.print("Array 2 insert number: ");
            matrix2[i] = input.nextInt();
        }

        System.out.println("Array 1: " + Arrays.toString(matrix1));
        System.out.println("Array 2: " + Arrays.toString(matrix2));


        /*
        Created a function just for having less code in main
        */
            int[] matrix3 = new int[a + b]; // Will store the merged values.
            CompareMerge(matrix2, matrix1, matrix3, b, a, matrix3.length);
    }

    public static void CompareMerge(int[] A, int[] B, int[] C, int x, int y, int z) {

        int k = 0; // Value to iterate the merged array

        while (k < z) { // while the merged array hasn't reached its final index

            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {

                    if (i == x) {
                        // One array has reached the end, so he just complete the merged array with the other values.
                        while (j < y) {
                            C[k] = B[j];
                            k++;
                            j++;

                        }
                        break;
                        // Compare array values and choose which one to put in the merged array.
                    } else if (A[i] <= B[j]) {

                        C[k] = A[i];
                        i++;
                        j--;
                        k++;

                    } else {
                        C[k] = B[j];
                        k++;
                    }
                    if (j == y) {
                    // One array has reached the end, so he just complete the merged array with the other values.
                        while (i < x) {
                            C[k] = A[i];
                            k++;
                            i++;

                        }
                    }
                }

            }
            System.out.println("Array Joined: " + Arrays.toString(C));
        }
    }
}

