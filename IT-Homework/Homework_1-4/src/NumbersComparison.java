import java.util.Scanner;

public class NumbersComparison {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input first integer: ");
        int numb1 = input.nextInt();
        System.out.print("Input second integer: ");
        int numb2 = input.nextInt();

        if (numb1 < numb2){
            System.out.println(numb1 + " < " + numb2);
        } else if (numb1 > numb2){
            System.out.println(numb1 + " > " + numb2);
        } else {
            System.out.println(numb1 + " = " + numb2);
        }

    }

}
