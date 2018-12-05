package poc.yetisir.com.apilibrary.rests;

import java.util.List;

import poc.yetisir.com.apilibrary.model.News;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface NewsRestInterface {
    @Headers({
            "accept: application/json",
            "apikey: feb94b517f1044c0b5d190ea74191a45"
    })
    @GET("v1/articles?$top=20")
    Call<List<News>> getNews();
}
