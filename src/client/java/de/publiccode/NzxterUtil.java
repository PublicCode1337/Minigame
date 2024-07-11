package de.publiccode;

public class NzxterUtil {
    private long lastMS;

    public NzxterUtil() {
        reset();
    }

    public int convertToMS(int d) {
        return 1000 / d;
    }

    public long getDelay() {
        return System.currentTimeMillis() - this.lastMS;
    }

    public boolean hasTimeReached(long delay) {
        return getDelay() >= delay;
    }

    public void reset() {
        setLastMS(System.currentTimeMillis());
    }

    public void setLastMS(long lastMS) {
        this.lastMS = lastMS;
    }
}
