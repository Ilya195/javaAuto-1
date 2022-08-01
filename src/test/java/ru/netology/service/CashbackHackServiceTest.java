package ru.netology.service;

import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class CashbackHackServiceTest {

    public void shouldRemain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 350;
        int expected = 650;
        int actual = service.remain(amount);


        //void assertEquals(int actual, int expected);
    }
}
