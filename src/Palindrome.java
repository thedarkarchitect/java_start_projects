public class Palindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(11212));
    }
    public static Boolean isPalindrome(int number){
        int reverse = 0;
        int num = number;

        while(number != 0){
            int lastDigit = number % 10;
            reverse = (reverse * 10 ) + lastDigit;
            number /= 10;
        }

        if (reverse == num){
            return true;
        }else{
            return false;
        }
    }
}
