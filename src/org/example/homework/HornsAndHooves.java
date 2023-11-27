package org.example.homework;

public class HornsAndHooves {

    private final int sausagePrice = 800;

    private final int hamPrice = 350;

    private final int porkPrice = 500;

    public int getSausageCostPrice(int sausageWeight) {
        if (sausageWeight > 0 && sausageWeight < 1000) {
            return 412;
        } else if (sausageWeight >= 1000 && sausageWeight < 2000) {
            return 408;
        } else {
            return 404;
        }
    }

    public int getHamCostPrice() {
        return 275;
    }

    public int getPorkCostPrice(int porkWeight) {
        if (porkWeight > 0 && porkWeight < 500) {
            return 311;
        } else {
            return 299;
        }
    }

    public int income(int sausageWeight, int hamWeight, int porkWeight) {
        return sausagePrice * sausageWeight + hamPrice * hamWeight + porkPrice * porkWeight;
    }

    public int expenditure(int sausageWeight, int hamWeight, int porkWeight) {
        return getSausageCostPrice(sausageWeight) * sausageWeight + getHamCostPrice() * hamWeight
                + getPorkCostPrice(porkWeight) * porkWeight + 1_000_000;
    }

    public double profitAfterTaxes(int sausageWeight, int hamWeight, int porkWeight) {
        int income = income(sausageWeight, hamWeight, porkWeight);
        int expenditure = expenditure(sausageWeight, hamWeight, porkWeight);
        int profit = income - expenditure;

        double tax = 0;
        if (profit > 2_000_000) {
            tax = 80_000 + 100_000 + (profit - 2_000_000) * 0.13;
        } else if (profit > 1_000_001 && profit <= 2_000_000) {
            tax = 80_000 + (profit - 1_000_000) * 0.10;
        } else {
            tax = profit * 0.08;
        }

        return profit - tax;
    }
}
