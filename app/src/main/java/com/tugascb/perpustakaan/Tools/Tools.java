package com.tugascb.perpustakaan.Tools;

import android.content.Context;


public class Tools {

    public static int dpToPx(Context context, float dp) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return Math.round(dp * scale);
    }
}
