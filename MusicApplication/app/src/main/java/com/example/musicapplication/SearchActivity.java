package com.example.musicapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.musicapplication.databinding.ActivitySearchBinding;

public class SearchActivity extends AppCompatActivity {
    ActivitySearchBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySearchBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        intiView();
    }

    private void intiView() {
        binding.library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lib=new Intent(SearchActivity.this,LibraryActivity.class);
                startActivity(lib);
                finish();
            }
        });
        binding.music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mus=new Intent(SearchActivity.this,MusicActivity.class);
                startActivity(mus);
                finish();
            }
        });
    }
}