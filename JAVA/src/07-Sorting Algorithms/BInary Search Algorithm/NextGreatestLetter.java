public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters, target));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int st = 0;
        int end = letters.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        // wrap-around
        return letters[st % letters.length];
    }
}
