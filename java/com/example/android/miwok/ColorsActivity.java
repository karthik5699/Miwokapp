package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red","wettiti",R.drawable.color_red,R.raw.color_red));
        words.add(new Word("black","wettiti",R.drawable.color_black,R.raw.color_black));
        words.add(new Word("brown","wettiti",R.drawable.color_brown,R.raw.color_brown));
        words.add(new Word("green","wettiti",R.drawable.color_green,R.raw.color_green));
        words.add(new Word("yellow","wettiti",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        words.add(new Word("gray","wettiti",R.drawable.color_gray,R.raw.color_gray));











        WordAdapter Adapter = new WordAdapter(this, words, R.color.category_colors);//simple_list_item_1 is predefined layout in android

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);
        Log.i("error","colors");
    }

}
