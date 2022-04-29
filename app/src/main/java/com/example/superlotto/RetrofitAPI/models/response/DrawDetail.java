package com.example.superlotto.RetrofitAPI.models.response;

import com.google.gson.annotations.SerializedName;

public class DrawDetail {
    @SerializedName("gameName")
    private String mGameName;
    @SerializedName("gameTime")
    private String mGameTime;
    @SerializedName("showTime")
    private String mShowTime;
    @SerializedName("slotTime")
    private String mSlotTime;

    public String getGameName() {
        return mGameName;
    }

    public void setGameName(String gameName) {
        mGameName = gameName;
    }

    public String getGameTime() {
        return mGameTime;
    }

    public void setGameTime(String gameTime) {
        mGameTime = gameTime;
    }

    public String getShowTime() {
        return mShowTime;
    }

    public void setShowTime(String showTime) {
        mShowTime = showTime;
    }

    public String getSlotTime() {
        return mSlotTime;
    }

    public void setSlotTime(String slotTime) {
        mSlotTime = slotTime;
    }
}
