package com.example.addition_custom_starter;

import org.springframework.stereotype.Component;

@Component
public class DoAddition {

    public static int addition(int a,int b){
        System.out.println("Calling this custom starter from now");
        return a+b;
    }

}
