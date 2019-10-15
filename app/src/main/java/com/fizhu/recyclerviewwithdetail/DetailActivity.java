package com.fizhu.recyclerviewwithdetail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.fizhu.recyclerviewwithdetail.model.ProcessorIntel;

public class DetailActivity extends AppCompatActivity {


    //TODO 1 INISIALISASI VARIABLE
    ImageView img;
    TextView nama, tahun, speed, clock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //TODO 3 MENGAMBIL DATA INTENT YANG DIKIRIM DARI MAINACTIVITY
        ProcessorIntel processorIntel = getIntent().getParcelableExtra("PRO_KEY");

        //TODO 2 CAST VIEW SEMUA ITEM
        img = findViewById(R.id.foto);
        nama = findViewById(R.id.tv_nama);
        tahun = findViewById(R.id.tv_tahunPro);
        speed = findViewById(R.id.tvSpeed);
        clock = findViewById(R.id.tvClock);

        //TODO 4 MENAMPILKAN DATA INTENT PADA MASING MASING TEXTVIEW
        nama.setText(processorIntel.getNamaPro());
        tahun.setText(processorIntel.getTahun());
        speed.setText(processorIntel.getSpeed());
        clock.setText(processorIntel.getClock());

        //TODO 5 MENAMPILKAN FOTO DENGAN LIBRARY GLIDE KE IMAGEVIEW
        Glide.with(this)
                .load(processorIntel.getFoto())
                .apply(new RequestOptions().override(400, 400))
                .into(img);

    }
}
