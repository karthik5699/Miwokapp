package com.example.android.miwok;

/**
 * Created by karthiksingh on 2017-08-28.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private static final int NO_IMAGE_RESOURCE=-1;
    private int resource_id = NO_IMAGE_RESOURCE;
    private int songid;


    public Word(String mDefaultTranslation, String mMiwokTranslation ) {

        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;

    }

    public Word(String mDefaultTranslation, String mMiwokTranslation , int resource,int song) {

        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.resource_id=resource;
        this.songid=song;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }
    public int getimageid(){
        return resource_id;
    }

    public boolean has_image(){
        return (resource_id!=-1 );
    }
    public int getSongid(){
        return songid;
    }
}
