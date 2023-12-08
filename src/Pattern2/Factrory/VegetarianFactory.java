package Pattern2.Factrory;

import Pattern2.Pizza.Pizza;
import Pattern2.Pizza.VegetarianPizza;

public class VegetarianFactory implements PizzaFactory  {
    @Override
    public Pizza createPizza() {
        return new VegetarianPizza();
    }
}
