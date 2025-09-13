public class SearchInMountain {

    public static void main(String[] args) {
        SearchInMountain sm = new SearchInMountain();

        int[] arr = {1, 3, 5, 7, 6, 4, 2}; // mountain array
        int target = 6;

        int ans = sm.search(arr, target);
        System.out.println("Target found at index: " + ans);
    }

    // Search target in mountain array
    int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);

        // try to find in left (ascending) part
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to find in right (descending) part
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    // Find peak index in mountain array
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // You are in descending part
                end = mid;
            } else {
                // You are in ascending part
                start = mid + 1;
            }
        }
        // start == end -> peak index
        return start;
    }

    // Order Agnostic Binary Search
    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
