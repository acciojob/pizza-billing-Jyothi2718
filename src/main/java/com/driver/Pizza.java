package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private  int extraCheesePrice = 80 ;
    private int extraToppingsPrice;
    private int takeAwayPrice = 20 ;
    private String bill;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isTakeaway;
    private boolean isBillGenerated;
    public Pizza(Boolean isVeg){

        this.isVeg = isVeg;
        isCheeseAdded = false;
        isToppingsAdded = false;
        isTakeaway = false;
        isBillGenerated = false;

        if(isVeg)
        {
            this.price = 300;
            this.extraToppingsPrice = 70;
        }
        else {
            this.price = 400;
            this.extraToppingsPrice = 120;
        }
        this.bill = "Base Price Of The Pizza: "+this.price+ "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese()
    {
        // your code goes here
        if(!isCheeseAdded) {
            this.price = price + extraCheesePrice;
            this.isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded) {
            this.price += extraToppingsPrice;
            this.isToppingsAdded = true;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeaway) {
            this.price += takeAwayPrice;
            this.isTakeaway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated)
        {
            this.isBillGenerated = true;


            if(isCheeseAdded)
            {
                this.bill += "Extra Cheese Added: "+this.extraCheesePrice+ "\n";
            }
            if(isToppingsAdded)
            {
                this.bill += "Extra Toppings Added: "+this.extraToppingsPrice+ "\n";
            }
            if(isTakeaway)
            {
                this.bill += "Paper bag Added: "+this.takeAwayPrice+ "\n";
            }
            this.bill += "Total Price: "+ this.price+ "\n";
        }
        return this.bill;
    }
}