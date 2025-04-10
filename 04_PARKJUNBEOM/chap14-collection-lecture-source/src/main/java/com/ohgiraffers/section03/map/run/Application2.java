package com.ohgiraffers.section03.map.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Application2 {

    public static void main(String[] args) {

        /*
        * Properties란?
        * HashMap과 거의 유사하지만 key와 value 모두를 String으로만 사용할 수 있는 자료구조이다.
        * 주로 설정 파일 관련된 파일과의 입출력에 사용된다.
        * */
        Properties prop = new Properties();
        prop.setProperty("driver", "com.mysql.jdbc.Driver");
        prop.setProperty("url", "jdbc::mysql://localhost:3306/student");
        prop.setProperty("user", "student");
        prop.setProperty("password", "student");

        System.out.println(prop);

        try {
            prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
            prop.store(new FileWriter("url.properties"), "jdbc driver");
            prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
        Properties prop2 = new Properties();
        System.out.println("prop2 = " + prop2);
        try {
            prop2.load(new FileInputStream("url.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("prop2 = " + prop2);
        System.out.println("driver : " + prop.getProperty("driver"));
    }
}
