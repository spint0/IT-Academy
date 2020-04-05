import java.util.Arrays;
import java.util.Scanner;

public class ArrayDuplicates {

    public static void main(String[] args) {

        // Creating the array

        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers would you like to add?: ");

        int arraySize = input.nextInt();
        int[] myArray = new int[arraySize];
        int[] duplicateArray = new int[arraySize];

        // User inputs Array Values

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Please input a number: ");
            myArray[i] = input.nextInt();
        }

        System.out.println("Your collection is: " + Arrays.toString(myArray));

        // Check what values are repeated

        int count = 0; //Counts how many duplicates values are
        int control = 0; // Control variable to check if a 0 is duplicate, it will always be at the end of the duplicateArray

        // Goes to the myArray to find duplicates
        for (int i = 0; i < arraySize - 1; i++) {
            for (int j = i + 1; j <= arraySize - 1; j++) {
                if (myArray[i] == myArray[j]) { //Found a duplicate

                    for (int k = 0; k < arraySize - 1; k++) { // Check if it is on our duplicateArray
                        if (myArray[i] == 0) { //If the duplicate value is 0, the I need the 0 next to the last non-0 number of the duplicateArray
                            control = 1;
                        } else if (duplicateArray[k] != 0 && duplicateArray[k] == myArray[i]) { // There is already a duplicate value
                            break;
                        } else if (duplicateArray[k] == 0) {
                            duplicateArray[k] = myArray[i]; // Put the value on my duplicateArray
                            count++; //Counts how many duplicates are
                            break;
                        }
                    }
                    break;
                }
            }
        }
        // Returns a smaller array that goes from the beginning of the duplicate Array to the duplicate counted and +1 if a zero is duplicated
        System.out.println("Your Duplicate collection is: " + Arrays.toString(Arrays.copyOfRange(duplicateArray, 0, count + control)));
    }


}