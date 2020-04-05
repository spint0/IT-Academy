import java.util.Arrays;
import java.util.Scanner;

public class ReversedArray {

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

        System.out.println("Your collection is: " + Arrays.toString(myArray));

        // Reversing the Array

        int t;
        for (int i = 0; i < arraySize / 2; i++){
            t = myArray[i];
            myArray[i] = myArray[ arraySize - i - 1];
            myArray[arraySize - i - 1] = t;
        }
        System.out.println("Your reversed collection is: " + Arrays.toString(myArray));

    }

}
