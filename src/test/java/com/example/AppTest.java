// File: src/test/java/com/example/AppTest.java
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testAdd() {
        // Arrange
        App app = new App();
        int a = 10;
        int b = 20;
        int expectedSum = 30;

        // Act
        int actualSum = app.add(a, b);

        // Assert
        assertEquals(expectedSum, actualSum, "10 + 20 should be 30");
    }
}
