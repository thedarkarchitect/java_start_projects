public class GreatestCommonDivisor {
    public static void main(String[] args){
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int num1, int num2){
        int divisor = 1;
        int gcm = 0;
        if ((num1 < 10) || (num2 < 10)){
            return -1;
        }else{
            while(divisor <= num1 || divisor <= num2){
                if((num1 % divisor == 0) && (num2 % divisor == 0)){
                    gcm = divisor;

                }
                divisor++;
            }
            return gcm;
        }


    }
}
