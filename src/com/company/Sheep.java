package com.company;

public class Sheep extends Animals{
    public Sheep(int weigth, int age, String gender, String nickName) {
        super(weigth, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "Sheep{" +getWeigth()+" " +getAge()+" "+getGender()+" "+getNickName()+"}";
    }
}
