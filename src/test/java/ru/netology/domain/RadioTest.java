package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldInstallQuantityStation (){
        Radio radio = new Radio(20);
        assertEquals(20,radio.getQuantityStation());
    }

    @Test
    public void shouldInstallCurrentNumberStation (){
        Radio radio = new Radio(5,true);
        assertEquals(5,radio.getCurrentNumberStation());
    }

    @Test
    public void shouldInstallCurrentVolume(){
        Radio radio = new Radio(0,100,50);
        assertEquals(50,radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentNumberStation() {
        Radio radio = new Radio();
    radio.setCurrentNumberStation(1);
    radio.increaseCurrentNumberStation();
    int expected = 2;
    int actual = radio.getCurrentNumberStation();
    assertEquals(expected,actual);
    }

    @Test
    public void shouldIncreaseCurrentNumberStation1() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(10);
        radio.increaseCurrentNumberStation();
        int expected = 0;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected,actual);
    }

    @Test
    public void shouldDecreaseCurrentNumberStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(3);
        radio.decreaseCurrentNumberStation();
        int expected = 2;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected,actual);
    }

    @Test
    public void shouldDecreaseCurrentNumberStation1() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(0);
        radio.decreaseCurrentNumberStation();
        int expected = 10;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected,actual);
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.increaseCurrentVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();
        assertEquals(expected,actual);
    }

    @Test
    public void shouldIncreaseCurrentVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseCurrentVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected,actual);
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseCurrentVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        assertEquals(expected,actual);
    }

    @Test
    public void shouldDecreaseCurrentVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected,actual);
    }

    @Test
    public void shouldMaxNumberStationReturn() {
        Radio radio = new Radio();
        int expected = 10;
        int actual = radio.getMaxNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMinNumberStationReturn() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getMinNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVolume() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getMinVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVolume() {
        Radio radio = new Radio();
        int expected = 100;
        int actual = radio.getMaxVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnOn() {
        Radio radio = new Radio();
        Boolean expected =true;
        boolean actual = radio.isOn();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeReturnMaxMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(110);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        radio.setCurrentVolume(-1);
        int expected1 =0 ;
        int actual1 = radio.getCurrentVolume();
        assertEquals(expected, actual);
        assertEquals(expected1,actual1);
    }

    @Test
    public void shouldCurrentNumberStationMaxMin() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(11);
        int expected = 0;
        int actual = radio.getCurrentNumberStation();
        radio.setCurrentNumberStation(-1);
        int expected1 = 10;
        int actual1 = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
        assertEquals(expected1,actual1);
    }

    @Test
    public void shouldIncreaseCurrentVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseCurrentVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected,actual);
    }
}