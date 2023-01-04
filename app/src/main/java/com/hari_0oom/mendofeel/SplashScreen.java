package com.hari_0oom.mendofeel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.hari_0oom.mendofeel.databinding.ActivitySplashScreenBinding;

public class SplashScreen extends AppCompatActivity {
ActivitySplashScreenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySplashScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        binding.logo.animate().scaleX(1.5f).scaleY(1.5f).alpha(0.9f).setDuration(1900);

        Thread t= new Thread(){
            @Override
            public void run() {
                try{
                    sleep(2000);
                }catch(Exception e){
                    Toast.makeText(SplashScreen.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }finally {
                    startActivity(new Intent(SplashScreen.this, MainActivity.class));
                    finish();
                }
            }
        };
        t.start();


    }
}