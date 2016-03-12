package com.zl.zhanglong.myapplication;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

public interface ApiService {
    //    这个接口有点不稳定 ，换成稳定接口更加流畅
    String ENDPOINT = "http://ip.taobao.com/service/";

    @GET("getIpInfo.php")
    Observable<IpData> getRibots(@Query("ip") String ip);

    /******** Helper class that sets up a new services *******/
    class Creator {
        public static ApiService newRibotsService() {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(ApiService.ENDPOINT)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();
            return retrofit.create(ApiService.class);
        }
    }
}
