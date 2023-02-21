public class PrimeNumber {
    public static void main(String[] args) {
      // count 3 prime numbers and break out of loop
        int count = 0;

        for (int i = 10; i <= 50; i++){
            if (isPrime(i)){//this controls the forloop numbers and only return primes
                System.out.println("number"+ i + " is a prime number");
                count ++;
                if (count == 3){
                    System.out.println("Found 3 - Exiting for loop");
                    break;
                }

            }
        }


    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor < wholeNumber; divisor++) {
            // if the number is divisible by any number from 2 and i less than it's self it's not prime
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
