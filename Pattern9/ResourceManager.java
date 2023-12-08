package Pattern9;

import java.util.HashMap;
import java.util.Map;

public class ResourceManager {
    private static ResourceManager instance;
    private Map<String, Resource> resourceMap;

    private ResourceManager() {
        resourceMap = new HashMap<>();
    }

    public static synchronized ResourceManager getInstance() {
        if (instance == null) {
            instance = new ResourceManager();
        }
        return instance;
    }

    public Resource getResource(String key) {
        Resource resource = resourceMap.get(key);
        if (resource == null) {
            resource = loadResource(key);
            resourceMap.put(key, resource);
        }
        return resource;
    }

    private Resource loadResource(String key) {
        Resource resource = new ImageResource(key);
        resource.load();
        return resource;
    }
}
