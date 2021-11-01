package com.company.practice.oca8part2;

import java.io.IOException;
import java.sql.SQLException;

public class BadIO {
    public static void main(String[] args) {
        BadIO badIO = new BadIO();
        try {
            badIO.fileBlowUp();
            badIO.databaseBlowUp();
            System.out.println("a");
        } catch (SQLException | IOException e) {
            System.out.println("b");
        } catch (Exception e) {
            System.out.println("c");
        }
    }

    void databaseBlowUp() throws SQLException {
        throw new SQLException();
    }

    void fileBlowUp() throws IOException {
        throw new IOException();
    }
}
