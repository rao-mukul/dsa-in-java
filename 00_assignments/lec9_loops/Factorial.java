import java.util.Scanner;

/*
 * Q3 - Write a program to calculate the factorial of a number. (Easy)
Explanation:
Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n.
E.g.-
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
Also,
1! = 1
0! = 0
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        System.out.println(fac);
    }
}
