public class MaxElement {
    public static void main(String[] args) {
       int[] nums={1,23,4,5,6,32,78,4,32};
        System.out.println(max(nums));
    }
    static int max(int[] arr){
        int maxIs=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>maxIs) {
                maxIs=arr[i];
            }
        }
        return maxIs;
    }
}
