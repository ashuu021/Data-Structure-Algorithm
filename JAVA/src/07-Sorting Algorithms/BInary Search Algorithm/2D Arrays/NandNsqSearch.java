public class NandNsqSearch {
   public static void main(String[] args) {
      int[] arr = {1, 3, 4, 5, 6,9};
      int target = 3;

      int ans = search(arr, target);
      int ans2 = search(arr, target * target);

      if (ans != -1 && ans2 != -1 && ans2 == ans * ans) {
         System.out.println(true);
      } else {
         System.out.println(false);
      }
    
   }

   static int search(int[] arr, int target) {
      int st = 0;
      int end = arr.length - 1;

      while (st <= end) {
         int mid = st + (end - st) / 2;

         if (arr[mid] == target ) {
            return arr[mid];
         }
         if (arr[mid] < target) {
            st = mid + 1;
         } else {
            end = mid - 1;
         }
      }
      return -1;
   }
}
