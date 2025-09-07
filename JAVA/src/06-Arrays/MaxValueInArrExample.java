public class MaxValueInArrExample {
public static void main(String[] args) {
    int [] arr={1,23,5,7,22,2};
    System.out.println(maxVal(arr));
    System.out.println(maxInRange(arr,3,5));
}
    static int maxVal(int[] arr){
        int maxIs=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxIs) {
                maxIs=arr[i];
            }
        }
        return maxIs;

    }
    static int maxInRange(int[] arr,int start,int end){
        int maxIs=arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i]>maxIs) {
                maxIs=arr[i];
            }
        }
        return maxIs;
    }
}