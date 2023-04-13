package com.youjia.web.domain;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className MainTest
 * @date 2023/4/12 12:22
 */
public class MainTest {

    public static void main(String[] args) {
        AbTestE e = new AbTestE(1, 2);
        System.out.println(e.a);
        System.out.println(e.b);
        e.get();
        e.st();
    }

}
