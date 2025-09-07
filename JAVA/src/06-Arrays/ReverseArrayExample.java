import java.util.Arrays;

public class ReverseArrayExample {
    public static void main(String[] args) {
        int [] arr={2,34,452,52,56};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
         arr[index1]=arr[index2];
        arr[index2]=temp;    }

    static void reverse(int[] arr){
        int st=0;
        int end=arr.length-1;
        while (st<end) {
            swap(arr, st, end);
        st++;
        end--;
        }
    }
}
