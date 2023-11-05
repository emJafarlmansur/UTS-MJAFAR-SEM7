package com.example.uts118228032v.BahasaDaerah;
import java.util.List;
import javax.annotation.processing.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")


public class ListProvinsi {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("provinsi")
    @Expose
    private String provinsi;
    @SerializedName("deskripsi")
    @Expose
    private List<String> deskripsi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public List<String> getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(List<String> deskripsi) {
        this.deskripsi = deskripsi;
    }

}