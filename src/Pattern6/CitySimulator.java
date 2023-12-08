package Pattern6;

public class CitySimulator {
    public static void main(String[] args) {
        CityObject house = new House();
        CityObject road = new Road();
        CityObject shop = new Shop();

        house.draw();
        road.draw();
        shop.draw();
    }
}
