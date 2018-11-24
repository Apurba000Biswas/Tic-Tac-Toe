package com.example.apurba.tic_tac_toe.Helper;

import android.support.v7.app.ActionBar;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;

import com.example.apurba.tic_tac_toe.R;

public class CustomStyle {


    public static void setCustomAppBar(Context context, ActionBar bar){
        SpannableString s = new SpannableString(context.getResources()
                .getString(R.string.app_name));
        s.setSpan(new ForegroundColorSpan(context.getResources()
                        .getColor(R.color.Applevel)),
                0,
                s.length(),
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        bar.setTitle(s);
        bar.setElevation(0);
    }
}
