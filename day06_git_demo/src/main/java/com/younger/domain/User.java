package com.younger.domain;

/**
 * Created by younger  2018/12/28
 */
public class User {
    private String username;
    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
