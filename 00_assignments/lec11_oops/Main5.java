package lec11_oops;

/*
 * Q5. Write a program that would print the information (name, year of joining, salary, address) of three
employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining      Address

Robert      1994                64C- WallsStreet             

Sam         2000                68D- WallsStreet

John        1999                26B- WallsStreet

 */

class Employee {
    String Name;
    int YOJ;
    String Address;

    Employee(String nm, int yoj, String addr) {
        this.Name = nm;
        this.YOJ = yoj;
        this.Address = addr;
    }
}

public class Main5 {
    public static void main(String[] args) {
        Employee obj1 = new Employee("Robert", 1994, "64C- WallsStreet");
        Employee obj2 = new Employee("Sam", 2000, "68D- WallsStreet");
        Employee obj3 = new Employee("John", 1999, "26B- WallsStreet");

        // Table headers
        System.out.printf("| %-10s | %-20s | %-20s |%n", "Name", "Year of joining", "Address");
        System.out.println("+------------+----------------------+----------------------+");

        // Table rows (data)
        System.out.printf("| %-10s | %-20d | %-20s |%n", obj1.Name, obj1.YOJ, obj1.Address);
        System.out.printf("| %-10s | %-20d | %-20s |%n", obj2.Name, obj2.YOJ, obj2.Address);
        System.out.printf("| %-10s | %-20d | %-20s |%n", obj3.Name, obj3.YOJ, obj3.Address);

    }
}
