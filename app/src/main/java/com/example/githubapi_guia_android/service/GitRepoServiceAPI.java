package com.example.githubapi_guia_android.service;

import com.example.githubapi_guia_android.model.GitRepo;
import com.example.githubapi_guia_android.model.GitUsersResponse;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GitRepoServiceAPI {
    @GET("search/users")
    public Call<GitUsersResponse> searchUsers(@Query("q") String query);

    @GET("users/{u}/repos")
    public Call<List<GitRepo>> userRepos(@Path("u") String username);
}
