package com.example.superlotto.RetrofitAPI.api;

import android.app.Activity;
import android.content.Intent;

import com.example.superlotto.RetrofitAPI.Utils.APIError;
import com.example.superlotto.RetrofitAPI.Utils.ErrorUtils;
import com.example.superlotto.RetrofitAPI.Utils.RetroUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.CertificatePinner;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitFactory<T> {


    private static RetrofitFactory mInstance;
    private IRetrofitResponseCallback mRetrofitCallback;
    public final String TAG = RetrofitFactory.class.getSimpleName();
    //    private static Retrofit mRetrofitBuilder;
    private static Retrofit mRetrofitBuilder;
    private int REQUEST_CODE = -1;
    private IRetrofitContract iRetrofitContract;
    private boolean BUILDER_RECREATION = false;
    private Activity activity;

    private RetrofitFactory() {
        super();
    }

    HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();


    OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .connectTimeout(5, TimeUnit.MINUTES)
            .readTimeout(300, TimeUnit.SECONDS)
            .writeTimeout(300, TimeUnit.SECONDS)
            .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .certificatePinner(new CertificatePinner.Builder().add("d1-slp-api.supremelifeplatform.com", "sha256/eZADO/TmTJ46Th1AWbo8vs7B6gfgYHt7yq9aPk2HdlE=").build())
            .addInterceptor(loggingInterceptor)
            .addInterceptor(new Interceptor() {
                @Override
                public okhttp3.Response intercept(Chain chain) throws IOException {

                    Request request = chain.request().newBuilder().addHeader("CLIENT-IP", RetroUtils.getIPAddress(true)).build();
                    okhttp3.Response response = chain.proceed(request);
                    //TODO handle it
                    if (response.code() == 401) {
                        try {
                            Intent myIntent = new Intent(activity,Class.forName("com.supremegames.jm.activity.LoginActivity"));
                            myIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            activity.startActivity(myIntent);

                        } catch (ClassNotFoundException e) {

                        }
                    }
                    else if (response.code() == 403) {
//                        try {
//                            Intent myIntent = new Intent(activity,Class.forName("com.supremegames.jm.activity.LoginActivity"));
//                            myIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                            activity.startActivity(myIntent);
//                        } catch (ClassNotFoundException e) {

//                        }
                    }
                    else if (response.code() == 500) {

                    /*    activity.runOnUiThread(new Runnable() {
                            public void run() {
                                final Toast toast = Toast.makeText(activity, "There is an error processing your request",Toast.LENGTH_LONG);
                                toast.show();
                            }
                        });*/
                    } else if (response.code() == 404) {

                    } else {

                    }

                    return response;
                }
            })
            .build();


    public static synchronized RetrofitFactory getInstance() {
        if (mInstance == null)
            mInstance = new RetrofitFactory();


        return mInstance;
    }
    public Retrofit getRetrofitBuilder(String baseUrl) {
        if (mRetrofitBuilder == null) {
            loggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();
            mRetrofitBuilder = new retrofit2.Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return mRetrofitBuilder;
    }


    public IRetrofitContract getRetrofitContract(String baseUrl) {
        iRetrofitContract = getRetrofitBuilder(baseUrl).create(IRetrofitContract.class);
//        this.activity=activity;
        return iRetrofitContract;
    }

    public void executeRequest(Call call, int request_code) {
        REQUEST_CODE = request_code;
        call.enqueue(new Callback<T>() {
            @Override
            public void onResponse(Call<T> call, Response<T> response) {
                if (response != null && response.isSuccessful())
                {
                    mRetrofitCallback.onResponseReceived(REQUEST_CODE, response.body());
                }
                else
                {
                    APIError error = ErrorUtils.parseError(mRetrofitBuilder,response);
                    mRetrofitCallback.onErrorReceived(error);
                }
            }

            @Override
            public void onFailure(Call<T> call, Throwable t) {
                if (call.isCanceled()) {
                }

            }
        });
    }
    public void cancelInProcessRequestsByTag(String tag) {
    }

    public void setRetrofitCallback(IRetrofitResponseCallback callback)
    {
        mRetrofitCallback = callback;
    }
}
