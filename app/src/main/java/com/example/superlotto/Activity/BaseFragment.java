package com.example.superlotto.Activity;

import static android.content.Context.MODE_PRIVATE;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.superlotto.Interface.BaseFragmentInterface;
import com.example.superlotto.R;
import com.google.android.material.card.MaterialCardView;

public class BaseFragment extends Fragment implements BaseFragmentInterface {
    private ProgressDialog progressDialog;
    public View view ;
    MaterialCardView cvPayPal,cvSagicor,cvQuisk;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (getLayoutById() != 0) {
            view =inflater.inflate(getLayoutById(),container,false);
        }
        manageToolBar();
        getViewById();
        return view;
    }

//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//        getViewById();
//    }

    @Override
    public void showProgressDialog() {
        if (getActivity() != null && !getActivity().isFinishing()) {
            if (progressDialog != null && progressDialog.isShowing()) {
                progressDialog.dismiss();
            }
            progressDialog = new ProgressDialog(getActivity());
            progressDialog.setMessage(getString(R.string.please_wait_loading));
            progressDialog.setCancelable(false);
            progressDialog.show();
        }
    }
    @Override
    public void hideProgressDialog() {
        if (getActivity() != null && !getActivity().isFinishing()) {
            if (progressDialog != null && progressDialog.isShowing())
                progressDialog.dismiss();
        }
    }


    @Override
    public int getLayoutById() {
        return 0;
    }

    @Override
    public void getViewById() {

    }

    @Override
    public void manageToolBar() {

    }

    public void hideKeyboard(Context context) {
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Find the currently focused view, so we can grab the correct window token from it.
        View view = getActivity().getCurrentFocus();
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = new View(getActivity());
        }
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }


    public void setCardView(int cvPayPal, int cvSagicor, int cvQuisk){
        this.cvPayPal =view.findViewById(cvPayPal);
        this.cvSagicor =view.findViewById(cvSagicor);
        this.cvQuisk =view.findViewById(cvQuisk);
    }

    public void setPaymentMethod(String selectedPaymentMethod) {
        switch (selectedPaymentMethod){
            case "Quisk":
                cvPayPal.setStrokeColor(getResources().getColor(R.color.grey));
                cvSagicor.setStrokeColor(getResources().getColor(R.color.grey));
                cvQuisk.setStrokeColor(getResources().getColor(R.color.red));

                break;
            case "Sagicor":
                cvPayPal.setStrokeColor(getResources().getColor(R.color.grey));
                cvSagicor.setStrokeColor(getResources().getColor(R.color.red));
                cvQuisk.setStrokeColor(getResources().getColor(R.color.grey));

                break;
            case "PayPal":
                cvPayPal.setStrokeColor(getResources().getColor(R.color.red));
                cvSagicor.setStrokeColor(getResources().getColor(R.color.grey));
                cvQuisk.setStrokeColor(getResources().getColor(R.color.grey));

                break;
        }
    }
}
