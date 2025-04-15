// SuperStore Exercise: Access Modifiers & Object Modeling Focus

// TODO: Define a class called Product with:
class Product{
    // - A protected String field called name
    protected String name;
    // - A protected double field called price
    protected double price;
    // - A private final int productId
    private final int productId;
    // - A public static int nextId to help generate unique IDs
    public static int nextId; //starts at 0
    // - A constructor that sets name, price, and assigns a unique ID

    /**
     * Constructor method for Product class
     * @param name name of the product
     * @param price price of the product
     */
    public Product(String name, double price){
        this.productId = nextId++;
        this.name = name;
        this.price = price;
    }
    // - Public getters for all fields

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getProductId() {
        return productId;
    }

    public static int getNextId() {
        return nextId;
    }
    // - Override toString() to return formatted product details
    @Override
    public String toString(){
        return "Product Name: " + this.name + "\nPrice: " + this.price + "\nProduct ID: " + this.productId;
    }
    // - Override equals(Object o) to compare name and productId
    @Override
    public boolean equals(Object o){
        if(o instanceof Product){
            return this.name.equals(((Product)o).name) && this.productId == ((Product) o).productId;
        }
        return false;
    }

}


// TODO: Define a subclass Electronics that extends Product
class Electronics extends Product{
    // - Add a private String field called brand
    private String brand;
    // - Add a private boolean field called hasBattery
    private boolean hasBattery;
    // - Constructor takes all fields and uses super for shared ones

    /**
     * Constructor for the Electronics class
     * @param name name of the electronic
     * @param price price of the electronic
     * @param brand brand of the electronic
     * @param hasBattery whether or not the electronic has a battery in it
     */
    public Electronics(String name, double price, String brand, boolean hasBattery){
        super(name, price);
        this.brand = brand;
        this.hasBattery = hasBattery;
    }
    // - Override toString() to include brand and battery status

    @Override
    public String toString() {
        return super.toString() + "\nBrand: " + brand + "\nHas Battery: " + hasBattery;
    }
}


// TODO: Define a subclass Grocery that extends Product
class Grocery extends Product{
    // - Add a private double field called weight (in kg)
    private double weight;
    // - Add a private boolean field called isPerishable
    private boolean isPerishable;
    // - Constructor takes all fields and uses super for shared ones

    /**
     * Constructor for the Grocery class
     * @param name name for the grocery
     * @param price price for the grocery
     * @param weight weight for the grocery in kg
     * @param isPerishable whether or not the grocery is perishable (like foodstuff)
     */
    public Grocery(String name, double price, double weight, boolean isPerishable){
        super(name, price);
        this.weight = weight;
        this.isPerishable = isPerishable;
    }
    // - Override toString() to include weight and perishability

    @Override
    public String toString() {
        return super.toString() + "\nWeight (kg): " + weight + "\nIs Perishable: " + isPerishable;
    }
}


// TODO: Define a final class Toy that extends Product
final class Toy extends Product{
    // - Add a private int field called minAge
    private int minAge;
    // - Constructor takes all fields and uses super for shared ones

    /**
     * Constructor for the Toy class
     * @param name name of the toy
     * @param price price of the toy
     * @param minAge minimum age of the toy (probably in years)
     */
    public Toy(String name, double price, int minAge){
        super(name, price);
        this.minAge = minAge;

    }
    // - Override toString() to include minAge

    @Override
    public String toString() {
        return super.toString() + "\nMin Age: " + minAge;
    }
}

class Coupon{
    final double discountRate;

    public Coupon(double discountRate, Product product){
        this.discountRate = discountRate;
        product.price = Double.parseDouble(String.format("%.2f",product.getPrice() * (1-discountRate)));
        System.out.printf("%d%% off coupon applied to %s\n",Math.round(discountRate*100), product.getName());

    }
}

// TODO: Define class SuperStoreTest with a main method
class SuperStoreTest{

    public static void main(String[] args) {
        // - Create at least one instance of each subclass
        Product switch2 = new Electronics("Nintendo Switch 2", 449.99, "Nintendo", true);
        Product rice = new Grocery("Rice",5.99,20,true);
        Product jasmineRice = new Grocery("Rice",50.99,500,true);
        Product beyblade = new Toy("Beyblade",10.99,2);
        Product beyblade2 = beyblade;

        // - Store them in a Product[] array
        Product[] products = {switch2, rice, jasmineRice, beyblade, beyblade2};
        // - Loop through and print each item
        for(Product p: products){
            System.out.println(p);
            System.out.println(); //newline
        }
        // - Call equals() to compare two products with the same ID and name
        System.out.println(rice.equals(jasmineRice)); //expected false
        System.out.println(beyblade.equals(beyblade2)); //expected true
        System.out.println("\n=== Additional TODOs ===");
        Coupon twentyPercentOff = new Coupon(0.20,jasmineRice);
        System.out.println(jasmineRice);

    }


}


// Additional TODOs:
// 1. Try to extend Toy — what happens and why?
//error. Cannot inherit from final toy because it's final and cannot be extended.

// 2. Make a class Coupon with a final discountRate and apply it to a Product


// 3. Add a method to Electronics called warrantyInfo() and mark it final


// 4. Use access modifiers appropriately and explain your choices in comments
