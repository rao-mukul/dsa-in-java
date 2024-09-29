public class NumPyramid {
    public static void main(String[] args) {
        int r = 4;
        // This Pattern has 3 parts: Space, P1, P2
        for (int i = 1; i <= r; i++) {
            // Spaces
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            // Pattern 1
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            // Pattern 2
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
