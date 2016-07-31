package clm.recipefragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Details extends Fragment {
    TextView nameTV;
    TextView descriptionTV;
    ImageView imageIV;
    String url;

    public Fragment_Details() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v=inflater.inflate(R.layout.fragment__details, container, false);

        nameTV=(TextView) v.findViewById(R.id.nameTV);
        descriptionTV=(TextView) v.findViewById(R.id.descriptionTV);
        imageIV=(ImageView) v.findViewById(R.id.imageIV);
        url=null;


        return v;
    }
    public void changeRecipe(myRecipe recipe)
    {
        nameTV.setText(recipe.name);
        descriptionTV.setText(recipe.description);
        imageIV.setImageResource(recipe.imageResource);
        url=recipe.URL;

    }
    public  void changeRecipe(String text)
    {
        nameTV.setText(text);
        descriptionTV.setText("Something");
        imageIV.setImageResource(R.drawable.cake);


    }
}
