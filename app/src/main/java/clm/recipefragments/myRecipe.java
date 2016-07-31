package clm.recipefragments;

/**
 * Created by CLM on 7/31/2016.
 */
public class myRecipe {
    String name;
    int imageResource;
    String description;
    String URL;

    public myRecipe(String name, int imageResource, String description, String URL) {
        this.name = name;
        this.imageResource = imageResource;
        this.description = description;
        this.URL = URL;
    }
}
