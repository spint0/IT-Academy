import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please type the number: ");
        int numb = input.nextInt();
        System.out.println("Your number is: " + numb);

        int sum = 0;
        while (numb != 0) {

            sum += numb % 10;
            numb = numb / 10;

        }
        System.out.println("The total sum of the digits of your number is: " + sum);

    }

}
