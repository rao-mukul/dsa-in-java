import java.util.Scanner;

public class lec6 {
    static Scanner sc = new Scanner(System.in);

    /*
     * Q1 - Write a program which takes the values of length and breadth from user
     * and check if it is
     * a square or not.
     * Sample Input:
     * Enter length:
     * 5
     * Enter breadth:
     * 4
     * Sample Output: It is a rectangle
     */

    public static void q1() {
        System.out.println("Enter Length:");
        int l = sc.nextInt();

        System.out.println("Enter Breadth:");
        int b = sc.nextInt();

        if (l == b) {
            System.out.println("It is a Square");
        } else {
            System.out.println("It is a rectangle");
        }

    }

    /*
     * Q2 - Write a program to print absolute value of a number entered by the user.
     * Sample Input : -1
     * Sample Output : 1
     */

    public static void q2(int n) {
        if (n < 0) {
            System.out.println(-n);
        } else {
            System.out.println(n);
        }
    }

    /*
     * Q3 - Write a program to take input from user for Cost Price (C.P.) and
     * Selling Price(S.P.) and
     * calculate Profit or Loss.
     * Explanation : Formula for profit and loss
     * Profit = S.P - C.P
     * Loss = C.P - S.P
     * (S.P is Selling Price and C.P is Cost Price)
     * Sample Input :
     * Enter cost price: 4000
     * Enter selling price: 9560
     * Sample Output :
     * Profit = 5560
     */

    public static void q3() {
        System.out.println("Enter cost price");
        int cp = sc.nextInt();

        System.out.println("Enter selling price");
        int sp = sc.nextInt();

        if (sp > cp) {
            int profit = sp - cp;
            System.out.println("Profit = " + profit);
        } else if (cp > sp) {
            int loss = cp - sp;
            System.out.println("Loss = " + loss);
        } else {
            System.out.println("No Profit No Loss");
        }
    }

    /*
     * Q4 - Write a program to print positive number entered by the user, if user
     * enters a negative
     * number, it is skipped
     * Sample Input : Enter an integer: -6
     * Sample Output : The number is negative and skipped
     */

    public static void q4() {
        System.out.println("Enter an integer:");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("The number is negative and skipped");
            return;
        }
        System.out.println(n);
    }

    /*
     * Q5 - Create a calculator using switch statement to perform addition,
     * subtraction, multiplication
     * and division.
     * Sample Input :
     * Enter an operator (+, -, *, /): -
     * Enter two numbers:
     * 6
     * 8
     * Sample Output :
     * 6 - 8 = -2
     */

     public static void q5(){
        System.out.println("Enter an operator (+,-,*,/): ");
        char operator = sc.next().charAt(0);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (operator) {
            case '+':
                System.out.println(a+" + "+b+" = "+(a+b));
                break;
            case '-':
                System.out.println(a+" - "+b+" = "+(a-b));
                break;
            case '*':
                System.out.println(a+" * "+b+" = "+(a*b));
                break;
            case '/':
                System.out.println(a+" / "+b+" = "+(a/b));
                break;
            default:
                System.out.println("Enter a valid operator");
                break;
        }
     }
    public static void main(String[] args) {
        // q1();
        // q2(-1);
        // q3();
        // q4();
        q5();
    }
}
