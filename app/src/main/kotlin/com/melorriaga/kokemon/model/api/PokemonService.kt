package com.melorriaga.kokemon.model.api

import com.melorriaga.kokemon.model.APIResourceList
import com.melorriaga.kokemon.model.Pokemon
import com.melorriaga.kokemon.model.Type
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import rx.Observable

interface PokemonService {

    @GET("pokemon")
    fun getPokemonList(@Query("limit") limit: Int): Observable<APIResourceList>

    @GET("pokemon/{id}")
    fun getPokemonDetails(@Path("id") id: Int): Observable<Pokemon>

    @GET("type")
    fun getPokemonTypes(): Observable<APIResourceList>

    @GET("type/{id}")
    fun getPokemonType(@Path("id") id: Int): Observable<Type>

}
