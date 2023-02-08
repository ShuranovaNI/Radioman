package ru.netology.qi;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public void setCurrentRadioStation(int newNumberStation) {
        if (newNumberStation < 0) {
            return;
        }
        if (newNumberStation > 9) {
            return;
        }
        currentRadioStation = newNumberStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void nextStation() {
        if (currentRadioStation >= 9) {
            setCurrentRadioStation(0);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public void prevStation() {
        if (currentRadioStation <= 0) {
            setCurrentRadioStation(9);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }

    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}