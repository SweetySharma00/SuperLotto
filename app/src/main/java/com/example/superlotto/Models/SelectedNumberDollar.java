package com.example.superlotto.Models;

public class SelectedNumberDollar {
    private String number;
    private int ballImage;
    private boolean selected;

    public SelectedNumberDollar() {
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public SelectedNumberDollar(String number, int ballImage, boolean selected) {
        this.number = number;
        this.ballImage = ballImage;
        this.selected = selected;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getBallImage() {
        return ballImage;
    }

    public void setBallImage(int ballImage) {
        this.ballImage = ballImage;
    }
}
