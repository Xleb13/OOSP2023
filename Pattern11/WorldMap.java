package Pattern11;

import java.util.ArrayList;
import java.util.List;

public class WorldMap implements Cloneable{
    private List<String> tiles;

    public WorldMap(List<String> tiles) {
        this.tiles = tiles;
    }

    public List<String> getTiles() {
        return tiles;
    }

    @Override
    public WorldMap clone() {
        List<String> clonedTiles = new ArrayList<>(this.tiles);
        return new WorldMap(clonedTiles);
    }
}
