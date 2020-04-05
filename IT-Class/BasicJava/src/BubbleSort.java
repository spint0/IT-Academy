import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
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

        for (int i = 2; i <= arraySize; i++) {
            for (int j = 0; j <= arraySize - i; j++) {
                if (myArray[j] > myArray[j + 1]) {

                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}