package net.r4mble.schizophrenia.common;

public class Schizo {
    public int progress = 0;

    public void addProgress(int n) {
        progress += n;
    }

    public void removeProgress(int n) {
        progress -= n;
    }

    public void setProgress(int n) {
        progress = n;
    }
}
