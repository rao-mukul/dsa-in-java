public class AlphaDiamond {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            char c = 'A';
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            char c = 'A';
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}
