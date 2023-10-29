package com.example.bmi_calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class HelloController {

    BMI_Calculator bmi = new BMI_Calculator();

    @FXML
    private TextField weightValue;

    @FXML
    private TextField heightValue;

    @FXML
    private TextField result;

    @FXML
    private RadioButton radioButton1, radioButton2;
    private String selectedRadio;

    @FXML
    private void onBMIButtonClick(){
        double userResult = bmi.bmiCalculator( Double.parseDouble(weightValue.getText()), Double.parseDouble(heightValue.getText()), selectedRadio );

        result.setText(String.valueOf(userResult));
    }

    @FXML
    private void getRadioButton(){
        if(radioButton1.isSelected()){
            bmi.setRadioButtonString("Metric");
        } else if (radioButton2.isSelected()) {
            bmi.setRadioButtonString("English");
        }
    }
}