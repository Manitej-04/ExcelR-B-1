
class Income{
    void Tax(int monthlySalary, int hra, int pf){
        

        int annual = (monthlySalary*12);

        int deduction = hra+pf;

        int tax =   annual - deduction;

        if(annual<=500000){
            System.out.println("Tax: "+tax*(10/100));
        } else if((annual>500000)&(annual>=1000000)){
            System.out.println("Tax: "+tax*(20/100));
        } else{
            System.out.println("Tax: "+tax*(30/100));
        }
    }
}

public class Demo19 {
    public static void main(String[] args) {
        Income i = new Income();

        i.Tax(400000,1000,5000);

    }
}
