package com.fizhu.recyclerviewwithdetail.adapter;

import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.RequestOptions;
import com.fizhu.recyclerviewwithdetail.R;
import com.fizhu.recyclerviewwithdetail.model.ProcessorIntel;

import java.util.ArrayList;

/**
 * Created by fizhu on 05,September,2019
 */
public class ListProAdapter extends RecyclerView.Adapter<ListProAdapter.ListViewHolder> {

    private ArrayList<ProcessorIntel> listPro;

    public ListProAdapter(ArrayList<ProcessorIntel> listPro) {
        this.listPro = listPro;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_items_processor, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder listViewHolder, int i) {
        ProcessorIntel processorIntel = listPro.get(i);

        listViewHolder.namaPro.setText(processorIntel.getNamaPro());
        listViewHolder.tahunPro.setText(processorIntel.getTahun());
        Glide.with(listViewHolder.itemView.getContext())
                .load(processorIntel.getFoto())
                .apply(new RequestOptions().override(200, 200))
                .into(listViewHolder.img);

    }

    @Override
    public int getItemCount() {
        return listPro.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView namaPro, tahunPro;
        RelativeLayout rl;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img_foto);
            namaPro = itemView.findViewById(R.id.tv_namaPro);
            tahunPro = itemView.findViewById(R.id.tv_tahun);
            rl = itemView.findViewById(R.id.pro_item);

        }
    }
}
