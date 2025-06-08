package net.r4mble.schizophrenia.common;

public class Schizo {
    private float tickValue;
    private float progress;

    public Schizo() {
        this.tickValue = 0;
        this.progress = 0;
    }

    public void addProgress(float n) {
        progress += n;
        validateData();
    }

    public void removeProgress(float n) {
        progress -= n;
        validateData();
    }

    public float getProgress() {
        return progress;
    }

    public void setProgress(float n) {
        progress = n;
    }

    public void addTickValue(float n) {
        tickValue += n;
        validateData();
    }

    public void removeTickValue(float n) {
        tickValue -= n;
        validateData();
    }

    public float getTickValue() {
        return tickValue;
    }

    public void setTickValue(float n) {
        tickValue = n;
    }


    private void validateData() {
        if (progress > 100) {
            progress = 100;
        } else if (progress < -100) {
            progress = -100;
        }

        if (tickValue > 100) {
            tickValue = 100;
        } else if (tickValue < -100) {
            tickValue = -100;
        }
    }
}
