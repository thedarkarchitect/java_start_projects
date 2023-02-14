public class PrimeNumber {
    public static void main(String[] args){
        System.out.println(" 0 is "+ (isPrime(0) ? "" : "NOT")+" a prime number");
        System.out.println(" 1 is "+ (isPrime(1) ? "" : "NOT")+" a prime number");
        System.out.println(" 2 is "+ (isPrime(2) ? "" : "NOT")+" a prime number");
        System.out.println(" 3 is "+ (isPrime(3) ? "" : "NOT")+" a prime number");
        System.out.println(" 4 is "+ (isPrime(4) ? "" : "NOT")+" a prime number");
        System.out.println(" 5 is "+ (isPrime(5) ? "" : "NOT")+" a prime number");

        System.out.println(" 8 is "+ (isPrime(8) ? "" : "NOT")+" a prime number");
        System.out.println(" 15 is "+ (isPrime(15) ? "" : "NOT")+" a prime number");

        primeCounter();

    }

    public static boolean isPrime(int wholeNumber ){
        if (wholeNumber <= 2){
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor < wholeNumber  / 2; divisor ++){
            // if the number is divisible by any number from 2 and i less than it's self it's not prime
            if (wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }

    public static void primeCounter(){
        for (int num = 1987; num < 2500; num ++){


            for ( int counter = 1; counter <= 3; counter ++){
                if (isPrime(num)) {
                    System.out.println(num);
                }

            }

        }

    }

}
