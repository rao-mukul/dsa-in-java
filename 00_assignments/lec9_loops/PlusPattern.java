public class PlusPattern {

    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == (rows + 1) / 2 || j == (cols + 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}