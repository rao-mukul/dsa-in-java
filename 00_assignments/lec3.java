public class lec3 {

    /*
     * ? Q1 - Take 2 integer values in two variables x and y and print their
     * product. (Easy)
     * Sample Input : x=2, y=4 (Both integers)
     * Sample Output : 8
     */
    public static void q1(int x, int y) {
        System.out.println(x * y);
    }

    /*
     * Q2 - Print the ASCII value of character ‘U’. (Easy)
     * Sample Input : already mentioned as ‘U’
     * Sample Output : 85
     */

    public static void q2(char c) {
        int ascii = c;
        // System.out.println((int)c);
        System.out.println(ascii);
    }

    /*
     * Q3 - Write a Java program to take the length and breadth of a rectangle and
     * print its area. (Easy)
     * Sample Input : 7, 4
     * Sample Output : 28
     */

    public static void q3(float length, float breadth) {
        System.out.println(length * breadth);
    }

    /*
     * Q4 - Write a Java program to calculate the cube of a number. (Easy)
     * Sample Input : 4
     * Sample Output : 64
     */

    public static void q4(int n) {
        // System.out.println(n*n*n);
        int c = (int) Math.pow(n, 3);
        // Math class is part of the java.lang package, which is automatically imported
        // into every Java program.
        System.out.println(c);
    }

    /*
     * Q5 - Write a Java program to swap two numbers with the help of a third
     * variable. (Hard)
     * Sample Input : 2,3
     * Sample Output : 3,2
     */

    public static void q5(int num1, int num2) {
        int temp = 0;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1 + " " + num2);
    }

    public static void main(String[] args) {
        // q1(2,4);
        // q2('U');
        // q3(7, 4);
        // q4(4);
        // q5(2, 3);
    }

}
