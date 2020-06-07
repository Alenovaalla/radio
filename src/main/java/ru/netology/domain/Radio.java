package ru.netology.domain;

public class Radio {

    private int quantityStation = 10;
    private int maxNumberStation = quantityStation;
    private int minNumberStation = 0;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentNumberStation;
    private int currentVolume;
    private boolean on = true;

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    public Radio(int currentNumberStation, boolean on) {
        this.currentNumberStation = currentNumberStation;
        this.on = on;
    }

    public Radio() {
    }

    public Radio(int minVolume, int maxVolume, int currentVolume) {
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = currentVolume;
    }

    public void increaseCurrentNumberStation() {
        if (currentNumberStation >= maxNumberStation) {
            currentNumberStation = minNumberStation;
            return;
        }
        currentNumberStation++;
    }

    public void decreaseCurrentNumberStation() {
        if (currentNumberStation <= minNumberStation) {
            currentNumberStation = maxNumberStation;
       return;
        }
        currentNumberStation--;
    }

    public void increaseCurrentVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void decreaseCurrentVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume--;
    }


    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public void setMaxNumberStation(int maxNumberStation) {
        this.maxNumberStation = quantityStation;
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }

    public void setMinNumberStation(int minNumberStation) {
        this.minNumberStation = minNumberStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentNumberStation(int currentNumberStation) {
        if(currentNumberStation>maxNumberStation){
            currentNumberStation = minNumberStation;
        }
        if(currentNumberStation<minNumberStation){
            currentNumberStation = maxNumberStation;
        }
        this.currentNumberStation = currentNumberStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if(currentVolume>maxVolume){
            return;
        }
        if(currentVolume<minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getQuantityStation() {
        return quantityStation;
    }

    public void setQuantityStation(int quantityStation) {
        this.quantityStation = quantityStation;
    }

}


