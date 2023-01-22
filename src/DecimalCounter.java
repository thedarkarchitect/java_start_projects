public class DecimalCounter {
    public static void main(String[] args){
//        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(change(-3.1756));
        System.out.println(-3175.000000/ Math.pow(10, 3));
//        System.out.println(change(3.175));

    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum){
        boolean answer = false;
        if ( change(firstNum) == change(secondNum)){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }

    public static double change(double num){

        num = num * Math.pow(10, 3); //pow(base, exponent)
        num = Math.floor(num);
        num = num/ Math.pow(10, 3);

        return Math.abs(num);
    }
}
