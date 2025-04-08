package com.ohgiraffers.section01.object.book;

public class Book {
    private int number;
    private String title;
    private String author;
    private int price;
//기본생성자
    public Book() {
    }
    //모든 필드를 초기화 하는 생성자

    public Book(int number, String title,String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
//오버라이딩

    @Override
    public String toString() {
        return
                "이름 =" + number +
                ", 제목 ='" + title +
                ", 저자 ='" + author +
                ", 가격 =" + price ;
    }
    //2.equals 메소드를 오버라이딩

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        Book other = (Book) obj;
        if(this.number != other.number){
            //number는 정수형
            return false;
        }
        if(this.title == null){

            if(other.title != null){
                return false;
            }

        } else if (!this.title.equals(other.title)) {
            return false;
        }
        if(this.author== null){

            if(other.author != null){
                return false;
            }
        } else if (!this.author.equals(other.author)) {
            return false;
        }

        if(this.price != other.price){
            return false;
        }
        return true;
    }
    //3. hashcode 오버라이딩
    @Override
    public int hashCode() {
        /***
         * 곱셈 연산을 누적시켜야하기 때문에 0이 아닌 값으로 초기화
         */
        int result =1;


        /***
         * 필드마다 곱해 줄 소수겂을 선언
         * 31은 소수이기 때문에 연산 시 동일한 hashcode 값이 나오지 않음
         */
        final int prime = 31;
        result = prime * result + this.number;
        result = prime * result +this.title.hashCode();
        result  = prime * result + this.author.hashCode();
        result  = prime * result + this.price;
        return result;

    }
}
