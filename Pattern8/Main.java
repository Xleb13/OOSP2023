package Pattern8;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.openFile("file1.txt");
        editor.openFile("file2.txt");
        editor.printOpenedFiles();

        history.saveState(editor.save());

    }
}
