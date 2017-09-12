package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one","lutti"));
        words.add(new Word("two","lutti"));
        words.add(new Word("three","lutti"));
        words.add(new Word("four","lutti"));
        words.add(new Word("five","lutti"));
        words.add(new Word("six","lutti"));
        words.add(new Word("seven","lutti"));
        words.add(new Word("eight","lutti"));
        words.add(new Word("nine","lutti"));




        WordAdapter Adapter = new WordAdapter(this, words,R.color.category_phrases);//simple_list_item_1 is predefined layout in android

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);
    }
}
