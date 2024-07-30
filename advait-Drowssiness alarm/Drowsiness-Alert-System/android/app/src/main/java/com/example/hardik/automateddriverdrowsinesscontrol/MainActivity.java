package com.example.hardik.automateddriverdrowsinesscontrol;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends FragmentActivity implements NavigationView.OnNavigationItemSelectedListener {

    FrameLayout frame;
    Button agree, disagree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Drowsiness Alert App");
        frame = (FrameLayout) findViewById(R.id.frame);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new MonitorMenu()).commit();



    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}