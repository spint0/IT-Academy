import java.util.Scanner;

class AgeDiscounts {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hello! What is your age? ");
        int age = input.nextInt();

        if (age > 65 || age < 18) {

            System.out.print("Are you a regular? (Y/N) ");
            String regular = input.next();

            if (regular.equalsIgnoreCase("Y")) {
                if (age > 65) {
                    System.out.println("Your total discount is 15%");
                } else {
                    System.out.println("Your total discount is 30%");
                }
            } else if (regular.equalsIgnoreCase("N")) {
                if (age > 65) {
                    System.out.println("Your total discount is 10%");
                } else {
                    System.out.println("Your total discount is 25%");
                }
            }
        } else {
            System.out.println("I'm sorry but you are not entitled to discounts! ");
        }
    }
}