package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int ERROR =-1;
    private static final int TABLE_MAX = 12;
    private static final int ELEVEN = 11;
    private static final int MINUS_ONE =-1;
    private int[] numbers = new int[TABLE_MAX];

    private int total = MINUS_ONE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == MINUS_ONE;
    }

    public boolean isFull() {
        return total == ELEVEN;
    }

    protected int peekaboo() {
        if (callCheck())
            return MINUS_ONE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return MINUS_ONE;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
