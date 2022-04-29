package com.example.superlotto.RetrofitAPI.models.response;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {

    @SerializedName("token")
    String token;
    @SerializedName("message")
    Message message;
    @SerializedName("errorCode")
    String errorCode;
    @SerializedName("isOutDated")
    String isOutDated;
    @SerializedName("verifiedYN")
    String verifiedYN;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getIsOutDated() {
        return isOutDated;
    }

    public void setIsOutDated(String isOutDated) {
        this.isOutDated = isOutDated;
    }

    public String getVerifiedYN() {
        return verifiedYN;
    }

    public void setVerifiedYN(String verifiedYN) {
        this.verifiedYN = verifiedYN;
    }
}
