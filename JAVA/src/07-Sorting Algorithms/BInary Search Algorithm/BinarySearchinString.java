public class BinarySearchinString {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D", "E", "F"};
        String target = "E";
        System.out.println(search(arr, target));
    }

    static int search(String[] arr, String target) {
        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid].equals(target)) {
                return mid;
            } else if (arr[mid].compareTo(target) < 0) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
