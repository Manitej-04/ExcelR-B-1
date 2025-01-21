
import java.util.LinkedHashSet;

class hashInt{
    void hashsum() {

        LinkedHashSet <Integer> hash = new LinkedHashSet<>();
        hash.add(10);
        hash.add(20);
        hash.add(30);
        int sum=0;
        System.out.println(hash);
        for (int num : hash) {
            sum += num;
        }
        System.out.println("Sum of elements: "+sum);
        for(int i:hash){
            System.out.println(i);
        }
   
    }

}
public class Demo033 {
    public static void main(String[] args) {
        hashInt h = new hashInt();
        h.hashsum();
    }
}
