import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {


    public static void main(String[] args) {

        // Creating the array

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

        if (a >= b) {
            int[] matrix3 = new int[b];
            Common(matrix1,matrix2,matrix3,a,b,b);
        } else {
            int[] matrix3 = new int[a];
            Common(matrix1,matrix2,matrix3,b,a,a);
        }

    }
    public static void Common(int[] A, int[] B, int[] C, int x, int y, int z) {

        int count = 0;
        int control=0;
        String array="";
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {

                if (A[i] == B[j]) { //Found a duplicate

                    for (int k = 0; k < z; k++) { // Check if it is on our duplicateArray
                        if (A[i] == 0) { //If the duplicate value is 0, the I need the 0 next to the last non-0 number of the duplicateArray
                            control = 1;
                        } else if (C[k] != 0 && C[k] == A[i]) { // There is already a duplicate value
                            break;
                        } else if (C[k] == 0) {
                            C[k] = A[i]; // Put the value on my duplicateArray
                            count++; //Counts how many duplicates are
                            break;
                        }
                    }
                    break;
                }
            }
        }
        System.out.println("Common elements: " + Arrays.toString(Arrays.copyOfRange(C, 0, count + control)));
    }
}
