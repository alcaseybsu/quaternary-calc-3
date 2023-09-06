package quaternary3;

import java.util.Objects;

public class Calculator {
    public Calculator(){}

    public int calculate(int firstNum, String Operator, int secondNum){

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


    public int calculate(int firstNum, String Operator){
        if (Objects.equals(Operator, "root")){
            return root(firstNum);
        }
        else {
            return squareroot(firstNum);
        }
    }

    private int squareroot(int firstNum) {
        return 0;
    }

    private int root(int firstNum) {
        return 0;
    }

    private int subtract(int firstNum, int secondNum) {
        return 0;
    }

    private int add(int firstNum, int secondNum) {
        return 0;
    }

    private int divide(int firstNum, int secondNum) {
        return 0;
    }

    private int multiply(int firstNum, int secondNum) {
        return 0;
    }


}