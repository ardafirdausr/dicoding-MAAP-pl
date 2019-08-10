package com.ardafirdausr.dicoding.maap.programming_language;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.ardafirdausr.dicoding.maap.programming_language.model.ProgrammingLanguage;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {

    TextView name, shareRate, description;
    ImageView image;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        name = (TextView) findViewById(R.id.tv_name);
        shareRate= (TextView) findViewById(R.id.tv_share_rate);
        description = (TextView) findViewById(R.id.tv_description);
        image = (ImageView) findViewById(R.id.iv_image);

        Bundle intentExtra = getIntent().getExtras();
        ProgrammingLanguage programmingLanguage = (ProgrammingLanguage) intentExtra.getSerializable("programmingLanguage");
        setDataToView(programmingLanguage);
    }

    public void setDataToView(ProgrammingLanguage programmingLanguage){
        name.setText(programmingLanguage.getName());
        shareRate.setText(Float.toString(programmingLanguage.getShareRate()) + " %");
        description.setText(programmingLanguage.getDescription());
        Glide.with(this)
                .load(programmingLanguage.getImage())
                .apply(new RequestOptions().override(150, 150))
                .into(image);
    }

}
