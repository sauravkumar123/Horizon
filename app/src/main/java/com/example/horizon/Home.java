package com.example.horizon;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;


public class Home extends Fragment {
    private ViewPager slidepage;
    private LinearLayout linearLayout;
    private TextView[] dots;
    private SliderAdapter sliderAdapter;
    private FloatingActionButton button;
    private int currentpage = 0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View root= inflater.inflate(R.layout.fragment_home, container, false);

        slidepage = (ViewPager)root.findViewById(R.id.viewpager);
        linearLayout = (LinearLayout)root.findViewById(R.id.dotslayout);
        sliderAdapter = new SliderAdapter(getActivity());  //This Defines which slide adapter aftre new see the class
        slidepage.setAdapter(sliderAdapter);
        adddotsindicator(0);
        slidepage.addOnPageChangeListener(viewlistener);
        return root;
    }
    public void adddotsindicator(int j) {
        dots = new TextView[3];
        linearLayout.removeAllViews();
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(getActivity());
            dots[i].setText(Html.fromHtml("&#8226;"));
            dots[i].setTextSize(35);
            dots[i].setTextColor(getResources().getColor(R.color.black));
            linearLayout.addView(dots[i]);
        }
        if (dots.length > 0) {
            dots[j].setTextColor(getResources().getColor(R.color.yellow));
        }
    }

    ViewPager.OnPageChangeListener viewlistener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            adddotsindicator(position);
            currentpage = position;

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}