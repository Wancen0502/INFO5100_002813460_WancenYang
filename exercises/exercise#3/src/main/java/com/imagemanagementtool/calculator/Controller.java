package com.imagemanagementtool.calculator;

import javafx.event.Event;
import javafx.event.EventTarget;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.regex.*;

public class Controller {

    @FXML
    private Label present;
    @FXML
    private Label result;
    private boolean LastisNum = true;
    private boolean LastisEqual = false;
    private boolean calucating = false;
    private String s;
    double check;

    // clear function (click "CE" key on the GUI)
    @FXML
    public void onActionCE(Event e) {
        int a = (present.getText().length());
        int b = (result.getText().length());
        if (a != 0 | b != 0) {
            present.setText("");
            result.setText("0");
        }
        LastisNum = true;
        LastisEqual = false;
        calucating = false;
    }

    @FXML
    public void onActionC(Event e){
        int b = (result.getText().length());
        if (b != 0 && calucating == false){
            result.setText("0");
        }
    }

    @FXML
    public void onClicked(Event e) {
        EventTarget target = e.getTarget();
        Button b = (Button) target;
        // read the input text
        String text = b.getText();
        // judge the input is a number
        try{
        double temp = Double.parseDouble(text);
        if (LastisNum) {
            String val = result.getText();
            int valLength = val.length();
            // if the length of input number over 10, the result label will only present 10 numbers.
            if (valLength >= 9) {
                return;
            }
            double newVal = Double.parseDouble(val)*10+ temp;
            result.setText(newVal +"");
        }
        else{
            result.setText(text);
        }
            LastisEqual = false;
    }
        catch (Exception ex){
            switch (text) {
                //plus, minus, multiply and divide
                case "+":
                    present.setText(result.getText() + "+");
                    LastisEqual= false;
                    break;
                case "-":
                    present.setText(result.getText() + "-");
                    LastisEqual = false;
                    break;
                case "*":
                    present.setText(result.getText() + "*");
                    LastisEqual = false;
                    break;
                case "/":
                    present.setText(result.getText() + "/");
                    LastisEqual = false;
                    break;

                // calculate "%", "X^2", "1/X", "X^0.5" directly
                case "%":
                    calucating = true;
                    present.setText(result.getText()+"%");
                    s = present.getText() ;
                    check = Double.parseDouble(result.getText())*0.01;
                    result.setText(check + "");
                    break;
                case "X^2":
                    calucating = true;
                    present.setText(result.getText()+"^2");
                    s = present.getText() ;
                    check = Double.parseDouble(result.getText())*Double.parseDouble(result.getText());
                    result.setText(check + "");
                    break;
                case "1/X":
                    calucating = true;
                    present.setText("1/"+result.getText());
                    s = present.getText() ;
                    check = 1/(Double.parseDouble(result.getText()));
                    result.setText(String.format("%.6f",check) + "");
                    break;
                case "X^0.5":
                    calucating = true;
                    present.setText(result.getText()+"^0.5");
                    s = present.getText() ;
                    check = Math.sqrt(Double.parseDouble(result.getText()));
                    result.setText(String.format("%.6f",check) + "");
                    break;
                    //calculate the result of plus, minus, multiply and  divide

                case "=":
                    if (!LastisEqual) {
                        calucating = true;
                        s = present.getText() + result.getText();
                        if (s.contains("+")) {
                            String[] split = s.split("\\+");
                            double resultVal = calculate(Double.parseDouble(split[0]), Double.parseDouble(split[1]), "+");
                            result.setText(resultVal + "");
                        } else if (s.contains("-")) {
                            String[] split = s.split("-");
                            double resultVal = calculate(Double.parseDouble(split[0]), Double.parseDouble(split[1]), "-");
                            result.setText(resultVal + "");
                        } else if (s.contains("*")) {
                            String[] split = s.split("\\*");
                            double resultVal = calculate(Double.parseDouble(split[0]), Double.parseDouble(split[1]), "*");
                            result.setText(resultVal + "");
                        } else if (s.contains("/")) {
                            String[] split = s.split("/");
                            double resultVal = calculate(Double.parseDouble(split[0]), Double.parseDouble(split[1]), "/");
                            result.setText(resultVal + "");
                        }
                    }
                    else{
                    }
                    LastisEqual = true;
                default:
                    break;
            }
        if (!calucating){
            result.setText("0");
        }
        else{
            present.setText(s + "=");
        }
        }
    }

    // This below method uses to calculate result.
    private double calculate(double a, double b, String o) {
        double r = 0;
        switch (o) {
            case "+":
                present.setText(result.getText() + "+");
                r = a + b; //plus
                break;
            case "-":
                present.setText(result.getText() + "-");
                r = a - b; // minus
                break;
            case "*":
                present.setText(result.getText() + "*");
                r = a * b; // multiply
                break;
            case "/":
                present.setText(result.getText() + "/");
                r = a / b; // divide
                break;

        }
        return r;

    }


    }
