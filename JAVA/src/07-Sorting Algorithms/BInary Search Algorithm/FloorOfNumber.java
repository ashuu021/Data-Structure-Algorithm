public class FloorOfNumber {
   public static void main(String[] args) {
        int [] nums={0,1,5,6,7,11,18,24,32,134};
        int target=22;
        System.out.println(search(nums, target));
    }
    static int search(int [] arr,int target){
    int start =0;
    int end = arr.length-1;
    
    while (start<=end) {
        int mid = start+(end-start)/2;
        if (arr[mid]==target) {
            return mid;
        }
        else if (arr[mid]<target) {
            start=mid+1;
        }
        else{
            end=mid-1;
        }
    }
return end;
    } 
}
