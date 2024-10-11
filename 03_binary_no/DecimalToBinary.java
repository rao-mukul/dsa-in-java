public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 13;
        int binary = 0;
        int baseValue = 1;

        while (decimal > 0) {
            int parity = decimal % 2;
            binary += parity * baseValue;
            decimal /= 2;
            baseValue *= 10;
        }
        System.out.println(binary);
    }
}
