public class LastDigitChecker {
    public static void main(String[] args){
              System.out.println(hasSameLastDigit(41, 22, 71));
              System.out.println(hasSameLastDigit(9, 99, 999));
              System.out.println(hasSameLastDigit(23, 32 ,48));
    }

    public static Boolean hasSameLastDigit(int num1, int num2, int num3){
        if((num1 >= 10 && num1 <= 100) && (num2 >= 10 && num2 <= 100) && (num3 >= 10 && num3 <= 100)){
            while(num1 != 0){
                int lastnum1 = num1 % 10;
                while(num2 != 0) {
                    int lastnum2 = num2 % 10;
                    while (num3 != 0) {
                        int lastnum3 = num3 % 10;
                        if ((lastnum1 == lastnum2) || (lastnum2 == lastnum3) || (lastnum3 == lastnum1)){
                            System.out.println("match");
                            break;
                        }else{
                            System.out.println("not match");
                            return false;
                        }

                    }
                    break;
                }
                break;
            }

            return true;
        }else{
            System.out.println("One of the numbers is not in the range!");
            return false;
        }
    }
}
