package com.ziri.manager;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.ziri.R;

/**
 * (c) 2013 Mahfoud Bouziri 
 * (c) ZiriKids games & applications.
 * 
 * @author Mahfoud Bouziri
 * @since 20 nov. 2013
 * @project ZiriKids
 */

public class Preferences extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.prefs);
    }
}