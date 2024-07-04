package com.shreyans.spring_boot_complete.model;

import org.springframework.stereotype.Component;

@Component
public class MyClass {
    private int callerId;

    public MyClass(int callerId) {
        this.callerId = callerId;
    }
    public MyClass() {}

    public void callMe(){
        System.out.println("MyClass Created with callerId" + callerId);
    }
}
