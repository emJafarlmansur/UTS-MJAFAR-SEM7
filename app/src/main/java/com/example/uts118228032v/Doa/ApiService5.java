package com.example.uts118228032v.Doa;


import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService5 {
@GET("api")
        Call<ArrayList<Doa>> getDoa();
}
