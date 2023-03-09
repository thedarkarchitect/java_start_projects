public class NumberToWords {
    public static void main(String[] args){
        numberToWord(123);
        numberToWord(1010);
        numberToWord(1000);
        numberToWord(-12);
    }


    public static int getDigitCount(int num){
        if(num < 0){
            return -1;
        }else{
            int counter = 0;
            while(num > 0 ){
                int lastDigit = num % 10;
                if (lastDigit >= 1 || lastDigit == 0){//not sure why always true
                    counter ++;
                }
                num /= 10;
            }
            return counter;
        }
    }

    public static int getReverse(int num){
        int reverse = 0;
        while(num > 0){
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num /= 10;
        }
        return reverse;
    }

    public static void numberToWord(int num) {
        int number = getReverse(num);//reversed digit so that the number can be pretend in order finally 
        //the orginal count and reversed count help to find the zeros after the numbers greater than zero soo when reversed they can be printed as "ZERO"
        int reversedCount = getDigitCount(number);
        int originalCount = getDigitCount(num);
        int zeroCount = originalCount - reversedCount;

        if(num < 0){
            System.out.println(-1);
        }else if(number > 0) {
            while (number > 0) {
                int lastDigit = number % 10;
                String words = switch (lastDigit) {
                    case 0 -> "ZERO";
                    case 1 -> "ONE";
                    case 2 -> "TWO";
                    case 3 -> "THREE";
                    case 4 -> "FOUR";
                    case 5 -> "FIVE";
                    case 6 -> "SIX";
                    case 7 -> "SEVEN";
                    case 8 -> "EIGHT";
                    case 9 -> "NINE";
                    default -> "Other";
                };
                System.out.println(words);
                number /= 10;
            }
        }

        if (zeroCount > 0) {
            for (int i = 0; i < zeroCount; i++) {
                System.out.println("ZERO");
            }
        }
    }
}
