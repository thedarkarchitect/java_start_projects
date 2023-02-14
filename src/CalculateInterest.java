public class CalculateInterest {
    public static void main(String[] args){

        for ( double rate = 7.5; rate <= 10; rate += 0.25){

            InterestRate(100, rate);

        }

    }
    public static void InterestRate(double amount, double rate){
        double answer = amount*(rate/100);
        System.out.println("The interest rate is "+ answer );
    }
}

