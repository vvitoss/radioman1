package ru.netology.radio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @ParameterizedTest
    @CsvSource (value = {
        "adding a channel,2,2",
    })
    void getCurrentChanel(String testNaime, int setCurrentChanel, int expected) {
        Radio radio =new Radio();
        int actual = radio.getCurrentChanel(testNaime, setCurrentChanel, expected);

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentChanel() {
    }

    @Test
    void next() {
    }

    @Test
    void prev() {
    }

    @Test
    void getCurrentVolume() {
    }

    @Test
    void setCurrentVolume() {
    }

    @Test
    void up() {
    }

    @Test
    void down() {
    }
}