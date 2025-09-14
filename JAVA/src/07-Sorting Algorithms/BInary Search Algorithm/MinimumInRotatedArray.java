public class MinimumInRotatedArray {

public static void main(String[] args) {
      int[] arr = {4, 5, 6, 7, 0, 1, 2,3};
    int ans=count(arr);
System.out.println("Minimum in rotated is " + arr[ans+1 ] +" at "+(ans+1) +"th index");
    }
    static int count(int[] arr){
        
        int st=0;
        int end=arr.length-1;
        while (st<=end) {
            int mid =st+(end-st)/2;
            if (mid<end&& arr[mid]>arr[mid+1]) {
                return mid;
            }
            if (mid>st && arr[mid]<arr[mid-1]) {
                return mid-1;

            }
            if (arr[mid]<=arr[st]) {
                return end=mid+1;
            }
            else{
                return st=mid+1;
            }
        }
    return -1;
    }
}

