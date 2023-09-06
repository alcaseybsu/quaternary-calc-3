package userInterface;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class UI_Calculator {
    public TextField equation_window;
    public TextField result_window;

    public String equation ="";

    public void buttonClearClicked(ActionEvent actionEvent) {
        equation = "";
        equation_window.setText(equation);
    }

    public void buttonSquareClicked(ActionEvent actionEvent) {

    }

    public void buttonSquareRootClicked(ActionEvent actionEvent) {
        equation += 0 ;
        equation_window.setText(equation);

    }
    public void buttonEnterClicked(ActionEvent actionEvent) {

    }

    public void buttonPlusClicked(ActionEvent actionEvent) {
        equation += "+";
        equation_window.setText(equation);

    }

    public void buttonMinusClicked(ActionEvent actionEvent) {
        equation += "-";
        equation_window.setText(equation);
    }

    public void buttonMultiplyClicked(ActionEvent actionEvent) {
        equation += "*";
        equation_window.setText(equation);
    }

    public void buttonDivideClicked(ActionEvent actionEvent) {
        equation += "/";
        equation_window.setText(equation);
    }

    public void button0Clicked(ActionEvent actionEvent) {
        equation += 0;
        equation_window.setText(equation);

    }
    public void button1Clicked(ActionEvent actionEvent) {
        equation += 1;
        equation_window.setText(equation);
    }

    public void button2Clicked(ActionEvent actionEvent) {
        equation += 2;
        equation_window.setText(equation);
    }

    public void button3Clicked(ActionEvent actionEvent) {
        equation += 3;
        equation_window.setText(equation);
    }

}

