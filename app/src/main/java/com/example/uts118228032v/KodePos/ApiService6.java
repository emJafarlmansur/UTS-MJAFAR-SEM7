package com.example.uts118228032v.KodePos;


import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService6 {
@GET("kota_kab/k69.json?print=pretty")
        Call<ArrayList<PosCode>> getZipcode();
}
