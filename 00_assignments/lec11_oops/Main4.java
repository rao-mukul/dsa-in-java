package lec11_oops;

import java.util.Scanner;

/*
 * Q4. Print the sum, difference and product of two complex numbers by creating a class named
'Complex' with separate methods for each operation whose real and imaginary parts are
entered by user.
 */

class Complex {
    double real1, imaginary1;
    double real2, imaginary2;

    Complex(double r1, double i1, double r2, double i2) {
        this.real1 = r1;
        this.imaginary1 = i1;
        this.real2 = r2;
        this.imaginary2 = i2;
    }

    void sum() {
        double rSum = real1 + real2;
        double iSum = imaginary1 + imaginary2;
        System.out.println("The sum of " + real1 + " + i" + imaginary1 + " and " + real2 + " + i"
                + imaginary2 + " is: ");
        System.out.println(rSum + " + i" + iSum);
    }

    void difference() {
        double rDiff = real1 - real2;
        double iDiff = imaginary1 - imaginary2;
        System.out.println("The Differnce of " + real1 + " + i" + imaginary1 + " and " + real2 + " + i"
                + imaginary2 + " is: ");
        System.out.println(rDiff + " + i" + iDiff);
    }

    void product() {

    }

}

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Real Part and Imaginary part of 1st Complex no :");
        double r1 = sc.nextDouble();
        double i1 = sc.nextDouble();
        System.out.println("Enter the Real Part and Imaginary part of 2nd Complex no :");
        double r2 = sc.nextDouble();
        double i2 = sc.nextDouble();

        Complex obj = new Complex(r1, i1, r2, i2);
        obj.sum();
        obj.difference();

    }
}
