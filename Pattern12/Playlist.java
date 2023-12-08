package Pattern12;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements MusicComponent{
    private String name;
    private List<MusicComponent> components = new ArrayList<>();

    public Playlist(String name) {
        this.name = name;
    }

    public void add(MusicComponent component) {
        components.add(component);
    }

    @Override
    public void play() {
        System.out.println("Плейлист: " + name);
        for (MusicComponent component : components) {
            component.play();
        }
    }
}
