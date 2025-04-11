package com.ohgiraffers.section04.testapp.service;

import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.repository.MemberRepository;

import java.util.ArrayList;

// 트랜잭션 처리(성공 실패에 따른 commit/rollback) 및 회원 관련 비즈니스 로직 처리
public class MemberService {

    private final MemberRepository mr = new MemberRepository();

    public void findAllMembers() {

        ArrayList<Member> members = mr.selectAllmembers();

        for(Member member : members) {
            System.out.println(member);
        }
    }

    /***
     * 회원번호로 회원찾기 기능
     * @param memberNo
     */
    public void findMemberBy(int memberNo) {

        Member selectedMember = mr.selectMemberBy(memberNo);

        if(selectedMember != null) {
            System.out.println(selectedMember);
        }
    }

    public void registMember(Member newmember) {

        int lastMemberNo = mr.selectLastMemberNo();
        newmember.setMembNo(lastMemberNo + 1);

        int result = mr.insertMember(newmember);
        if(result == 1) {
            System.out.println(newmember.getId() +" has been registered successfully!👌");
        }
    }

    public Member findMemberForMod(int memNo) {
        Member selectedMember = mr.selectMemberBy(memNo);
        if(selectedMember != null) {
            Member newInstance = new Member();
            newInstance.setMembNo(selectedMember.getMembNo());
            newInstance.setId(selectedMember.getId());
            newInstance.setPwd(selectedMember.getPwd());
            newInstance.setAge(selectedMember.getAge());

            String[] copiedHobbies = selectedMember.getHobbies();
            newInstance.setHobbies(copiedHobbies);
            newInstance.setBloodType(selectedMember.getBloodType());
            System.out.println("조회된 회원은 : " + newInstance.getId());
            return newInstance;

        } else {
            System.out.println("그런 회원은 없네요!");
        }
        return null;
    }

    public void modifyMember(Member reform) {
        int result = mr.updateMember(reform);

        if(result == 1) {
            System.out.println("수정 성공");
            return;
        }
        System.out.println("수정 내역 없음");
    }

    public void removeMember(int removeMemberNo) {
        int result = mr.deleMember(removeMemberNo);

        if(result == 1) {
            System.out.println("다시 돌아오세요~~");
            return;
        }
        System.out.println("회원 번호 틀렸나 본데요?");
    }
}
