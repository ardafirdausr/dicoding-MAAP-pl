package com.ardafirdausr.dicoding.maap.programming_language;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.w3c.dom.Text;

public class AboutActivity extends AppCompatActivity {

    ImageView ivPhoto;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        ivPhoto = (ImageView) findViewById(R.id.ci_photo);
        Glide.with(this)
                .load("https://www.dicoding.com/images/small/avatar/20190531153737e910429e6a72fb9c014ecdbc5574d339.jpg")
                .apply(new RequestOptions().override(150, 150))
                .into(ivPhoto);
    }
}
