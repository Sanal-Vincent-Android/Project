package com.example.hp.project;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by hp on 14-08-2017.
 */

public interface IGetNewsEvents {
    @GET("api/users/details/type/")
    Call<ArrayList<NewsItem>> getNewsItems();
   /* Call<ArrayList<News>> getNews();
*/
}
