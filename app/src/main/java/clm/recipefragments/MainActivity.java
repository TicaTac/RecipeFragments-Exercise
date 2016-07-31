package clm.recipefragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    FragmentManager manager;
    FragmentTransaction transaction;
    myRecipeList myList;
    Fragment_List listFrag;
    Fragment_Details detailsFrag;
    LinearLayout detailsFragContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myList=new myRecipeList();
        myList.myRecipesList.add(new myRecipe("Cake",R.drawable.cake,"Birthday Cake","http://www.google.com"));

        listFrag= new Fragment_List();
        listFrag.myList=myList;
        manager= getFragmentManager();
        transaction= manager.beginTransaction();
        transaction.add(R.id.listFragmentContainerLL, listFrag);

        detailsFragContainer = (LinearLayout) findViewById(R.id.detailsFragmentContainerLL);

        if (isLandscape()){
            detailsFrag=new Fragment_Details();
            transaction.add(R.id.detailsFragmentContainerLL,detailsFrag);
        }
        transaction.commit();


    }

    public boolean isLandscape()
    {
        LinearLayout detailFrag = (LinearLayout) findViewById(R.id.detailsFragmentContainerLL);
        return  (detailFrag!=null);
    }

    public void setRecipe(myRecipe recipe)
    {
        if (detailsFragContainer!=null) {
            detailsFrag.changeRecipe(recipe);
        }
    }

    public void setRecipe(String text)
    {
        detailsFrag.changeRecipe(text);
        if (isLandscape()) {
            //transaction.replace(R.id.listFragmentContainerLL, detailsFrag);
        }
        else{
            transaction.replace(R.id.listFragmentContainerLL, detailsFrag);
            transaction.commit();

        }


    }


}
