public class NumberToWords {
    public static void main(String[] args){
        getDigitCount(0);
    }

    public static void numberToWords(int num){

    }

    public static void getDigitCount(int num){
        if(num < 0){
            System.out.println(-1);
        }else{
            int counter = 0;
            while(num > 0 ){
                int lastDigit = num % 10;
                if (lastDigit >= 1 || lastDigit == 0){
                    counter ++;
                }
                num /= 10;
            }
            
            System.out.println(counter);
        }
    }
}
