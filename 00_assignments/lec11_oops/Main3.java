package lec11_oops;

import java.util.Scanner;

/*
 * Q3. Write a program to print the area of a rectangle by creating a class named 'Area' taking the values
of its length and breadth as parameters of its constructor and having a method named 'returnArea'
which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
 */

class Area {
    int length, breadth;

    Area(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    int returnArea() {
        int area = length * breadth;
        return area;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length: ");
        int length = sc.nextInt();
        System.out.println("Enter the Breadth: ");
        int breadth = sc.nextInt();
        Area obj = new Area(length, breadth);
        System.out.println("The Area of this rectangle is: " + obj.returnArea());

        sc.close();
    }
}
