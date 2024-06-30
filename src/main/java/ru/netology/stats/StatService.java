package ru.netology.stats;

public class StatService {

    public long sumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
        sum += sale;
        }
        return sum;
    }

    public long avgSales(long[] sales) {
        long sum = sumSales(sales);
        return sum / sales.length;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for(int i = 0; i < sales.length; i++) {
            if(sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int minMonth = 0;

        for(int i = 0; i < sales.length; i++) {
            if(sales[i] >= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int countLessThanAvg(long[] sales) {
        long avg = avgSales(sales);
        int months = 0;
        for (long sale : sales) {
            if(sale < avg) {
                months++;
            }
        }
        return months;
    }

    public int countMoreThanAvg(long[] sales) {
        long avg = avgSales(sales);
        int months = 0;
        for (long sale : sales) {
            if(sale > avg) {
                months++;
            }
        }
        return months;
    }

}
