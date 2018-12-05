package poc.yetisir.com.apilibrary;

import poc.yetisir.com.apilibrary.service.NewsRest;
import poc.yetisir.com.apilibrary.support.ServiceListener;

public class Api {
    public NewsRest newsRest;

    public Api() {
        newsRest = new NewsRest();
    }

    public void getNews(ServiceListener listener){
        newsRest.getNews(listener);
    }
}
