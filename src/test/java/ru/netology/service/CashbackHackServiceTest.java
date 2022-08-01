package ru.netology.service;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 350;
        int expected = 650;
        int actual = service.remain(amount);

        assertEquals( actual,  expected);
    }

    @Test
    public void shouldHighRemain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 3000;
        int expected = 3000;
        int actual = service.remain(amount);

        assertEquals( actual,  expected);
    }
}
