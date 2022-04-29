package com.example.superlotto.RetrofitAPI.models.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Pick4BetResponse {

    @SerializedName("message")
    @Expose
    private Message message;
    @SerializedName("totalAmount")
    private String totalAmount;

    @SerializedName("orderId")
    private int orderId;

    @SerializedName("currency")
    private String currency;

    @SerializedName("bets")
    private List<BetsItem> bets;
    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
    public void setTotalAmount(String totalAmount){
        this.totalAmount = totalAmount;
    }

    public String getTotalAmount(){
        return totalAmount;
    }

    public void setOrderId(int orderId){
        this.orderId = orderId;
    }

    public int getOrderId(){
        return orderId;
    }

    public void setCurrency(String currency){
        this.currency = currency;
    }

    public String getCurrency(){
        return currency;
    }

    public void setBets(List<BetsItem> bets){
        this.bets = bets;
    }

    public List<BetsItem> getBets(){
        return bets;
    }
}
