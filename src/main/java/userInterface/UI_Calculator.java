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
        equation += "²";
        equation_window.setText(equation);
    }

    public void buttonSquareRootClicked() {
        equation += "√" ;
        equation_window.setText(equation);

    }
    public void buttonEnterClicked() {

    }

    public void buttonPlusClicked() {
        equation += "+";
        equation_window.setText(equation);

    }

    public void buttonMinusClicked() {
        equation += "-";
        equation_window.setText(equation);
    }

    public void buttonMultiplyClicked() {
        equation += "*";
        equation_window.setText(equation);
    }

    public void buttonDivideClicked() {
        equation += "/";
        equation_window.setText(equation);
    }

    public void button0Clicked() {
        equation += 0;
        equation_window.setText(equation);

    }
    public void button1Clicked() {
        equation += 1;
        equation_window.setText(equation);
    }

    public void button2Clicked() {
        equation += 2;
        equation_window.setText(equation);
    }

    public void button3Clicked() {
        equation += 3;
        equation_window.setText(equation);
    }

    public void toggleButtonPressed() {

    }
}

