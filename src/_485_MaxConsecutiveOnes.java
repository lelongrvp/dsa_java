public class _485_MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
            } else {
                int[] temp = {currentCount, maxCount};
                maxCount = findMax(temp);
                currentCount = 0;
            }
        }
        int[] temp = {currentCount, maxCount};
        return findMax(temp);
    }

    public int findMax(int[] nums) {
        int maxValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
            }
        }
        return maxValue;
    }
}
