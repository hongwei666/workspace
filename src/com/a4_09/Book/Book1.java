package com.a4_09.Book;

/**
 * Created by HongWeiPC on 2017/4/11.
 */
public class Book1 {
    private String title;
    private int pageNum;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        if (pageNum < 200) {
            System.out.println("页数不能少于200页");
            this.pageNum = 200;
        } else {
            this.pageNum = pageNum;
        }
    }

    public String detail() {
        return "名称:" + this.title + ":\t页数:" + this.pageNum;
    }
}
