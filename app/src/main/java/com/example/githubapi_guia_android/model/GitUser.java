package com.example.githubapi_guia_android.model;
 import  com.google.gson.annotations.SerializedName;
public class GitUser {
    public int id;
    @SerializedName("login")
    public String username;
    @SerializedName("avatar_url")
    public String avatarUrl;
    public String score;

}
