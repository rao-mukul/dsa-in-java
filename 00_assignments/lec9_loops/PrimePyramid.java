/*
 * Q8 - Write a program to print a triangle of prime numbers upto given number of lines of the trinagle.
 */

public class PrimePyramid {
    public static void main(String[] args) {
        int r = 6;
        int col = 5;
        int prime = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = i; j <= col; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                prime = nextPrimeNo(prime);
                System.out.print(prime + " ");
            }
            System.out.println();
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
