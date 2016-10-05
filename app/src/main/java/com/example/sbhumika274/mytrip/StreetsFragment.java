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
public class StreetsFragment extends Fragment {

    public StreetsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create an list of words
        final ArrayList<Place> words = new ArrayList<Place>();

        //words.add("subjects")
        words.add(new Place(R.string.MGRoad ,R.string.MGRoadDescription, R.drawable.mg_road));
        words.add(new Place(R.string.Rajpath, R.string.RajpathDescription, R.drawable.rajpath_road));
        words.add(new Place(R.string.MarineDrive, R.string.MarineDriveDescription, R.drawable.marine_drive));
        words.add(new Place(R.string.DadabhaiNaoroji, R.string.DadabhaiNaorojiDescription, R.drawable.dadabhai_road));
        words.add(new Place(R.string.SitabuldiMarket, R.string.SitabuldiMarketDescription, R.drawable.sitabuldi_market));
        words.add(new Place(R.string.PimriRoad, R.string.PimriRoadDescription, R.drawable.pimri_road));
        words.add(new Place(R.string.MallRoad, R.string.MallRoadDescription, R.drawable.mall_road));
        words.add(new Place(R.string.MominpuraRoad, R.string.MominpuraRoadDescription, R.drawable.mominpura_road));
        words.add(new Place(R.string.TilakMarg, R.string.TilakMargDescription, R.drawable.tilak_marg));


        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), words, R.color.category_famousstreets);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(placeAdapter);

        return rootView;
    }

}






