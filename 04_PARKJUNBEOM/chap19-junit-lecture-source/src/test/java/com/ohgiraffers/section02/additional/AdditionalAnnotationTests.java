package com.ohgiraffers.section02.additional;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

/* @Order 어노테이션의 기능이 활성화 되기 위해서는 클래스 레벨에 어노테이션 선언이 필요하다. */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AdditionalAnnotationTests {
    @Disabled
    @Test
    void testIgnore() {
        System.out.println("테스트 실행 확인");
    }
    @Disabled
    @Test
    @Timeout(value = 1000, unit= TimeUnit.MILLISECONDS)
    void testTimeout() {
        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("타임 아웃 테스트");
    }

    @Test
    @Order(1)
    void testFirst() {
        System.out.println("first");
    }

    @Test
    @Order(3)
    void testThird() {
        System.out.println("third");
    }

    @Test
    @Order(2)
    void testSecond() {
        System.out.println("second");
    }

    @RepeatedTest(5)
    void testRepeated() {
        System.out.println("repeated");
    }
}
