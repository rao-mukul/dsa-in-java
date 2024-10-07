import java.util.Scanner;

/*
 * Q4- Write a program to print all Armstrong numbers between 1 to n. (Medium)
Explanation:
A three digit number is called the Armstrong number if the sum of the cube of its digit is equal to the number itself.
E.g.- 153 is an Armstrong number because (1^3)+(5^3)+(3^3) = 153.

Input1:
1000
Output1:
0
1
153
370
371
407
Input2:
500
Output2:
0
1
153
370
371
407

 */

public class Armstrong {

    public static boolean checkArmstrong(int n) {
        int givenN = n;
        int calcN = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            calcN += Math.pow(lastDigit, 3);
            n /= 10;
        }
        if (calcN == givenN) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            boolean arm = checkArmstrong(i);
            if (arm == true) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
