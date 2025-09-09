public class ReturnValue {
public static void main(String[] args) {
    int[] nums={1,23,4,5,6,32,78,4,32};
    int target=0;
   int  ans=linearSearch(nums,target);
    System.out.println(ans);
}
static int linearSearch(int[] arr, int target ){
 if (arr.length==0) {
    return -1;
 }
 for (int i = 0; i < arr.length; i++) {
    if (arr[i]==target) {
        return arr[i];
    }
 }
    return -1;
}
}