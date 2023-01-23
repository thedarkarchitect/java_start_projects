public class DecimalCounter {
    public static void main(String[] args){
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));


    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum){
        // the logic is to move the first 3 decimals to the left by multiplying by 1000 then turning it into a an int to remove the decimal points and compare the first 4 numbers
        firstNum = (int) (firstNum * 1000);
        secondNum = (int) (secondNum * 1000);

        if (firstNum == secondNum){
            return true;
        }else{
            return false;
        }
    }

}
