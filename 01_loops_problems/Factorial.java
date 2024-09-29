// package loops_problems;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fac = 1;

        for (int i = 1; i <= n; i++) {
            fac *= i;
            System.out.println("The fac of "+i+" is: "+fac);
        }
        sc.close();
    }
}
