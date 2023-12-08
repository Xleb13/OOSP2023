package Pattern2.Pizza;

public class VegetarianPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Приготовление вегатрианской пиццыы");
    }
}
