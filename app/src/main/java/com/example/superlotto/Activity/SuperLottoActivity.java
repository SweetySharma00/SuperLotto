package com.example.superlotto.Activity;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.app.Dialog;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.superlotto.Adapters.PickHelpAdapter;
import com.example.superlotto.Adapters.SelectedNumberSuperLottoAdapter;
import com.example.superlotto.Models.SelectedNumber;
import com.example.superlotto.Models.SelectedSuperball;
import com.example.superlotto.Models.SuperlottoViewModel;
import com.example.superlotto.R;
import com.example.superlotto.RetrofitAPI.models.response.AvailableDrawResponse;
import com.example.superlotto.RetrofitAPI.models.response.GameDetails;
import com.example.superlotto.Utils.DataUtils;
import com.example.superlotto.Utils.InfinitePagerAdapter;
import com.example.superlotto.Utils.InfiniteViewPager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SuperLottoActivity  {
//
//    FrameLayout rlSelectedSuperballContainer;
//    TextView txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10, txt11, txt12, txt13, txt14, txt15, txt16, txt17, txt18, txt19, txt20, txt21, txt22, txt23, txt24, txt25, txt26, txt27, txt28, txt29, txt30, txt31, txt32, txt33, txt34, txt35, txtBetAmount1, txtBetAmount2, txtBetAmount3, txtBetAmount4, txtBetAmount5, txtBetAmount6, txtBetAmount7, txtBetAmount8, txtBetAmount9, txtBetAmount10, txtBetAmount11, txtBetAmount12, txtBetAmount13, txtBetAmount14, txtBetAmount15, txtBetAmount16, txtBetAmount17, txtBetAmount18, txtBetAmount19, txtBetAmount20, txtBetAmount21, txtBetAmount22, txtBetAmount23, txtBetAmount24, txtBetAmount25, txtBetAmount26, txtBetAmount27, txtBetAmount28, txtBetAmount29, txtBetAmount30, txtBetAmount31, txtBetAmount32, txtBetAmount33, txtBetAmount34, txtBetAmount35, supertxtBetAmount1, supertxtBetAmount2, supertxtBetAmount3, supertxtBetAmount4, supertxtBetAmount5, supertxtBetAmount6, supertxtBetAmount7, supertxtBetAmount8,
//            supertxtBetAmount9, supertxtBetAmount10, txtAmount, txtNextDraw, txtTotalAmount, txtSelectedSuperBall;
//    ImageView imgSelectChip6,imgSelectChip5,imgSelectChip4,imgSelectChip3,imgSelectChip2,imgSelectChip1,imgChip1, imgChip2, imgChip3, imgChip4, imgChip5, imgChip6, imgChip7, imgChip8, imgChip9, imgChip10, imgChip11, imgChip12, imgChip13, imgChip14,
//            imgChip15, imgChip16, imgChip17, imgChip18, imgChip19, imgChip20, imgChip21, imgChip22, imgChip23, imgChip24, imgChip25, imgChip26, imgChip27, imgChip28,
//            imgChip29, imgChip30, imgChip31, imgChip32, imgChip33, imgChip34, imgChip35, superimgChip1, superimgChip2, superimgChip3, superimgChip4, superimgChip5,
//            superimgChip6, superimgChip7, superimgChip8, superimgChip9, superimgChip10, superimgChip11, superimgChip12, ivQuickPick, ivClearAll, ivPlayNow, ivCancelPlay, imgSelectedSuperBall;
//    LinearLayout layoutClearAll, layoutQuickPick, layoutPlayNow, superlinearLayout1, superlinearLayout2, superlinearLayout3, superlinearLayout4, superlinearLayout5, superlinearLayout6,
//            superlinearLayout7, superlinearLayout8, superlinearLayout9, superlinearLayout10, llparent, linear0, linearSeconds;
//    HashMap<Integer, Integer> reverseNumberMapping = new HashMap<>();
//    HashMap<Integer, Integer> superballNumberMapping = new HashMap<>();
//    CheckBox checkTerms;
//    private TextView txtCommonDialogMessage, tvdiscription;
//    private int currentSelectedDrawNumber = 0;
//    private int count;
//    int number;
//    List<Integer> list = new ArrayList<>();
//    private SuperlottoViewModel superlottoViewModel;
//    ArrayList<SelectedNumber> selectedNumbers = new ArrayList<>();
//    SelectedSuperball superball = null;
//    private AvailableDrawResponse availableDrawResponse;
//    private Dialog dialog;
//    private GameDetails gameDetails;
//    private String[] amount, nextDraws;
//    private int checkedItemNextDraw, checkItemAmount;
//    private android.app.AlertDialog commonAlertDialog;
//    private TextView buttonTv;
//    private ImageView btnCommonCloseDialog;
//    private boolean isChecked = false;
//    Boolean isQP = true;
//    ImageView[] lottoImages;
//    TextView[] lottoText;
//    LinearLayout.LayoutParams params1, params2;
//    private RecyclerView recyclerSelectedNumbers;
//    private SelectedNumberSuperLottoAdapter selectedNumberSuperLottoAdapter;
//    private InfiniteViewPager viewPagerHelpTips;
//    private InfinitePagerAdapter infinitePagerAdapter;
//    private ImageView[] dots = new ImageView[DataUtils.getSuperLottohelp().size()];
//    private LinearLayout sliderDots;
//    private PickHelpAdapter pickHelpAdapter;
//    ImageView jackpotImage;
//    private CountDownTimer countDownTimer;
//    private TextView timerTv, drawNameTv, tvHr, tvSec, tvMin, nextDrawTv, txtTime, tvDay;
//    private PopupWindow popUp;
//    private View popupView;
//    private ImageView btnCTConfirm;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_super_lotto);
//        recyclerSelectedNumbers = view.findViewById(R.id.recyclerSelectedNumbers);
//        int height = (int) getResources().getDimension(R.dimen._18dp);
//        int width = (int) (getResources().getDimension(R.dimen._120dp)/7);
//        params1=  new LinearLayout
//                .LayoutParams(width, height);
//        params2 =  new LinearLayout
//                .LayoutParams(10, height);
//        params2.gravity= Gravity.BOTTOM;
//
//        txt1 = view.findViewById(R.id.txt1);
//        txt2 = view.findViewById(R.id.txt2);
//        txt3 = view.findViewById(R.id.txt3);
//        txt4 = view.findViewById(R.id.txt4);
//        txt5 = view.findViewById(R.id.txt5);
//        txt6 = view.findViewById(R.id.txt6);
//        txt7 = view.findViewById(R.id.txt7);
//        txt8 = view.findViewById(R.id.txt8);
//        txt9 = view.findViewById(R.id.txt9);
//        txt10 = view.findViewById(R.id.txt10);
//        txt11 = view.findViewById(R.id.txt11);
//        txt12 = view.findViewById(R.id.txt12);
//        txt13 = view.findViewById(R.id.txt13);
//        txt14 = view.findViewById(R.id.txt14);
//        txt15 = view.findViewById(R.id.txt15);
//        txt16 = view.findViewById(R.id.txt16);
//        txt17 = view.findViewById(R.id.txt17);
//        txt18 = view.findViewById(R.id.txt18);
//        txt19 = view.findViewById(R.id.txt19);
//        txt20 = view.findViewById(R.id.txt20);
//        txt21 = view.findViewById(R.id.txt21);
//        txt22 = view.findViewById(R.id.txt22);
//        txt23 = view.findViewById(R.id.txt23);
//        txt24 = view.findViewById(R.id.txt24);
//        txt25 = view.findViewById(R.id.txt25);
//        txt26 = view.findViewById(R.id.txt26);
//        txt27 = view.findViewById(R.id.txt27);
//        txt28 = view.findViewById(R.id.txt28);
//        txt29 = view.findViewById(R.id.txt29);
//        txt30 = view.findViewById(R.id.txt30);
//        txt31 = view.findViewById(R.id.txt31);
//        txt32 = view.findViewById(R.id.txt32);
//        txt33 = view.findViewById(R.id.txt33);
//        txt34 = view.findViewById(R.id.txt34);
//        txt35 = view.findViewById(R.id.txt35);
////        txtBetAmount1 = view.findViewById(R.id.txtBetAmount1);
////        txtBetAmount2 = view.findViewById(R.id.txtBetAmount2);
////        txtBetAmount3 = view.findViewById(R.id.txtBetAmount3);
////        txtBetAmount4 = view.findViewById(R.id.txtBetAmount4);
////        txtBetAmount5 = view.findViewById(R.id.txtBetAmount5);
////        txtBetAmount6 = view.findViewById(R.id.txtBetAmount6);
////        txtBetAmount7 = view.findViewById(R.id.txtBetAmount7);
////        txtBetAmount8 = view.findViewById(R.id.txtBetAmount8);
////        txtBetAmount9 = view.findViewById(R.id.txtBetAmount9);
////        txtBetAmount10 = view.findViewById(R.id.txtBetAmount10);
////        txtBetAmount11 = view.findViewById(R.id.txtBetAmount11);
////        txtBetAmount12 = view.findViewById(R.id.txtBetAmount12);
////        txtBetAmount13 = view.findViewById(R.id.txtBetAmount13);
////        txtBetAmount14 = view.findViewById(R.id.txtBetAmount14);
////        txtBetAmount15 = view.findViewById(R.id.txtBetAmount15);
////        txtBetAmount16 = view.findViewById(R.id.txtBetAmount16);
////        txtBetAmount17 = view.findViewById(R.id.txtBetAmount17);
////        txtBetAmount18 = view.findViewById(R.id.txtBetAmount18);
////        txtBetAmount19 = view.findViewById(R.id.txtBetAmount19);
////        txtBetAmount20 = view.findViewById(R.id.txtBetAmount20);
////        txtBetAmount21 = view.findViewById(R.id.txtBetAmount21);
////        txtBetAmount22 = view.findViewById(R.id.txtBetAmount22);
////        txtBetAmount23 = view.findViewById(R.id.txtBetAmount23);
////        txtBetAmount24 = view.findViewById(R.id.txtBetAmount24);
////        txtBetAmount25 = view.findViewById(R.id.txtBetAmount25);
////        txtBetAmount26 = view.findViewById(R.id.txtBetAmount26);
////        txtBetAmount27 = view.findViewById(R.id.txtBetAmount27);
////        txtBetAmount28 = view.findViewById(R.id.txtBetAmount28);
////        txtBetAmount29 = view.findViewById(R.id.txtBetAmount29);
////        txtBetAmount30 = view.findViewById(R.id.txtBetAmount30);
////        txtBetAmount31 = view.findViewById(R.id.txtBetAmount31);
////        txtBetAmount32 = view.findViewById(R.id.txtBetAmount32);
////        txtBetAmount33 = view.findViewById(R.id.txtBetAmount33);
////        txtBetAmount34 = view.findViewById(R.id.txtBetAmount34);
////        txtBetAmount35 = view.findViewById(R.id.txtBetAmount35);
//        supertxtBetAmount1 = view.findViewById(R.id.supertxtBetAmount1);
//        supertxtBetAmount2 = view.findViewById(R.id.supertxtBetAmount2);
//        supertxtBetAmount3 = view.findViewById(R.id.supertxtBetAmount3);
//        supertxtBetAmount4 = view.findViewById(R.id.supertxtBetAmount4);
//        supertxtBetAmount5 = view.findViewById(R.id.supertxtBetAmount5);
//        supertxtBetAmount6 = view.findViewById(R.id.supertxtBetAmount6);
//        supertxtBetAmount7 = view.findViewById(R.id.supertxtBetAmount7);
//        supertxtBetAmount8 = view.findViewById(R.id.supertxtBetAmount8);
//        supertxtBetAmount9 = view.findViewById(R.id.supertxtBetAmount9);
//        supertxtBetAmount10 = view.findViewById(R.id.supertxtBetAmount10);
//        txtAmount = view.findViewById(R.id.txtAmount);
//        txtNextDraw = view.findViewById(R.id.txtNextDraw);
//        checkTerms = view.findViewById(R.id.checkTerms);
//        txtTotalAmount = view.findViewById(R.id.txtTotalAmount);
//        llparent = view.findViewById(R.id.llparent);
//
//        imgChip1 = view.findViewById(R.id.imgChip1);
//        imgChip2 = view.findViewById(R.id.imgChip2);
//        imgChip3 = view.findViewById(R.id.imgChip3);
//        imgChip4 = view.findViewById(R.id.imgChip4);
//        imgChip5 = view.findViewById(R.id.imgChip5);
//        imgChip6 = view.findViewById(R.id.imgChip6);
//        imgChip7 = view.findViewById(R.id.imgChip7);
//        imgChip8 = view.findViewById(R.id.imgChip8);
//        imgChip9 = view.findViewById(R.id.imgChip9);
//        imgChip10 = view.findViewById(R.id.imgChip10);
//        imgChip11 = view.findViewById(R.id.imgChip11);
//        imgChip12 = view.findViewById(R.id.imgChip12);
//        imgChip13 = view.findViewById(R.id.imgChip13);
//        imgChip14 = view.findViewById(R.id.imgChip14);
//        imgChip15 = view.findViewById(R.id.imgChip15);
//        imgChip16 = view.findViewById(R.id.imgChip16);
//        imgChip17 = view.findViewById(R.id.imgChip17);
//        imgChip18 = view.findViewById(R.id.imgChip18);
//        imgChip19 = view.findViewById(R.id.imgChip19);
//        imgChip20 = view.findViewById(R.id.imgChip20);
//        imgChip21 = view.findViewById(R.id.imgChip21);
//        imgChip22 = view.findViewById(R.id.imgChip22);
//        imgChip23 = view.findViewById(R.id.imgChip23);
//        imgChip24 = view.findViewById(R.id.imgChip24);
//        imgChip25 = view.findViewById(R.id.imgChip25);
//        imgChip26 = view.findViewById(R.id.imgChip26);
//        imgChip27 = view.findViewById(R.id.imgChip27);
//        imgChip28 = view.findViewById(R.id.imgChip28);
//        imgChip29 = view.findViewById(R.id.imgChip29);
//        imgChip30 = view.findViewById(R.id.imgChip30);
//        imgChip31 = view.findViewById(R.id.imgChip31);
//        imgChip32 = view.findViewById(R.id.imgChip32);
//        imgChip33 = view.findViewById(R.id.imgChip33);
//        imgChip34 = view.findViewById(R.id.imgChip34);
//        imgChip35 = view.findViewById(R.id.imgChip35);
//        ivQuickPick = view.findViewById(R.id.ivQuickPick);
//        ivClearAll = view.findViewById(R.id.ivClearAll);
//        ivPlayNow = view.findViewById(R.id.ivPlayNow);
//        ivCancelPlay = view.findViewById(R.id.ivCancelPlay);
//        imgSelectedSuperBall = view.findViewById(R.id.imgSelectedSuperBall);
//        superimgChip1 = view.findViewById(R.id.superimgChip1);
//        superimgChip2 = view.findViewById(R.id.superimgChip2);
//        superimgChip3 = view.findViewById(R.id.superimgChip3);
//        superimgChip4 = view.findViewById(R.id.superimgChip4);
//        superimgChip5 = view.findViewById(R.id.superimgChip5);
//        superimgChip6 = view.findViewById(R.id.superimgChip6);
//        superimgChip7 = view.findViewById(R.id.superimgChip7);
//        superimgChip8 = view.findViewById(R.id.superimgChip8);
//        superimgChip9 = view.findViewById(R.id.superimgChip9);
//        superimgChip10 = view.findViewById(R.id.superimgChip10);
////        layoutClearAll = view.findViewById(R.id.layoutClearAll);
////        layoutQuickPick = view.findViewById(R.id.layoutQuickPick);
////        layoutPlayNow = view.findViewById(R.id.layoutPlayNow);
//        rlSelectedSuperballContainer = view.findViewById(R.id.rlSelectedSuperballContainer);
//        txtSelectedSuperBall = view.findViewById(R.id.txtSelectedSuperBall);
//        linear0 = view.findViewById(R.id.linear0);
//        linearSeconds = view.findViewById(R.id.linearSeconds);
//        timerTv = view.findViewById(R.id.timerTv);
//        drawNameTv = view.findViewById(R.id.drawNameTv);
//        tvHr = view.findViewById(R.id.tvHr);
//        tvDay = view.findViewById(R.id.tvDay);
//        tvMin = view.findViewById(R.id.tvMin);
//        tvSec = view.findViewById(R.id.tvSec);
//
//        checkTerms.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                SuperLottoActivity.this.isChecked = isChecked;
//            }
//        });
//        txt1.setOnClickListener(this);
//        txt2.setOnClickListener(this);
//        txt3.setOnClickListener(this);
//        txt4.setOnClickListener(this);
//        txt5.setOnClickListener(this);
//        txt6.setOnClickListener(this);
//        txt7.setOnClickListener(this);
//        txt8.setOnClickListener(this);
//        txt9.setOnClickListener(this);
//        txt10.setOnClickListener(this);
//        txt11.setOnClickListener(this);
//        txt12.setOnClickListener(this);
//        txt13.setOnClickListener(this);
//        txt14.setOnClickListener(this);
//        txt15.setOnClickListener(this);
//        txt16.setOnClickListener(this);
//        txt17.setOnClickListener(this);
//        txt18.setOnClickListener(this);
//        txt19.setOnClickListener(this);
//        txt20.setOnClickListener(this);
//        txt21.setOnClickListener(this);
//        txt22.setOnClickListener(this);
//        txt23.setOnClickListener(this);
//        txt24.setOnClickListener(this);
//        txt25.setOnClickListener(this);
//        txt26.setOnClickListener(this);
//        txt27.setOnClickListener(this);
//        txt28.setOnClickListener(this);
//        txt29.setOnClickListener(this);
//        txt30.setOnClickListener(this);
//        txt31.setOnClickListener(this);
//        txt32.setOnClickListener(this);
//        txt33.setOnClickListener(this);
//        txt34.setOnClickListener(this);
//        txt35.setOnClickListener(this);
//
//        imgChip1.setOnClickListener(this);
//        imgChip2.setOnClickListener(this);
//        imgChip3.setOnClickListener(this);
//        imgChip4.setOnClickListener(this);
//        imgChip5.setOnClickListener(this);
//        imgChip6.setOnClickListener(this);
//        imgChip7.setOnClickListener(this);
//        imgChip8.setOnClickListener(this);
//        imgChip9.setOnClickListener(this);
//        imgChip10.setOnClickListener(this);
//        imgChip11.setOnClickListener(this);
//        imgChip12.setOnClickListener(this);
//        imgChip13.setOnClickListener(this);
//        imgChip14.setOnClickListener(this);
//        imgChip15.setOnClickListener(this);
//        imgChip16.setOnClickListener(this);
//        imgChip17.setOnClickListener(this);
//        imgChip18.setOnClickListener(this);
//        imgChip19.setOnClickListener(this);
//        imgChip20.setOnClickListener(this);
//        imgChip21.setOnClickListener(this);
//        imgChip22.setOnClickListener(this);
//        imgChip23.setOnClickListener(this);
//        imgChip24.setOnClickListener(this);
//        imgChip25.setOnClickListener(this);
//        imgChip26.setOnClickListener(this);
//        imgChip27.setOnClickListener(this);
//        imgChip28.setOnClickListener(this);
//        imgChip29.setOnClickListener(this);
//        imgChip30.setOnClickListener(this);
//        imgChip31.setOnClickListener(this);
//        imgChip32.setOnClickListener(this);
//        imgChip33.setOnClickListener(this);
//        imgChip34.setOnClickListener(this);
//        imgChip35.setOnClickListener(this);
//        superimgChip1.setOnClickListener(this);
//        superimgChip2.setOnClickListener(this);
//        superimgChip3.setOnClickListener(this);
//        superimgChip4.setOnClickListener(this);
//        superimgChip5.setOnClickListener(this);
//        superimgChip6.setOnClickListener(this);
//        superimgChip7.setOnClickListener(this);
//        superimgChip8.setOnClickListener(this);
//        superimgChip9.setOnClickListener(this);
//        superimgChip10.setOnClickListener(this);
//        ivQuickPick.setOnClickListener(this);
//        ivClearAll.setOnClickListener(this);
//        ivPlayNow.setOnClickListener(this);
//        ivCancelPlay.setOnClickListener(this);
//        imgSelectedSuperBall.setOnClickListener(this);
//        imgSelectedSuperBall.setOnClickListener(this);
//        txtAmount.setOnClickListener(this);
//        addHelpBanner();
//
//    }
//    private void addHelpBanner() {
//        sliderDots = view.findViewById(R.id.sliderDots);
//        viewPagerHelpTips = view.findViewById(R.id.viewPagerHelpTips);
//        pickHelpAdapter = new PickHelpAdapter(getContext(), DataUtils.getSuperLottohelp(), R.color.strokeColor, R.color.white);
//        infinitePagerAdapter = new InfinitePagerAdapter(pickHelpAdapter);
//        viewPagerHelpTips.setAdapter(infinitePagerAdapter);
//
//        for (int i = 0; i < dots.length; i++) {
//            dots[i] = new ImageView(getContext());
//            dots[i].setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.non_active_dot));
//            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
//            params.setMargins(8, 0, 8, 0);
//            sliderDots.addView(dots[i], params);
//        }
//
//        dots[0].setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.active_dot_super_lotto));
//        viewPagerHelpTips.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//                position = position % DataUtils.getSuperLottohelp().size();
//                for (int i = 0; i < dots.length; i++) {
//                    dots[i].setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.non_active_dot));
//                }
//                dots[position].setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.active_dot_super_lotto));
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//            }
//        });
//    }
//
//    @Override
//    public void onClick(View view) {
//
//    }
}