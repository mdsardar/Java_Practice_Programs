package com.company;

public class Train {
    public static void main(String[] args) throws RanOtOfTrack, AnotherTrainComing {
        Train a = new Train();
        try {
            a.drive();
            System.out.println("toot! toot!");
        } catch (RanOtOfTrack e) {
            System.out.println("Error locomoting");
            throw e;
        }
    }

    void drive() throws RanOtOfTrack, AnotherTrainComing {
        throw new RanOtOfTrack();
    }

    class RanOtOfTrack extends Exception {
    }

    class AnotherTrainComing extends Exception {
    }
}
