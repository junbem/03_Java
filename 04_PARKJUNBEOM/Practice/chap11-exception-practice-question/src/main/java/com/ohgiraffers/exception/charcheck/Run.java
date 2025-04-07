package com.ohgiraffers.exception.charcheck;

public class Run {
    public static void main(String[] args) {
        CharacterProcess cp = new CharacterProcess();

        try {
            cp.countAlpha("Hello World");
        } catch (CharCheckException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }
    }
}
