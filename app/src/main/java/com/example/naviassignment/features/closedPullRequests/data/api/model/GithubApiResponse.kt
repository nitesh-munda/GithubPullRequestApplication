package com.example.naviassignment.features.closedPullRequests.data.api.model

import com.google.gson.annotations.SerializedName

data class PullRequestData(
    @SerializedName("id")
    val id: String,
    @SerializedName("state")
    val state: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("userDetails")
    val userDetails: UserDetails,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("closed_at")
    val closedAt: String
)

data class UserDetails(
    @SerializedName("login")
    val login: String,
    @SerializedName("avatar_url")
    val avatarUrl: String
)
