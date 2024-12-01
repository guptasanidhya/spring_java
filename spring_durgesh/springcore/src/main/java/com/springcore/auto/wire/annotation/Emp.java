package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

//    @Autowired
    private Address address;
    public Emp(Address address) {
        this.address = address;
    }

    public Emp(){
        super();
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    @Autowired
    @Qualifier("address2")
    public void setAddress(Address address) {
        this.address = address;
    }
}
