package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application1 {
    public static void main(String[] args) {
        FileInputStream fin = null;

        try {
            fin = new FileInputStream("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt");

            int value;
            System.out.println("파일의 길이 : " + new File("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt").length());

            int size = (int) new File("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt").length();
            byte[] bytes = new byte[size];

            fin.read(bytes);

            // 바이트 배열을 문자열로 변환하여 출력
            String content = new String(bytes);
            System.out.println("파일 내용: " + content);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fin != null) {
                try {
                    fin.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
