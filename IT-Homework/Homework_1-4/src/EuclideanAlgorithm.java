import java.util.Scanner;

public class EuclideanAlgorithm {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please type the first number: ");
        int numb1 = input.nextInt();
        System.out.print("Please type the second number: ");
        int numb2 = input.nextInt();

        System.out.println("Your two numbers are: " + numb1 + " " + numb2);

        if (numb1<=numb2){
            int t = numb1;
            numb1 =numb2;
            numb2 = numb1;
        }

        while ( numb2 != 0){
            int t = numb2;
            numb2 = numb1 % numb2;
            numb1 = t;
        }
        System.out.println("The greatest common divisor is: " + numb1);

    }
}

