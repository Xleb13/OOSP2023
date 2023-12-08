package Pattern2.Pizza;

public class MeatPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Приготовление мясной пиццыы");
    }
}