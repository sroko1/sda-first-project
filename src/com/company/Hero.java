package com.company;

public class Hero {
    public static int heroescount = 0;

    private String name = " Goliath ";
    private String gender = "Mężczyzna";
    private int hp = 100;
    private int st = 10;

    public Hero() {



    }

    public void printInfo() {
        heroescount ++;

        System.out.println(" Stytystyki postaci: \n Imię: " + name + "\n Płeć: " + gender + "\n Zdrowie: " + hp + "\n Siła: " + st);
        printInfo();

        if(heroesCount >= 1000) {
            System.out.println("Zatrzymajmy to");

        }

    }

    public void setName(String name) {
        this.name = name;
    }

}


