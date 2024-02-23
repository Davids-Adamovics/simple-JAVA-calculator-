package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class calculatorController {

    @FXML
    private Button acButton;
    @FXML
    private Button plusminusButton;
    @FXML
    private Button percentButton;
    @FXML
    private Button devideButton;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button buttonTimes;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button buttonMinus;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button buttonPlus;
    @FXML
    private Button button0;
    @FXML
    private Button buttonDot;
    @FXML
    private Button buttonResult;
    @FXML
    private TextField result;
    @FXML
    private TextField allnumbers;

    @FXML
    public void addNull(ActionEvent event) throws IOException {
        allnumbers.appendText("0");
    }

    @FXML
    public void addOne(ActionEvent event) throws IOException {
        allnumbers.appendText("1");
    }

    @FXML
    public void addTwo(ActionEvent event) throws IOException {
        allnumbers.appendText("2");
    }

    @FXML
    public void addThree(ActionEvent event) throws IOException {
        allnumbers.appendText("3");
    }

    @FXML
    public void addFour(ActionEvent event) throws IOException {
        allnumbers.appendText("4");
    }

    @FXML
    public void addFive(ActionEvent event) throws IOException {
        allnumbers.appendText("5");
    }

    @FXML
    public void addSix(ActionEvent event) throws IOException {
        allnumbers.appendText("6");
    }

    @FXML
    public void addSeven(ActionEvent event) throws IOException {
        allnumbers.appendText("7");
    }

    @FXML
    public void addEight(ActionEvent event) throws IOException {
        allnumbers.appendText("8");
    }

    @FXML
    public void addNine(ActionEvent event) throws IOException {
        allnumbers.appendText("9");
    }

    @FXML
    public void deleteAll(ActionEvent event) throws IOException {
        allnumbers.deleteText(0, allnumbers.getLength());
    }

    @FXML
    public void devideIt(ActionEvent event) throws IOException {
        allnumbers.appendText(" / ");
    }

    @FXML
    public void minusIt(ActionEvent event) throws IOException {
        allnumbers.appendText(" - ");
    }

    @FXML
    public void plusIt(ActionEvent event) throws IOException {
        allnumbers.appendText(" + ");
    }

    @FXML
    public void timesIt(ActionEvent event) throws IOException {
        allnumbers.appendText(" * ");
    }

    @FXML
    public void equalsTo(ActionEvent event) throws IOException {
        allnumbers.appendText(" = ");
        calculation(allnumbers);
    }

public void calculation(TextField incomingEquation) {
    String text = incomingEquation.getText();
    int results = 0;
    int currentNumber = 0;
    char currentOperator = '+';

    for (int i = 0; i < text.length(); i++) {
        char currentChar = text.charAt(i);

        if (Character.isDigit(currentChar)) {
            currentNumber = currentNumber * 10 + Character.getNumericValue(currentChar);
        } else if (isOperator(currentChar)) {
            results = applyOperator(results, currentNumber, currentOperator);
            currentNumber = 0;
            currentOperator = currentChar;
        }
    }
    results = applyOperator(results, currentNumber, currentOperator);

    result.setText(Integer.toString(results));
}

private boolean isOperator(char c) {
    return c == '+' || c == '-' || c == '*' || c == '/' ;
}

private int applyOperator(int result, int currentNumber, char currentOperator) {
    switch (currentOperator) {
        case '+':
            return result + currentNumber;
        case '-':
            return result - currentNumber;
        case '*':
            return result * currentNumber;
        case '/':
            // Check for division by zero
            return (currentNumber != 0) ? result / currentNumber : 0;
        default:
            throw new IllegalArgumentException("Invalid operator: " + currentOperator);
    }
}

}
