package com.inge.laundryku.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroServer {

    private static final String baseURL = "http://10.0.2.2/movie_db/";
    private static Retrofit retro;

    public static Retrofit konekRetrofit(){
        if(retro == null){
            retro = new Retrofit.Builder ()
                    .baseUrl ( baseURL )
                    .addConverterFactory ( GsonConverterFactory.create ())
                    .build();
        }
        return  retro;
    }
}
