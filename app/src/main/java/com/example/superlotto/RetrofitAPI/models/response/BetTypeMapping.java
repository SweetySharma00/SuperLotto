package com.example.superlotto.RetrofitAPI.models.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BetTypeMapping {
    @SerializedName("COMBO4")
    @Expose
    private String combo4;
    @SerializedName("COMBO5")
    @Expose
    private String combo5;
    @SerializedName("REGULAR")
    @Expose
    private String regular;
    @SerializedName("COMBO7")
    @Expose
    private String combo7;
    @SerializedName("COMBO8")
    @Expose
    private String combo8;
    @SerializedName("COMBO9")
    @Expose
    private String combo9;
    @SerializedName("COMBO10")
    @Expose
    private String combo10;

    public String getCombo4() {
        return combo4;
    }

    public void setCombo4(String combo4) {
        this.combo4 = combo4;
    }

    public String getCombo5() {
        return combo5;
    }

    public void setCombo5(String combo5) {
        this.combo5 = combo5;
    }

    public String getRegular() {
        return regular;
    }

    public void setRegular(String regular) {
        this.regular = regular;
    }

    public String getCombo7() {
        return combo7;
    }

    public void setCombo7(String combo7) {
        this.combo7 = combo7;
    }

    public String getCombo8() {
        return combo8;
    }

    public void setCombo8(String combo8) {
        this.combo8 = combo8;
    }

    public String getCombo9() {
        return combo9;
    }

    public void setCombo9(String combo9) {
        this.combo9 = combo9;
    }

    public String getCombo10() {
        return combo10;
    }

    public void setCombo10(String combo10) {
        this.combo10 = combo10;
    }
}
