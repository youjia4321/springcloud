package com.youjia.web.domain;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className AbTest
 * @date 2023/4/12 12:18
 */
public abstract class AbTest {

    int a;
    int b;

    AbTest(){}
    AbTest(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void get(){
        System.out.println("xxxx");
    }

    abstract void st();

}
