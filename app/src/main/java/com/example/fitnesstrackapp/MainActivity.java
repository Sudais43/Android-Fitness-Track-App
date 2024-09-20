package com.example.fitnesstrackapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.fitnesstrackapp.Fragments.HomeFragment;
import com.example.fitnesstrackapp.Fragments.LearnFragment;
import com.example.fitnesstrackapp.Fragments.ProfileFragment;
import com.example.fitnesstrackapp.Fragments.TrackFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    final FragmentManager mfragmentManager = getSupportFragmentManager();

    private static final int ACTION_HOME = R.id.action_home;
    private static final int ACTION_LEARN = R.id.action_learn;

    private static final  int ACTION_TRACK = R.id.action_track;

    private static final int ACTION_PROFILE = R.id.action_profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.BottomNavigation);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment=null;
                switch (menuItem.getItemId()){

                    case ACTION_HOME:
                        fragment = new HomeFragment();
                        break;
                    case ACTION_LEARN:
                        fragment = new LearnFragment();
                        break;

                    case ACTION_TRACK:
                        fragment = new TrackFragment();
                        break;

                    case ACTION_PROFILE:
                        fragment = new ProfileFragment();
                        break;

                    default:
                        break;
                }
                mfragmentManager.beginTransaction().replace(R.id.f1Container, Objects.requireNonNull(fragment)).commit();
                return true;
            }
        });

        bottomNavigationView.setSelectedItemId(R.id.action_home);
    }
}