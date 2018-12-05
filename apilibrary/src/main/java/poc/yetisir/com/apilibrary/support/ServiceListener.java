package poc.yetisir.com.apilibrary.support;

import java.util.List;

import poc.yetisir.com.apilibrary.model.News;

public interface ServiceListener {
    void onSuccess(List<News> result);
    void onFailure();
}
