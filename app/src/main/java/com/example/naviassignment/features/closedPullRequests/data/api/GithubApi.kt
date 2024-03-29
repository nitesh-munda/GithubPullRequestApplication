package com.example.naviassignment.features.closedPullRequests.data.api

import com.example.naviassignment.features.closedPullRequests.data.api.model.PullRequestData
import com.example.naviassignment.features.closedPullRequests.data.apiConstants.APIEndpoints.PULL_REQUEST
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GithubApi {
    @GET(PULL_REQUEST)
    fun getClosedPullRequests(
        @Path("owner")
        username: String,
        @Path("repo")
        repo: String,
        @Query("state")
        status: String = "closed"
    ) : Single<List<PullRequestData>>
}