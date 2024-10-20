package com.example.myapp;

public class Calculator {

    private double op1;// First operand
    private double op2; // Second operand
    private char operator;// Operator (+, -, *, /)
    private double result; // Result of the operation
    private boolean isError;// Tracks if an error occurred

    /**
     * Performs the calculation based on the stored operator and operands.
     * The result is stored in the result variable.
     */
    public void calculate(){

        if(this.operator == '+'){
            this.result = this.op1 + this.op2;
        }
        else if (this.operator == '-'){
            this.result = this.op1 - this.op2;
        }
        else if (this.operator == '*'){
            this.result = this.op1 * this.op2;
        }
        else if (this.operator == '/'){
            if(this.op1 == 0 || this.op2 == 0){
                this.isError = true;
            }else {
                this.result = this.op1 /this.op2;
            }
        }

    }
     /* Checks if an error occurred during the last calculation.*/
    public boolean isError(){
        return isError;
    }


    public double getOp1() {
        return op1;
    }
/* Sets the first operand for the calculation.*/
    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public double getOp2() {
        return op2;
    }
/* Sets the second operand for the calculation.*/
    public void setOp2(double op2) {
        this.op2 = op2;
    }

    public char getOperator() {
        return operator;
    }
/* Sets the arithmetic operator for the calculation.*/
    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
