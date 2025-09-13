public class FindPivotWithDuplicates {
public static void main(String[] args) {
      int[] arr = {2, 9, 2, 2, 2};
      
        int ans =findPivotWithDuplicates(arr);
        System.out.println(ans);
}
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // case 1: mid > mid+1
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // case 2: mid < mid-1
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // case 3: skip duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip duplicates
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // case 4: left is sorted, so pivot right me hoga
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}