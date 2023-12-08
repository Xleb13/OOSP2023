package Pattern11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WorldMapGenerator {
    private WorldMap prototype;

    public WorldMapGenerator(WorldMap prototype) {
        this.prototype = prototype;
    }

    public WorldMap generateWorldMap() {
        List<String> newTiles = generateRandomTiles();
        return new WorldMap(newTiles);
    }

    private List<String> generateRandomTiles() {
        List<String> tiles = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            String tile = String.valueOf(random.nextInt(100));
            tiles.add(tile);
        }

        return tiles;
    }
}
