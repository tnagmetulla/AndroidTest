package com.freenow.android_demo.models

import com.google.gson.JsonParser
import okhttp3.OkHttpClient
import okhttp3.Request

class TestUser (var username: String, var password:String )
fun fetchUser(): TestUser {
    val url = "https://randomuser.me/api/?seed=a1f30d446f820665"
    val request = Request.Builder().url(url).build()
    val client = OkHttpClient()
    val body = client.newCall(request).execute().body()?.string()
    val jsonParser = JsonParser()
    val jsonObject = jsonParser.parse(body).getAsJsonObject()
    val results = jsonObject.getAsJsonArray("results")
    val jsonElement = results.get(0)
    val jsonUser = jsonElement.getAsJsonObject()
    val login = jsonUser.getAsJsonObject("login")
    val testUser = TestUser(login.get("username").getAsString(),login.get("password").getAsString())
    return testUser
}