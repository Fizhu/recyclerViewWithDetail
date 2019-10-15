package com.fizhu.recyclerviewwithdetail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.fizhu.recyclerviewwithdetail.adapter.ListProAdapter;
import com.fizhu.recyclerviewwithdetail.data.ProcessorIntelData;
import com.fizhu.recyclerviewwithdetail.model.ProcessorIntel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //TODO 1 Inisialisasi Variable
    private RecyclerView rvPro;
    private ArrayList<ProcessorIntel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 2 CAST VIEW dan PENGATURAN RECYCLERVIEW
        rvPro = findViewById(R.id.rv_pro);
        rvPro.setHasFixedSize(true);

        //TODO 3 MENAMBAHKAN DATA KE LIST YANG AKAN DITAMPILKAN PADA RECYCLERVIEW
        list.addAll(ProcessorIntelData.getListData());

        //TODO 5 PEMAGGILAN FUNGSI PADA TODO 4
        showRv();

    }

    //TODO 4 FUNGSI YANG BERISI PENGATURAN RECYCLERVIEW (SETUP ADAPTER, LAYOUT MANAGER)
    private void showRv() {
        rvPro.setLayoutManager(new LinearLayoutManager(this));
        ListProAdapter listProAdapter = new ListProAdapter(this);
        listProAdapter.setListPro(list);
        rvPro.setAdapter(listProAdapter);
    }
}
