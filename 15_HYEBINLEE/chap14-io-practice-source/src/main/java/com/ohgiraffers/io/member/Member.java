package com.ohgiraffers.io.member;

import java.io.Serializable;

public class Member implements Serializable {
  /**
   *
   */
  private static final long serialVersionUID = 1L;
  private String userId;
  private String userPwd;
  private String userName;
  private String email;
  private int age;
  private char gender;
  private double point;
  public Member(){}
  public Member(String userId, String userPwd, String userName){
    this.userId = userId;
    this.userPwd= userPwd;
    this.userName = userName;
  }
  public Member(String userId, String userPwd, String userName, String email,
      int age, char gender, double point){
    this(userId, userPwd, userName);
    this.email = email;
    this.age = age;
    this.gender = gender;
    this.point = point;
  }

  public String getUserId() {
    return userId;
  }
  public String getUserPwd() {
    return userPwd;
  }
  public String getUserName() {
    return userName;
  }
  public String getEmail() {
    return email;
  }
  public int getAge() {
    return age;
  }
  public char getGender() {
    return gender;
  }
  public double getPoint() {
    return point;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }
  public void setUserPwd(String userPwd) {
    this.userPwd = userPwd;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public void setGender(char gender) {
    this.gender = gender;
  }
  public void setPoint(double point) {
    this.point = point;
  }
  @Override
  public String toString() {
    return this.userId + ", " + this.userPwd + ", " + this.userName + ", " +
        this.email + ", " + this.age + ", " + this.gender + ", " +
        this.point;
  }
}
