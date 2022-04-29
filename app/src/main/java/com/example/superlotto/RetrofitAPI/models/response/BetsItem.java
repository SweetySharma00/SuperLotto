package com.example.superlotto.RetrofitAPI.models.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BetsItem {
    @SerializedName("betDate")
    private String betDate;

    @SerializedName("amount")
    private String amount;

    @SerializedName("game")
    private String game;

    @SerializedName("serialNumber")
    private String serialNumber;

    @SerializedName("orderId")
    private String orderId;

    @SerializedName("transactionStatus")
    private String transactionStatus;

    @SerializedName("drawId")
    private String drawId;

    @SerializedName("betType")
    private String betType;

    @SerializedName("transactionId")
    private String transactionId;

    @SerializedName("totalAmount")
    private String totalAmount;

    @SerializedName("selections")
    private List<String> selections;

    @SerializedName("rejectReason")
    private Object rejectReason;

    @SerializedName("betTax")
    private Object betTax;

    @SerializedName("id")
    private int id;

    @SerializedName("betName")
    private String betName;

    @SerializedName("status")
    private String status;

    public void setBetDate(String betDate){
        this.betDate = betDate;
    }

    public String getBetDate(){
        return betDate;
    }

    public void setAmount(String amount){
        this.amount = amount;
    }

    public String getAmount(){
        return amount;
    }

    public void setGame(String game){
        this.game = game;
    }

    public String getGame(){
        return game;
    }

    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber(){
        return serialNumber;
    }

    public void setOrderId(String orderId){
        this.orderId = orderId;
    }

    public String getOrderId(){
        return orderId;
    }

    public void setTransactionStatus(String transactionStatus){
        this.transactionStatus = transactionStatus;
    }

    public String getTransactionStatus(){
        return transactionStatus;
    }

    public void setDrawId(String drawId){
        this.drawId = drawId;
    }

    public String getDrawId(){
        return drawId;
    }

    public void setBetType(String betType){
        this.betType = betType;
    }

    public String getBetType(){
        return betType;
    }

    public void setTransactionId(String transactionId){
        this.transactionId = transactionId;
    }

    public String getTransactionId(){
        return transactionId;
    }

    public void setTotalAmount(String totalAmount){
        this.totalAmount = totalAmount;
    }

    public String getTotalAmount(){
        return totalAmount;
    }

    public void setSelections(List<String> selections){
        this.selections = selections;
    }

    public List<String> getSelections(){
        return selections;
    }

    public void setRejectReason(Object rejectReason){
        this.rejectReason = rejectReason;
    }

    public Object getRejectReason(){
        return rejectReason;
    }

    public void setBetTax(Object betTax){
        this.betTax = betTax;
    }

    public Object getBetTax(){
        return betTax;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setBetName(String betName){
        this.betName = betName;
    }

    public String getBetName(){
        return betName;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }
}
