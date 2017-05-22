package com.starkindustry.tonystark.sunset;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Tony Stark on 5/22/2017.
 */

public class SunsetFragment extends Fragment {
    //Method for constructing new instance
    public static SunsetFragment newInstance(){
        return new SunsetFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_sunset, container, false);
        return  view;
    }
}
