package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {


    @Test
    public void shouldRemain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 700;
        int expected = 300;
        int actual = service.remain(amount);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void shouldNegativeTest() {
        CashbackHackService service = new CashbackHackService();

        int amount = 2200;
        int expected = 2200;
        int actual = service.remain(amount);

        Assert.assertEquals(expected,actual);
    }
}
