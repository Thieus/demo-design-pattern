package com.mla.designpattern.singleton;

import org.springframework.stereotype.Service;


@Service
public class SpringSingletonService {
    public void doSomething() {
        System.out.println("Spring manages this as a singleton!");
    }
}
