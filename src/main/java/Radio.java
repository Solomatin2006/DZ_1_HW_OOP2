public class Radio {
    private int currentRadioStationNumber;
    private int soundVolume;

    public void nextSoundVolume() {
        if (soundVolume < 100) {
            soundVolume++;
        } else {
            soundVolume = 100;
        }
    }

    public void prevSoundVolume() {
        if (soundVolume >= 1) {
            soundVolume--;
        } else {
            soundVolume = 0;
        }
    }

    public void nextStation() {
        if (currentRadioStationNumber != 9) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void prevStation() {
        if (currentRadioStationNumber != 0) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        } else {
            currentRadioStationNumber = 9;
        }
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        if (currentRadioStationNumber < 0) {
            return;
        }
        if (currentRadioStationNumber > 9) {
            return;
        }
        this.currentRadioStationNumber = currentRadioStationNumber;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume < 0) {
            return;
        }
        if (soundVolume > 100) {
            return;
        }
        this.soundVolume = soundVolume;
    }
}
