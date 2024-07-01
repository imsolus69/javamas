package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatServiceTest {

    @Test
    public void sumSalesTest() {
        StatService statService = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = statService.sumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void avgSalesTest() {
        StatService statService = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / sales.length;
        long actual = statService.avgSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSalesTest() {
        StatService statService = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = statService.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesTest() {
        StatService statService = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = statService.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countLessThanAvgTest() {
        StatService statService = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = statService.countLessThanAvg(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countMoreThanAvgTest() {
        StatService statService = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = statService.countMoreThanAvg(sales);
        Assertions.assertEquals(expected, actual);
    }
}

