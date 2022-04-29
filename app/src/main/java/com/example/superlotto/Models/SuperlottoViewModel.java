package com.example.superlotto.Models;

import android.app.Activity;
import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.superlotto.RetrofitAPI.Utils.RetroUtils;
import com.example.superlotto.RetrofitAPI.api.IRetrofitContract;
import com.example.superlotto.RetrofitAPI.api.RetrofitFactory;
import com.example.superlotto.RetrofitAPI.models.request.Pick4BetRequest;
import com.example.superlotto.RetrofitAPI.models.response.AvailableDrawResponse;
import com.example.superlotto.RetrofitAPI.models.response.GetCashpotGameDetailsResponse;
import com.example.superlotto.RetrofitAPI.models.response.Pick4BetResponse;
import com.example.superlotto.RetrofitAPI.models.response.Pick4BetStartResponse;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class SuperlottoViewModel extends AndroidViewModel {
    private RetrofitFactory mRetrofitFactory;
    public MutableLiveData<AvailableDrawResponse> availableDrawResponseMutableLiveData;
    public MutableLiveData<Pick4BetStartResponse> superlottoBetStartResponseMutableLiveData;
    public MutableLiveData<Pick4BetResponse> superlottoBetResponseMutableLiveData;

    public MutableLiveData<GetCashpotGameDetailsResponse> superlottoGameDetailsResponseMutableLiveData;
    public MutableLiveData<Throwable> errorLiveData = new MutableLiveData<>();

    public SuperlottoViewModel(@NonNull Application application) {
        super(application);
    }

    public void getAvailableDraws(String platformType, String clientType, String token, Activity activity){
        availableDrawResponseMutableLiveData = new MutableLiveData<>();
        mRetrofitFactory = RetrofitFactory.getInstance();
        IRetrofitContract iRetrofitContract = mRetrofitFactory.getRetrofitContract(RetroUtils.APP_ENV);
        Observable<AvailableDrawResponse> availableDrawResponseObservable = iRetrofitContract.getAvailableDrawssuperlotto(platformType,clientType,token);
        availableDrawResponseObservable.observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io()).subscribe(new Observer<AvailableDrawResponse>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(AvailableDrawResponse availableDrawResponse) {
                availableDrawResponseMutableLiveData.setValue(availableDrawResponse);
            }

            @Override
            public void onError(Throwable e) {
                errorLiveData.setValue(e);
            }

            @Override
            public void onComplete() {

            }
        });
    }
    public void getGameDetails(String platformType, String clientType, String token,Activity activity){
        superlottoGameDetailsResponseMutableLiveData = new MutableLiveData<>();
        mRetrofitFactory = RetrofitFactory.getInstance();
        IRetrofitContract iRetrofitContract = mRetrofitFactory.getRetrofitContract( RetroUtils.APP_ENV);
        Observable<GetCashpotGameDetailsResponse> gameDetails = iRetrofitContract.getsuperlottoGameDetails(platformType,clientType,token);
        gameDetails.observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io()).subscribe(new Observer<GetCashpotGameDetailsResponse>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(GetCashpotGameDetailsResponse cashpotGameDetailsResponse) {
                superlottoGameDetailsResponseMutableLiveData.setValue(cashpotGameDetailsResponse);
            }

            @Override
            public void onError(Throwable e) {
                errorLiveData.setValue(e);
            }

            @Override
            public void onComplete() {

            }
        });
    }


    public void placeSuperlottoBet(String platformType, String clientType, String token, Activity activity, Pick4BetRequest pick4BetRequest){
        superlottoBetStartResponseMutableLiveData = new MutableLiveData<>();
        mRetrofitFactory = RetrofitFactory.getInstance();
        IRetrofitContract iRetrofitContract = mRetrofitFactory.getRetrofitContract(RetroUtils.APP_ENV);
        Observable<Pick4BetStartResponse> availableDrawResponseObservable = iRetrofitContract.betsuperlotto(platformType,clientType,token,pick4BetRequest);
        availableDrawResponseObservable.observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io()).subscribe(new Observer<Pick4BetStartResponse>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Pick4BetStartResponse pick4BetStartResponse) {
                superlottoBetStartResponseMutableLiveData.setValue(pick4BetStartResponse);
            }

            @Override
            public void onError(Throwable e) {
                errorLiveData.setValue(e);
            }

            @Override
            public void onComplete() {

            }
        });
    }

    public void confirmsuperlottoBet(String platformType, String clientType, String token, Activity activity, int id){
        superlottoBetResponseMutableLiveData = new MutableLiveData<>();
        mRetrofitFactory = RetrofitFactory.getInstance();
        IRetrofitContract iRetrofitContract = mRetrofitFactory.getRetrofitContract( RetroUtils.APP_ENV);
        Observable<Pick4BetResponse> availableDrawResponseObservable = iRetrofitContract.hitConfirmPick4Bet(platformType,clientType,token,id);
        availableDrawResponseObservable.observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io()).subscribe(new Observer<Pick4BetResponse>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Pick4BetResponse pick4BetResponse) {
                superlottoBetResponseMutableLiveData.setValue(pick4BetResponse);
            }

            @Override
            public void onError(Throwable e) {
                errorLiveData.setValue(e);
            }

            @Override
            public void onComplete() {

            }
        });
    }
}
