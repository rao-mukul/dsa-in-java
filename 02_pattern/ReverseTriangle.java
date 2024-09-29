public class ReverseTriangle {
    public static void main(String[] args) {
        int r = 4;
        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        // Alternate Method
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= (r + 1 - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
