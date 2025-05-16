import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        _88_MergeSortedArray p = new _88_MergeSortedArray();
        int[] n1 = {1, 2, 3, 0, 0, 0};
        int[] n2 = {2, 5, 6};
        p.merge(n1, 3, n2, 3);
        System.out.println(Arrays.toString(n1));
    }
}