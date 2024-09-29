// package loops_problems;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nc = n;
        int rn = 0;

        while (nc > 0) {
            rn = rn * 10 + nc % 10;
            nc /= 10;
        }

        System.out.println(rn);
        sc.close();
    }
}
