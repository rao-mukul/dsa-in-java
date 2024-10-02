public class Alphabets {
    public static void main(String[] args) {
        // L
        int r = 5;
        int c = 5;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (j == 1 || i == r) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
        // O
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (j == 1 || j == c || i == r || i == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        // K

        // E
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (j == 1 || i == (r / 2) + 1 || i == r || i == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // S
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == r || i == 1 || (i <= r / 2 + 1) && j == 1 || i == (r / 2) + 1 || i >= (r / 2) + 1 && j == c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        // H
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (j == 1 || j == c || i == (r / 2) + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
