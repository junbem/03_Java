package com.ohgiraffers.lamda.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Application {
    public static void main(String[] args) {

        Application app = new Application();
        app.test1();
        app.test2();
        app.test3();
        app.test4();
        app.test5();
    }
    /**
     *  <pre>
     *  @실습문제1
     *  현재시각 HH:mm:ss.SSS을 출력하는 람다식을 작성
     *  </pre>
     *  */
    private void test1() {
        Supplier<LocalDateTime> ldt = () -> LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(ldt.get().format(formatter));
        System.out.println(ldt.get());
    }
    /**
     *  <pre>
     *  @실습문제2
     *  로또를 생성하는 람다식을 작성하세요.
     *  - 리턴타입 Set<Integer>
     *  </pre>
     *  */
    private void test2() {
        IntSupplier intSupplier = () -> (int) (Math.random() * 45) + 1;
        Set<Integer> lotto= new HashSet<>(Arrays.asList(intSupplier.getAsInt()));
        while (lotto.size() < 6) {
            lotto.add(intSupplier.getAsInt());
        }
        System.out.println("lotto = " + lotto);

    }
    /**
     *  <pre>
     *  @실습문제3
     *  원화 입력시 환율 계산을 통해 얻어진 달러를 출력하는 람다식을 작성
     *  현재 1달러는 1350원이다.
     *  </pre>
     *  */
    private void test3() {
        System.out.print("액수 입력 : ");
        Scanner sc = new Scanner(System.in);
        int won = sc.nextInt();
        DoubleSupplier dollar = () -> (double) won / 1350;
        System.out.println("￦ " + won + " => " + "$ " + dollar.getAsDouble() );
    }
    /**
     * <pre>
     * @실습문제4
     * 위 문제를 jdk가 제공하는 Function 함수형인터페이스 형식에 맞게 변형하세요.
     * </pre>
     * */
    private void test4() {
        Function<Double, Double> function = (won) -> won / 1350;
        System.out.println(function.apply(3000.0));
    }
    /**
     * <pre>
     * @실습문제5
     * 공백을 제외한 문자열의 길이가 0인지를 체크하는 람다식을 만들고,
     * 문자열리스트 {"abc","","대한민국","   "}를 체크하세요.
     * </pre>
     * */
    private void test5() {
        List<String> strList = Arrays.asList("abc", "", "대한민국", " ");
        Function<String, >
    }
}
