package com.ohgiraffers.io.member;

import java.io.*;

public class MemberManager {
    ObjectInputStream ois = null;
    Member[] members = null;
    public void readMembers() {

        try {
            ois = new ObjectInputStream(new BufferedInputStream(
                    new FileInputStream("src/main/java/com/ohgiraffers/Io/member/members.ser")));
            while (true) {
                Object obj = ois.readObject();
                members = (Member[]) obj;
                System.out.println(ois.readObject());
            }
        } catch (EOFException e) {
            for (Member member : members) {
                System.out.println(member);
            }
            System.out.println("Finish");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }



    }

    public void addMember(Member member) {

       String target = "src/main/java/com/ohgiraffers/Io/member/members.ser";
       int count = 0;
       for (int i = 0; i < members.length; i++) {
           if(members[i] != null){
               count++;
           }
       }
       if (count < members.length) {
           members[count] = member;
       }

        try {ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(
                    new FileOutputStream()
                    
            ) );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
