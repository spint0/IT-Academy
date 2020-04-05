import java.util.Arrays;
import java.util.Scanner;

public class UniqueTriplets {

    public static void main(String[] args) {

        // Creating the array

        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers would you like to add?: ");

        int arraySize = input.nextInt();
        int[] myArray = new int[arraySize];
        int[] tripletArray = new int[3];

        System.out.print("What is the target value?: ");

        int targVal = input.nextInt();

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Please input a number: ");
            myArray[i] = input.nextInt();
        }

        System.out.println("Your collection is: " + Arrays.toString(myArray));

        for (int i = 0; i < arraySize; i++) {
            for (int j = i + 1; j < arraySize; j++) {
                for (int k = j + 1; k < arraySize; k++) {
                    if ((myArray[i] + myArray[j] + myArray[k]) == targVal) {

                        tripletArray[0] = myArray[i];
                        tripletArray[1] = myArray[j];
                        tripletArray[2] = myArray[k];

                        Arrays.sort(tripletArray);
                        System.out.println(Arrays.toString(tripletArray));
                    }
                }

            }
        }
    }
}
