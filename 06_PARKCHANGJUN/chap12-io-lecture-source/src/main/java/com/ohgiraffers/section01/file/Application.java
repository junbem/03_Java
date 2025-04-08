package com.ohgiraffers.section01.file;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.IOException;
// 입력, 출력은 대부분 io라는 패키지 안에 들어있다.

public class Application {
    public static void main(String[] args) {
        /*
         * JDK 1.0부터 지원하는 API로 파일 처리를 수행하는 대표적인 클래스
         */


        // 절대경로, 상대경로
        File file = new File("src/main/java/com/ohgiraffers/section01/file/test.txt");

        try {
            // 파일 생성 후 성공/실패 여부를 boolean 으로 리턴(생성되면 true)
            boolean createSuccess = file.createNewFile();

            // 최초 실행하면 새롭게 파일이 만들어지기 때문에 true를 반환한다.
            // 파일이 한 번 생성되고 난 이후는 새롭게 파일을 만들지 않기 때문에 false를 반환
            System.out.println("file : " + file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("파일의 크기 : " + file.length() + "byte");
        System.out.println("파일의 경로 : " + file.getPath());
        System.out.println("현재 파일의 상위경로 : " + file.getParent());
        System.out.println("파일의 절대경로 : " + file.getAbsolutePath());

        String path = "/Users/parkchangjun/Documents/Dev/Path";
        File filePath = new File(path);

        boolean mkdir = filePath.mkdirs();
        System.out.println("mkdir = " + mkdir);

        boolean deleteSuccess = filePath.delete();
        System.out.println("deleteSuccess = " + deleteSuccess);

        boolean deleteSuccess2 = new File("/Users/parkchangjun/Documents/Dev").delete();
        System.out.println("deleteSuccess2 = " + deleteSuccess2);

        boolean deleteSuccess3 = new File(path).delete();
        System.out.println("deleteSuccess3 = " + deleteSuccess3);

        // 폴더의 생성여부를 exists() 메소드를 이용해서 판별
        System.out.println("filePath.exists() : " + filePath.exists());
    }
}
