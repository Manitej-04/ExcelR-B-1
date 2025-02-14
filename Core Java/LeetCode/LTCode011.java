
import java.util.Arrays;

public class LTCode011 {
    static String largePrefix(String[] strs){
        if(strs.length == 0) return "";

        Arrays.sort(strs);
        int n=strs.length;

        String s1 = strs[0];
        String s2 = strs[n-1];
        int i=0;
        while(i<s1.length()){
            if(s1.charAt(i)==s2.charAt(i)){
                i++;
            } else{
                break;
            }
        }
        return i==0 ? "" : s1.substring(0,i);
    }
    public static void main(String[] args) {
        String[] strs = {"F-lower","F-low","F-light"};
        System.out.println(largePrefix(strs));
    }
}
