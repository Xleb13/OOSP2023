package Pattern9;

public class Main {
    public static void main(String[] args) {
        ResourceManager resourceManager = ResourceManager.getInstance();

        Resource imageResource1 = resourceManager.getResource("image1");
        imageResource1.use();

        Resource imageResource2 = resourceManager.getResource("image1");
        imageResource2.use();

        Resource imageResource3 = resourceManager.getResource("image2");
        imageResource3.use();
    }
}
