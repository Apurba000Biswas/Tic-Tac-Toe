package com.example.apurba.tic_tac_toe.Styles;

import android.support.v7.app.ActionBar;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.apurba.tic_tac_toe.R;

public class CustomStyle {

    private CustomStyle(){
    }

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

    public static void setRightAnimationToTextView(Context context, TextView textView){
        final Animation tvAnimation = AnimationUtils.loadAnimation(context, R.anim.slide_right);
        tvAnimation.setDuration(500);
        textView.startAnimation(tvAnimation);
    }

    public static void setLeftAnimationToTextView(Context context, TextView textView){
        final Animation tvAnimation = AnimationUtils.loadAnimation(context, R.anim.slide_left);
        tvAnimation.setDuration(500);
        textView.startAnimation(tvAnimation);
    }

    public static void setBotomRightAnimationToTextView(Context context, TextView textView){
        final Animation tvAnimation = AnimationUtils.loadAnimation(context, R.anim.slide_botom_right);
        tvAnimation.setDuration(800);
        textView.startAnimation(tvAnimation);
    }
}
