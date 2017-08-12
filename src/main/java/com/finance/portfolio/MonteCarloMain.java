package com.finance.portfolio;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import java.text.NumberFormat;
import java.util.Locale;

public class MonteCarloMain {


    public static void main(String arga[]) {
        MonteCarloSimulator monteCarlo = new MonteCarloSimulator();

        PortfolioStatistics portfolioStatistics = monteCarlo.runSimulation(10000, 20,
                0.06189,0.063438, 100000, 0.035);

        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        System.out.println("Best Case = " + currencyFormatter.format(portfolioStatistics.getBestCase()));
        System.out.println("Worst Case = " + currencyFormatter.format(portfolioStatistics.getWorstCase()));
        System.out.println("Median = " + currencyFormatter.format(portfolioStatistics.getMedian()));
    }
}