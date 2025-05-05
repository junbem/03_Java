package com.ohgiraffers.hw1.model.dto;

public class BookDTO {
    private int bNO;
    private int category;
    private String title;
    private String author;

    public BookDTO() {
    }

    public BookDTO(int bNO, int category, String title, String author) {
        this.bNO = bNO;
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public void setbNO(int bNO) {
        this.bNO = bNO;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getbNO() {
        return bNO;
    }

    public int getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return '[' +
                "bNO=" + bNO +
                ", category=" + category +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ']';
    }
}
