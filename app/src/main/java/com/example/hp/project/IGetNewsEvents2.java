package com.example.hp.project;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by hp on 14-08-2017.
 */

public interface IGetNewsEvents2 {
    @GET("api/unit_details/unitdetails_by_id?category_id=6&format=json")
    Call<ArrayList<Newsn>> getNewsn();
}

