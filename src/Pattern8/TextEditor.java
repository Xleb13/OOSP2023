package Pattern8;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private List<String> openedFiles = new ArrayList<>();

    public void openFile(String fileName) {
        System.out.println("Открытие файла: " + fileName);
        openedFiles.add(fileName);
    }

    public void printOpenedFiles() {
        System.out.println("Открытые файлы: " + openedFiles);
    }

    public EditorMemento save() {
        return new EditorMemento(openedFiles);
    }


}
