public class CoffeeOrder {
    // TODO 1: Change the class name to CoffeeOrder (done)

    // TODO 2: Create instance variables: (done)
    // - size (String)
    // - type (String)
    // - orderID (String, make this one private)
    String size;
    String type;
    private String orderID;

    // TODO 3: Add a static int variable called totalOrders (done)
    static int totalOrders;


    // TODO 4: Create a no-arg constructor (done)
    // Set size to "medium" and type to "black"
    // Increment totalOrders

    CoffeeOrder(){

        size = "medium";
        type = "black";
        totalOrders++;
    }



    // TODO 5: Create a constructor that takes a size only (done)
    // Set type to "black" by default
    // Increment totalOrders

    CoffeeOrder(String size){
        this.size = size;
        type = "black";
        totalOrders++;
    }

    // TODO 6: Create a constructor that takes size and type (done)
    // Increment totalOrders

    CoffeeOrder(String size, String type){
        this.size = size;
        this.type = type;
        totalOrders++;
    }

    // TODO 7: Create a method describeOrder() that returns (done)
    // something like "Order: medium black"

    public String describeOrder(){
        return "Order: " + size + " " + type;
    }

    // TODO 8: Add a static method getTotalOrders() to return totalOrders (done)
    public static int getTotalOrders(){
        return totalOrders;
    }
}
