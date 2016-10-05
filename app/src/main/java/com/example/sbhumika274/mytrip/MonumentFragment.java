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

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MonumentFragment extends Fragment {

    public MonumentFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create an list of words
        final ArrayList<Place> words = new ArrayList<Place>();

        //words.add("subjects")
        words.add(new Place(R.string.Tajmahal, R.string.TajmahalDescription, R.drawable.taj_mahal));
        words.add(new Place(R.string.FatehpurSikri, R.string.FatehpurSikriDescription,R.drawable.fatehpur_sikri ));
        words.add(new Place(R.string.Sikandra, R.string.SikandraDescription, R.drawable.sikandra));
        words.add(new Place(R.string.AgraFort, R.string.AgraFortDescription, R.drawable.agra_fort));
        words.add(new Place(R.string.IndiaGate, R.string.IndiaGateDescription, R.drawable.india_gate));
        words.add(new Place(R.string.HawaMahal, R.string.HawaMahalDescription, R.drawable.hawa_mahal));
        words.add(new Place(R.string.QutbMinar, R.string.HawaMahalDescription, R.drawable.qutb_minar));
        words.add(new Place(R.string.Lotustemple, R.string.LotustempleDescription, R.drawable.lotus_temple));
        words.add(new Place(R.string.JalMahal, R.string.JalMahalDescription, R.drawable.jal_mahal));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), words, R.color.category_monuments);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(placeAdapter);

        return rootView;
    }

}



