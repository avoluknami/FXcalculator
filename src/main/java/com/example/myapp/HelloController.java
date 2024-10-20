package com.example.myapp;


import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {

    Calculator calc = new Calculator();

    @FXML
    private TextField text;// TextField to display input and results

    // Individual button click handlers for digits 0-9
    @FXML
    private void onClickBut1(){
        String val = text.getText();
        val = val + "1";
        text.setText(val);
    }
    @FXML
    private void onClickBut2(){
        String val = text.getText();
        val = val + "2";
        text.setText(val);
    }
    @FXML
    private void onClickBut3(){
        String val = text.getText();
        val = val + "3";
        text.setText(val);
    }
    @FXML
    private void onClickBut4(){
        String val = text.getText();
        val = val + "4";
        text.setText(val);
    }
    @FXML
    private void onClickBut5(){
        String val = text.getText();
        val = val + "5";
        text.setText(val);
    }
    @FXML
    private void onClickBut6(){
        String val = text.getText();
        val = val + "6";
        text.setText(val);
    }
    @FXML
    private void onClickBut7(){
        String val = text.getText();
        val = val + "7";
        text.setText(val);
    }
    @FXML
    private void onClickBut8(){
        String val = text.getText();
        val = val + "8";
        text.setText(val);
    }
    @FXML
    private void onClickBut9(){
        String val = text.getText();
        val = val + "9";
        text.setText(val);
    }
    @FXML
    private void onClickBut0(){
        String val = text.getText();
        val = val + "0";
        text.setText(val);
    }






/* Handles the addition operator.
            * Stores the first operand and sets the operator, then clears the text field.
            */
    @FXML
    private void onPlusClick(){
        String op1 = text.getText();
        text.setText("");

        calc.setOp1( Integer.parseInt(op1) );
        calc.setOperator('+');

    }

    /**
     * Handles the subtraction operator.
     */
    @FXML
    public void onMinusButton(){
        String op1 = text.getText();
        text.setText("");

        calc.setOp1((Integer.parseInt(op1)));
        calc.setOperator('-');
    }

    /**
     * Handles the multiplication operator.
     */
    @FXML
    public void multiplyButton(){
        String op1 = text.getText();
        text.setText("");

        calc.setOp1((Integer.parseInt(op1)));
        calc.setOperator('*');
    }

    /**
     * Handles the division operator.
     */
    @FXML
    public void divideButton(){
        String op1 = text.getText();
        text.setText("");

        calc.setOp1((Integer.parseInt(op1)));
        calc.setOperator('/');
    }

    /**
     * Handles the equals button click.
     * Retrieves the second operand, performs the calculation, and updates the display.
     */
    @FXML
    private void onEqualClick(){

        String op2 = text.getText();
        if(!op2.isEmpty()){
            calc.setOp2( Integer.parseInt(op2) );
            calc.calculate();
            text.setText("" +  calc.getResult() );
            // Check for errors and display results
            if (calc.isError()) {
                text.setText("Error");
            } else {
                text.setText(String.valueOf(calc.getResult()));
            }
        }
    }
    /**
     * Resets the calculator state and clears the display.
     */
    @FXML
    private void onClearClick(){
        text.setText("");
    }



}