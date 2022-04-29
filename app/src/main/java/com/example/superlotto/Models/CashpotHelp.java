package com.example.superlotto.Models;

public class CashpotHelp {
    private String stepNo;
    private String stepDescription;

    public CashpotHelp(String stepNo, String stepDescription) {
        this.stepNo = stepNo;
        this.stepDescription = stepDescription;
    }

    public String getStepNo() {
        return stepNo;
    }

    public void setStepNo(String stepNo) {
        this.stepNo = stepNo;
    }

    public String getStepDescription() {
        return stepDescription;
    }

    public void setStepDescription(String stepDescription) {
        this.stepDescription = stepDescription;
    }
}
