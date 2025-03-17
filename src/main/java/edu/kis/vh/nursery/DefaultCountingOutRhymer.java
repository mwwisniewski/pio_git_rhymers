package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    final static int ERROR =-1;
    final static int TABLE_MAX = 12;
    final static int ELEVEN = 11;
    final static int MINUS_ONE =-1;
    private int[] numbers = new int[TABLE_MAX];

    public int total = MINUS_ONE;

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

}
