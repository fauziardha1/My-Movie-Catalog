package com.example.mymoviecatalog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //data manual
    private String[] listOfMovie = {"a star",
                        "aquaman",
                        "avenger infinity war",
                        "birdbox",
                        "bohemian",
                        "bumblebee",
                        "creed",
                        "deadpool",
                        "dragon",
                        "dragon ball",
                        "glass",
                        "hunter killer",
                        "marry poins",
                        "mortal engines",
                        "preman",
                        "robinhood",
                        "spiderman",
                        "the girl",
                        "the mule",
                        "venom"
                    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvMovie = findViewById(R.id.lvMovie);

        ArrayAdapter<String> adapter  = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_2,android.R.id.text1,listOfMovie);
        lvMovie.setAdapter(adapter);
    }
}
