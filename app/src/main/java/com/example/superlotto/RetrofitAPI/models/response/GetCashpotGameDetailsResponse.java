package com.example.superlotto.RetrofitAPI.models.response;

import com.google.gson.annotations.SerializedName;

public class GetCashpotGameDetailsResponse {
    @SerializedName("gameDetails")
    private GameDetails mGameDetails;
    @SerializedName("message")
    private Message mMessage;

    public GameDetails getGameDetails() {
        return mGameDetails;
    }

    public void setGameDetails(GameDetails gameDetails) {
        mGameDetails = gameDetails;
    }

    public Message getMessage() {
        return mMessage;
    }

    public void setMessage(Message message) {
        mMessage = message;
    }
}
