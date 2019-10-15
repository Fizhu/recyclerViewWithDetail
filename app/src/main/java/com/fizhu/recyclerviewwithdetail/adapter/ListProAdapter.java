package com.fizhu.recyclerviewwithdetail.adapter;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.RequestOptions;
import com.fizhu.recyclerviewwithdetail.DetailActivity;
import com.fizhu.recyclerviewwithdetail.R;
import com.fizhu.recyclerviewwithdetail.model.ProcessorIntel;
import com.fizhu.recyclerviewwithdetail.util.CustomOnItemClickListener;

import java.util.ArrayList;

/**
 * Created by fizhu on 05,September,2019
 */
public class ListProAdapter extends RecyclerView.Adapter<ListProAdapter.ListViewHolder> {

    public ListProAdapter(Context context) {
        this.context = context;
    }

    private Context context;

    private ArrayList<ProcessorIntel> listPro;

    public ArrayList<ProcessorIntel> getListPro() {
        return listPro;
    }

    public void setListPro(ArrayList<ProcessorIntel> listPro) {
        this.listPro = listPro;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_items_processor, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder listViewHolder, final int i) {
        final ProcessorIntel processorIntel = getListPro().get(i);

        listViewHolder.namaPro.setText(processorIntel.getNamaPro());
        listViewHolder.tahunPro.setText(processorIntel.getTahun());
        Glide.with(listViewHolder.itemView.getContext())
                .load(processorIntel.getFoto())
                .apply(new RequestOptions().override(300, 300))
                .into(listViewHolder.img);

        listViewHolder.rl.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                ProcessorIntel p = getListPro().get(position);
                Intent i = new Intent(context, DetailActivity.class);
                i.putExtra("PRO_KEY", p);
                context.startActivity(i);
            }
        }));

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
