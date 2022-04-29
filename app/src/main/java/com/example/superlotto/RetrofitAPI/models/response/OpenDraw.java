package com.example.superlotto.RetrofitAPI.models.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OpenDraw {
    @SerializedName("betName")
    private String mBetName;
    @SerializedName("breakEndTime")
    private Long mBreakEndTime;
    @SerializedName("drawTime")
    private Long mDrawTime;
    @SerializedName("id")
    private String mId;
    @SerializedName("status")
    private String mStatus;
    @SerializedName("wagerCloseTime")
    private Long mWagerCloseTime;
    @SerializedName("estimatedJackpot")
    @Expose
    private Long estimatedJackpot;
    @SerializedName("jackpots")
    @Expose
    private List<Jackpot> jackpots = null;

    public String getBetName() {
        return mBetName;
    }

    public void setBetName(String betName) {
        mBetName = betName;
    }

    public Long getBreakEndTime() {
        return mBreakEndTime;
    }

    public void setBreakEndTime(Long breakEndTime) {
        mBreakEndTime = breakEndTime;
    }

    public Long getDrawTime() {
        return mDrawTime;
    }

    public void setDrawTime(Long drawTime) {
        mDrawTime = drawTime;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

    public Long getWagerCloseTime() {
        return mWagerCloseTime;
    }

    public void setWagerCloseTime(Long wagerCloseTime) {
        mWagerCloseTime = wagerCloseTime;
    }

    public Long getEstimatedJackpot() {
        return estimatedJackpot;
    }

    public void setEstimatedJackpot(Long estimatedJackpot) {
        this.estimatedJackpot = estimatedJackpot;
    }

    public List<Jackpot> getJackpots() {
        return jackpots;
    }

    public void setJackpots(List<Jackpot> jackpots) {
        this.jackpots = jackpots;
    }
}
