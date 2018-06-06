package com.company;

public class Main {

    public static void main(String[] args) {

        Trenager atlet = new Trenager();
        Trenager king = new Trenager("king",400,15, "power" );
        Trenager inter = new Trenager("inter",550,8,"speed","medium");
        atlet.setTrenagerName("atlet");
        atlet.setPrice(470);
        atlet.setAmount(5);
        atlet.setType("flexibility");
        atlet.setSize("small");
        System.out.println(atlet);
        System.out.println(king);
        System.out.println(inter);
        Trenager.printTotalPrice();
        atlet.printSum();
        king.printSum();
        inter.printSum();
        atlet.resreValue("Globus",700,20,"power","large");
        king.resreValue("Grand",200,70,"speed","small");
        inter.resreValue("Union",1000,4,"flexibility","large");
        System.out.println(atlet);
        System.out.println(king);
        System.out.println(inter);
        
    }

}
