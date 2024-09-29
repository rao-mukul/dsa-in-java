import java.util.Scanner;

public class lec4 {
    static Scanner sc = new Scanner(System.in);

    /*
     * Q1 - Input name, roll number and field of interest from user and print in the
     * format below :
     * Name: xyz, Roll number: xyz, Field of interest: xyz
     * Input : Single line format
     * Aman Gupta 4053 Physics
     * Output :
     * Name: Aman Gupta
     * Roll Number: 4053
     * Field of interest: Physics
     */
    public static void q1() {
        String first_name = sc.next();
        String last_name = sc.next();
        int roll = sc.nextInt();
        String interest = sc.next();

        System.out.println("Name: " + first_name + " " + last_name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Field of Interest: " + interest);
    }

    /*
     * Q2 - Input two different string and print them in same line.
     * Input :
     * Level
     * Up
     * Output :
     * LevelUp
     */

    public static void q2() {
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(str1 + str2);
    }

    /*
     * Q3 - If the marks of Robert in three subjects are entered through keyboard
     * (each out of
     * 100), write a program to calculate his total marks and percentage marks.
     * Input :
     * 78
     * 89
     * 95
     * Output : Total marks: 262
     * Percentage marks: 87%
     */

    public static void q3() {
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int total = m1 + m2 + m3;
        int percent = total / 3;
        System.out.println("Total marks: " + total);
        System.out.println("Percentage marks: " + percent + "%");
    }

    /*
     * Q4 - Given two numbers, return their sum in the following format:
     * Int t representing number of test cases
     * T lines of Two integers representing the numbers to be added
     * Input :
     * 3
     * 4 5
     * 18 20
     * 49 27
     * Output :
     * 9
     * 38
     * 76
     */

    public static void q4() {
        int t = sc.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
            arr[i] = sum;
        }

        System.out.println("Output:");
        for (int i : arr) {
            System.out.println(i);
        }

    }

    /*
     * Q5 - Given few lines of input(number of lines unknown) where each line has
     * two
     * strings, concatenate the strings.
     * Input :
     * Hello World
     * Happy Faces
     * Sunny Day
     * Good Morning
     * Output :
     * HelloWorld
     * HappyFaces
     * SunnyDay
     * GoodMorning
     */

    public static void q5() {
        while (sc.hasNextLine()) {
            String str1 = sc.next();
            String str2 = sc.next();
            System.out.println(str1 + str2);
        }
    }

    public static void main(String[] args) {
        // q1();
        // q2();
        // q3();
        // q4();
        // q5();
    }
}
