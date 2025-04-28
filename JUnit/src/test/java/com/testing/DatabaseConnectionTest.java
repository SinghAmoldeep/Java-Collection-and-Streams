package com.testing;

import com.testing.database_connection.DatabaseConnection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConnectionTest {
    private DatabaseConnection databaseConnection;

    @BeforeEach
    void setUp() {
        databaseConnection = new DatabaseConnection();
        databaseConnection.connect();
    }

    @Test
    void testConnection() {
        assertTrue(databaseConnection.isConnected());
    }

    @Test
    @Timeout(2)  // means the test should be done with in 2 seconds , if not JUnit will fail the testcase
    void testConnectionWithDelay() {
        assertTrue(databaseConnection.isConnectedDelayed());
    }

    @AfterEach
    @Test
    void tearDown() {
        databaseConnection.disconnect();
        assertFalse(databaseConnection.isConnected());
    }
}
