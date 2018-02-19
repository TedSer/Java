package com.company;

public class Main {

    public static void main(String[] args) {

        Trenager Atlet = new Trenager();
        Trenager King = new Trenager("King",400,15, "power" );
        Trenager Inter = new Trenager("Inter",550,8,"speed","medium");

        Atlet.setTrenagerName("Atlet");
        Atlet.setPrice(470);
        Atlet.setAmount(5);
        Atlet.setType("flexibility");
        Atlet.setSize("small");

        System.out.println(Atlet);
        System.out.println(King);
        System.out.println(Inter);

        Trenager.printtotalPrice();
        Atlet.printSum();
        King.printSum();
        Inter.printSum();
        Atlet.resreValue("Globus",700,20,"power","large");
        King.resreValue("Grand",200,70,"speed","small");
        Inter.resreValue("Union",1000,4,"flexibility","large");
        System.out.println(Atlet);
        System.out.println(King);
        System.out.println(Inter);
    }


}
