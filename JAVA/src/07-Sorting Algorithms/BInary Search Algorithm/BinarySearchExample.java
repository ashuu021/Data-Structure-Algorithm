public class BinarySearchExample {

    public static void main(String[] args) {
        int [] nums={0,1,2,3,4};
        int target=3;
        System.out.println(search(nums, target));
    }
    static int search(int [] arr,int target){
    int start =0;
    int end = arr.length-1;
    while (start<=end) {
        int mid = start+(end-start)/2;
        if (mid==target) {
            return mid;
        }
        else if (mid<target) {
            start=mid+1;
        }
        else{
            end=mid-1;
        }
    }
return -1;
    }
}
