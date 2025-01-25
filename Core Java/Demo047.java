public class Demo047 {
    static int countDigits(int x){
        int count = 0;
        while(x!=0){
            x = x/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int x = 124;
        int result = countDigits(x);
        System.out.println("No of digits in "+x+" are: "+result);
    }
}
