// Q9- Write a program to check whether a prime Number can be expressed as a Sum of Two Prime Numbers.

public class PrimeAsSumOf2Primes {

    public static void main(String[] args) {
        int givenNo = 41;
        // Coorect nos: 5, 7, 11, 13, 19, 31, 43, 61, 73
        int prime1 = 1;
        int prime2 = 1;
        while (prime1 < givenNo) {
            prime1 = nextPrimeNo(prime1);
            // System.out.println("Outer Loop: "+prime1);
            prime2 = nextPrimeNo(prime1);
            while (prime2 < givenNo) {
                if (prime1 + prime2 == givenNo) {
                    System.out.println(prime1 + " + " + prime2 + " = " + givenNo);
                    break;
                }
                prime2 = nextPrimeNo(prime2);
            }
        }
    }

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
