package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheesePrice;
    private int extraToppingsPrice;
    private int extraTakeaway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg == true){
            this.price = 300;
        }
        else {
            this.price = 400;
        }
        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.price+=80;

        this.extraCheesePrice+=80;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg == true){
            price+=70;
            this.extraToppingsPrice+=70;
        }
        else{
            price+=120;
            this.extraToppingsPrice+=120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        this.price+=20;
        this.extraTakeaway+=20;

    }

    public String getBill(){
        // your code goes here
        this.bill+="Extra Cheese Added: "+this.extraCheesePrice+"\n";
        this.bill+="Extra Toppings Added: "+this.extraToppingsPrice+"\n";
        this.bill+="Paperbag Added: "+this.extraTakeaway+"\n";
        this.bill+="Total Price: "+this.price;
        return this.bill;
    }
}
