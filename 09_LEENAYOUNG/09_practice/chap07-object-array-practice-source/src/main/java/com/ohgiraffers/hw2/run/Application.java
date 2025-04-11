package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
        StudentDTO[] students = new StudentDTO[10];

        // while문을 사용하여 학생들의 정보를 계속 입력 받고
        // 한 명씩 추가 될 때마다 카운트함
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가

        int count = 0;

        while(true) {
            System.out.print("학년 : ");
            int grade = sc.nextInt();
            System.out.print("반 : ");
            int classroom = sc.nextInt();
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("국어 점수 : ");
            int kor = sc.nextInt();
            System.out.print("영어 점수 : ");
            int eng = sc.nextInt();
            System.out.print("수학 점수 : ");
            int math = sc.nextInt();

            students[count] = new StudentDTO(grade, classroom, name, kor, eng, math);
            count++;
            System.out.print("계속 추가하시겠습니까? (y/n): ");
            char ch = sc.next().charAt(0);

            if(ch == 'y' || ch == 'Y'){
                continue;
            } else {
                break;
            }
        }

        // 3명 정도의 학생 정보를 입력 받아 각 객체에 저장함
        // 현재 기록된 학생들의 각각의 점수 평균을 구함
        // 학생들의 정보를 모두 출력 (평균 포함)

        /*int[] gradeAvg = new int[10];

        for(int i = 0; i < count; i++) {
            gradeAvg[i] = (students[i].getKor() + students[i].getEng() + students[i].getMath()) / 3;
            System.out.println(students[i].information() + ", 점수 평균 : " + gradeAvg[i]);
        }*/

        for (StudentDTO student : students) {
            if(student == null) {
                break;
            }

            int sum = student.getKor() + student.getEng() + student.getMath();
            System.out.println(student.information() + ", 평균=" + sum / 3);
        }
    }
}
