public class DigitSum {
    public static void main(String[] args){
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1000));
        System.out.println(sumDigits(9));
        System.out.println(sumDigits(-20));

    }

    public static int sumDigits(int number){
        int sum  = 0;
        if (number < 0){
            return -1;
        }else{
            while(number != 0) {
                int remain = number % 10;
                sum = sum + remain;
                number = number /10;
            }
            return sum;
        }
    }
}
