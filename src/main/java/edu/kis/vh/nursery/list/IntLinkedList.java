package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;
    private int i;
    private static final int DEFAULT_VALUE = -1;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            Node newNode = new Node(i);
            last.setNext(newNode);
            newNode.setPrev(last);
            last = newNode;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return DEFAULT_VALUE;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return DEFAULT_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
