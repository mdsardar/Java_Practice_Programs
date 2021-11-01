package com.company.practice.oca8part2;

import java.io.IOException;
import java.sql.SQLException;

class A extends Exception { }
class B extends Exception { }

public class MultiCatchDemo {

    public static void main(String[] args) {

    }
    public void rain() throws A, B {}

    public void reThrow() throws SQLException, IOException {
        try {
            couldThrowAnException();
        } catch(IOException | SQLException e) {
            //e = new IOException();
            throw e;
        }
    }

    void couldThrowAnException() throws SQLException, IOException {

    }
}
