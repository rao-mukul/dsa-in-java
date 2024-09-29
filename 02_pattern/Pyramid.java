public class Pyramid {
    public static void main(String[] args) {
        int r = 4;
        for (int i = 1; i <= r; i++) { // For Rows
            for (int k = 1; k <= (r - i); k++) { // For Spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) { // For Stars
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
