package com.example.uts118228032v;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.uts118228032v.AlQuran.AlQuranModel;
import com.example.uts118228032v.AlQuran.ApiClient2;
import com.example.uts118228032v.AlQuran.ApiService2;
import com.example.uts118228032v.BahasaDaerah.ApiClient3;
import com.example.uts118228032v.BahasaDaerah.ApiService3;
import com.example.uts118228032v.BahasaDaerah.Bader;
import com.example.uts118228032v.Berita.ApiClient4;
import com.example.uts118228032v.Berita.ApiService4;
import com.example.uts118228032v.Berita.Berita;
import com.example.uts118228032v.Cuaca.ApiClient;
import com.example.uts118228032v.Cuaca.ApiService;
import com.example.uts118228032v.Cuaca.DataBMKG;
import com.example.uts118228032v.Doa.ApiClient5;
import com.example.uts118228032v.Doa.ApiService5;
import com.example.uts118228032v.Doa.Doa;
import com.example.uts118228032v.KodePos.ApiClient6;
import com.example.uts118228032v.KodePos.ApiService6;
import com.example.uts118228032v.KodePos.PosCode;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static ApiService apiInterface= ApiClient.getClient().create(ApiService.class);
    private static ApiService2 apiInterface2= ApiClient2.getClient().create(ApiService2.class);
    private static ApiService3 apiInterface3= ApiClient3.getClient().create(ApiService3.class);
    private static ApiService4 apiInterface4= ApiClient4.getClient().create(ApiService4.class);
    private static ApiService5 apiInterface5= ApiClient5.getClient().create(ApiService5.class);

    private static ApiService6 apiInterface6= ApiClient6.getClient().create(ApiService6.class);
    private TextView txAlquran,txBhs,txBerita,txDoa,txKodepos;


    Button btnApi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txAlquran=findViewById(R.id.AlquranApi);
        txBhs=findViewById(R.id.Bader);
        txBerita=findViewById(R.id.Berita);
        txDoa=findViewById(R.id.Doai);
        txKodepos=findViewById(R.id.posCode);
        btnApi=findViewById(R.id.tomb);


        btnApi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                clickApi();
                callSurah();
                callBader();
                callBerita();
                callDoa();
                callPos();
            }
        });
    }


    private void clickApi() {
        apiInterface.getDataBMKG().enqueue(new Callback<DataBMKG>() {
            @Override
            public void onResponse(Call<DataBMKG> call, Response<DataBMKG> response) {
                Toast.makeText(MainActivity.this, "Call Sukses", Toast.LENGTH_SHORT).show();
                DataBMKG dataBMKG = response.body();
                if(dataBMKG !=null&&dataBMKG.isSuccess()){
                    txKodepos.setText(dataBMKG.getData().getWilayah());
                }
            }

            @Override
            public void onFailure(Call<DataBMKG> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error Call", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void callDoa(){
        apiInterface5.getDoa().enqueue(new Callback<ArrayList<Doa>>() {
            @Override
            public void onResponse(Call<ArrayList<Doa>> call, Response<ArrayList<Doa>> response) {
                if (response.isSuccessful()) {
                    //ambil data dari objek response
                    ArrayList<Doa> doas = response.body();
                        //tampilkan data ke TextView
                        txDoa.setText(doas.get(0).getAyat());
                } else {
                    //tampilkan pesan error jika respons gagal
                    Toast.makeText(MainActivity.this, "Error Response", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ArrayList<Doa>> call, Throwable t) {

            }
        });
    }
//method untuk memanggil REST Api AlQuran
private void callSurah(){
    apiInterface2.getSurah().enqueue(new Callback<ArrayList<AlQuranModel>>() {
        @Override
        public void onResponse(Call<ArrayList<AlQuranModel>> call, Response<ArrayList<AlQuranModel>> response) {
            //cek apakah respons berhasil atau tidak
            if (response.isSuccessful()) {
                //ambil data dari objek response
                ArrayList<AlQuranModel> data = response.body();
                    txAlquran.setText(data.get(0).getAr());
            } else {
                //tampilkan pesan error jika respons gagal
                Toast.makeText(MainActivity.this, "Error Response", Toast.LENGTH_SHORT).show();
            }
        }

        @Override
        public void onFailure(Call<ArrayList<AlQuranModel>> call, Throwable t) {
            Toast.makeText(MainActivity.this, "Error Call", Toast.LENGTH_SHORT).show();
        }
    });
}
private void callPos(){
        apiInterface6.getZipcode().enqueue(new Callback<ArrayList<PosCode>>() {
            @Override
            public void onResponse(Call<ArrayList<PosCode>> call, Response<ArrayList<PosCode>> response) {
                if (response.isSuccessful()) {
                    //ambil data dari objek response
                    ArrayList<PosCode> dataPos = response.body();

                    txKodepos.setText(dataPos.get(1).getKelurahan());
                } else {
                    //tampilkan pesan error jika respons gagal
                    Toast.makeText(MainActivity.this, "Error Response", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ArrayList<PosCode>> call, Throwable t) {

            }
        });
}
private void callBerita(){
        apiInterface4.getBerita().enqueue(new Callback<Berita>() {
            @Override
            public void onResponse(Call<Berita> call, Response<Berita> response) {
                    Berita berita=response.body();
                if(response.isSuccessful()){
                    txBerita.setText(berita.getData().getPosts().get(0).getDescription());

                }
            }

            @Override
            public void onFailure(Call<Berita> call, Throwable t) {

            }
        });
}

    private void callBader(){
        apiInterface3.getBahasa().enqueue(new Callback<ArrayList<Bader>>() {
            @Override
            public void onResponse(Call<ArrayList<Bader>> call, Response<ArrayList<Bader>> response) {
                //cek apakah respons berhasil atau tidak
                if (response.isSuccessful()) {
                    //ambil data dari objek response
                    ArrayList<Bader> dataBader = response.body();
                    //tampilkan data ke TextView
                  txBhs.setText(dataBader.get(3).getListProvinsi().get(0).getDeskripsi().get(0));
                } else {
                    //tampilkan pesan error jika respons gagal
                    Toast.makeText(MainActivity.this, "Error Response", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ArrayList<Bader>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error Call", Toast.LENGTH_SHORT).show();
            }
        });
    }

}