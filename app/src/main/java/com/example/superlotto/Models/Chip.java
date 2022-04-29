package com.example.superlotto.Models;

public class Chip {
    int image;
    int value;
    boolean isSelected;

    public Chip(int image, int value, boolean isSelected) {
        this.image = image;
        this.value = value;
        this.isSelected = isSelected;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
