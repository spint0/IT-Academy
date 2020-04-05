import java.util.Scanner;

/*Needs work

 */


public class BInarySearch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What should be the size of the first Array: ");

        int a = input.nextInt();
        int[] matrix1 = new int[a];
        for (int i = 0; i < a; i++) {

            System.out.print("Array 1 insert number: ");
            matrix1[i] = input.nextInt();
        }

        System.out.print("What is the value you are looking for: ");

        int b = input.nextInt();


        System.out.println(BinarySearch(matrix1,b));

    }

   public static int BinarySearch (int[] A, int target){

        int L = 0;
        int R = A.length -1;

       while (L<R){
            int mid = L + ((R-L)/2);
            if (A[mid]==target){
                return mid;
            } else if (A[mid] < target) {
                L = mid +1;
            } else {
                R = mid -1;
            }
        }
       return -1;
   }

}
