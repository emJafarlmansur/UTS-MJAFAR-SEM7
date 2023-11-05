package com.example.uts118228032v.AlQuran;


import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService2 {
@GET("99c279bb173a6e28359c/surat/1")
        Call<ArrayList<AlQuranModel>> getSurah();
}
