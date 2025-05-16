public class _1295_FindNumberswithEvenNumberofDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num: nums) {
            if (digitCount(num) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int digitCount(int num) {
        int count = 0;
        while(num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
