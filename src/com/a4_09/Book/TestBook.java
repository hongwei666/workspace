package com.a4_09.Book;

/**
 * Created by HongWeiPC on 2017/4/11.
 */
public class TestBook {
    public static void main(String[] args) {
        Book1 book = new Book1();
        Book1 book1 = new Book1();
        book.setTitle("计算机网络");
        book.setPageNum(150);
        book1.setTitle("组成原理");
        book1.setPageNum(250);
        System.out.println(book.detail());
        System.out.println(book1.detail());
    }
}
