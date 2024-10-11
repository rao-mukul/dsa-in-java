public class BinaryToDecimal2 {
    public static void main(String[] args) {
        int binary = 1001;
        int orgininalBinary = binary;
        int decimal = 0;
        int baseValue = 1; // 2^0 = 1

        while (binary > 0) {
            int unitPlace = binary % 10;
            decimal += unitPlace * baseValue;
            binary /= 10;
            baseValue *= 2;
        }
        System.out.println("The Decimal value of " + orgininalBinary + " is: " + decimal);
    }
}
