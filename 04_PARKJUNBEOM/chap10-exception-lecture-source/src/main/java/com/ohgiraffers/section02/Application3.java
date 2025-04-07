package com.ohgiraffers.section02;

import com.ohgiraffers.section02.userexception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.PriceNegativeException;

public class Application3 {

    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();


        try {
            et.checkEnoughMoney(20000, -10000);
        } catch (PriceNegativeException e) {
            System.out.println(e.getClass() + "발생");
            System.out.println((e.getMessage()));
        } catch (MoneyNegativeException e) {
            e.printStackTrace();
        } catch (NotEnoughMoneyException e) {
            e.printStackTrace();
        } finally {
            
        }
    }
}
