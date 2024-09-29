// package loops_problems;

import java.util.Scanner;

public class DigitsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nc = n;
        int count = 0;
        while (nc > 0) {
            nc /= 10;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
