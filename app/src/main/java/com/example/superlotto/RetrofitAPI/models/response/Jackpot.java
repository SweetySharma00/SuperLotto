package com.example.superlotto.RetrofitAPI.models.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Jackpot {
    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("cashAmount")
    @Expose
    private Integer cashAmount;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(Integer cashAmount) {
        this.cashAmount = cashAmount;
    }
}
