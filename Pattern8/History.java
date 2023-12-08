package Pattern8;

import java.util.ArrayList;
import java.util.List;

public class History {
    private final List<EditorMemento> mementos = new ArrayList<>();

    public void saveState(EditorMemento memento) {
        mementos.add(memento);
    }

    public EditorMemento undo() {
        if (mementos.isEmpty()) {
            return null;
        }
        return mementos.remove(mementos.size() - 1);
    }
}
