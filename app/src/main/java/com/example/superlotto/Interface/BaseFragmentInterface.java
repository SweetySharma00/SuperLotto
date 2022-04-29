package com.example.superlotto.Interface;

import android.content.Context;

public interface BaseFragmentInterface {
    int getLayoutById();
    void getViewById();
    void manageToolBar();
    void hideKeyboard(Context context);
    void showProgressDialog();
    void hideProgressDialog();
}
