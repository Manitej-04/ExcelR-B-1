public class Demo045 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println(x);
        System.out.println(y);
       
        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("After swapping: ");
        System.out.println(x);
        System.out.println(y);


    }
}
