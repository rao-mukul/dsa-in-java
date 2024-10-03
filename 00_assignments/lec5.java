import java.util.Scanner;

public class lec5 {
    static Scanner sc = new Scanner(System.in);
    /*
     * Q1 - Write a program to add 8 to the number x and then divide it by 3. Now,
     * the modulus of the quotient
     * is taken with 5 and then multiply the resultant value by 5. Display the final
     * result.
     * Input: 2345
     * Output: 20
     */

    public static void q1(int x) {
        x += 8;
        x /= 3;
        x %= 5;
        x *= 5;
        // x = (((x+8)/3)%5)*5;
        System.out.println(x);
    }

    /*
     * Q2 - Swap two numbers without the use of third variable.
     * Input: 5 10
     * Output: 10 5
     */
    public static void q2(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }

    /*
     * Q3 - Write a program to calculate the sum of the digits of a 3-digit number.
     * Input: 132
     * Output: 6
     */

    public static void q3(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }

    /*
     * Q4 - Assign values of variables 'a' and 'b' as 55 and 70 respectively and
     * then check if:
     * i) both the conditions 'a < 50' and 'a < b' are true.
     * ii) at least one of the conditions 'a < 50' or 'a < b' is true.
     */

    public static void q4(int a, int b) {
        boolean cond1 = a < 50;
        boolean cond2 = a < b;
        if (cond1 && cond2) {
            System.out.println("i");
        }
        if (cond1 || cond2) {
            System.out.println("ii");
        }
    }

    /*
     * Q5 - Find the total number of bits needed to be flipped to convert x to y.
     * Input: 65 80
     * Output: 2
     */
    public static void q5(int x, int y) {
        int xor = x ^ y;
        // System.out.println(xor);
        // After Xor all the bits which are different in x and y are set to 1

        // Now using Brian Kernighan algorithm we can count the 1 set bits
        int count = 0;
        while (xor != 0) {
            xor = xor & (xor - 1);
            count++;
        }
        System.out.println(count);

        // ---------------------------------------------------
        // Count the number of set bits in the XOR result
        while (xor != 0) {
            count += xor & 1; // Check if the least significant bit is 1
            xor >>= 1; // Right shift to check the next bit
        }
        // -----------------------------------------------------
    }

    public static void main(String[] args) {
        // q1(2345);
        // q2(5, 10);
        // q3(132);
        // q4(55, 70);
        q5(65, 80);
    }
}
