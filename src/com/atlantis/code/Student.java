package com.atlantis.code;

/**
 * Created by IntelliJ IDEA
 * Student class
 * Description: 请添加描述。
 * User: Atlantis
 * Date: 16/7/25
 * Time: 下午10:25
 */

public class Student {
    private Integer age;
    private String name;

    public Integer getAge() {
        System.out.println("Age : " + age );
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        System.out.println("Name : " + name );
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printThrowException(){
        System.out.println("Exception raised");
        throw new IllegalArgumentException();
    }
}
