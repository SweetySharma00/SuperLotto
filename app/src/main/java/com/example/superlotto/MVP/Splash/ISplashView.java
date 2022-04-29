package com.example.superlotto.MVP.Splash;

import com.example.superlotto.RetrofitAPI.models.response.LoginResponse;

public interface ISplashView {
    String getUserName();
    String password();
    String getClientType();
    String getPlatformType();
    String getServerToken();
    void setResponse(LoginResponse loginResponse);
    void setError(Throwable error);
}
