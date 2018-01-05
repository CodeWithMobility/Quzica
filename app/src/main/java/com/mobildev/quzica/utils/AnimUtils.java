package com.mobildev.quzica.utils;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;

/**
 * Created by Manu on 1/5/2018.
 */

public class AnimUtils {



    public static void alphaAnimation(View holder) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator anim = ObjectAnimator.ofFloat(holder,"alpha",0,1f);
        ObjectAnimator animTranslateX = ObjectAnimator.ofFloat(holder, "translationX",70 , 0);
        animatorSet.playTogether(anim,animTranslateX);
        animatorSet.setInterpolator(new AccelerateInterpolator());
        animatorSet.setDuration(800);
        animatorSet.start();
    }


}
