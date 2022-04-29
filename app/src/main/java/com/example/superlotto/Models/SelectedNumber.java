package com.example.superlotto.Models;

import android.widget.ImageView;
import android.widget.TextView;

public class SelectedNumber {
    TextView textView;
    ImageView imageView;
    TextView amount;
    Boolean status;

    public SelectedNumber( ImageView imageView, TextView amount, Boolean status) {

        this.imageView = imageView;
        this.amount = amount;
        this.status = status;

    }

    public TextView getTextView() {
        return textView;
    }

    public ImageView getImageView() {
        return imageView;
    }


    public TextView getAmount() {
        return amount;
    }

    public Boolean getStatus() {
        return status;
    }

}
