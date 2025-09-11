public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9, 11}; // ascending
        int[] arr2 = {20, 17, 15, 12, 10, 5}; // descending

        int target = 10;

        System.out.println(orderAgnosticBS(arr1, target)); // -1 (not found)
        System.out.println(orderAgnosticBS(arr2, target)); // 4 (index of 10)
    }
  
    static int orderAgnosticBS(int[] arr, int target) {
        int st = 0, end = arr.length - 1;
          boolean isAscending =arr[st]<arr[end];
        while (st<=end) {
            int mid =st+(end-st)/2;
if (arr[mid]==target) {
    return mid;
}
           else if (isAscending) {
                if (arr[mid]<target) {
                    st=mid+1;
                }
                else{
                    end=mid-1;
                }
                
            }
            else{
                      if (arr[mid]<target) {
                    end=mid-1;
                }
                else{
                    st=mid+1;
                } 
                }
            
        }
        
            
        
        return -1; // not found
    }
}
