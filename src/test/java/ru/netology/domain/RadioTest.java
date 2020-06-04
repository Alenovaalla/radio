package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldIncreaseCurrentNumberStation() {
        Radio radio = new Radio();
    radio.setMinNumberStation(0);
    radio.setMaxNumberStation(9);
    radio.setOn(true);
    radio.setCurrentNumberStation(1);
    radio.increaseCurrentNumberStation();
    int expected = 2;
    int actual = radio.getCurrentNumberStation();
    assertEquals(expected,actual);
    }

    @Test
    public void shouldIncreaseCurrentNumberStation1() {
        Radio radio = new Radio();
        radio.setMinNumberStation(0);
        radio.setMaxNumberStation(9);
        radio.setOn(true);
        radio.setCurrentNumberStation(9);
        radio.increaseCurrentNumberStation();
        int expected = 0;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected,actual);
    }

    @Test
    public void shouldDecreaseCurrentNumberStation() {
        Radio radio = new Radio();
        radio.setMinNumberStation(0);
        radio.setMaxNumberStation(9);
        radio.setOn(true);
        radio.setCurrentNumberStation(3);
        radio.decreaseCurrentNumberStation();
        int expected = 2;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected,actual);
    }

    @Test
    public void shouldDecreaseCurrentNumberStation1() {
        Radio radio = new Radio();
        radio.setMinNumberStation(0);
        radio.setMaxNumberStation(9);
        radio.setOn(true);
        radio.setCurrentNumberStation(0);
        radio.decreaseCurrentNumberStation();
        int expected = 9;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected,actual);
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(9);
        radio.setOn(true);
        radio.setCurrentVolume(1);
        radio.increaseCurrentVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();
        assertEquals(expected,actual);
    }

    @Test
    public void shouldIncreaseCurrentVolume1() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(9);
        radio.setOn(true);
        radio.setCurrentVolume(9);
        radio.increaseCurrentVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        assertEquals(expected,actual);
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(9);
        radio.setOn(true);
        radio.setCurrentVolume(5);
        radio.decreaseCurrentVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        assertEquals(expected,actual);
    }

    @Test
    public void shouldDecreaseCurrentVolume1() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(9);
        radio.setOn(true);
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected,actual);
    }

    @Test
    public void shouldMaxNumberStationReturn() {
        Radio radio = new Radio();
        radio.setMaxNumberStation(9);
        int expected = 9;
        int actual = radio.getMaxNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMinNumberStationReturn() {
        Radio radio = new Radio();
        radio.setMinNumberStation(0);
        int expected = 0;
        int actual = radio.getMinNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        int expected = 0;
        int actual = radio.getMinVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        int expected = 10;
        int actual = radio.getMaxVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnOn() {
        Radio radio = new Radio();
        radio.setOn(true);
        Boolean expected =true;
        boolean actual = radio.isOn();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeReturnMaxMin() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        radio.setMinVolume(0);
        radio.setCurrentVolume(-1);
        int expected1 =0 ;
        int actual1 = radio.getCurrentVolume();
        assertEquals(expected, actual);
        assertEquals(expected1,actual1);
    }

    @Test
    public void shouldCurrentNumberStationMaxMin() {
        Radio radio = new Radio();
        radio.setMaxNumberStation(9);
        radio.setCurrentNumberStation(10);
        int expected = 0;
        int actual = radio.getCurrentNumberStation();
        radio.setMinNumberStation(0);
        radio.setCurrentNumberStation(-1);
        int expected1 = 9;
        int actual1 = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
        assertEquals(expected1,actual1);
    }

    @Test
    public void shouldIncreaseCurrentVolume2() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(9);
        radio.setCurrentVolume(9);
        radio.increaseCurrentVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        assertEquals(expected,actual);
    }
}