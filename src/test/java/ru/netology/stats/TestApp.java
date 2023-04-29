package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestApp {
    int[] testArray = {
            8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
    };
    StatsService serv = new StatsService();

    @Test
    public void SummTest() {
        int expected = 180;
        Assertions.assertEquals(expected, serv.summ(testArray));
    }

    @Test
    public void averageSalesPerMonthTest() {
        double expected = 15.0;
        Assertions.assertEquals(expected, serv.averageSalesPerMonth(testArray));
    }

    @Test
    public void numMonthWithPeakTest() {
        int expected = 8;
        Assertions.assertEquals(expected, serv.HowManyMonthWithPeak(testArray));
    }

    @Test
    public void numMonthWithDno() {
        int expected = 9;
        Assertions.assertEquals(expected, serv.HowManyMonthWithDno(testArray));
    }

    @Test
    public void salesUnderAverageTest() {
        int expected = 5;
        Assertions.assertEquals(expected, serv.MonthWithSalesBelowAverage(testArray));
    }

    @Test
    public void salesBelowAverageTest() {
        int expected = 5;
        Assertions.assertEquals(expected, serv.MonthWithSalesAboveAverage(testArray));
    }
}
