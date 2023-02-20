package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private  int extraCheesePrice = 80 ;
    private int ExtraToppingsPrice;
    private int TakeAwayPrice = 20 ;
    private String bill;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isTakeaway;
    private boolean isBillGenerated;
    public Pizza(Boolean isVeg){

        this.isVeg = isVeg;
        isCheeseAdded=false;
        isToppingsAdded=false;
        isTakeaway=false;
        isBillGenerated=false;

        if(isVeg)
        {
            price=300;
            ExtraToppingsPrice=70;
        }
        else {
            price=400;
            ExtraToppingsPrice=120;
        }
        bill="Base Price Of The Pizza: "+price+ "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese()
    {
        // your code goes here
        if(!isCheeseAdded) {
            price = price + extraCheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded) {
            price = price +ExtraToppingsPrice;
            isToppingsAdded=true;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeaway) {
            price = price + TakeAwayPrice;
            isTakeaway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated)
        {
            isBillGenerated=true;


            if(isCheeseAdded)
            {
                bill=bill+"Extra Cheese Added: "+extraCheesePrice+ "\n";
            }
            if(isToppingsAdded)
            {
                bill=bill+"Extra Toppings Added: "+ExtraToppingsPrice+ "\n";
            }
            if(isTakeaway)
            {
                bill=bill+"Paperbag Added: "+TakeAwayPrice+ "\n";
            }
            bill=bill+"Total Price: "+price+ "\n";
        }
        return this.bill;
    }
}