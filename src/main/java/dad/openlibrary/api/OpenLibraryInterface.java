package dad.openlibrary.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OpenLibraryInterface {

    // https://openlibrary.org/search.json?q=<query>
    @GET("search.json")
    Call<SearchResult> search(@Query("q") String query);

}
