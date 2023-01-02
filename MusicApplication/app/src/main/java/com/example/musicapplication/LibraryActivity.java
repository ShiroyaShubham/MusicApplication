package com.example.musicapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.musicapplication.databinding.ActivityLibraryBinding;

public class LibraryActivity extends AppCompatActivity {
    LinearLayout music;
    ActivityLibraryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityLibraryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        intiView();
    }

    private void intiView() {
        binding.music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mus=new Intent(LibraryActivity.this,MusicActivity.class);
                startActivity(mus);
            }
        });binding.search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ser=new Intent(LibraryActivity.this,SearchActivity.class);
                startActivity(ser);
                finish();
            }
        });
        binding.txtplaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent play=new Intent(LibraryActivity.this,PlaylistActivity.class);
                startActivity(play);
                finish();
            }
        });
    }
}