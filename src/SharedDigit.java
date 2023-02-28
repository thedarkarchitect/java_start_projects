public class SharedDigit {
    public static void main(String[] args){
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static Boolean hasSharedDigit(int num1, int num2){
        if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)){
            while(num1 != 0){
                int comparisonNum1 = num1 % 10;
                while(num2 != 0){
                    int comparisonNum2 = num2 % 10;
                    if (comparisonNum2 == comparisonNum1){
                        System.out.println(comparisonNum2);
                        break;
                    }
                    num2 /= 10;
                }
                num1 /= 10;

            }
            return true;

        }else{
            return false;
        }
    }
}
