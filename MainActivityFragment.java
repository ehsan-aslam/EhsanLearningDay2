package putitout.ehsanlearningday2;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends ListFragment {

    String[] AndroidOS = new String[] { "Cupcake","Donut","Eclair","Froyo","Gingerbread",
            "Honeycomb","Ice Cream SandWich","Jelly Bean","KitKat","Lollipop","Mashmallow","Perk"
            ,"Jelly Bean","KitKat","Lollipop","Mashmallow","Perk"};
    String[] Version = new String[]{"1.5","1.6","2.0-2.1","2.2","2.3","3.0-3.2",
            "4.0","4.1-4.3","4.4","5.0","5.1","5.2"};

//    public MainActivityFragment() {
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_main, container, false);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, AndroidOS);

        setListAdapter(adapter);


        return view;
    }


    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {


//             First change in develop branch

        TextFragment txt = (TextFragment) getFragmentManager().findFragmentById(R.id.fragment2);
        txt.change(AndroidOS[position],"Version : "+Version[position]);
        getListView().setSelector(android.R.color.holo_blue_dark);
    }
}
