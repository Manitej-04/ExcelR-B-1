import java.util.Scanner;

class Demo007 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            
            System.out.println("Enter your phone number: ");
            long num = sc.nextLong();
            
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Phone Number: "+num);
        
    }
 }
