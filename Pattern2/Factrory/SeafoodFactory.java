package Pattern2.Factrory;

import Pattern2.Pizza.Pizza;
import Pattern2.Pizza.SeafoodPizza;

public class SeafoodFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new SeafoodPizza();
    }
}
