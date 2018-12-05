package poc.yetisir.com.sdkexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.List;

import poc.yetisir.com.apilibrary.Api;
import poc.yetisir.com.apilibrary.model.News;
import poc.yetisir.com.apilibrary.support.ServiceListener;

public class MainActivity extends AppCompatActivity {
    private Api api;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        api = new Api();
    }

    public void middleButtonOnClick(View view) {
        api.getNews(new ServiceListener() {
            @Override
            public void onSuccess(List<News> result) {
                for (News temp : result){
                    Log.d("Activity_Result", temp.title);
                }
            }

            @Override
            public void onFailure() {

            }
        });
    }
}
