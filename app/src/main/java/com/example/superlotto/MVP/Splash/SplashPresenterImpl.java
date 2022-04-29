package com.example.superlotto.MVP.Splash;

import android.app.Activity;

import com.example.superlotto.Activity.BaseActivity;
import com.example.superlotto.RetrofitAPI.Utils.RetroUtils;
import com.example.superlotto.RetrofitAPI.api.IRetrofitContract;
import com.example.superlotto.RetrofitAPI.api.RetrofitFactory;
import com.example.superlotto.RetrofitAPI.models.response.LoginResponse;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class SplashPresenterImpl implements ISplashPresenter {
    ISplashView iSplashView;

    @Override
    public void hitLogin(){
        String username = iSplashView.getUserName();
        String password = iSplashView.password();
        String platformType = iSplashView.getPlatformType();
        String clientType = iSplashView.getClientType();
        String serverToken = iSplashView.getServerToken();
        RetrofitFactory retrofitFactory = RetrofitFactory.getInstance();
        IRetrofitContract iRetrofitContract = retrofitFactory.getRetrofitContract(RetroUtils.APP_ENV);
        Observable<LoginResponse> observableLoginResponse = iRetrofitContract.hitLogin("1.0.3",platformType,clientType,serverToken,username,password);
        observableLoginResponse.observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io()).subscribe(new Observer<LoginResponse>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(LoginResponse loginResponse) {
                iSplashView.setResponse(loginResponse);
            }

            @Override
            public void onError(Throwable e) {iSplashView.setError(e);
            }

            @Override
            public void onComplete() {

            }
        });
    }
    @Override
    public void setView(ISplashView iSplashView) {
        this.iSplashView = iSplashView;
    }


}

