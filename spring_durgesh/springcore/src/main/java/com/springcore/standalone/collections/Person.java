package com.springcore.standalone.collections;
import java.util.*;

public class Person {
    private List<String> friends;
    private Map<String,Integer> fees_structure;

    private Properties properties;

    public Person(Map<String, Integer> fees_structure, Properties properties, List<String> friends) {
        this.fees_structure = fees_structure;
        this.properties = properties;
        this.friends = friends;
    }

    public Person(){
        super();
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", fees_structure=" + fees_structure +
                ", properties=" + properties +
                '}';
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Map<String, Integer> getFees_structure() {
        return fees_structure;
    }

    public void setFees_structure(Map<String, Integer> fees_structure) {
        this.fees_structure = fees_structure;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
