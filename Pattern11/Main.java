package Pattern11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        WorldMap prototypeMap = new WorldMap(new ArrayList<>());

        WorldMapGenerator mapGenerator = new WorldMapGenerator(prototypeMap);

        WorldMap newMap = mapGenerator.generateWorldMap();

        System.out.println("Новый мир: " + newMap.getTiles());
    }

}
