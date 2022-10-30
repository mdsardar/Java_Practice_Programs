package practice.streamsFromJava8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Reading {

    int yr;
    int mon;
    int day;
    double value;

    public Reading(int yr, int mon, int day, double value) {
        this.yr = yr;
        this.mon = mon;
        this.day = day;
        this.value = value;
    }


    public static void main(String[] args) {

        List<Reading> readings = Arrays.asList(
                new Reading(2017, 1, 1, 405.91),
                new Reading(2017, 1, 8, 405.98),
                new Reading(2017, 1, 15, 406.14),
                new Reading(2017, 1, 22, 406.48),
                new Reading(2017, 1, 29, 406.20),
                new Reading(2017, 2, 5, 407.20),
                new Reading(2017, 2, 12, 407.12));

        OptionalDouble avgReading = readings.stream().mapToDouble(r -> r.value).filter(v -> v >= 406.0 && v < 407.90)
                .average();

        System.out.println("Average of 406 readings: " + avgReading);

    }
}
