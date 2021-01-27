package com.example.myapplication.branchAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.List;

public class branchAdapter extends RecyclerView.Adapter<branchAdapter.branchAdapterVH> {
    LayoutInflater layoutInflater;
    List<Branch> branchList;

    public branchAdapter(Context context, List<Branch> branchList) {
        this.layoutInflater = layoutInflater.from(context);
        this.branchList = branchList;
    }

    @NonNull
    @Override
    public branchAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new branchAdapterVH(layoutInflater.inflate(R.layout.branch_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull branchAdapter.branchAdapterVH holder, int position) {
        Branch listBranch = branchList.get(position);
        holder.TextAddress.setText(listBranch.getAddress());
        holder.TextBankomat.setText(listBranch.getBankomat());
        holder.TextWorking.setText(listBranch.getWorking());
        holder.TextWorkingT.setText(listBranch.getWtime());
    }

    @Override
    public int getItemCount() {
        return branchList.size();
    }

    public class branchAdapterVH extends RecyclerView.ViewHolder {
        TextView TextAddress,TextBankomat,TextWorking,TextWorkingT;

        public branchAdapterVH(@NonNull View itemView) {
            super(itemView);
            TextAddress = (TextView) itemView.findViewById(R.id.address);
            TextBankomat = (TextView) itemView.findViewById(R.id.bankomat);
            TextWorking = (TextView) itemView.findViewById(R.id.working);
            TextWorkingT = (TextView) itemView.findViewById(R.id.working_time);
        }
    }
}
