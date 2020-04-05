import java.util.Scanner;

public class ArraysLesson {

    public static void main(String[] args) {
        /*
        double[] myList = new double[10];
        myList[0] = Math.PI;
         // myList[10] = 10; // runtime error due to index being out of bonds
        myList[9] = "tree";
        */

        // Week Day using array //

        Scanner input = new Scanner(System.in);
        // int num = input.nextInt();

        // String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // String weekday = weekdays[num-1];

        //  for (String weekday : weekdays) {
        //    System.out.print(weekday + " ");
        // }

        int length = input.nextInt();
        int[] numbers = new int[length];
        int a = 456;
        for (int i = 0; i < length; i++) {
            numbers[i] = input.nextInt();
        }

        int sum = 0;
        int max = Integer.MIN_VALUE; // better practice than using 0, protects for negative values

        for (int number : numbers) {
            sum += number;

            if (max < number) {
                max = number;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
    }

}
