package com.example.myapplication.BranchAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.List;

public class BranchAdapter extends RecyclerView.Adapter<BranchAdapter.BranchAdapterVH> {
    LayoutInflater layoutInflater;
    List<Branch> courseList;

    public BranchAdapter(Context context, List<Branch> courseList) {
        this.layoutInflater = layoutInflater.from(context);
        this.courseList = courseList;
    }

    @NonNull
    @Override
    public BranchAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BranchAdapterVH(layoutInflater.inflate(R.layout.course_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BranchAdapter.BranchAdapterVH holder, int position) {
        Branch course = courseList.get(position);

        holder.name.setText(course.getAddress());
        holder.lastName.setText(course.getBankomat());
        holder.textBuy.setText(course.getWorking());
        holder.textSell.setText(course.getWtime());
    }

    @Override
    public int getItemCount() {
        return courseList.size();
    }

    public class BranchAdapterVH extends RecyclerView.ViewHolder {
        TextView name, lastName, textBuy, textSell;

        public BranchAdapterVH(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name_course);
            lastName = itemView.findViewById(R.id.nameLast_course);
            textBuy = itemView.findViewById(R.id.tvBuy);
            textSell = itemView.findViewById(R.id.tvSell);
        }
    }
}
