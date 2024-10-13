package com.ingenious.githubapp.data.service

import com.ingenious.githubapp.data.model.UserDetailsResponse
import com.ingenious.githubapp.data.model.UserResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GithubService {

    @GET("users")
    suspend fun getUsers(
        @Query("since") since: Int = 0,
        @Query("per_page") perPage: Int = 50,
    ): List<UserResponse>

    @GET("users/{username}")
    suspend fun getUser(
        @Path("username") username: String,
    ): UserDetailsResponse
}