package clm.recipefragments;

import java.util.ArrayList;

/**
 * Created by CLM on 7/31/2016.
 */
public class myRecipeList {
    ArrayList<myRecipe> myRecipesList;

    public myRecipeList() {
        myRecipesList=new ArrayList<>();
        myRecipesList.add(new myRecipe("Rice",R.drawable.rice,"2 Cups of rice bla bla","http://www.google.com"));
        myRecipesList.add(new myRecipe("Pasta",R.drawable.pasta,"tomato","http://www.google.com"));

    }
}
