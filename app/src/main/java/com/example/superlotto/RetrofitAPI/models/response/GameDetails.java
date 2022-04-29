package com.example.superlotto.RetrofitAPI.models.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GameDetails {
    @SerializedName("betAmount")
    private List<Long> mBetAmount;
    @SerializedName("drawDetails")
    private List<DrawDetail> mDrawDetails;
    @SerializedName("merchanCD")
    private String mMerchanCD;
    @SerializedName("nextDraw")
    private List<Long> mNextDraw;
    @SerializedName("betTypeMapping")
    @Expose
    private BetTypeMapping betTypeMapping;
    @SerializedName("backUpAmount")
    private List<Long> backUpAmount;


    public List<Long> getBetAmount() {
        return mBetAmount;
    }

    public void setBetAmount(List<Long> betAmount) {
        mBetAmount = betAmount;
    }

    public List<DrawDetail> getDrawDetails() {
        return mDrawDetails;
    }

    public void setDrawDetails(List<DrawDetail> drawDetails) {
        mDrawDetails = drawDetails;
    }

    public String getMerchanCD() {
        return mMerchanCD;
    }

    public void setMerchanCD(String merchanCD) {
        mMerchanCD = merchanCD;
    }

    public List<Long> getNextDraw() {
        return mNextDraw;
    }

    public void setNextDraw(List<Long> nextDraw) {
        mNextDraw = nextDraw;
    }

    public List<Long> getBackUpAmount() {
        return backUpAmount;
    }

    public void setBackUpAmount(List<Long> backUpAmount) {
        this.backUpAmount = backUpAmount;
    }
}
