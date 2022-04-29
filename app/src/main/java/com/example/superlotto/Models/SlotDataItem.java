package com.example.superlotto.Models;

public class SlotDataItem {
    private String slotName;
    private String slotTime;
    private int currentDate;

    public SlotDataItem(String slotName, String slotTime, int currentDate) {
        this.slotName = slotName;
        this.slotTime = slotTime;
        this.currentDate = currentDate;
    }

    public int getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(int currentDate) {
        this.currentDate = currentDate;
    }

    public String getSlotName() {
        return slotName;
    }

    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    public String getSlotTime() {
        return slotTime;
    }

    public void setSlotTime(String slotTime) {
        this.slotTime = slotTime;
    }
}
