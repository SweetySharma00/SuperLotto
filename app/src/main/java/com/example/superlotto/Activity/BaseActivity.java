package com.example.superlotto.Activity;

import android.app.ProgressDialog;
import android.os.Build;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.superlotto.R;

public class BaseActivity extends AppCompatActivity{
    private ProgressDialog progressDialog;

    public void showProgressDialog() {
        if (!isFinishing()) {
            if (progressDialog != null && progressDialog.isShowing()) {
                progressDialog.dismiss();
                progressDialog=null;
            }
            progressDialog = new ProgressDialog(this);
            progressDialog.setCancelable(false);
            progressDialog.setMessage(getString(R.string.please_wait_loading));
            progressDialog.show();
        }
    }
    public void hideProgressDialog() {
        if (!isFinishing()) {
            if (progressDialog!=null && progressDialog.isShowing()) {
                progressDialog.dismiss();
                progressDialog=null;
            }
        }
    }



    public String getPlatFormType() {
        return "JM";
    }


    public String getClientTypeSDK() {
        return "Android" + " " + Build.VERSION.SDK_INT;
    }

}
