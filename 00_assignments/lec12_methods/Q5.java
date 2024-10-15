package lec12_methods;

// Q5 - Write a Java method to find the smallest number among three numbers.

public class Q5 {

    // Simplest Approach
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

    // Nested If Else Approach
    static void smallestNo2(int a, int b, int c) {
        if (a < b) {
            if (a < c) {
                System.out.println(a + " is the smallest");
            } else {
                System.out.println(c + " is smallest");
            }
        } else {
            if (b < c) {
                System.out.println(b + " is the smallest");
            } else {
                System.out.println(c + " is the smallest");
            }
        }
    }

    // Using Ternary Operator
    static void smallestNo3(int a, int b, int c) {
        int smallest = (a < b) ? (a < c) ? a : c : (b < c) ? b : c;
        System.out.println(smallest);
    }

    // Using Math Library Built-in Function
    static void smallestNo4(int a, int b, int c) {
        System.out.println(Math.min(a, Math.min(b, c)));
    }

    public static void main(String[] args) {
        int smallest = smallestNo(7, 6, 3);
        System.out.println(smallest);
        smallestNo2(1, 3, 9);
        smallestNo3(5, 4, 7);

    }
}
