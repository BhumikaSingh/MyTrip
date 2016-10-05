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
public class RestaurantsFragment extends Fragment {
    public RestaurantsFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create an list of words
        final ArrayList<Place> words = new ArrayList<Place>();

        //words.add("subjects")
        words.add(new Place(R.string.RoyalTandoor, R.string.RotichaiDescription, R.drawable.table_restaurant));
        words.add(new Place(R.string.IndianExpress,R.string.IndiaGateDescription, R.drawable.chair_restaurant));
        words.add(new Place(R.string.Lotus, R.string.LotustempleDescription, R.drawable.glass_restaurant));
        words.add(new Place(R.string.Amaya, R.string.AmayaDescription, R.drawable.roast_restaurant));
        words.add(new Place(R.string.Pinchofspice, R.string.PinchofspiceDescription, R.drawable.water_restaurant));
        words.add(new Place(R.string.Tamarind, R.string.TajmahalDescription, R.drawable.gujrat_restaurant));
        words.add(new Place(R.string.Rotichai, R.string.RotichaiDescription, R.drawable.thali_restaurant));
        words.add(new Place(R.string.MasalaZone, R.string.MasalaZoneDescription, R.drawable.paris_restaurant));
        words.add(new Place(R.string.Bukhra, R.string.BukhraDescription, R.drawable.huge_restaurant));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), words, R.color.category_restaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(placeAdapter);

        return rootView;
    }

}

