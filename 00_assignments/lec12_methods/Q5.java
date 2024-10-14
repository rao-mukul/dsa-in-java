package lec12_methods;

// Q5 - Write a Java method to find the smallest number among three numbers.

public class Q5 {

    static int smallestNo(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else if (c < a && c < b) {
            return c;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        int smallest = smallestNo(7, 7, 7);
        // System.out.println(smallest);
        
    }
}
