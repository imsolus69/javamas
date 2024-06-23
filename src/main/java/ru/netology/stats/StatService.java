package ru.netology.stats;

public class StatService {

    public long sumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }
}
