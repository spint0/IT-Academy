import java.util.Scanner;

public class CircleDimensions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the circle radius: ");
        double rad = input.nextDouble();

        System.out.println("Perimeter is = " + (2 * rad * Math.PI));
        System.out.println("Area is = " + (Math.PI * Math.pow(rad,2)));
    }
}


