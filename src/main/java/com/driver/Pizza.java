package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean extraCheeseAdded = false;
    private boolean extraToppingsAdded = false;
    private boolean paperBagAdded = false;
    private boolean isBillGenerated = false;
    
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg == true) {
            this.price = 300;
        }
        else {
            this.price = 400;
        }
        this.bill = "Base Price Of The Pizza: " + this.price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!extraCheeseAdded) {
            this.price += 80;
            extraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!extraToppingsAdded) {
            if(isVeg == true) {
                price += 70;
            }
            else {
                price += 120;
            }
            extraToppingsAdded = true;
        }

    }

    public void addTakeaway(){
        if(!paperBagAdded) {
            this.price += 20;
            paperBagAdded = true;
        }
    }

    public String getBill(){
        if(!isBillGenerated) {
            if(extraCheeseAdded) {
                this.bill += "\nExtra Cheese Added: 80";
            }
            if(extraToppingsAdded) {
                if (isVeg) {
                    this.bill += "\nExtra Toppings Added: 70";
                } else {
                    this.bill += "\nExtra Toppings Added: 120";
                }
            }
            if(paperBagAdded) {
                this.bill += "\nPaperbag Added: 20";
            }
            isBillGenerated = true;
        }
        return this.bill;
    }
}