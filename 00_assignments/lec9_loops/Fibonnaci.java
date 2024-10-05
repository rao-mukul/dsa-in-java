import java.util.Scanner;

/*Q1 - Write a program to print Fibonacci series of n terms where n is input by user.
Input1:
6
Output1:
1 1 2 3 5 8
Input2:
2
Output2:
11
8
*/

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");

        for (int i = 0; i < n - 2; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
