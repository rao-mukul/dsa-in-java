package lec12_methods;

/*
 * Q1 - Write a Java method to compute the average of three numbers
 * Input1:
25
45
65
Output1:
45
Input2:
25
25
25
Output2:
25
 */

class Average {
    void average(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        System.out.println(avg);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Average obj = new Average();
        obj.average(25, 45, 65);
        obj.average(25, 25, 25);
    }
}
