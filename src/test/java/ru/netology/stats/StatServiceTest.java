package ru.netology.stats;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatServiceTest {

    @Test
    public void test() {
        StatService statService = new StatService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = statService.sumSales(sales);
        Assertions.assertEquals(expected, actual);
    }
}
