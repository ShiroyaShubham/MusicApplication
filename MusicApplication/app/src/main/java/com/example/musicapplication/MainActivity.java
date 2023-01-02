package com.example.musicapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.musicapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        intiView();
    }

    private void intiView() {
        binding.library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lib=new Intent(MainActivity.this,LibraryActivity.class);
                startActivity(lib);
            }
        });
        binding.music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mus=new Intent(MainActivity.this,MusicActivity.class);
                startActivity(mus);
            }
        });binding.search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ser=new Intent(MainActivity.this,SearchActivity.class);
                startActivity(ser);
            }
        });
    }
}