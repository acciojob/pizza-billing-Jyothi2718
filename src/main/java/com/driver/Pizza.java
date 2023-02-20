package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private int toppings;
    private String bill;
    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;
    private boolean isTakeaway;
    private boolean isBillGenerated;
    public Pizza(Boolean isVeg){

        this.isVeg = isVeg;

        if(isVeg)
        {
            this.price = 300;
           this.toppings = 70;
        }
        else {
           this.price = 400;
            this.toppings = 120;
        }
        isExtraCheeseAdded =false;
        isExtraToppingsAdded =false;
        isTakeaway=false;
        isBillGenerated=false;

       this.bill = "Base Price Of The Pizza: "+this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese()
    {
        // your code goes here
        if(!isExtraCheeseAdded) {
            this.price += 80;
           this.isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingsAdded) {
            this.price += this.toppings;
            this.isExtraToppingsAdded= true;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeaway) {
            this.price += 20;
            isTakeaway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated)
        {

            if(isExtraCheeseAdded)
            {
                this.bill += "Extra Cheese Added: 80"+ "\n";
            }
            if(isExtraToppingsAdded)
            {
                this.bill += "Extra Toppings Added: "+this.toppings+ "\n";
            }
            if(isTakeaway)
            {
                this.bill += "Paper bag Added: 20" + "\n";
            }
            this.bill += "Total Price: "+ this.price + "\n";
            this.isBillGenerated = true;
            return this.bill;
        }
        return "";
    }
}
