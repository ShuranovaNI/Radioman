package ru.netology.qi;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    private int countRadioStation;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
        this.maxRadioStation = 9;
    }

    public Radio(int countRadioStation) {
        this.maxRadioStation = countRadioStation - 1;
    }

    public void setCurrentRadioStation(int newNumberStation) {
        if (newNumberStation < minRadioStation) {
            return;
        }
        if (newNumberStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newNumberStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void nextStation() {
        if (currentRadioStation >= maxRadioStation) {
            setCurrentRadioStation(minRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public void prevStation() {
        if (currentRadioStation <= minRadioStation) {
            setCurrentRadioStation(maxRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }

    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}