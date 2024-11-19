package com.tw;

public class MultiplicationTableBuilder {
    public boolean isInRange(int number) {
        return number > 0 && number <= 1000;
    }

    public boolean isStarterNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }

    public boolean isValid(int start, int end) {
        return isInRange(start) && isInRange(start) && isStarterNotBiggerThanEnd(start,end);
    }
}
