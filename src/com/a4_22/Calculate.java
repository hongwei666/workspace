package com.a4_22;

/**
 * Created by HongWeiPC on 2017/5/2.
 */
public interface Calculate {
    double area();

    double perimeter();

    void show();
}

class Circle implements Calculate {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public void show() {
        System.out.println("圆面积是" + this.area());
        System.out.println("圆周长是" + this.perimeter());
    }
}

class Parallelogram implements Calculate {
    private int a, h, b; //a是底边，b是斜边，h是高

    public Parallelogram(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double area() {
        return a * h;
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }

    public void show() {
        System.out.println("\n平行四边形面积是" + this.area());
        System.out.println("平行四边形周长是" + this.perimeter());
    }
}

class Rectangle implements Calculate {
    private double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }

    @Override
    public void show() {
        System.out.println("\n矩形面积是" + this.area());
        System.out.println("矩形周长是" + this.perimeter());
    }
}

class Trapezoid implements Calculate {
    private double ul, dl, h; //ul是上边长，dl是下边长，h是高
    private double x1, x2; //x1是斜边1，x2是斜边2

    public Trapezoid(double ul, double dl, double h, double x1, double x2) {
        this.ul = ul;
        this.dl = dl;
        this.h = h;
        this.x1 = x1;
        this.x2 = x2;
    }

    @Override
    public double area() {
        return ((ul + dl) * h) / 2;
    }

    @Override
    public double perimeter() {
        return ul + dl + h + x1 + x2;
    }

    public void show() {
        System.out.println("\n梯形面积是" + this.area());
        System.out.println("梯形周长是" + this.perimeter());
    }
}

class TestCalculate {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Parallelogram p1 = new Parallelogram(3, 4, 6);
        Rectangle r1 = new Rectangle(2, 3);
        Trapezoid t1 = new Trapezoid(3, 5, 2, 3, 4);
        c1.show();
        p1.show();
        r1.show();
        t1.show();
    }

}