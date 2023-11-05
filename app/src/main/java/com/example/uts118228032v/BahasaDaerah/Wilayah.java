package com.example.uts118228032v.BahasaDaerah;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wilayah {
    @SerializedName("willayah")
    @Expose
    private String itemwilayah;

    public String getItemwilayah() {
        return itemwilayah;
    }

    public void setItemwilayah(String itemwilayah) {
        this.itemwilayah = itemwilayah;
    }
}
