package com.example.superlotto.RetrofitAPI.models.request;

import com.google.gson.annotations.SerializedName;

public class Pick4BetRequest {
    @SerializedName("bettingDetails")
    private BettingDetails bettingDetails;

    public void setBettingDetails(BettingDetails bettingDetails){
        this.bettingDetails = bettingDetails;
    }

    public BettingDetails getBettingDetails(){
        return bettingDetails;
    }
}
