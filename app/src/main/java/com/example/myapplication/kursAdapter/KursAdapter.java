package com.example.myapplication.kursAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.List;

public class KursAdapter extends RecyclerView.Adapter<KursAdapter.kursAdapterVH> {
    List<Kurs> kursList;
    LayoutInflater layoutInflater;

    public KursAdapter(Context context, List<Kurs> kursList) {
        this.layoutInflater = layoutInflater.from(context);
        this.kursList = kursList;
    }

    @NonNull
    @Override
    public KursAdapter.kursAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new kursAdapterVH(layoutInflater.inflate(R.layout.kurs_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull KursAdapter.kursAdapterVH holder, int position) {
        Kurs kurs = kursList.get(position);
        holder.one.setText(kurs.getBuy());
    }

    @Override
    public int getItemCount() {
        return kursList.size();
    }

    public class kursAdapterVH extends RecyclerView.ViewHolder {
        TextView one, two, three, four, five;
        public kursAdapterVH(@NonNull View itemView) {
            super(itemView);
            one = itemView.findViewById(R.id.buy);
        }
    }
}
