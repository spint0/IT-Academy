import java.util.Arrays;
import java.util.Scanner;

public class SieveofEratosthenes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please type the number: ");
        int numb1 = input.nextInt();
        boolean[] myArray = new boolean[numb1 + 1];
        Arrays.fill(myArray, true);

        for (int i = 2; i * i <= numb1; i++) {
            if (myArray[i]) {
                for (int j = i * i; j <= numb1; j += i) {
                    myArray[j] = false;
                }
            }

        }
        for (int i = 2; i <= numb1; i++) {
            if (myArray[i])
                System.out.print(i + ", ");

        }

    }
}
