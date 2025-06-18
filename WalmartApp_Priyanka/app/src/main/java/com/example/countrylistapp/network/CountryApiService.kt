package com.example.countrylistapp.network

import com.example.countrylistapp.Country
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface CountryApiService {
    @GET
    fun getCountries(
        @Url url: String = "https://gist.githubusercontent.com/peymano-wmt/32dcb892b06648910ddd40406e37fdab/raw/db25946fd77c5873b0303b858e861ce724e0dcd0/countries.json"
    ): Call<List<Country>>
}
