public class Practice {
     public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2}; // example array

        bubbleSort(arr);

        // print sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
             boolean isSwap=false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwap=true;
                }
            }
            if (!isSwap) break;
        }
        
    }

}
