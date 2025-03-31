package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

//Projekt jest poprawny, przeszedł pomyślnie 5 na 5 testów
class RhymersDemo {
    final static int MAX_COUNT = 15;
    final static int MAX_COUNT2 = 3;
    final static int BOUND = 20;
    final static int ONE = 1;
    final static int ZERO = 0;


    public static void main(String[] args) {
        RhymersFactory factory = new DefaultRhymersFactory();
        testRhymers(factory);
    }

    static void testRhymers(RhymersFactory factory) {
        DefaultCountingOutRhymer[] rhymers = {factory.getStandardRhymer(), factory.getFalseRhymer(),
                factory.getFIFORhymer(), factory.getHanoiRhymer()};

        for (int i = ONE; i < MAX_COUNT; i++)
            for (int j = ZERO; j < MAX_COUNT2; j++)
                rhymers[j].countIn(i);

        java.util.Random rn = new java.util.Random();
        for (int i = ONE; i < MAX_COUNT; i++)
            rhymers[MAX_COUNT2].countIn(rn.nextInt(BOUND));

        for (int i = ZERO; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[MAX_COUNT2]).reportRejected());
    }
}