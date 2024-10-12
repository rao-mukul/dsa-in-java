package lec11_oops;

// Q2.Write a program to print the area and perimeter of a triangle having sides of 3,4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.

class Triangle {
    int a, b, c;

    void area() {
        double area = 0.5 * (a * b);
        System.out.println("Area of triangle: " + area);
    }

    void areaOfAnyTriangle() {
        // Using Heron's formula

        // 1. Calculate the semi-perimeter
        double s = (double) (a + b + c) / 2;
        // System.out.println(s);

        // 2. Apply Heron’s formula
        // A= Root[s(s−a)(s−b)(s−c)]

        double product = s * (s - a) * (s - b) * (s - c);
        double Area = Math.sqrt(product);
        System.out.println("Area of triangle: " + Area);
    }

    void perimeter() {
        int peri = a + b + c;
        System.out.println("Perimeter of the triange: " + peri);
    }

}

public class Main2 {
    public static void main(String[] args) {
        Triangle obj = new Triangle();
        obj.a = 3;
        obj.b = 4;
        obj.c = 5;
        obj.area();
        obj.perimeter();
        obj.areaOfAnyTriangle();
    }

}
