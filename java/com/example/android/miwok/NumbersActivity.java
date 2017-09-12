package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);





        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one","lutti",R.drawable.number_one,R.raw.number_one));
        words.add(new Word("two","lutti",R.drawable.number_two,R.raw.number_two));
        words.add(new Word("three","lutti",R.drawable.number_three,R.raw.number_three));
        words.add(new Word("four","lutti",R.drawable.number_four,R.raw.number_four));
        words.add(new Word("five","lutti",R.drawable.number_five,R.raw.number_five));
        words.add(new Word("six","lutti",R.drawable.number_six,R.raw.number_six));
        words.add(new Word("seven","lutti",R.drawable.number_seven,R.raw.number_six));
        words.add(new Word("eight","lutti",R.drawable.number_eight,R.raw.number_seven));
        words.add(new Word("nine","lutti",R.drawable.number_nine,R.raw.number_eight));




        WordAdapter Adapter = new WordAdapter(this, words,R.color.category_numbers);//simple_list_item_1 is predefined layout in android

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);
    }







}
