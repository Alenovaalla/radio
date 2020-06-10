package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Radio {

    private int maxNumberStation = 10;
    private int minNumberStation = 0;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentNumberStation;
    private int currentVolume;
    private boolean on = true;

    public Radio(int maxNumberStation, int minNumberStation) {
        this.maxNumberStation = maxNumberStation;
        this.minNumberStation = minNumberStation;
    }

    public Radio(int currentNumberStation, boolean on) {
        this.currentNumberStation = currentNumberStation;
        this.on = on;
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

}


