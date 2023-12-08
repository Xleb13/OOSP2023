package Pattern9;

public class ImageResource implements Resource{
    private String filename;

    public ImageResource(String filename) {
        this.filename = filename;
    }

    @Override
    public void load() {
        System.out.println("Загрузка изображения: " + filename);
    }

    @Override
    public void use() {
        System.out.println("Использование изображения: " + filename);
    }
}
