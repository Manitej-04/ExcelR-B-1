class Solution10 {
    public int singleNumber(int[] arr) {
        
        for(int i=0; i<arr.length; i++){
            int count=0;
            
            for(int j=0; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                return arr[i];
            }
        }
        return -1;
        
    }
}
public class LTCode010 {
    public static void main(String[] args) {
        Solution10 s = new Solution10();
        int[] arr = {1, 2, 1, 3, 3,1};
        int single = s.singleNumber(arr);
        System.out.println("Single number in array: "+single);
    }
}
