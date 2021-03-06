package com.example.horizon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class Manger extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public Manger(Context context) {
        this.context = context;
    }

    //Arraysss

    public int slidearr[]={
            R.drawable.eventparty,
            R.drawable.images1,
            R.drawable.image
    };

    public String heading[]={
            "Artifical Seminar online",
            "Android   online",
            " Web Development  online"

    };
    public String des[]={
            "It should also include some sort of thank you to your attendees. A lot of people only think to thank their audience at the end of the webinar, but it’s just as important to say it up front. After all, these people are taking time out of their day to attend your webinar, you want to make sure they feel appreciated up front. This will make them more likely to watch the whole thing, and it will also make them more likely to engage with things like polls, Q&A and surveys.",
            "It should also include some sort of thank you to your attendees. A lot of people only think to thank their audience at the end of the webinar, but it’s just as important to say it up front. After all, these people are taking time out of their day to attend your webinar, you want to make sure they feel appreciated up front. This will make them more likely to watch the whole thing, and it will also make them more likely to engage with things like polls, Q&A and surveys.",
            " It should also include some sort of thank you to your attendees. A lot of people only think to thank their audience at the end of the webinar, but it’s just as important to say it up front. After all, these people are taking time out of their day to attend your webinar, you want to make sure they feel appreciated up front. This will make them more likely to watch the whole thing, and it will also make them more likely to engage with things like polls, Q&A and surveys."

    };
    @Override
    public int getCount() {
        return heading.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==(RelativeLayout)object;
    }
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.slide_layout2,container,false);
        ImageView imageView=view.findViewById(R.id.imageview2);
    TextView textView=view.findViewById(R.id.compttitle);
    TextView textView1=view.findViewById(R.id.comptdes);
    textView.setText(heading[position]);
    textView1.setText(des[position]);
        imageView.setImageResource(slidearr[position]);
        container.addView(view);

     return view;


    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
