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
    private final LayoutInflater inflater;
    private final List<Branch> brlists;

    public branchAdapter(Context context, List<Branch> brlists) {
        this.inflater = LayoutInflater.from(context);
        this.brlists = brlists;
    }

    @NonNull
    @Override
    public branchAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.branch_item, parent, false);
        return new branchAdapterVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull branchAdapterVH holder, int position) {
        Branch listBranch = brlists.get(position);
        holder.TextAddress.setText(listBranch.getAddress());
        holder.TextBankomat.setText(listBranch.getBankomat());
        holder.TextWorking.setText(listBranch.getWorking());
        holder.TextWorkingT.setText(listBranch.getWtime());
    }

    @Override
    public int getItemCount() {
        return brlists.size();
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
