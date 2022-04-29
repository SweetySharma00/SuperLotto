package com.example.superlotto.RetrofitAPI.api;

import com.example.superlotto.RetrofitAPI.Utils.APIError;

public interface IRetrofitResponseCallback<T> {
    void onResponseReceived(int REQUEST_CODE, T object);

    /**
     * This is a method which will be called once a error response is received from a network API
     *
     * @param apiError
     */
    void onErrorReceived(APIError apiError);
}
