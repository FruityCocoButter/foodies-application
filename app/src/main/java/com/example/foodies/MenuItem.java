class MenuItem{
   
   String itemName;
   String itemPrice;
   String itemDescription;
   
   public MenuItem(String itemName, String itemPrice, String itemDescription) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
    }

    // Getters and setters

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    @Override
    public String toString() {
        return "Item: " + itemName + "\nPrice: " + itemPrice + "\nDescription: " + itemDescription;
    }

}