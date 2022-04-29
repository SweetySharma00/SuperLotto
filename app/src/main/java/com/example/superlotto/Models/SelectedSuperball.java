package com.example.superlotto.Models;

import android.widget.ImageView;
import android.widget.LinearLayout;

public class SelectedSuperball {
    ImageView imageView;
    String amount;
    LinearLayout linearLayout;
    public SelectedSuperball(ImageView imageView, String amount, LinearLayout linearLayout) {
        this.imageView = imageView;
        this.amount = amount;
        this.linearLayout = linearLayout;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public String getAmount() {
        return amount;
    }

    public LinearLayout getLinearLayout() {
        return linearLayout;
    }
}
