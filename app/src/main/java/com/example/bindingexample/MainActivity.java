package com.example.bindingexample;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onViewBindingClicked(View v) {
        getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer, new ViewBindingFragment()).addToBackStack("ViewBindingFragment").commit();
    }

    public void onDataBindingClicked(View v) {
        getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer, new DataBindingFragment()).addToBackStack("DataBindingFragment").commit();
    }
}
