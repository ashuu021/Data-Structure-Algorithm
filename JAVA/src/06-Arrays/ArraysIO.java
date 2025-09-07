import java.util.Arrays;
import java.util.Scanner;
public class ArraysIO {

    public static void main(String[] args) {
        int[] arr=new int[3];
        Scanner sc = new Scanner(System.in);
        // Input
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        // Output using for loop
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
System.out.println();
        // Output using For each loop
        for (int k : arr) {
            System.out.print(k+" ");
        }
        System.out.println(Arrays.toString(arr));
    }
}
