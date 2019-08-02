package com.example.amanbansal.testingapp;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

public class LayoutHelper {
    public static float getPx(Context context, int dp) {
        Resources r = context.getResources();
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics());
    }
}
