package com.example.sbhumika274.mytrip;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.example.sbhumika274.mytrip.R;
import com.example.sbhumika274.mytrip.Place;
import com.example.sbhumika274.mytrip.PlaceAdapter;

import java.util.ArrayList;
/**
 * A simple {@link Fragment} subclass.
 */
public class TemplesFragment extends Fragment {

    public TemplesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create an list of words
        final ArrayList<Place> words = new ArrayList<Place>();

        //words.add("subjects")
        words.add(new Place(R.string.JagannathPuri, R.string.JagannathPuriDescription, R.drawable.jaganath_puri));
        words.add(new Place(R.string.SomnathTemple, R.string.SomnathTempleDescription, R.drawable.somnath_temple));
        words.add(new Place(R.string.GoldenTemple, R.string.GoldenTempleDescription, R.drawable.golden_temple));
        words.add(new Place(R.string.VenkateswaraTemple,R.string.VenkateswaraTempleDescription, R.drawable.venkateswara_temple));
        words.add(new Place(R.string.KamakhyaTemple, R.string.KamakhyaTempleDescription, R.drawable.kamakhya_temple));
        words.add(new Place(R.string.Akshardhamtemple, R.string.AkshardhamtempleDescription, R.drawable.akshardham_temple));
        words.add(new Place(R.string.IskconTemple, R.string.IskconTempleDescription, R.drawable.iskcon_temple));
        words.add(new Place(R.string.RadhaRaniTemple, R.string.RadhaRaniTempleDescription, R.drawable.radharani_temple));
        words.add(new Place(R.string.VenkateswaraTemple, R.string.VenkateswaraTempleDescription, R.drawable.vaisnodevi_temple));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), words, R.color.category_temples);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(placeAdapter);

        return rootView;
    }

}






