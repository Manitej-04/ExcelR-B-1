import java.util.Arrays;
class Solution9 {
    double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int n = nums1.length;
            int m = nums2.length;
    
            int[] merged = new int[m+n];
            int k = 0;
            for(int i=0; i<n; i++){
                merged[k++] = nums1[i];
            }
    
            for(int j=0; j<m; j++){
                merged[k++] = nums2[j]; 
            }
    
            Arrays.sort(merged);
    
            int total = merged.length;
            
            if(total%2==1){
                return (double) merged[total/2];
            } else{
                int m1 = merged[total/2 -1];
                int m2 = merged[total/2];
                double avg = ((double)m1+(double)m2)/2;
                return avg;
            }
        }
    }
    public class LTCode009 {
        public static void main(String[] args) {
            int[] num1 = {1,2};
            int[] num2 = {3,4};
    
            Solution9 s = new Solution9();
            double result = s.findMedianSortedArrays(num1, num2);

        System.out.println("Median : "+result);
    }
    
}
