package com.example.uts118228032v.BahasaDaerah;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Bader {
    @SerializedName("nomor")
    @Expose
    private int nomor;
    @SerializedName("bahasa")
    @Expose
    private String bahasa;
    @SerializedName("listWilayah")
    @Expose
    private List<String> listWilayah;
    @SerializedName("listProvinsi")
    @Expose
    private List<ListProvinsi> listProvinsi;

    public int getNomor() {
        return nomor;
    }

    public void setNomor(int nomor) {
        this.nomor = nomor;
    }

    public String getBahasa() {
        return bahasa;
    }

    public void setBahasa(String bahasa) {
        this.bahasa = bahasa;
    }

    public List<String> getListWilayah() {
        return listWilayah;
    }

    public void setListWilayah(List<String> listWilayah) {
        this.listWilayah = listWilayah;
    }

    public List<ListProvinsi> getListProvinsi() {
        return listProvinsi;
    }

    public void setListProvinsi(List<ListProvinsi> listProvinsi) {
        this.listProvinsi = listProvinsi;
    }
}
