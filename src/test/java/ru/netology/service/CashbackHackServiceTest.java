package ru.netology.service;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void BonusServiceNull() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(0);

        assertEquals(actual, expected);
    }

    @Test
    public void BonusServiceLimitValueMin() {
        CashbackHackService service = new CashbackHackService();
        int expected = 50;
        int actual = service.remain(950);

        assertEquals(actual, expected);
    }

    @Test
    public void BonusServiceLimitValueMax() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int actual = service.remain(1001);

        assertEquals(actual, expected);
    }

    @Test
    public void BonusServiceLimitValue() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }

    @Test
    public void BonusServiceBigValue() {
        CashbackHackService service = new CashbackHackService();
        int expected = 571;
        int actual = service.remain(1736879429);

        assertEquals(actual, expected);
    }

}