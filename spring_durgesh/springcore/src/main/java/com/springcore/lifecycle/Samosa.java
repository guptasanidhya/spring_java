package com.springcore.lifecycle;

public class Samosa {
    private int price;

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Samosa(int price) {
        this.price = price;
    }

    public Samosa() {
        super();
    }

    public void init(){
        System.out.println("Hii I am inside Init");
    }
    public void destroy(){
        System.out.println("Destroying Destroying Destroying");
    }
}
