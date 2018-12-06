# SDK Example for Android Project
Android Library Project for easy using of Retrofit with Hurriyet Api

## Getting Started
This project getting top 20 news with Hurriyet API on Hurriyet Haber. OkHttp using for http connection. Retrofit using for Get, Post request. Gson using for json parse operation.

## Requirements
```
implementation 'com.squareup.retrofit2:retrofit:2.5.0'
implementation 'com.squareup.retrofit2:converter-gson:2.3.0'
implementation 'com.squareup.okhttp:okhttp:2.7.5'
```

## Installation
1. Add this lines into Project build.gradle file
```
allprojects {
    repositories {
        google()
        jcenter()
        maven {
            url  "https://yetisir.bintray.com/sdk-example"
        }
    }
}
```
2. Add this lines into dependencies in AppModule build.gradle file
```
implementation 'com.yetisir.sdkexample:apilibrary:1.0.0'
```

## Tutorial
1. Need Api object. Create it.
```
Api api = new Api();
```
2. Use getNews method of Api object.
```
api.getNews();
```
3. Get news list with ServiceListener.
```
api.getNews(new ServiceListener() {
  @Override
  public void onSuccess(List<News> result) {
    for (News temp : result) {
      Log.d("News-Title", temp.title);
    }
  }
    
  @Override
  public void onFailure() {
    Log.e("News-Error","Error during getting news");
  }
});
```
- News Object: a news json object of top 20 News.
