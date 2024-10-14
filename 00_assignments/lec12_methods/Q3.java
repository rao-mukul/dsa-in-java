package lec12_methods;

/*
 * Q3 - Write a Java method to display the middle character of a string.(Easy)
Note: a) If the length of the string is even there will be two middle characters.
b) If the length of the string is odd there will be one middle character.
 */

public class Q3 {

    static void midOfString(String str) {
        int length = str.length();
        int mid = 0;

        if (length % 2 == 0) {
            mid = length / 2;
            System.out.println((str.charAt(mid - 1)) + "" + (str.charAt(mid)));
        } else {
            mid = (length / 2) + 1;
            System.out.println(str.charAt(mid - 1));
        }
    }

    public static void main(String[] args) {
        midOfString("4004");
        midOfString("350");
    }
}
