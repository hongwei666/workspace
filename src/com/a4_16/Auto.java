package com.a4_16;

/**
 * Created by HongWeiPC on 2017/5/2.
 */
public class Auto {
    public double speed;
    private int tries;
    private String colour;
    private double weight;

    public Auto() {
        this.tries = 4;
        this.colour = "白色";
        this.weight = 2000;
        this.speed = 60;
    }

    public Auto(int tries, String colour, double weight, double speed) {
        this.tries = tries;
        this.colour = colour;
        this.weight = weight;
        this.speed = speed;
    }

    public void speedup() {
        if (this.speed >= 0) {
            this.speed = speed + 5;
        } else {
            speed = 120;
        }
    }

    public void speeddown() {
        if (this.speed >= 0) {
            this.speed = speed - 5;
        } else {
            speed = 0;
        }
    }
}

class Cars extends Auto {
    private int air;
    private String CD;

    public Cars() {
        super();
        this.CD = "cd1";
        this.air = 24;
    }

    public void speedup() {
        if (this.speed >= 0 && this.speed <= 120) {
            this.speed = speed + 5;
        } else {
            this.speed = 120;
        }
    }

    public void speeddown() {
        if (this.speed >= 0 && this.speed <= 120) {
            this.speed = speed - 5;
        } else {
            speed = 0;
        }
    }
}

