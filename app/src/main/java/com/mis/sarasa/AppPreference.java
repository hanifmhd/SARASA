package com.mis.sarasa;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Hanifmhd on 14/11/2017.
 */

public class AppPreference {
    public static final String PREF_NAME = "mykamus";
    public static final String PREF_FIRST_RUN = "first_run";

    private SharedPreferences mSharedPreferences;

    public AppPreference(Context context) {
        mSharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

    public void setFirstRun(boolean firstRun){
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putBoolean(PREF_FIRST_RUN, firstRun);
        editor.commit();
    }

    public boolean isFirstRun(){
        return mSharedPreferences.getBoolean(PREF_FIRST_RUN, true);
    }
}
