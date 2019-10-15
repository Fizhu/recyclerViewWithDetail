package com.fizhu.recyclerviewwithdetail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.fizhu.recyclerviewwithdetail.model.ProcessorIntel;

public class DetailActivity extends AppCompatActivity {

    ImageView img;
    TextView nama, tahun, speed, clock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ProcessorIntel processorIntel = getIntent().getParcelableExtra("PRO_KEY");

        img = findViewById(R.id.foto);
        nama = findViewById(R.id.tv_nama);
        tahun = findViewById(R.id.tv_tahunPro);
        speed = findViewById(R.id.tvSpeed);
        clock = findViewById(R.id.tvClock);

        nama.setText(processorIntel.getNamaPro());
        tahun.setText(processorIntel.getTahun());
        speed.setText(processorIntel.getSpeed());
        clock.setText(processorIntel.getClock());

        Glide.with(this)
                .load(processorIntel.getFoto())
                .apply(new RequestOptions().override(400, 400))
                .into(img);

    }
}
