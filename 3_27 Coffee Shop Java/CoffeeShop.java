public class CoffeeShop {
    // TODO 1: Change the class name to CoffeeShop (done)

    public static void main(String[] args) {
        // TODO 2: Create three CoffeeOrder objects (done)
        // Use a different constructor each time
        CoffeeOrder orderA = new CoffeeOrder();
        CoffeeOrder orderB = new CoffeeOrder("grande");
        CoffeeOrder orderC = new CoffeeOrder("pequeño", "frappachappajappalappadappachino");

        // TODO 3: Call describeOrder() on each and print the result (done)
        System.out.println(orderA.describeOrder());
        System.out.println(orderB.describeOrder());
        System.out.println(orderC.describeOrder());
        // TODO 4: Print the total number of orders using (done)
        // CoffeeOrder.getTotalOrders()
        System.out.println(CoffeeOrder.getTotalOrders());
    }
}
