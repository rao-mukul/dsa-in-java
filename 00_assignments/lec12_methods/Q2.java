package lec12_methods;

// Q2 - Write a Java method to count all vowels in a string

public class Q2 {

    static int countVowels(String str) {
        int len = str.length();
        int count = 0;

        str = str.toLowerCase(); // Convert the String to Lower Case

        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            boolean cond1 = c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
            // boolean cond2 = c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';

            if (cond1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("cOding"));
        System.out.println(countVowels("heaps"));
    }
}
