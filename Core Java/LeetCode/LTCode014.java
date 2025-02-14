class Solution14 {
    public int differenceOfSum(int[] nums) {
        int elesum=0;
        int sum=0;
        // for(int i:nums){
        //     elesum+=i;
        // }
        for(int i=0; i<nums.length; i++){
            elesum+=nums[i];
            int x=nums[i];
            while(x!=0){
                sum+=x%10;
                x=x/10;
            }
        }
        return elesum-sum;
    }
}
public class LTCode014 {
    public static void main(String[] args) {
        int[] nums = {1,15,6,3};
        Solution14 s = new Solution14();
        System.out.println(s.differenceOfSum(nums));
    }
}
