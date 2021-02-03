package com.example.horizon;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

public class webinar extends Fragment {
    private ViewPager slidepage;
    private LinearLayout linearLayout;
    private TextView[] dots;
    private Manger sliderAdapter;
    private ImageView backtoevent;
    private int currentpage = 0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root= inflater.inflate(R.layout.webinar, container, false);
        slidepage = (ViewPager)root.findViewById(R.id.viewpager1);
        //back to event

        backtoevent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new Event();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentcontainer, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        //back to event finsh
        linearLayout = (LinearLayout)root.findViewById(R.id.dotslayout1);
            sliderAdapter =new Manger(getActivity());
        slidepage.setAdapter(sliderAdapter);
        adddotsindicator(0);
        slidepage.addOnPageChangeListener(viewlistener);
        return root;
    }

    private void adddotsindicator(int j) {
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
