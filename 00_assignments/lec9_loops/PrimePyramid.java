/*
 * Q8 - Write a program to print a triangle of prime numbers upto given number of lines of the trinagle.
 * Input1:
2
Output1:
2
3 5
Input2:
6
Output2:
2
3 5
7 11 13
17 19 23 29
31 37 41 43 47
53 59 61 67 71 73
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
