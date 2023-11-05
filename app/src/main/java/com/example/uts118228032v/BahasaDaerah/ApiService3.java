package com.example.uts118228032v.BahasaDaerah;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService3 {


//    public static ApiService getClient() {
//        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
//        logging.level(HttpLoggingInterceptor.Level.BODY);
//        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(logging).connectTimeout(30, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).readTimeout(30, TimeUnit.SECONDS).build();
//
//        Gson gson=new GsonBuilder()
//                .setDateFormat("dd-MM-yyy HH:mm:ss")
//                .create();
//
//        return new Retrofit.Builder()
//                .baseUrl("https://cuaca-gempa-rest-api.vercel.app/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .client(client)
//                .build()
//                .create(ApiService.class);
//
@GET("codespade/api/bahasa-daerah")
Call<ArrayList<Bader>> getBahasa();
//    }
}
