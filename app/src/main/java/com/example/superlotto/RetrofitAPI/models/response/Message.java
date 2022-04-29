package com.example.superlotto.RetrofitAPI.models.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Message {

    @SerializedName("successMessage")
    @Expose
    private String successMessage;

    @SerializedName("errorMessage")
    @Expose
    private String errorMessage;

    @SerializedName("updateAppURL")
    @Expose
    private String updateAppURL;

    public String getUpdateAppURL() {
        return updateAppURL;
    }

    public void setUpdateAppURL(String updateAppURL) {
        this.updateAppURL = updateAppURL;
    }

    public String getSuccessMessage() {
        return successMessage;
    }

    public void setSuccessMessage(String successMessage) {
        this.successMessage = successMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
