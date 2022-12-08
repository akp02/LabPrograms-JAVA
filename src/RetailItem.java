public class RetailItem {
    public String description;
    public int units;
    public double retail_price;

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

        System.out.println("The price of item 1 is " + item1.retail_price); //what accessor method??
    }

    
}
