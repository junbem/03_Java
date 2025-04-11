package com.ohgiraffers.api.member.model.vo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Member {
    private int memberNo;
    private String memberName;
    private int height;
    private int weight;
    private LocalDate birth;

    public Member() {
    }

    public Member(int memberNo, String memberName, int height, int weight, LocalDate birth) {
        this.memberNo = memberNo;
        this.memberName = memberName;
        this.height = height;
        this.weight = weight;
        this.birth = birth;
    }



    public String information() {
        return "Member{" +
                "회원번호 :" + memberNo +
                ", 이름 : '" + memberName + '\'' +
                ", 키 :" + height +
                ", 몸무게 : " + weight +
                ", 생일 : " + birth.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일")) +
                '}';
    }


}
