package ru.netology.qi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void shouldSetRadioStation() {
        Radio service = new Radio();
        service.setCurrentRadioStation(6);

        int expected = 6;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void WhenSetStationLessThanMinimum() {
        Radio service = new Radio(10);

        service.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void WhenSetStationMoreThanMax() {
        Radio service = new Radio(10);
        service.setCurrentRadioStation(10);

        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void WhenNextStationGreaterThanMaximum() {
        Radio service = new Radio(10);
        service.setCurrentRadioStation(9);
        service.nextStation();

        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldSetNextStation() {
        Radio service = new Radio(10);
        service.setCurrentRadioStation(3);
        service.nextStation();

        int expected = 4;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldSetPrevStation() {
        Radio service = new Radio(10);
        service.setCurrentRadioStation(5);
        service.prevStation();

        int expected = 4;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void WhenPrevStationLessThanMinimum() {
        Radio service = new Radio(10);
        service.setCurrentRadioStation(0);
        service.prevStation();

        int expected = 9;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldSetCurrentRadioStation() {
        Radio service = new Radio(10);
        service.setCurrentRadioStation(9);

        int expected = 9;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldChangeVolume() {
        Radio service = new Radio();
        service.setCurrentVolume(7);

        int expected = 7;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void WhenVolumeMaximum() {
        Radio service = new Radio();
        service.setCurrentVolume(100);
        service.increaseVolume();

        int expected = 100;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void increaseVolumeTest() {
        Radio service = new Radio();
        service.setCurrentVolume(99);
        service.increaseVolume();


        int expected = 100;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void whenOverMaxVolume() {
        Radio service = new Radio();
        service.setCurrentVolume(101);
        service.increaseVolume();


        int expected = 1;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void decreaseVolumeTest() {
        Radio service = new Radio();
        service.setCurrentVolume(9);
        service.decreaseVolume();


        int expected = 8;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void WhenVolumeMinimum() {
        Radio service = new Radio();
        service.setCurrentVolume(0);
        service.decreaseVolume();


        int expected = 0;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void WhenVolumeBelowMinimum() {
        Radio service = new Radio();
        service.setCurrentVolume(-3);
        service.decreaseVolume();

        int expected = 0;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldSetRadioVolume() {
        Radio service = new Radio();
        service.setCurrentVolume(10);

        int expected = 10;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

}
