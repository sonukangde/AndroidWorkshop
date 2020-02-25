package com.android.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.CarHolder> {
    private Context context;
    private List<CarName> list;

    public CarAdapter(Context context, List<CarName> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public CarHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.single_card,parent,false);

        return new CarHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull CarHolder holder, int position) {

        holder.getName().setText(list.get(position).getName());
        holder.getImage().setImageResource(list.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class CarHolder extends RecyclerView.ViewHolder {


        public CarHolder(@NonNull View itemView) {
            super(itemView);
        }

        TextView getName(){

            return itemView.findViewById(R.id.textView);

        }

        ImageView getImage(){
            return  itemView.findViewById(R.id.imageView);
        }
    }


}
