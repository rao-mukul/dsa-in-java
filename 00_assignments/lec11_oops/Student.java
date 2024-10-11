package lec11_oops;

/*
 * Q1. Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign
the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
 */

public class Student {
    String name;
    int roll_no;

    public static void main(String[] args) {
        Student obj = new Student();
        obj.name = "John";
        obj.roll_no = 2;
    }
}
