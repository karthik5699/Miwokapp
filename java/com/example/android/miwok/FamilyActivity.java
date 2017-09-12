package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father","wettiti",R.drawable.family_father,R.raw.family_father));
        words.add(new Word("mother","wettiti",R.drawable.family_mother,R.raw.family_father));
        words.add(new Word("brother","wettiti",R.drawable.family_older_brother,R.raw.family_father));
        words.add(new Word("sister","wettiti",R.drawable.family_older_sister,R.raw.family_father));
        words.add(new Word("grandfather","wettiti",R.drawable.family_grandfather,R.raw.family_father));
        words.add(new Word("grandmother","wettiti",R.drawable.family_grandmother,R.raw.family_father));












        WordAdapter Adapter = new WordAdapter(this, words,R.color.category_family);//simple_list_item_1 is predefined layout in android

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);
    }
}
