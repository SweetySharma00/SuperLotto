package com.example.superlotto.RetrofitAPI.models.response;

import com.google.gson.annotations.SerializedName;

public class DataItem {
    @SerializedName("amount")
    private int amount;

    @SerializedName("betId")
    private int betId;

    @SerializedName("gameCode")
    private String gameCode;

    public int getAmount(){
        return amount;
    }

    public int getBetId(){
        return betId;
    }

    public String getGameCode(){
        return gameCode;
    }
}
