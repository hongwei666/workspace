package com.a4_22;

interface Buffer {
    String Buffer();
}

interface Filter {
    String Filter();
}

interface Heating {
    String Heating();
}

interface Sugaring {
    String Sugaring();
}

/**
 * Created by HongWeiPC on 2017/5/4.
 */
public abstract class Water {
}

class Water1 extends Water implements Buffer, Filter {

    public String toString() {
        return "纯净水1：" + this.Buffer() + " " + this.Filter();
    }

    @Override
    public String Buffer() {
        return "缓冲";
    }

    @Override
    public String Filter() {
        return "过滤";
    }
}

class Water2 extends Water implements Buffer {
    @Override
    public String toString() {
        return "纯净水2：" + this.Buffer();
    }

    @Override
    public String Buffer() {
        return "缓冲";
    }
}

class Water3 extends Water implements Filter {
    @Override
    public String toString() {
        return "纯净水3：" + this.Filter();
    }

    @Override
    public String Filter() {
        return "过滤";
    }
}


class Water4 extends Water implements Buffer, Filter, Heating {
    @Override
    public String toString() {
        return "纯净水4：" + this.Buffer() + " " + this.Filter() + " " + this.Heating();
    }

    @Override
    public String Buffer() {
        return "缓冲";
    }

    @Override
    public String Filter() {
        return "过滤";
    }

    @Override
    public String Heating() {
        return "加热";
    }
}

class Water5 extends Water implements Buffer, Filter, Heating, Sugaring {
    @Override
    public String toString() {
        return "纯净水5：" + this.Buffer() + " " + this.Filter() + " " + this.Heating() + " " + this.Sugaring();
    }

    @Override
    public String Buffer() {
        return "缓冲";
    }

    @Override
    public String Filter() {
        return "过滤";
    }

    @Override
    public String Heating() {
        return "加热";
    }

    @Override
    public String Sugaring() {
        return "放糖";
    }
}

class TestWater {
    public static void main(String[] args) {
        Water1 water1 = new Water1();
        Water2 water2 = new Water2();
        Water3 water3 = new Water3();
        Water4 water4 = new Water4();
        Water5 water5 = new Water5();
        System.out.println(water1.toString());
        System.out.println(water2.toString());
        System.out.println(water3.toString());
        System.out.println(water4.toString());
        System.out.println(water5.toString());
    }
}