package com.macwu.Bean;

import java.io.Serializable;

/**
 * Created by Tong on 2016/8/29.
 */
public class BookBean implements Serializable{
    private String bookId;
    private String authorName;
    private String bookName;
    private double bookPrice;
    private String publishDate;
    private String disciption;
    private int saleAmount;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getDisciption() {
        return disciption;
    }

    public void setDisciption(String disciption) {
        this.disciption = disciption;
    }

    public int getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(int saleAmount) {
        this.saleAmount = saleAmount;
    }
}
