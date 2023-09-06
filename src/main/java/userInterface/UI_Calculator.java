package userInterface;

import javafx.scene.control.TextField;

public class UI_Calculator {
    public TextField equation_window;
    public TextField result_window;
    public String equation ="";

    public void buttonClearClicked() {
        equation = "";
        equation_window.setText(equation);
    }
    public void buttonSquareClicked() {
        if (!operationCheck(equation)) {
            setEquation_window("²");
        }
    }

    public void buttonSquareRootClicked() {
        if (!operationCheck(equation)) {
            setEquation_window("√");
        }

    }
    public void buttonPlusClicked() {
        if (!operationCheck(equation)) {
            setEquation_window("+");
        }

    }

    public void buttonMinusClicked() {
        if (!operationCheck(equation)) {
            setEquation_window("-");
        }
    }

    public void buttonMultiplyClicked() {
        if (!operationCheck(equation)) {
            setEquation_window("*");
        }
    }

    public void buttonDivideClicked() {
        if (!operationCheck(equation)) {
            setEquation_window("/");
        }
    }

    public void button0Clicked() {
        setEquation_window("0");
    }
    public void button1Clicked() {
        setEquation_window("1");

    }

    public void button2Clicked() {
        setEquation_window("2");

    }

    public void button3Clicked() {
        setEquation_window("3");
    }

    public void toggleButtonPressed() {

    }


    public void buttonEnterClicked() {
        result_window.setText(operationCheck(equation).toString());

    }


    private void setEquation_window(String str){
        equation += str;
        equation_window.setText(equation);
    }

    private Boolean operationCheck(String str){
        int count = 0;
        char[] strArray = str.toCharArray();
        for (char c : strArray){
            if (c == '+' ||c == '-' ||c == '*'||c == '/' ||c == '√' ||c == '²'){
                count+=1;
            }
        }
        return count >= 1;
    }
}