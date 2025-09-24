import java.util.Arrays;

class CycleSort {

    public static void main(String[] args) {
        int[] arr={3,2,1,7,4};
        for (int i = 0; i < arr.length; i++) {
           int last=arr.length-i-1;
           int max=maxIndex(arr,0,last);
           swap(arr,max,last); 
        }
        System.out.println(Arrays.toString(arr));

    }
    static int maxIndex(int arr[],int start,int end){
        int max=start;
        for (int i = start; i <=end; i++) {
            if (arr[max]<arr[i]) {
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}