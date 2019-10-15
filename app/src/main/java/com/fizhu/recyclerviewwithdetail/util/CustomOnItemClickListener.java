package com.fizhu.recyclerviewwithdetail.util;

import android.view.View;


//TODO 1 COPAS AJA INI SEMUA GA PERLU DIJELASIN
// INI CLASS BUAT ITEM CLICK LISTENER DI RECYCLERVIEW
public class CustomOnItemClickListener implements View.OnClickListener {

    public static Object OnItemClickCallback;
    private int position;
    private OnItemClickCallback onItemClickCallback;

    public CustomOnItemClickListener(int position, OnItemClickCallback onItemClickCallback) {
        this.position = position;
        this.onItemClickCallback = onItemClickCallback;
    }
    @Override
    public void onClick(View view) {
        onItemClickCallback.onItemClicked(view, position);
    }
    public interface OnItemClickCallback {
        void onItemClicked(View view, int position);
    }
}
