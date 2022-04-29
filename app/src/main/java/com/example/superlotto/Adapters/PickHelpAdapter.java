package com.example.superlotto.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.superlotto.Models.CashpotHelp;
import com.example.superlotto.R;

import java.util.ArrayList;

public class PickHelpAdapter extends PagerAdapter {
    private ArrayList<CashpotHelp> pick4Helps;
    private Context context;
    private LayoutInflater layoutInflater;
    private int currentPosition;
    private int stepColor,descriptionColor;

    public PickHelpAdapter(Context context, ArrayList<CashpotHelp> pick4Helps, int stepColor, int descriptionColor) {
        this.pick4Helps = pick4Helps;
        this.context = context;
        this.stepColor = stepColor;
        this.descriptionColor = descriptionColor;
    }

    @Override
    public int getCount() {
        return pick4Helps.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.pick4_help_item,null);
        TextView txtStepCount = view.findViewById(R.id.txtStepCount);
        TextView txtHelpDescription = view.findViewById(R.id.txtHelpDescription);
        txtStepCount.setTextColor(container.getContext().getResources().getColor(stepColor));
        txtHelpDescription.setTextColor(container.getContext().getResources().getColor(descriptionColor));
        txtStepCount.setText(pick4Helps.get(position).getStepNo());
        txtHelpDescription.setText(pick4Helps.get(position).getStepDescription());
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
