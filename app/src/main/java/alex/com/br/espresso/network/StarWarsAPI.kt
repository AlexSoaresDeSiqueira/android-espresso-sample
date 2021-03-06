package alex.com.br.espresso.network

import alex.com.br.espresso.network.model.Starship
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface StarWarsAPI {

    @GET("starships/{starshipId}/")
    fun searchStarship(@Path("starshipId") starshipId: Int): Call<Starship>
}