package com.finance.portfolio;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class MonteCarloSimulator {
    private Random r = new Random();

    public double getRandom(double mean, double stdDev) {
        double nextGauss = r.nextGaussian();
        double rand = nextGauss * stdDev + mean;
        return rand;
    }


    public PortfolioStatistics runSimulation(int simulationCount, int yearCount, double mean,
                              double stdDev, double initialInvestment, double inflation) {
        double[] investmentSimulationArray = new double[simulationCount];
        for (int i = 0; i < simulationCount; i++) {
            double investment = initialInvestment;
            for (int j = 0; j < yearCount; j++) {
                investment = investment * (1 + getRandom(mean, stdDev)) * (1 - inflation);
            }
            investmentSimulationArray[i] = investment;
        }
        DescriptiveStatistics ds = new DescriptiveStatistics(investmentSimulationArray);
        double bestCase = ds.getPercentile(90);
        double worstCase = ds.getPercentile(10);
        double median = ds.getPercentile(50);

        return new PortfolioStatistics(bestCase, worstCase, median);
    }

}
