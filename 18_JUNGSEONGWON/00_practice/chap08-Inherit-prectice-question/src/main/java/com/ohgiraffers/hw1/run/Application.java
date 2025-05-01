package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // 1. 3명의 학생 정보를 기록할 수 있게 객체 배열 할당
        // 위의 사용데이터 참고하여 3명의 학생 정보 초기화
        // 위의 학생 정보 모두 출력 --> 향상된 for문 이용해서
        StudentDTO[] sDTO = new StudentDTO[3];
        sDTO[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, "정보시스템공학과", 1);
        sDTO[1] = new StudentDTO("김말똥", 21, 186.3, 80.0, "경영학과", 2);
        sDTO[2] = new StudentDTO("강개순", 23, 167.0, 45.0, "정보통신공학과", 4);
        for (StudentDTO sDTO1 : sDTO) {
            System.out.println(sDTO1.toString());
        }
        // 2. 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
        // 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
        // 2명 정도의 사원 정보를 입력 받아 객체 배열에 저장
        // 현재 기록된 사원들의 정보를 모두 출력
        EmployeeDTO[] eDTO = new EmployeeDTO[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("정보를 입력해주세요.");
        int index = 0;
        while (index < eDTO.length) {
            System.out.println("사원 이름 입력:");
            String name = sc.nextLine();

            System.out.println("나이 입력:");
            int age = Integer.parseInt(sc.nextLine());

            System.out.println("키 입력:");
            double height = Double.parseDouble(sc.nextLine());

            System.out.println("몸무게 입력:");
            double weight = Double.parseDouble(sc.nextLine());

            System.out.println("급여 입력:");
            int salary = Integer.parseInt(sc.nextLine());

            System.out.println("부서 입력:");
            String dept = sc.nextLine();

            eDTO[index] = new EmployeeDTO(name, age, height, weight, salary, dept);
            index++;
            System.out.println("현재 등록된 사원 수: " + index + "명");
            // 계속할 것인지 여부 확인
            System.out.print("계속 입력하시겠습니까? (Y/N): ");
            String answer = sc.nextLine();
            if (!answer.equalsIgnoreCase("y")) {
                break;
            }
        }

        // 입력된 사원 정보 출력
        System.out.println("\n[입력된 사원 정보]");
        for (int i = 0; i < index; i++) {
            System.out.println(eDTO[i]);
        }

        sc.close();
    }

}