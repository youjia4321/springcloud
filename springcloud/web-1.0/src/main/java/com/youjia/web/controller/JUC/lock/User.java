package com.youjia.web.controller.JUC.lock;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className User
 * @date 2022/11/9 14:02
 */
public class User {

    static class User1 {
        private String name;
        private Integer age;

        User1(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            return true;
        }

        @Override
        public int hashCode() {
            return 4;
        }
    }

    static class User2 {
        private String name;
        private Integer age;

        User2(String name, Integer age) {
            this.name = name;
            this.age = age;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            return true;
        }

        @Override
        public int hashCode() {
            return 16;
        }

    }

    public static void main(String[] args) {

        User1 user1 = new User1("小红", 32);
        User2 user2 = new User2("小明", 31);

        HashMap<Object, Integer> map = new HashMap<>(4);

        map.put(user1, 3);
        map.put(user2, 5);
        System.out.println(map.hashCode());


        int h = 0;
        h = user1.hashCode() ^ (h >>> 16);           // 0100 0000   10000 00000
        System.out.println(h);

    }

}
