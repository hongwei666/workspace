package com.a4_16;

/**
 * Created by HongWeiPC on 2017/5/2.
 */
public class WuMingFen {
    private String theMa;
    private int quantity;
    private boolean likeSoup;

    public WuMingFen() {
        this.theMa = "酸辣面码";
        this.quantity = 2;
        this.likeSoup = true;
    }

    public WuMingFen(String theMa1, int quantity2) {
        this.theMa = theMa1;
        this.quantity = quantity2;
        this.likeSoup = false;
    }

    public WuMingFen(String theMa1, int quantity2, boolean likeSoup3) {
        this.theMa = theMa1;
        this.quantity = quantity2;
        this.likeSoup = likeSoup3;
    }
}

class TestWuMingFen {
    WuMingFen f1 = new WuMingFen("牛肉", 3, true);
    WuMingFen f2 = new WuMingFen("牛肉", 2);
    WuMingFen f3 = new WuMingFen();
}
