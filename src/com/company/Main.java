package com.company;

public class Main {

    public static void main(String[] args) {

        Cow cow = new Cow(200, 3, "bull","Kashka");
        Cow cow1 = new Cow(100, 2, "heifer","Ala");
        Cow cow2 = new Cow(220, 3, "bull","Kara");
        Cow cow3 = new Cow(230, 4, "bull","Tank");
        Cow cow4 = new Cow(150, 3, "Heifer","Jazk");
        Sheep sheep = new Sheep(30, 3, "sheep", "Tina");
        Sheep sheep1 = new Sheep(35, 3, "ram", "Roma");
        Sheep sheep2 = new Sheep(40, 4, "ram", "Dima");
        Horse horse = new Horse(250, 3, "J", "Tanya", "Toru");
        Horse horse1 = new Horse(280, 4, "M", "Kara Kashka", "Kara");

    Farm_1 farm_1 = new Farm_1("Osh obl Nookat r-n", "Kamal",
            new Sheep[]{sheep, sheep1, sheep2}, new Cow[]{cow, cow1,cow2,cow3,cow4}, new Horse[]{horse,horse1});

    Farm_2 farm_2 = new Farm_2("Naryn obl, Kochkor r-nu", "Satypaldy",
            new Sheep[]{sheep2}, new Cow[]{cow4}, new Horse[]{horse});

        System.out.println(farm_1);
        System.out.println(farm_2);


    }
}
