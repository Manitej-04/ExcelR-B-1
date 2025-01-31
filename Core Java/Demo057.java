public class Demo057 {
    static void sumOfFirstAndLast(int x){
        int last = x%10;

        // int num = x;
        // int reverse = 0;

        // while(num!=0){
        //     int digit = num%10;
        //     reverse = reverse*10+digit;
        //     num = num/10;
        // }        
        // int first = reverse%10;

        int first=x;
        while(first>=10){
            first /= 10;
        }
        System.out.println(first);
        
        int sum = first+last;
        System.out.println("Sum of first and last digits of "+x+" is: "+sum);
    }
    public static void main(String[] args) {
        int x = 417;
        sumOfFirstAndLast(x);
    }
}
