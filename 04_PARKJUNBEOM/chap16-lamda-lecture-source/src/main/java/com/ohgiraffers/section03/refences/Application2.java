package com.ohgiraffers.section03.refences;

import java.util.function.Function;

public class Application2 {

    public static void main(String[] args) {

        Account account = new Account("홍길동");
        System.out.println(account);

        Function<String, Account> function = Account::new; // Account라는 객체 생성
        Account account1 = function.apply("홍길동");
        System.out.println(account1);
    }
}
