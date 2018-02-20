package com.company;

public class Trenager {
    private String trenagerName;
    private int price;
    private int amount;
    private String type;
    private String size;
    public static int totalPrice = 0;

    public Trenager(){

    }

    public Trenager(String trenagerName,int price ,int amount, String type){
        this.trenagerName = trenagerName;
        this.price = price;
        this.amount = amount;
        this.type = type;
    }

    public Trenager(String trenagerName,int price ,int amount, String type,String size){
        this.trenagerName = trenagerName;
        this.price = price;
        this.amount = amount;
        this.type = type;
        this.size = size;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        totalPrice = totalPrice - this.price + price;
        this.price = price;
    }

    public String getTrenagerName() {
        return trenagerName;
    }

    public void setTrenagerName(String trenagerName) {
        this.trenagerName = trenagerName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return "Name of the trenager : "+this.getTrenagerName()+"\n Amount : "+this.getAmount()+"\n Price : "+this.getPrice()+"\n Type : "+this.getType()+"\n Size : "+this.getSize();
    }

    static void printTotalPrice(){
        System.out.println("Total price of all trenagers : " + totalPrice);
    }

    public void printSum(){
        System.out.println("Name of the trenager : "+ getTrenagerName()+"\nType : "+ getType()+"\nSize : "+ getSize());
    }

    public void resreValue(String trenagerName,int price ,int amount, String type,String size){
        setTrenagerName(trenagerName);
        setAmount(amount);
        setPrice(price);
        setSize(size);
        setType(type);
    }

}

