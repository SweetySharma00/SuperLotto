package com.example.superlotto.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.superlotto.Fragment.SupperLottoFragment;
import com.example.superlotto.MVP.Splash.ISplashPresenter;
import com.example.superlotto.MVP.Splash.ISplashView;
import com.example.superlotto.MVP.Splash.SplashPresenterImpl;
import com.example.superlotto.R;
import com.example.superlotto.RetrofitAPI.models.response.LoginResponse;
import com.example.superlotto.Utils.ExtraUtils;

public class SplashActivity extends BaseActivity implements ISplashView {

    private String serverToken="277";
    ISplashPresenter iSplashPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
//        showProgressDialog();
        iSplashPresenter=new SplashPresenterImpl();
        iSplashPresenter.hitLogin();
        iSplashPresenter.setView(this);

    }


    @Override
    public String getUserName() {
        return "9060649411";
    }

    @Override
    public String password() {
        return "136900";
    }

    @Override
    public String getClientType() {
        return getClientTypeSDK();
    }

    @Override
    public String getPlatformType() {
        return getPlatFormType();
    }

    @Override
    public String getServerToken() {
        return serverToken;
    }

    @Override
    public void setResponse(LoginResponse Response) {
        if (Response != null && Response.getMessage() != null && Response.getMessage().getSuccessMessage() != null && Response.getMessage().getSuccessMessage().length() != 0) {
            ExtraUtils.TOKEN=Response.getToken().trim();
            Toast.makeText(this, Response.getMessage().getSuccessMessage(), Toast.LENGTH_LONG).show();
            Intent intent = new Intent(SplashActivity.this, SupperLottoFragment.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);

        } else {
            assert Response != null;
            assert Response.getMessage() != null;
            Toast.makeText(this, Response.getMessage().getErrorMessage(), Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public void setError(Throwable error) {
        hideProgressDialog();
        Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();

    }
}