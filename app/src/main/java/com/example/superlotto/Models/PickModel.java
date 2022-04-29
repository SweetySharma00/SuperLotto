package com.example.superlotto.Models;

public class PickModel {
    int number;
    int image;

    public PickModel(int number, int image) {
        this.number = number;
        this.image = image;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
