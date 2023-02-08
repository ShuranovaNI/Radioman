package ru.netology.qi;

public class Radio {
    int currentRadioStation;
    int currentVolume;

    void setCurrentRadioStation(int newNumberStation) {
        if (newNumberStation < 0) {
            return;
        }
        if (newNumberStation > 9) {
            return;
        }
        currentRadioStation = newNumberStation;
    }

    int getCurrentRadioStation() {
        return currentRadioStation;
    }

    void nextStation() {
        if (currentRadioStation >= 9) {
            setCurrentRadioStation(0);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    void prevStation() {
        if (currentRadioStation <= 0) {
            setCurrentRadioStation(9);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }

    }


    int getCurrentVolume() {
        return currentVolume;
    }

    void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}