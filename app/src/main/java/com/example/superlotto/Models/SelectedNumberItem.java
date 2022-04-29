package com.example.superlotto.Models;

public class SelectedNumberItem {
    private int image;
    private String name;
    private boolean isEnabled;
    private int number;

    public SelectedNumberItem(int image, String name, boolean isEnabled, int number) {
        this.image = image;
        this.name = name;
        this.isEnabled = isEnabled;
        this.number = number;
    }
    public int getNumber() {
        return number;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}
