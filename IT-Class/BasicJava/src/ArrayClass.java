import java.util.Scanner;

public class ArrayClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What matrix would you like to create?: ");

        int arraySize = input.nextInt();
        int[][] myArray = new int[arraySize][arraySize];
        int sum = 0;

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {

                System.out.print("Please input a number: ");
                myArray[i][j] = input.nextInt();

            }
        }
            for (int i = 0; i < arraySize; i++) {
                sum += myArray[i][i];


            }
        System.out.println("The total value is: " + sum);
        }
    }