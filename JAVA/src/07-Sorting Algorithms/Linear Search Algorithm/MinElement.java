public class MinElement {
public static void main(String[] args) {
int[] nums={};
System.out.println(min(nums));

}
    static int min(int[] arr){
      
      int mini=arr[0];
      for(int i =1; i<arr.length;i++){
        if(arr[i]<mini){
            mini=arr[i];
        }
      }
      return mini;

    }
}