import java.util.Arrays;

public class _88_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i : nums2) {
            shiftElement(i, nums1, m);
            m++;
        }
    }

    private void shiftElement(int i, int[] nums1, int m) {
        boolean isFound = false;
        for (int y = 0; y < m; y++) {
            if (nums1[y] > i) {
                isFound = true;
                for (int n = m - 1; n >= y; n--) {
                    nums1[n + 1] = nums1[n];
                }
                nums1[y] = i;
                System.out.println(Arrays.toString(nums1));
                break;
            }
        }
        if (!isFound) {
            nums1[m] = i;
        }
    }
}
