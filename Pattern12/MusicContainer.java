package Pattern12;

import java.util.ArrayList;
import java.util.List;

public class MusicContainer implements MusicComponent{
    private String title;
    private List<MusicComponent> children;

    public MusicContainer(String title) {
        this.title = title;
        this.children = new ArrayList<>();
    }

    public void add(MusicComponent component) {
        children.add(component);
    }

    @Override
    public void play() {
        System.out.println("> " + title);
        for (MusicComponent component : children) {
            component.play();
        }
    }
}
