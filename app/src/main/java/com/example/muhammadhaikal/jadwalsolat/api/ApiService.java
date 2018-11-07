package com.example.muhammadhaikal.jadwalsolat.api;


import com.example.muhammadhaikal.jadwalsolat.model.ModelJadwal;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("jakarta.json")
    Call<ModelJadwal> getJadwal();

}
