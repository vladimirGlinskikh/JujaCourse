package kz.zhelezyaka.juja.lms.recursion.lab19;

import laboratoryWork.lab19.ExchangeMoney;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ExchangeMoneyTest {
    @Test
    public void exchangeCoins(){
        assertEquals(4, ExchangeMoney.exchangeAmountOfCoinsBrutForce(5));
        assertEquals(11, ExchangeMoney.exchangeAmountOfCoinsBrutForce(10));
        assertEquals(199, ExchangeMoney.exchangeAmountOfCoinsBrutForce(39));
        assertEquals(46_995, ExchangeMoney.exchangeAmountOfCoinsBrutForce(190));
        assertEquals(2_176_790, ExchangeMoney.exchangeAmountOfCoinsBrutForce(459));
    }
}
