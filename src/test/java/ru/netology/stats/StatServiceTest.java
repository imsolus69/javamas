package ru.netology.stats;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatServiceTest {

    @Test
    public void sumSalesTest() {
        StatService statService = new StatService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = statService.sumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void avgSalesTest() {
        StatService statService = new StatService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / sales.length;
        long actual = statService.avgSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSalesTest() {
        StatService statService = new StatService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int minMonth = 0;
        long minSales = sales[0];
        for (int index = 0; index < sales.length; index++) {
            if(sales[index] < minSales) {
                minMonth = index + 1;
                minSales = sales[index];
            }
        }
        long actual = statService.minSales(sales);
        Assertions.assertEquals(minMonth, actual);
    }

    @Test
    public void maxSalesTest() {
        StatService statService = new StatService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int maxMonth = 0;
        long maxSales = sales[0];
        for (int index = 0; index < sales.length; index++) {
            if(sales[index] >= maxSales) {
                maxMonth = index + 1;
                maxSales = sales[index];
            }
        }
        long actual = statService.maxSales(sales);
        Assertions.assertEquals(maxMonth, actual);
    }

    @Test
    public void countLessThanAvgTest() {
        StatService statService = new StatService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long avg = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / sales.length;
        long expected = 0;
        for (long sale : sales) {
            if(sale < avg) {
                expected++;
            }
        }
        long actual = statService.countLessThanAvg(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countMoreThanAvgTest() {
        StatService statService = new StatService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long avg = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / sales.length;
        long expected = 0;
        for (long sale : sales) {
            if(sale > avg) {
                expected++;
            }
        }
        long actual = statService.countLessThanAvg(sales);
        Assertions.assertEquals(expected, actual);
    }
}
