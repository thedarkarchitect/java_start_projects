public class OddNumber {
    public static void main(String[] args){
        System.out.println("The sum of these odd number is "+sumOdd(1,100));

    }

    public static boolean isOdd(int number){
        if (number > 0){
            if (number % 2 != 0){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public static int sumOdd(int start, int end){
        if (start <= 0 && end <= 0){
            return -1;
        }
        int sum = 0;

        for (int num = start ; num <= end; num++){
            if (isOdd(num)){
                sum += num;
            }
        }
        return sum;
    }
}
