// Q9- Write a program to check whether a prime Number can be expressed as a Sum of Two Prime Numbers.

/**
 * This program takes an integer input from the user and checks whether it can
 * be expressed as a sum of two prime numbers.
 * The program uses a nested while loop to iterate through all possible pairs of
 * prime numbers which are less than or equal to the given number.
 * If a pair of prime numbers is found which adds up to the given number, the
 * program prints true and the pair of numbers.
 * If no such pair is found, the program prints false.
 */
public class PrimeAsSumOf2Primes {

    public static void main(String[] args) {
        int givenNo = 13;

        // Correct nos: 5, 7, 11, 13, 19, 31, 43, 61, 73
        int prime1 = 1;
        int prime2 = 1;
        boolean flag = false;

        // Outer loop to iterate through all possible first prime numbers
        while (prime1 < givenNo) {
            prime1 = nextPrimeNo(prime1);
            System.out.println("--- " + "Outer Loop: " + prime1 + " ---");

            // Inner loop to iterate through all possible second prime numbers
            prime2 = nextPrimeNo(prime1);
            while (prime2 < givenNo) {
                System.out.println("Inner Loop: " + prime2);
                if (prime1 + prime2 == givenNo) {
                    flag = true; // Condition Satisfied
                    break;
                }
                prime2 = nextPrimeNo(prime2);
            }
            if (flag) {
                break;
            }
            System.out.println();
        }
        if (flag) {
            System.out.println("True " + givenNo + " can be expressed as sum of primes");
            System.out.println(givenNo + " = " + prime1 + " + " + prime2);
        } else {
            System.out.println("False " + givenNo + " cannot be expressed as sum of primes");
        }
    }

    /**
     * This method takes an integer as an argument and returns the next prime
     * number.
     * The method uses a while loop to iterate through all numbers greater than the
     * given number and checks if they are prime.
     * If a prime number is found, it is returned.
     */
    public static int nextPrimeNo(int i) {
        while (true) {
            i++;
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
    }
}

// Hint: Apart from 2, all of the prime numbers are odd. So it is not possible
// to represent a prime number
// (which is odd) to be written as a sum of two odd prime numbers, so we are
// sure that one of the two
// prime numbers should be 2. So we have to check whether n-2 is prime or not.
class alternativeApproach {
    public static void main(String[] args) {
        int n = 13;
        if (isPrime(n) && isPrime(n - 2)) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)// if number is divisible by any number other than 0 anditself, denoted by i, it
                           // is not a prime number
                return false;
        }
        return true;
    }
}
