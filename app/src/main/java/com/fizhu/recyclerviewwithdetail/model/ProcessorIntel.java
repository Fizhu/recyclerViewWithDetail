package com.fizhu.recyclerviewwithdetail.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by fizhu on 27,August,2019
 */
public class ProcessorIntel implements Parcelable {
    private String namaPro, tahun, foto, clock, speed, detail;


    public ProcessorIntel() {
    }

    protected ProcessorIntel(Parcel in) {
        namaPro = in.readString();
        tahun = in.readString();
        foto = in.readString();
        clock = in.readString();
        speed = in.readString();
        detail = in.readString();
    }

    public static final Creator<ProcessorIntel> CREATOR = new Creator<ProcessorIntel>() {
        @Override
        public ProcessorIntel createFromParcel(Parcel in) {
            return new ProcessorIntel(in);
        }

        @Override
        public ProcessorIntel[] newArray(int size) {
            return new ProcessorIntel[size];
        }
    };

    public String getNamaPro() {
        return namaPro;
    }

    public void setNamaPro(String namaPro) {
        this.namaPro = namaPro;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getClock() {
        return clock;
    }

    public void setClock(String clock) {
        this.clock = clock;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(namaPro);
        dest.writeString(tahun);
        dest.writeString(foto);
        dest.writeString(clock);
        dest.writeString(speed);
        dest.writeString(detail);
    }
}
