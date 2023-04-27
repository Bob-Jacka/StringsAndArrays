package ru.netology.stats;



import java.util.Arrays;


public class StatsService {

    public  int summ(int[] salesPerMonth) {
        return Arrays.stream(salesPerMonth).sum();
    }

    public  double averageSalesPerMonth(int[] salesPerMonth) {
        return Double.parseDouble(Arrays.stream(salesPerMonth).average().toString().substring(15).replace("]", ""));
    }

    public  int HowManyMonthWithPeak(int[] salesPerMonth) {
        int minMonth=0;
        int peak = Integer.parseInt(Arrays.stream(salesPerMonth).max().toString().substring(12).replace("]", ""));;
        for(int i= 0; i<salesPerMonth.length; i++) {
            if(salesPerMonth[i] == peak) {
                minMonth = i;
            }
        }
        return minMonth+1;
    }


    public  int HowManyMonthWithDno(int[] salesPerMonth) {
        int minMonth=0;
        int dno = Integer.parseInt(Arrays.stream(salesPerMonth).min().toString().substring(12).replace("]", ""));
        for(int i= 0; i<salesPerMonth.length; i++) {
            if(salesPerMonth[i] == dno) {
                minMonth = i;
            }
        }
        return minMonth+1;
    }


    public  int MonthWithSalesBelowAverage(int[] salesPerMonth) {
        double avSale = averageSalesPerMonth(salesPerMonth);
        int dnoSales = 0;
        for(int i=0; i<salesPerMonth.length; i++) {
            if(salesPerMonth[i] < avSale) {
                dnoSales += 1;
            }
        }
        return dnoSales;
    }

    public  int MonthWithSalesAboveAverage(int[] salesPerMonth) {
        double avSale = averageSalesPerMonth(salesPerMonth);
        int godSales = 0;
        for(int i=0; i<salesPerMonth.length; i++) {
            if(salesPerMonth[i] > avSale) {
                godSales += 1;
            }
        }
        return godSales;
    }
    public void makeHappy() {
        System.out.println("Happy");
    }
}
