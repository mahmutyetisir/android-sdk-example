package poc.yetisir.com.apilibrary.service;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import poc.yetisir.com.apilibrary.ApiClient;
import poc.yetisir.com.apilibrary.model.News;
import poc.yetisir.com.apilibrary.rests.NewsRestInterface;
import poc.yetisir.com.apilibrary.support.ServiceListener;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NewsRest {
    private NewsRestInterface newsRestInterface = null;
    public NewsRest() {
        newsRestInterface = ApiClient.getClient().create(NewsRestInterface.class);
    }

    public void getNews(final ServiceListener listener){
        newsRestInterface.getNews().enqueue(new Callback<List<News>>() {
            @Override
            public void onResponse(Call<List<News>> call, Response<List<News>> response) {
                if (response.body() != null) {
                    List<News> listNews = new ArrayList<>();
                    listNews = response.body();
                    Log.d("inSDK",listNews.toString());
                    listener.onSuccess(listNews);
                }
            }

            @Override
            public void onFailure(Call<List<News>> call, Throwable t) {
                listener.onFailure();
            }
        });
    }

}
