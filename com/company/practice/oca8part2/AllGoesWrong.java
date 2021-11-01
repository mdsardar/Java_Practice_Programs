package com.company.practice.oca8part2;

import java.io.IOException;
import java.sql.SQLException;

public class AllGoesWrong {
    public static void main(String[] args) {
        AllGoesWrong a = new AllGoesWrong();
        try {
            a.blowUp();
            System.out.println("a");
        } catch (IOException | SQLException e) {
            System.out.println("c");
        } finally {
            System.out.println("d");
        }
    }

    void blowUp() throws IOException, SQLException {
        throw new SQLException();
    }
}
