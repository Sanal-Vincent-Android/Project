package com.example.hp.project;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by hp on 17-08-2017.
 */

public interface IGetExecutive {
    @GET("api/users/details/type/1/")
    Call<ArrayList<Newsx>> getNewsx();
   /* Call<ArrayList<News>> getNews();
*/
}
