import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void validStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(5);
        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryAcceptableStation0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryAcceptableStation1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(1);
        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryAcceptableStation8() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(8);
        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryAcceptableStation9() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(9);
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderInvalidStation_1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderInvalidStation10() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderInvalidStation23() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(23);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void permissibleVolume25() {
        Radio radio = new Radio();

        radio.setSoundVolume(25);
        int expected = 25;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitAcceptableVolume0() {
        Radio radio = new Radio();

        radio.setSoundVolume(0);
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitAcceptableVolume1() {
        Radio radio = new Radio();

        radio.setSoundVolume(1);
        int expected = 1;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitAcceptableVolume99() {
        Radio radio = new Radio();

        radio.setSoundVolume(99);
        int expected = 99;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitAcceptableVolume100() {
        Radio radio = new Radio();

        radio.setSoundVolume(100);
        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void BoundaryInvalidVolume_1() {
        Radio radio = new Radio();

        radio.setSoundVolume(-1);
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void BoundaryInvalidVolume101() {
        Radio radio = new Radio();

        radio.setSoundVolume(101);
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void BoundaryInvalidVolume130() {
        Radio radio = new Radio();

        radio.setSoundVolume(130);
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation6() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);

        radio.nextStation();

        int expected = 6;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(1);

        radio.nextStation();

        int expected = 2;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation8() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(8);

        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation6() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(6);

        radio.prevStation();

        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);

        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(1);

        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextSoundVolume51() {
        Radio radio = new Radio();
        radio.setSoundVolume(51);

        radio.nextSoundVolume();

        int expected = 52;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextSoundVolume1() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);

        radio.nextSoundVolume();

        int expected = 1;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextSoundVolume100() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);

        radio.nextSoundVolume();

        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextSoundVolume99() {
        Radio radio = new Radio();
        radio.setSoundVolume(99);

        radio.nextSoundVolume();

        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevSoundVolume40() {
        Radio radio = new Radio();
        radio.setSoundVolume(40);

        radio.prevSoundVolume();

        int expected = 39;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevSoundVolume99() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);

        radio.prevSoundVolume();

        int expected = 99;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevSoundVolume0() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);

        radio.prevSoundVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevSoundVolume1() {
        Radio radio = new Radio();
        radio.setSoundVolume(1);

        radio.prevSoundVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
}