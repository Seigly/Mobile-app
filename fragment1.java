package com.example.skinelixirfire;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


public class fragment1 extends Fragment {

 Activity fragment1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragment1=getActivity();
        return inflater.inflate(R.layout.fragment_fragment1, container, false);
    }
    public void onStart()
    {
        super.onStart();
        ImageButton btn=(ImageButton) fragment1.findViewById(R.id.imageButton5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(fragment1,extremefair.class);
                startActivity(intent);
            }
        });
    }
}