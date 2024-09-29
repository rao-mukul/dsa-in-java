// package loops_problems;

import java.util.*;

public class Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i%2 == 0) {
                sum -= i;
            }
            else{
                sum += i;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
