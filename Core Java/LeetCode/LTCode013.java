class Solution13 {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        int x=n;
        while(x!=0){
            int digit = x%10;
            sum = sum + digit;
            product = product*digit;
            x=x/10;
        }
        int result = product-sum;
        return result;        
    }
}
public class LTCode013 {
        public static void main(String[] args) {
        int n = 234;
        Solution13 s = new Solution13();
        System.out.println("Subtraction of Product and Sum of "+n+": "+s.subtractProductAndSum(n));
    }
}
