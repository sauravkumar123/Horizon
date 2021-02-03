package com.example.horizon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class adapter2 extends RecyclerView.Adapter<adapter2.viewholder>{

private String names[];
private String dates[];

private Context context;

    public adapter2(String[] names, String[] dates ,Context context) {
        this.names = names;
        this.dates = dates;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.mylayout2,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
holder.textView.setText(names[position]);
holder.textView1.setText(dates[position]);
holder.itemView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        
    }
});

    }
    @Override
    public int getItemCount() {
        return names.length;
    }

    class viewholder extends RecyclerView.ViewHolder {

       TextView textView;
        TextView textView1;

        public viewholder(@NonNull View itemView) {


            super(itemView);
            textView=itemView.findViewById(R.id.startetxt1);
            textView1=itemView.findViewById(R.id.startext2);

        }
    }


}
