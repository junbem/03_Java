package com.ohgiraffers.section05.calendar;

import java.util.Date;

public class Application1 {

    public static void main(String[] args) {

        /*
        * 패키지 : java.util.Date
        * */
        /*
         *  JDK 1.1부터는 새롭게 제공되는 Calendar 클래스를 이용하여 날짜와 시간에 관한 처리를 하게 된다.
         *  하지만 Calendar 클래스는 몇 가지 문제를 가지고 있다.
         *  1. Calendar 인스턴스는 불변객체가 아니기 때문에 값을 수정할 수 있다.
         *  2. 윤초(leap second)를 고려하지 않는다.
         *     윤초란?
         *     협정 세계시에서 사용하는 세슘 원자 시계와 실제 지구의 자전/공전 속도를 기준으로 한 태양시의 차이로 인해
         *     발생한 오차를 보정하기 위해 추가하는 1초이다.
         *     12월 31일의 마지막에 추가하거나, 혹은 6월 30일의 마지막에 추가한다.
         *     윤초는 사소해 보이지만 실제 2012년 링크드인 과 같은 대규모 서비스의 서버를 마비시킨 버그를 발생한 적 도 있다.
         *  3. Calendar 클래스는 월을 나타낼 때 0 부터 11까지로 표현하는 불편함이 있다.
         * */

        Date date = new Date();
        System.out.println(date);

        // getTime() : 1970년 1월 1일 0시 0분 0초 이후 지난 시간을 millisecond로 계산해서 long타입으로 반환
        System.out.println(date.getTime());

        // 1초 : 1000밀리초 ==> 5초 : 5000밀리초   0.5초 : 500밀리초
        // 1분 : 60초
        // 1시간 : 60분
        // 하루 : 24시간

        // 1000 * 60 * 60 * 24 > 하루

        Date time = new Date(1743751040124L);
        System.out.println(time);





    }
}
