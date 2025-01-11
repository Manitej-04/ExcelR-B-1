import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1 ");
        int num1 = sc.nextInt();

        System.out.println("Enter num2 :");
        int num2 = sc.nextInt();
        //comparing
        if(num1>num2){
            System.out.println(num1+" greater than "+num2);
        }
        else{
            System.out.println(num2+" is greater than "+num1);
        }
        sc.close();
    }
}
