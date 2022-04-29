package com.example.superlotto.RetrofitAPI.models.request;

import com.example.superlotto.RetrofitAPI.models.response.BetsItem;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BettingDetails {
    @SerializedName("gameId")
    private int gameId;

    @SerializedName("totalAmount")
    private int totalAmount;

    @SerializedName("totalItem")
    private int totalItem;

    @SerializedName("drawCount")
    private int drawCount;

    @SerializedName("bets")
    private List<BetsItem> bets;

    public void setGameId(int gameId){
        this.gameId = gameId;
    }

    public int getGameId(){
        return gameId;
    }

    public void setTotalAmount(int totalAmount){
        this.totalAmount = totalAmount;
    }

    public int getTotalAmount(){
        return totalAmount;
    }

    public void setTotalItem(int totalItem){
        this.totalItem = totalItem;
    }

    public int getTotalItem(){
        return totalItem;
    }

    public void setDrawCount(int drawCount){
        this.drawCount = drawCount;
    }

    public int getDrawCount(){
        return drawCount;
    }

    public void setBets(List<BetsItem> bets){
        this.bets = bets;
    }

    public List<BetsItem> getBets(){
        return bets;
    }
}
