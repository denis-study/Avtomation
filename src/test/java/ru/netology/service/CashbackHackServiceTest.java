package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expectedResult = 3000;
        int actualResult = cashbackHackService.remain( 1000);
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    void remain1() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expectedResult = 1000;
        int actualResult = cashbackHackService.remain( 1000);
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    void remain2() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expectedResult = 1000;
        int actualResult = cashbackHackService.remain( 1000);
        Assertions.assertTrue(expectedResult == actualResult);

    }

    @Test
    void remain3() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expectedResult = 13000;
        int actualResult = cashbackHackService.remain( 1000);
        Assertions.assertTrue(expectedResult == actualResult);

    }

}