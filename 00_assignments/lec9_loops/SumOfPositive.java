import java.util.Scanner;

/*
 * Q2 - Write a program to enter the numbers till the user wants, the number can be positive,
negative or zero. Calculate the sum of numbers until a negative number is encountered.
If the input is a negative number, current sum is discarded and print -1.
 */

public class SumOfPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        // int n = 0;
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n>=0) {
                sum += n;
            }
            else{
                sum =-1;
                break;
            }
        }
        System.out.println(sum);

    }
}
