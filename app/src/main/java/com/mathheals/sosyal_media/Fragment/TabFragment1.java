package com.mathheals.sosyal_media.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mathheals.sosyal_media.HomePage;
import com.mathheals.sosyal_media.Login;
import com.mathheals.sosyal_media.R;

/**
 * Created by kadirhan on 18.06.2017.
 */

public class TabFragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_fragment_1, container, false);

        return rootView;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent a=new Intent(getActivity(),HomePage.class);
        startActivity(a);

    }

}