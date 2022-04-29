package com.example.superlotto.RetrofitAPI.models.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AvailableDrawResponse {
    @SerializedName("message")
    private Message mMessage;
    @SerializedName("openDraws")
    private List<OpenDraw> mOpenDraws;

    public Message getMessage() {
        return mMessage;
    }

    public void setMessage(Message message) {
        mMessage = message;
    }

    public List<OpenDraw> getOpenDraws() {
        return mOpenDraws;
    }

    public void setOpenDraws(List<OpenDraw> openDraws) {
        mOpenDraws = openDraws;
    }
}
