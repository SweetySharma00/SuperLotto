package com.example.superlotto.RetrofitAPI.models.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Pick4BetStartResponse {
    @SerializedName("totalAmount")
    private int totalAmount;

    @SerializedName("data")
    private List<DataItem> data;

    @SerializedName("orderId")
    private int orderId;

    @SerializedName("message")
    private Message message;

    public int getTotalAmount(){
        return totalAmount;
    }

    public List<DataItem> getData(){
        return data;
    }

    public int getOrderId(){
        return orderId;
    }

    public Message getMessage(){
        return message;
    }
}
