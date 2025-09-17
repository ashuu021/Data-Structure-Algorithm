public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2}; // example array

        bubbleSort(arr);

        // print sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Bubble Sort function
    static void bubbleSort(int[] arr) {
        int n = arr.length;

        // run n-1 passes
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            // compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // if no swapping happened, array is already sorted
            if (!swapped) break;
        }
    }
}
