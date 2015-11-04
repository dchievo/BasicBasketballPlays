package com.tenchichrono.basicbasketballplays.ui;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.tenchichrono.basicbasketballplays.R;
import com.tenchichrono.basicbasketballplays.model.Play;
import com.tenchichrono.basicbasketballplays.model.PlayBook;

public class MainPlaysMenu extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plays_list);

        PlayBook playBook = new PlayBook();

        ArrayAdapter<Play> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, playBook.getPlayBook());
        setListAdapter(adapter);
    }

}
