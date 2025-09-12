public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int []arr = {0,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr){
        int st=0;
        int end =arr.length-1;
        while (st<end) {
            int mid =st+(end-st)/2;
            if (arr[mid]>arr[mid+1]) {
                end=mid;
            }else{
                st=mid+1;
            }
            
        }
        return st;
    }
}
