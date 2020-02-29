package com.android.retrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.retrofit.domain.DataItem;

import java.util.List;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.ViewHolder> {
    private Context context;
    private List<DataItem> list;

    public EmployeeAdapter(Context context, List<DataItem> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public EmployeeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.singe_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeAdapter.ViewHolder holder, int position) {
        holder.getName().setText(list.get(position).getEmployeeName());
        holder.getAge().setText(list.get(position).getEmployeeAge());
        holder.getSalary().setText(list.get(position).getEmployeeSalary());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }


        TextView getName() {
            return itemView.findViewById(R.id.txtName);
        }

        TextView getAge() {
            return itemView.findViewById(R.id.txtAge);
        }

        TextView getSalary() {
            return itemView.findViewById(R.id.txtSalary);
        }


    }

}
