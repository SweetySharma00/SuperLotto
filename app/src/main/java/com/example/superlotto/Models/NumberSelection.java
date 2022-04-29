package com.example.superlotto.Models;

public class NumberSelection {
    private int image;
    private String name;
    private boolean isEnabled;

    public NumberSelection(int image, String name, boolean isEnabled) {
        this.image = image;
        this.name = name;
        this.isEnabled = isEnabled;
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
