public class LargestPrime {
    public static void main(String[] args){
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int num) {
        int largestDigit = 0;
        if (num <= 0){
            return -1;
        }else {
            for (int div = 2; div < num; div++) {
                if (isprime(div)) {
                    if (num % div == 0) {
                        largestDigit = div;
                    }
                }
            }
        }
        return largestDigit;
    }

    public static boolean isprime(int num){
        if (num <= 2) {
            return (num == 2);
        }
        for (int divisor = 2; divisor < num; divisor++) {
            if (num % divisor == 0) {
                return false;
            }

        }
        return true;
    }
}
