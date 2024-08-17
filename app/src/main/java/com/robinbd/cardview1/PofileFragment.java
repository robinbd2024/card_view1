package com.robinbd.cardview1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class PofileFragment extends Fragment {
    Button data;
    TextView tvdata;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View myview =inflater.inflate(R.layout.fragment_pofile, container, false);
        data =myview.findViewById(R.id.data);
        tvdata =myview.findViewById(R.id.tvdata);

        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             SharedPreferences sharedPreferences = getActivity().getSharedPreferences("userdettres",Context.MODE_PRIVATE);
             String getusername = sharedPreferences.getString("emailkey","no data avallable");
             String getpassword = sharedPreferences.getString("passwordkey","no data");
             tvdata.append("email is "+getusername+"\n");
             tvdata.append("password is "+getpassword);

            }

        });



        return myview;
    }
}