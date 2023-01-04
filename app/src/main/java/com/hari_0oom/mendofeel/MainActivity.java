package com.hari_0oom.mendofeel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.hari_0oom.mendofeel.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        binding.vid.setVideoPath();
    }
}