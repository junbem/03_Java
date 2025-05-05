package com.ohgiraffers.section05.finalkeyword;

public class FinalFieldTest {
    /*
     * final
     * : final은 종단의 의미를 가지는 키워드이다.
     *   final 키워드를 사용할 수 있는 위치는 다양한 편이며 의미가 약간은 다르지만
     *   결국 변경 불가의 의미이다.
     * 1. 지역변수 : 초기화 이후 값 변경 불가
     * 2. 매개변수 : 호출 시 전달한 인자 변경 불가
     * 3. 전역변수 : 인스턴스 생성 후 초기화 이후에 값 변경 불가
     * 4. 클래스(static) 변수 : 프로그램 start 이후 값 변경 불가
     * 5. non-static 메소드 : 메소드 재작성(overriding) 불가
     * 6. static 메소드 : 메소드 재작성(overriding) 불가
     * 7. 클래스 : 상속 불가
     * */

    /*
     * final은 변경 불가의 의미를 가진다.
     * 따라서 초기 인스턴스가 생성되고 나면 기본값이 0이 필드에 들어가게 되는 데
     * 그 초기화 이후 값을 변경할 수 없기 때문에 선언하면서 바로 초기화를 해주어야한다.
     * 그렇지 않으면 compile error가 발생한다. */
//    private final int nonStaticNum;

    // 해결방안
    // 1. 선언과 동시에 초기화를 한다.
    private final int NON_STATIC_NUM = 1;

    // 2. 생성자를 이용해서 초기화한다.
    private final String NON_STATIC_NAME;

    public FinalFieldTest(String nonStaticName) {
        this.NON_STATIC_NAME = nonStaticName;
    }

    // static field에 final 사용
//  private static final int STATIC_NUM; // 0으로 초기화 되기 때문에 이후 변경 불가능
    private static final int STATIC_NUM = 1;

    /*
     * 생성자는 인스턴스가 생성되는 시점에 호출되기 때문에 그전에는 초기화가 일어나지 못한다.
     * 하지만 static은 프로그램이 start될 때 할당 되기 때문에 초기화가 되지 않은 상태로
     * 선언된 것과 동일하며 기본값으로 초기화된 후 값을 변경하지 못하기 때문에 에러가 발생한다.
     * */
 //   private static final double STATIC_DOUBLE;
//    public FinalFieldTest(double STATIC_DOUBLE){
//        FinalFieldTest.STATIC_DOUBLE = staticDouble;
//    }
    // 초기화 블럭으로 사용 가능
//   static {
//       STATIC_DOUBLLE = 1.0;
//    }

}


