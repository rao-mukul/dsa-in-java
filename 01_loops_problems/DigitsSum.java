// package loops_problems;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nc = n;
        int sum = 0;

        while (nc > 0) {
            sum += nc % 10;
            nc /= 10;
        }

        System.out.println(sum);
        sc.close();
    }

}
