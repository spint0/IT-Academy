import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {

        // Creating the array

        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers would you like to add?: ");

        int arraySize = input.nextInt();
        int[] myArray = new int[arraySize];


        for (int i = 0; i < arraySize; i++) {
            System.out.print("Please input a number: ");
            myArray[i] = input.nextInt();
        }

        insertionSort(myArray,arraySize-1);
        System.out.println(Arrays.toString(myArray));
    }

    private static void insertionSort(int[] A, int n) {

        if (n > 0) {
            insertionSort(A, n - 1);
            int x = A[n]; //last element to sort
            int j = n - 1;
            while (j >= 0 && A[j] > x) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = x;

        }


    }
}