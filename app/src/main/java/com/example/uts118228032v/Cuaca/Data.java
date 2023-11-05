package com.example.uts118228032v.Cuaca;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {
    @SerializedName("tanggal")
    @Expose
    private String tanggal;
    @SerializedName("jam")
    @Expose
    private String jam;
    @SerializedName("datetime")
    @Expose
    private String datetime;
    @SerializedName("coordinates")
    @Expose
    private String coordinates;
    @SerializedName("lintang")
    @Expose
    private String lintang;
    @SerializedName("bujur")
    @Expose
    private String bujur;
    @SerializedName("magnitude")
    @Expose
    private Float magnitude;
    @SerializedName("kedalaman")
    @Expose
    private String kedalaman;
    @SerializedName("wilayah")
    @Expose
    private String wilayah;
    @SerializedName("potensi")
    @Expose
    private String potensi;
    @SerializedName("dirasakan")
    @Expose
    private String dirasakan;
    @SerializedName("shakemap")
    @Expose
    private String shakemap;

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getLintang() {
        return lintang;
    }

    public void setLintang(String lintang) {
        this.lintang = lintang;
    }

    public String getBujur() {
        return bujur;
    }

    public void setBujur(String bujur) {
        this.bujur = bujur;
    }

    public Float getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(Float magnitude) {
        this.magnitude = magnitude;
    }

    public String getKedalaman() {
        return kedalaman;
    }

    public void setKedalaman(String kedalaman) {
        this.kedalaman = kedalaman;
    }

    public String getWilayah() {
        return wilayah;
    }

    public void setWilayah(String wilayah) {
        this.wilayah = wilayah;
    }

    public String getPotensi() {
        return potensi;
    }

    public void setPotensi(String potensi) {
        this.potensi = potensi;
    }

    public String getDirasakan() {
        return dirasakan;
    }

    public void setDirasakan(String dirasakan) {
        this.dirasakan = dirasakan;
    }

    public String getShakemap() {
        return shakemap;
    }

    public void setShakemap(String shakemap) {
        this.shakemap = shakemap;
    }
}
