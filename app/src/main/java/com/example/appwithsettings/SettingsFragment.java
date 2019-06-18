package com.example.appwithsettings;


import android.os.Bundle;
import android.preference.Preference;
import android.support.v4.app.Fragment;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {

        //Associate with the Preferences XML
        setPreferencesFromResource(R.xml.preferences,rootKey);

    }
}
