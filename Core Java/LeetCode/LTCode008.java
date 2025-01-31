
import java.util.Arrays;



class Solution8{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m - 1, j = n - 1, k = m + n - 1; j >= 0; --k) {
            nums1[k] = i >= 0 && nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        System.out.println(Arrays.toString(nums1));
    }
}
public class LTCode008 {
    public static void main(String[] args) {
        Solution8 s = new Solution8();

        int[] num1 = {2,2,4,0,0,0};
        int[] num2 = {5,6,7};
        int m = 3;
        int n = 3;
        s.merge(num1, m, num2, n);
    }
}
