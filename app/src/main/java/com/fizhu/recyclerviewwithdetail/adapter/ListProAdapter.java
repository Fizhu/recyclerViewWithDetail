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

    // TODO 3 BUAT CONSTRUCTOR Context
    public ListProAdapter(Context context) {
        this.context = context;
    }

    // TODO 1 DEKLARASI VARIABLE buat Context dan ArrayList buat nampung datanya
    private Context context;

    private ArrayList<ProcessorIntel> listPro;

    // TODO 2 BUAT GETTER SETTER LIST
    public ArrayList<ProcessorIntel> getListPro() {
        return listPro;
    }

    public void setListPro(ArrayList<ProcessorIntel> listPro) {
        this.listPro = listPro;
    }


    // TODO 4 HUBUNGKAN KE LAYOUT LIST NYA (BUKAN LAYOUT ACTIVITY !!!!)
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_items_processor, viewGroup, false);
        return new ListViewHolder(view);
    }


    //TODO 7 FUNGSIIN SEMUA ITEM YANG BAKAL DIISI SAMA DATA
    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder listViewHolder, final int i) {
        // TODO 8 BUAT VARIABLE BuAT NYIMPEN DATA BERDASARKAN POSISI (JADI CUMA 1 DATA BUKAN SEMUA LIST)
        final ProcessorIntel processorIntel = getListPro().get(i);

        // TODO 9 MASUKIN DATA NYA KE MASING MASING TEXTVIEW
        listViewHolder.namaPro.setText(processorIntel.getNamaPro());
        listViewHolder.tahunPro.setText(processorIntel.getTahun());

        // TODO 10 NAMPILIN GAMBAR PAKE LIBRARY GLIDE
        Glide.with(listViewHolder.itemView.getContext())
                .load(processorIntel.getFoto())
                .apply(new RequestOptions().override(300, 300))
                .into(listViewHolder.img);

        //TODO 11 MENGATUR ClickListener Layout list biar bisa di click nampilin detail
        listViewHolder.rl.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                // TODO 12 MASUKIN LAGI 1 DATA KE VARIABLE BUAT DIKIRIM KE DETAIL ACTIVITY
                ProcessorIntel p = getListPro().get(position);

                // TODO 13 KIRIM DATA PAKE INTENT KE DETAIL ACTIVITY
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

        //TODO 5 DEKLARASI SEMUA ITEM YANG DIGUNAIN DI LIST
        ImageView img;
        TextView namaPro, tahunPro;
        RelativeLayout rl;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            //TODO 6 CAST VIEW SEMUA ITEM
            img = itemView.findViewById(R.id.img_foto);
            namaPro = itemView.findViewById(R.id.tv_namaPro);
            tahunPro = itemView.findViewById(R.id.tv_tahun);
            rl = itemView.findViewById(R.id.pro_item);

        }
    }
}
