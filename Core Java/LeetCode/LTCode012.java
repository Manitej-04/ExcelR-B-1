
import java.util.*;

public class LTCode012 {
    static List<Integer> charIndex(String[] strs, char x){
        List<Integer> l = new ArrayList<>();

        for(int i=0; i<strs.length; i++){
            if(strs[i].indexOf(x)!=-1){
                l.add(i);
            }
        }
        return l;
    }
    public static void main(String[] args) {
        String[] strs = {"leet","code"};
        System.out.println(charIndex(strs,'e'));
    }
}
