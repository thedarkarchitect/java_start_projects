public class PerfectNumber {
    public static void main(String[] args){
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int num){

        if(num <  1){
            System.out.println("The number is below the expected limit");
            return false;
        }else{
            int divisor = 1;
            int counter = 0;
            while(divisor < num){
                if(num % divisor == 0){
                    counter += divisor;

                }
                divisor ++;
            }
            if(counter == num){
                return true;
            }else{
                return false;
            }
        }
    }
}
