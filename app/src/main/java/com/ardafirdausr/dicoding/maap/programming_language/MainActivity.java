package com.ardafirdausr.dicoding.maap.programming_language;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.ardafirdausr.dicoding.maap.programming_language.adapter.ProgrammingLanguageAdapter;
import com.ardafirdausr.dicoding.maap.programming_language.database.FakeDatabase;
import com.ardafirdausr.dicoding.maap.programming_language.model.ProgrammingLanguage;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActionBar actionBar;
    RecyclerView rvProgrammingLanguage;
    ArrayList<ProgrammingLanguage> programmingLanguages;
    ProgrammingLanguageAdapter rvProgrammingLanguageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionBar = getSupportActionBar();

        programmingLanguages = new ArrayList<ProgrammingLanguage>();
        programmingLanguages.addAll(FakeDatabase.getListData());
        rvProgrammingLanguage = findViewById(R.id.rv_programming_languages);
        showRecycleView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void showRecycleView(){
        ProgrammingLanguageAdapter programmingLanguageAdapter = new ProgrammingLanguageAdapter(programmingLanguages);
        programmingLanguageAdapter.setOnItemClickCallback(new ProgrammingLanguageAdapter.OnItemClickCallback(){
            @Override
            public void onItemClicked(ProgrammingLanguage programmingLanguage) {
                showDetailActivity(programmingLanguage);
            }
        });

        rvProgrammingLanguage.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rvProgrammingLanguage.setAdapter(programmingLanguageAdapter);
    }

    public void showDetailActivity(ProgrammingLanguage programmingLanguage){
        Intent navigateToDetailActivity = new Intent(MainActivity.this, DetailActivity.class);
        navigateToDetailActivity.putExtra("programmingLanguage", programmingLanguage);
        startActivity(navigateToDetailActivity);
    }

    public void showAboutActivity(){
        Intent navigateToAboutActivity = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(navigateToAboutActivity);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.menu_item_user:
                showAboutActivity();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
