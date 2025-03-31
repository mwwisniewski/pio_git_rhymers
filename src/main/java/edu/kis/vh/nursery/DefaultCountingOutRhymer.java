package edu.kis.vh.nursery;

/**
 * The type Default counting out rhymer.
 */
public class DefaultCountingOutRhymer {
    /**
     * The constant representing an empty stack.
     */
    final static int EMPTY = -1;

    /**
     * Maximum number of elements that can be stored in the stack
     */
    final static int TABLE_MAX = 12;

    /**
     * Default value returned when trying to access an empty stack
     */
    final static int DEFAULT_VALUE = -1;

    /**
     * Internal array storing the elements of the stack
     */
    private int[] numbers = new int[TABLE_MAX];

    /**
     * Index of the last inserted element. Starts at -1, which means the stack is empty
     */
    private int total = EMPTY;

    /**
     * Pushes a value onto the stack if it is not full
     *
     * @param in the value to be pushed
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     *  Checks whether the stack is empty
     *
     * @return the boolean
     */
    public boolean callCheck() {
        return total == EMPTY;
    }

    /**
     * Is full boolean.
     *
     * @return the boolean
     */
    public boolean isFull() {
        return total == TABLE_MAX - 1;
    }

    /**
     *  Returns the value at the top of the stack without removing it
     *
     * @return the top value
     */
    public int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    /**
     * Count out int.
     *
     * @return the int
     */
    protected int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

    /**
     * Returns the index of the last inserted element in the stack
     *
     * @return the index of the top element
     */
    public int getTotal() {
        return total;
    }
}
