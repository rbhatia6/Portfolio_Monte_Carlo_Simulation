package com.finance.portfolio;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class MonteCarloSimulatorTest {
    @Test
    public void getRandom() {
        MonteCarloSimulator monteCarlo = new MonteCarloSimulator();
        assertTrue(monteCarlo.getRandom(0,1) >= -1);
        assertTrue(monteCarlo.getRandom(0,1) <= 1);

        assertTrue(monteCarlo.getRandom(10,30) >= -20);
        assertTrue(monteCarlo.getRandom(0,1) <= 40);
    }
}