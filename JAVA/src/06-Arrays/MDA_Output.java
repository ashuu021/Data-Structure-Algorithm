import java.util.Arrays;
import java.util.Scanner;

public class MDA_Output {
    // Multidimensional array input and output
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);

        // Input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        // Output using for-each loop
        System.out.println("Using for-each loop:");
        for (int[] j : arr) {
            System.out.println(Arrays.toString(j));
        }

        // Output using normal for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        // Output using nested loop (element by element)
        System.out.println("Using nested loop:");
        for (int row1 = 0; row1 < arr.length; row1++) {
            for (int col1 = 0; col1 < arr[row1].length; col1++) {
                System.out.print(arr[row1][col1] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
