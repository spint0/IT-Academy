import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        int[][] numbers = new int[6][8];
        System.out.println("numbers.length = " + numbers.length);
        System.out.println("numbers[0].length = " + numbers[0].length);
        for (int r = 0; r < numbers.length; r++) {
            for (int c = 0; c < numbers[0].length; c++) {

                System.out.println("R = " + r);
                System.out.println("C = " + c);
                numbers[r][c] = r + c;

                System.out.println("numbers[" + r + "][" + c + "] = " + (r + c));


            }

        }
    }
}
