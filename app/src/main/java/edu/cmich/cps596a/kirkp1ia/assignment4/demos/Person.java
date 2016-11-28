package edu.cmich.cps596a.kirkp1ia.assignment4.demos;

import com.orm.SugarRecord;

/**
 * Created by kirkp1ia on 11/28/16.
 */

public class Person extends SugarRecord {

    protected String name;
    protected String nickName;
    protected int age;

    public Person() {
        // This default constructor is required for the table to be created.
    }

    public Person(String name, String nickName, int age) {
        this.name = name;
        this.nickName = nickName;
        this.age = age;
    }

    public String toString() {
        return "Person: " + this.name + ", age: " + this.age;
    }
}
