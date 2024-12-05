package com.springcore.spel;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Value("#{20+30}")
    private int x;

    @Value("#{44}")
    private int y;

    @Value("#{T(java.lang.Math).sqrt(144)}")
    private double z;

    @Value("#{T(java.lang.Math).E}")
    private double e;

    @Value("#{T(java.lang.Math).PI}")
    private double pi;

    @Value("#{new java.lang.String('Sanidhya')}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", e=" + e +
                ", pi=" + pi +
                ", name='" + name + '\'' +
                '}';
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getPi() {
        return pi;
    }

    public void setPie(double pi) {
        this.pi = pi;
    }
}
