public class NumRect3 {
    public static void main(String[] args) {
        int r = 4;
        int c = 6;

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if ((i+j)%2 ==0) {
                    System.out.print(1);
                }
                else{
                    System.out.print(2);
                }
            }
            System.out.println();
        }

    }
}
