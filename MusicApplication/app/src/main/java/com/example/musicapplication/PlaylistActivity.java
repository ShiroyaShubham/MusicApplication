package com.example.musicapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.musicapplication.databinding.ActivityPlaylistBinding;

public class PlaylistActivity extends AppCompatActivity {

    ActivityPlaylistBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityPlaylistBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        intiView();
    }

    private void intiView() {
        binding.txtrecntlyadded.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recadd=new Intent(PlaylistActivity.this,LibraryActivity.class);
                startActivity(recadd);
                finish();
            }
        });
        binding.library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent library=new Intent(PlaylistActivity.this,LibraryActivity.class);
                startActivity(library);
                finish();
            }
        });
        binding.music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent music=new Intent(PlaylistActivity.this,MusicActivity.class);
                startActivity(music);
                finish();
            }
        });
        binding.search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ser=new Intent(PlaylistActivity.this,SearchActivity.class);
                startActivity(ser);
                finish();
            }
        });
    }
}