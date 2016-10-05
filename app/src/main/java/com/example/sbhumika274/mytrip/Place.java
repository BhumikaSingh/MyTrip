package com.example.sbhumika274.mytrip;

/**
 * {@link Place}represents vocabulary words that  the user wants to learn.
 * It contains a default  translation and a MyMusic translation  for that words
 *
 *
 *
 */
public class Place {

    private int mTitleResourceId;

    private int mCommentsResourceId;

    private int mImageResourceId;

    public Place(int defaultTranslation) {
        mTitleResourceId = defaultTranslation;

    }

    public Place(int titleResourceId, int commentsResourceId , int imageResourceId ) {
        mTitleResourceId = titleResourceId;
        mCommentsResourceId = commentsResourceId;
        mImageResourceId = imageResourceId;
    }

    public int getmTitleResourceId() {
        return mTitleResourceId;
    }

    public int getmCommentsResourceId() {
        return mCommentsResourceId;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

}