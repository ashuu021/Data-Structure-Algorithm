public class RBS {
   public static void main(String[] args) {
    
       int []arr={4,5,6,7,0,1,2};
       int target =2;
       int ans =search(arr, target);
       System.out.println(ans);

}
static int search(int[]arr ,int target){
    int pivot=pivotElement(arr);
    if (pivot==-1) {
       return binarySearch(arr, target ,0,arr.length-1);
    }
    if (arr[pivot]==target) {
        return pivot;
        
    }
    if (target>=arr[0]) {
        return binarySearch(arr, target ,0,pivot-1);
    }
    
        return binarySearch(arr, target ,pivot+1,arr.length-1);
    
}
static int  binarySearch(int [] arr ,int target,int st,int end){
  
    while (st<=end) {
        int mid=st+(end-st)/2;
        if (arr[mid]==target) {
            return mid;
        }
       else if (arr[mid]<target) {
            st=mid+1;
        }
        else{
            end=mid-1;
        }
        
    }
return -1;
}
static int pivotElement(int[] arr){
    int st=0;
    int end=arr.length-1;
    while (st<=end) {
        int mid=st+(end-st)/2;
        if (mid<end && arr[mid]>arr[mid+1]) {
            return mid;
        }
        if (mid>st && arr[mid]<arr[mid-1]) {
            return mid-1;
        }
        if (arr[mid]<=arr[st]) {
            end=mid-1;
        }
        else{
            st=mid+1;
        }
    }
    return -1;
}
}
