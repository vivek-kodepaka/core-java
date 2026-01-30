package kode.core.java.exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws Exception {

        try {
            dbEXP();
            ioExp();

        } catch (Exception e) {
            throw e;
        }

    }

    static void ioExp() throws IOException {
        throw new IOException();
    }

    static void dbEXP() throws SQLException {
        throw new SQLException();
    }
}
