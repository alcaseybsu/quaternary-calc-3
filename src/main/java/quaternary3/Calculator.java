package quaternary3;

import java.util.Objects;

import static quaternary3.QuaternaryConverter.convertToBase4;
import static quaternary3.QuaternaryConverter.convertToDecimal;

public class Calculator {
    public Calculator(){}

    public static String calculate(int firstNum, String Operator, int secondNum){

        if (Objects.equals(Operator, "*")){
            return multiply(firstNum, secondNum);
        }
        else if (Objects.equals(Operator, "/")){
            return divide(firstNum, secondNum);
        }
        else if (Objects.equals(Operator, "-")){
            return subtract(firstNum, secondNum);
        }
        else{
            return add(firstNum, secondNum);
        }
    }


    public static String calculate(int firstNum, String Operator){
        if (Objects.equals(Operator, "root")){
            return squareroot(firstNum);
        }
        else {
            return square(firstNum);
        }
    }

    private static String squareroot(int firstNum) {
        int convertedNum = convertToDecimal(firstNum);
        convertedNum = (int) Math.sqrt(convertedNum);
        return convertToBase4(convertedNum);
    }

    private static String square(int firstNum) {
        int convertedNum = convertToDecimal(firstNum);
        convertedNum = convertedNum + convertedNum;
        return convertToBase4(convertedNum);
    }

    private static String subtract(int firstNum, int secondNum) {
        int convertedNumOne = convertToDecimal(firstNum);
        int convertedNumTwo = convertToDecimal(secondNum);
        int result = convertedNumOne - convertedNumTwo;
        return convertToBase4(result);
    }

    private static String add(int firstNum, int secondNum) {
        int convertedNumOne = convertToDecimal(firstNum);
        int convertedNumTwo = convertToDecimal(secondNum);
        int result = convertedNumOne + convertedNumTwo;
        return convertToBase4(result);
    }

    private static String divide(int firstNum, int secondNum) {
        int convertedNumOne = convertToDecimal(firstNum);
        int convertedNumTwo = convertToDecimal(secondNum);
        int result = convertedNumOne / convertedNumTwo;
        return convertToBase4(result);
    }

    private static String multiply(int firstNum, int secondNum) {
        int convertedNumOne = convertToDecimal(firstNum);
        int convertedNumTwo = convertToDecimal(secondNum);
        int result = convertedNumOne * convertedNumTwo;
        return convertToBase4(result);
    }


}