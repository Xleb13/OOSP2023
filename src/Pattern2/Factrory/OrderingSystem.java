package Pattern2.Factrory;

import Pattern2.Pizza.Pizza;

public class OrderingSystem {
    public static void main(String[] args) {

        PizzaFactory meatPizzaFactory = new MeatFactory();
        Pizza meatPizza = meatPizzaFactory.createPizza();
        meatPizza.prepare();

        PizzaFactory vegetarianPizzaFactory = new VegetarianFactory();
        Pizza vegetarianPizza = vegetarianPizzaFactory.createPizza();
        vegetarianPizza.prepare();

        PizzaFactory seafoodPizzaFactory = new SeafoodFactory();
        Pizza seafoodPizza = seafoodPizzaFactory.createPizza();
        seafoodPizza.prepare();
    }
}