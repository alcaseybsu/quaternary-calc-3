package userInterface;

import javafx.scene.control.TextField;
import quaternary3.Calculator;
import quaternary3.QuaternaryConverter;


import java.util.Arrays;


public class UI_Calculator extends QuaternaryConverter {
    public TextField equation_window;
    public TextField result_window;
    public String equation ="";
    public String result= "";
    public Integer temp = 0;
    public Integer tempSquare = 0;
    public Integer tempRoot = 0;
    public String operation = null;

    public void buttonClearClicked() {
        equation = "";
        equation_window.setText(equation);
        result_window.setText("");
        operation = "";
    }
    public void buttonSquareClicked() {
        if (!operationCheck(equation)) {
            tempSquare = Integer.parseInt(equation);
            setEquation_window("\u00B2");
            operation = "square";

        }
    }

    public void buttonSquareRootClicked() {
        if (!operationCheck(equation)) {
            tempRoot = Integer.valueOf(equation);
            setEquation_window("\u221A");
            operation = "root";
        }

    }
    public void buttonPlusClicked() {
        if (!operationCheck(equation)) {
            setEquation_window("+");
            operation = "+";
        }

    }

    public void buttonMinusClicked() {
        if (!operationCheck(equation)) {
            setEquation_window("-");
            operation = "-";
        }
    }

    public void buttonMultiplyClicked() {
        if (!operationCheck(equation)) {
            setEquation_window("x");
            operation = "x";
        }
    }

    public void buttonDivideClicked() {
        if (!operationCheck(equation)) {
            setEquation_window("/");
            operation = "/";
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
        int answer = Integer.parseInt(result);
        if(temp == 0){
            answer = convertToDecimal(answer);
            temp = 1;
        }else {
            temp = 0;
        }
        result_window.setText(String.valueOf(answer));
    }


    public void buttonEnterClicked() {
        if(operation == "root"){
            result = Calculator.calculate(tempRoot, "root");
            result_window.setText(result);
        }else if(operation ==  "square"){
            result = Calculator.calculate(tempSquare, "square");
            result_window.setText(result);
        }else {
            String[] numbers = splitString(equation);
            result = Calculator.calculate(Integer.parseInt(numbers[0]), operation, Integer.parseInt(numbers[1]));
            result_window.setText(result);
        }
    }

    private void setEquation_window(String str){
        equation += str;
        equation_window.setText(equation);
    }

    private Boolean operationCheck(String str){
        int count = 0;
        char[] strArray = str.toCharArray();
        for (char c : strArray){
            if (c == '+' || c == '-' || c == '*'|| c == '/'){
                count+=1;
            }
        }
        return count >= 1;
    }

    private String[] splitString(String str){
        String[] numbers;
        if (str.contains("+")){
            numbers = str.split("\\+");
        }else if (str.contains("-")){
            numbers = str.split("-");
        }else if (str.contains("x")){
            numbers = str.split("x");
        }else if (str.contains("/")){
            numbers = str.split("/");
        }else if (str.contains("√")){
            numbers = str.split("√");
        }else
            numbers = str.split("²");

        return numbers;
    }
}