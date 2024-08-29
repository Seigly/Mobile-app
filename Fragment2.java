package com.example.skinelixirfire;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class Fragment2 extends Fragment {

    Activity fragment1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragment1=getActivity();
        return inflater.inflate(R.layout.fragment_2, container, false);
    }
    public void onStart()
    {
        super.onStart();

            }

    }
