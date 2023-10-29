package com.example.bmi_calculator;

public class BMI_Calculator {
    private double userWeight;
    private double userHeight;
    private double userResult;
    private String radioButtonString;

    public double bmiCalculator(double a, double b, String radioButtonString){
        if(radioButtonString.equals("Metric")){
            return a / (b * b);
        } else if (radioButtonString.equals("English")) {
            return (a / (b*b)) * 703;
        }
        else
            return 0;
    }

    public double getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(double userWeight) {
        this.userWeight = userWeight;
    }

    public double getUserHeight() {
        return userHeight;
    }

    public void setUserHeight(double userHeight) {
        this.userHeight = userHeight;
    }

    public double getUserResult() {
        return userResult;
    }

    public void setUserResult(double userResult) {
        this.userResult = userResult;
    }

    public String getRadioButtonString() { return radioButtonString; }

    public void setRadioButtonString(String radioButtonString) { this.radioButtonString = radioButtonString; }
}
