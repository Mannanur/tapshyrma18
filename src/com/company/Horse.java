package com.company;

public class Horse extends Animals{
    private String color;

    public Horse(int weigth, int age, String gender, String nickName, String color) {
        super(weigth, age, gender, nickName);
        this.color=color;
    }

    @Override
    public String toString() {
        return "Horse{" +getWeigth()+" " +getAge()+" "+getGender()+" "+getNickName()+
                "color-'" + color +
                '}';
    }
}
