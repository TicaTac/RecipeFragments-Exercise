package clm.recipefragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_List extends Fragment {
    View v;
    ArrayList<String> categoryList;
    myRecipeList myList;
    public Fragment_List() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v=inflater.inflate(R.layout.fragment__list, container, false);
        categoryList=new ArrayList<>();
        categoryList.add("Rice");
        categoryList.add("Pasta");
        categoryList.add("Cake");



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),R.layout.single_list_item,R.id.categoryTV,categoryList);

        ListView categoryLV=(ListView) v.findViewById(R.id.categoryLV);
        categoryLV.setAdapter(adapter);

        categoryLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                MainActivity mainActivity=(MainActivity) getActivity();
                if (!mainActivity.isLandscape()) {
                    mainActivity.setRecipe(myList.myRecipesList.get(position));
                } else {
                    mainActivity.setRecipe(myList.myRecipesList.get(position).name);
                }
                Toast.makeText(getActivity(),""+position,Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }

}
