package com.example.android.miwok;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by karthiksingh on 2017-08-28.
 */

public class WordAdapter extends ArrayAdapter<Word>{

    private int mcolorid;
    private int msongid = 0;


    public WordAdapter(Activity context, ArrayList<Word> words,int colorid){
        super(context, 0, words);
        mcolorid = colorid;


    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
       View listItemView = convertView;
        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);// if listitemview is null that is there is no view then dont show it on the screen
        }

        Word currentWord = getItem(position);

        TextView currentText = (TextView) listItemView.findViewById(R.id.miwok);

        currentText.setText(currentWord.getmMiwokTranslation());


        TextView currentmText = (TextView) listItemView.findViewById(R.id.etext);

        currentmText.setText(currentWord.getmDefaultTranslation());




        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imagemiwok);

        if(currentWord.has_image()) {




            imageView.setImageResource(currentWord.getimageid());
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);//view.gone hides the image and the image does not take any space whereas view.invisible just hides it
        }
        msongid = currentWord.getSongid();

        if(msongid!=0) {
            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), currentWord.getSongid());

            currentText.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.start();
                }
            });
        }

        LinearLayout linearLayout1 = (LinearLayout) listItemView.findViewById(R.id.task);

        int color = ContextCompat.getColor(getContext(),mcolorid);

        linearLayout1.setBackgroundColor(color);

        return  listItemView;


    }


}
