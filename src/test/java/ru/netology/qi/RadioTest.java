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
        Radio service = new Radio();
        service.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void WhenSetStationMoreThanMax() {
        Radio service = new Radio();
        service.setCurrentRadioStation(10);

        int expected = 0;
        int actual = service.getCurrentRadioStation();

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

    @Test
    void WhenNextStationGreaterThanMaximum() {
        Radio service = new Radio();
        service.setCurrentRadioStation(9);
        service.nextStation();

        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldSetNextStation() {
        Radio service = new Radio();
        service.setCurrentRadioStation(3);
        service.nextStation();

        int expected = 4;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldSetPrevStation() {
        Radio service = new Radio();
        service.setCurrentRadioStation(5);
        service.prevStation();

        int expected = 4;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void WhenPrevStationLessThanMinimum() {
        Radio service = new Radio();
        service.setCurrentRadioStation(0);
        service.prevStation();

        int expected = 9;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldSetCurrentRadioStation() {
        Radio service = new Radio();
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
    void increaseVolumeAboveMaximum() {
        Radio service = new Radio();
        service.setCurrentVolume(11);
        service.increaseVolume();

        int expected = 1;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void increaseVolumeTest() {
        Radio service = new Radio();
        service.setCurrentVolume(9);
        service.increaseVolume();


        int expected = 10;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldOverMaxVolume() {
        Radio service = new Radio();
        service.setCurrentVolume(10);
        service.increaseVolume();


        int expected = 10;
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
    void decreaseVolumeMaxMin() {
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

}
