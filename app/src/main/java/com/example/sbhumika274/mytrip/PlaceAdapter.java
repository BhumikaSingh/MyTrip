package com.example.sbhumika274.mytrip;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sbhumika274.mytrip.R;

import java.util.List;

/**
 * Created by hemezh on 02/08/16.
 */

public class PlaceAdapter extends ArrayAdapter<com.example.sbhumika274.mytrip.Place> {
    /**Resources ID for the background color of this list of words**/
    private int mColorResourceId;

    private Context context;

    public PlaceAdapter(Activity context, List<com.example.sbhumika274.mytrip.Place> words , int ColorResourceId ) {
        super(context, 0, words);
        this.context = context;
        mColorResourceId=ColorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent ) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        com.example.sbhumika274.mytrip.Place currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.myTrip_text_view);
        nameTextView.setText(currentWord.getmTitleResourceId());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        numberTextView.setText(currentWord.getmCommentsResourceId());

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        // Set the ImageView to the image resource specified in the current word
        Log.d("image resourse:", String.valueOf(currentWord.getmImageResourceId()));
        imageView.setImageDrawable(context.getResources().getDrawable(currentWord.getmImageResourceId()));

        //Set the color theme of the list item
        View textContainer = listItemView.findViewById(R.id.text_container);

        //Find the color that resources ID map to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //Set the background color to the container view
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }
}