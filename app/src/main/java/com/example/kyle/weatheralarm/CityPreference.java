package com.example.kyle.weatheralarm;

import android.app.Activity;
import android.content.SharedPreferences;

public class CityPreference {

    SharedPreferences prefs;

    public CityPreference(Activity activity)
    {
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    String getCity()
    {
        return prefs.getString("city", "Irvine");
    }

    void setCity(String city)
    {
        String city2 = city.replaceAll("\\s","");
        prefs.edit().putString("city", city2).commit();
    }
}
