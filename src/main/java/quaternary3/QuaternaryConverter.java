package quaternary3;

public class QuaternaryConverter {


    public static int convertToDecimal(int number) {
        String numberString = "" + number;
        int decimalNumber = 0;
        int power = 0;

        for (int i = numberString.length() - 1; i >= 0; i--) {
            char digitChar = numberString.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            decimalNumber += digit * Math.pow(4, power);
            power++;
        }

        return decimalNumber;
    }
    public static String convertToBase4(int decimalNumber) {
        StringBuilder base4Number = new StringBuilder();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 4;
            base4Number.insert(0, remainder); // Insert the remainder at the beginning
            decimalNumber /= 4;
        }

        if (base4Number.length() == 0) {
            base4Number.append(0); // Handle the case when the input is 0
        }

        return base4Number.toString();
    }
}
