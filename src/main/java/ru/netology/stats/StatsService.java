package ru.netology.stats;


public class StatsService {

    public int summ(int[] salesPerMonth) {
        int sum = 0;
        for (int i : salesPerMonth) {
            sum += i;
        }
        return sum;
    }

    public double averageSalesPerMonth(int[] salesPerMonth) {
        int sum = 0;
        for (int i : salesPerMonth) {
            sum += i;
        }
        return (double) sum / salesPerMonth.length;
    }

    public int HowManyMonthWithPeak(int[] salesPerMonth) {
        int minMonth = 0;
        int peak = 0;
        for (int i = 0; i < salesPerMonth.length; i++) {
            if (salesPerMonth[i] > peak) {
                peak = salesPerMonth[i];
            }
        }
        for (int i = 0; i < salesPerMonth.length; i++) {
            if (salesPerMonth[i] == peak) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }


    public int HowManyMonthWithDno(int[] salesPerMonth) {
        int minMonth = 0;
        int dno = salesPerMonth[0];
        for (int i = 0; i < salesPerMonth.length; i++) {
            if (salesPerMonth[i] <= dno) {
                dno = salesPerMonth[i];
            }
        }
        for (int i = 0; i < salesPerMonth.length; i++) {
            if (salesPerMonth[i] == dno) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }


    public int MonthWithSalesBelowAverage(int[] salesPerMonth) {
        double avSale = averageSalesPerMonth(salesPerMonth);
        int dnoSales = 0;
        for (int i = 0; i < salesPerMonth.length; i++) {
            if (salesPerMonth[i] < avSale) {
                dnoSales += 1;
            }
        }
        return dnoSales;
    }

    public int MonthWithSalesAboveAverage(int[] salesPerMonth) {
        double avSale = averageSalesPerMonth(salesPerMonth);
        int godSales = 0;
        for (int i = 0; i < salesPerMonth.length; i++) {
            if (salesPerMonth[i] > avSale) {
                godSales += 1;
            }
        }
        return godSales;
    }
}
