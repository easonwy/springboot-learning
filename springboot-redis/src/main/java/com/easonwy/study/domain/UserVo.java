package com.easonwy.study.domain;

import java.io.Serializable;

/**
 * @author eason.wu
 * @date 2022/1/7 22:10
 **/
public class UserVo implements Serializable {

    private static final long serialVersionUID = -8944830171305126357L;

    public  static final String Table = "t_user";

    private String name;
    private String address;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
