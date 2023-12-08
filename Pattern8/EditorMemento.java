package Pattern8;

import java.util.ArrayList;
import java.util.List;

public class EditorMemento {
    private final List<String> openedFiles;

    public EditorMemento(List<String> openedFiles) {
        this.openedFiles = new ArrayList<>(openedFiles);
    }

    public List<String> getOpenedFiles() {
        return openedFiles;
    }
}
