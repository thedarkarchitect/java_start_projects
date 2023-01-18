public class PositiveNegativeZero {
    public static void main(String[] args){
        System.out.println(checkNumber(89));
        System.out.println(checkNumber(0));
        System.out.println(checkNumber(-89));
    }

    public static String checkNumber(int number){
            String result = (number > 0) ? "positive" : ((number < 0 ) ? "negative" : "zero");

            return  result;
    }
}
