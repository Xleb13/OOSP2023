package Pattern2.Factrory;

import Pattern2.Pizza.MeatPizza;
import Pattern2.Pizza.Pizza;

public class MeatFactory implements PizzaFactory{
    @Override
    public Pizza createPizza() {
        return new MeatPizza();
    }
}
