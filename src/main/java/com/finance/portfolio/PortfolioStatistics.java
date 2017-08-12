package com.finance.portfolio;

public class PortfolioStatistics {
    private double bestCase, worstCase, median;

    PortfolioStatistics(double bestCase, double worstCase, double median) {
        this.bestCase = bestCase;
        this.worstCase = worstCase;
        this.median = median;
    }

    public double getBestCase() {
        return bestCase;
    }

    public double getWorstCase() {
        return worstCase;
    }

    public double getMedian() {
        return median;
    }
}
