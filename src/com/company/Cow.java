package com.company;

public class Cow extends Animals{
    public Cow(int weigth, int age, String gender, String nickName) {
        super(weigth, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "Cow{" +getWeigth()+" " +getAge()+" "+getGender()+" "+getNickName()+"}";
    }
}
