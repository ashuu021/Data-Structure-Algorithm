public class CountEvenDigits {
    // Given an array nums of integers, return how many of them contain an even number of digits.
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));  // Expected output: 2
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;  
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num) {
        if (num < 0) {
            num = -num;  // handle negatives
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {  
            count++;
            num /= 10;
        }
        return count;
    }


}
