package com.example.horizon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {


    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navbar);

        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentcontainer, new Home()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectfrag = null;
            switch (item.getItemId()) {
                case R.id.nav_deals:
                    selectfrag = new Home();
                    break;

                case R.id.nav_partners:
                    selectfrag = new Event();
                    break;
                case R.id.nav_partnersffdd:
                    selectfrag = new profile();
                    break;
                case R.id.nav_partnersfqqf:
                    selectfrag = new star();
                    break;
                case R.id.nav_partnersffdd1:
                    selectfrag = new star();
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentcontainer, selectfrag).commit();
            return true;
        }
    };



}