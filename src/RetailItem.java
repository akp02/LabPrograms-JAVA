/*B. Design and create a class named Retail Item that holds data about an item in a retail
store. The class should have the following fields:
i. Description - The description field references a String object that holds a brief
description of the item.
ii. Units - The unit’s field is an int variable that holds the number of units currently in
inventory.
iii. Price - The price field is a double that holds the item’s retail price.
Write a constructor that accepts arguments for each field, appropriate mutator methods
that store values in these fields, and accessor methods that return the values in these
fields. Write the main method which creates three Retail Item objects and invokes
appropriate methods. */
public class RetailItem {
    private String description;
    private int units;
    private double retail_price;

    RetailItem(){
        System.out.println("Constructor is invoked.");
        this.description = "Default";
        this.units = 0;
        this.retail_price = 0.0;
    }

    public void setRetailItem(String d, int u, double p)
    {
        description = d;
        units = u;
        retail_price = p;
    }

    public String getDescription()
    {
        return description;
    }

    public int getUnits()
    {
        return units;
    }

    public double getRetailPrice()
    {
        return retail_price;
    }

    public static void main(String[] args) {
        RetailItem item1 = new RetailItem();
        RetailItem item2 = new RetailItem();
        RetailItem item3 = new RetailItem();
        
        item1.setRetailItem("paper towel", 5, 90.00);
        item2.setRetailItem("coffee mug", 150, 250.00);
        item3.setRetailItem("photo frame",29 , 400.00);

        System.out.println("The price of item 1 is " + item1.getRetailPrice()); 
    }

    
}
