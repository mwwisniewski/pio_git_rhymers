package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    final static int EMPTY =-1;
    final static int TABLE_MAX = 12;
    final static int DEFAULT_VALUE =-1;
    private int[] numbers = new int[TABLE_MAX];

    private int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == TABLE_MAX-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
