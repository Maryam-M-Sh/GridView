package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieDescription extends AppCompatActivity {

    private Bundle bundle;
    private ImageView image;
    private TextView movie_title, description;
    private int grid_image;
    private String grid_title,movie_description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_description);

        image = findViewById(R.id.desc_imgView);
        movie_title = findViewById(R.id.desc_textView);
        description = findViewById(R.id.movie_desc);

        bundle = getIntent().getExtras();

        if (bundle != null) {

            grid_image = bundle.getInt("grid_img");
            grid_title = bundle.getString("grid_title");
            movie_description = bundle.getString("grid_desc");


            image.setImageResource(grid_image);
            movie_title.setText(grid_title);
            description.setText(movie_description);

        }

    }
}

//if (bundle != null){
//
//        image.setImageResource(bundle.getInt("grid_img"));
//        movie_title.setText(bundle.getString("grid_title"));
//        }