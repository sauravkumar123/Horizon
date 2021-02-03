package com.example.horizon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class adapter extends RecyclerView.Adapter<adapter.viewholder>{

private String names[];

    private String num[];

    private String email[];
private Context context;

    public adapter(String[] names, String[] num, String[] email, Context context) {
        this.names = names;
        this.num = num;
        this.email = email;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.mylayout,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
holder.textView.setText(names[position]);
holder.email.setText(email[position]);
holder.num.setText(email[position]);

    }
    @Override
    public int getItemCount() {
        return names.length;
    }

    class viewholder extends RecyclerView.ViewHolder {

        ImageView imageView;
       TextView textView;
        TextView email;
        TextView num;
        public viewholder(@NonNull View itemView) {


            super(itemView);
            imageView=itemView.findViewById(R.id.imag1);
            textView=itemView.findViewById(R.id.names);
            num=itemView.findViewById(R.id. numbers);
            email=itemView.findViewById(R.id.emails);
        }
    }


}
