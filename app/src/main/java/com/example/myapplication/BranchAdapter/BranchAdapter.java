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
    List<Branch> branchList;

    public BranchAdapter(Context context, List<Branch> branchList) {
        this.layoutInflater = layoutInflater.from(context);
        this.branchList = branchList;
    }

    @NonNull
    @Override
    public BranchAdapter.BranchAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BranchAdapterVH(layoutInflater.inflate(R.layout.branch_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BranchAdapter.BranchAdapterVH holder, int position) {
        Branch branch = branchList.get(position);

        holder.address.setText(branch.getAddress());
        holder.bankomat.setText(branch.getBankomat());
        holder.working.setText(branch.getWorking());
        holder.tworking.setText(branch.getWtime());
    }

    @Override
    public int getItemCount() {
        return branchList.size();
    }

    public class BranchAdapterVH extends RecyclerView.ViewHolder {
        TextView address, bankomat, working, tworking;

        public BranchAdapterVH(@NonNull View itemView) {
            super(itemView);
            address = itemView.findViewById(R.id.address);
            bankomat = itemView.findViewById(R.id.bankomat);
            working = itemView.findViewById(R.id.working);
            tworking = itemView.findViewById(R.id.working_time);
        }
    }
}
