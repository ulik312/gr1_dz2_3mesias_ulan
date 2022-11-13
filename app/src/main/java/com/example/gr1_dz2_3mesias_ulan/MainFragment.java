package com.example.gr1_dz2_3mesias_ulan;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.renderscript.Sampler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.google.android.material.button.MaterialButton;


public class MainFragment extends Fragment {

    Integer cont = 0;
    private MaterialButton Plus, minus;
    TextView Null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Plus = view.findViewById(R.id.bTN_plus);
        minus = view.findViewById(R.id.btn_minus);
        Null = view.findViewById(R.id.Null);

        Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont = Integer.parseInt(Null.getText().toString()) + 1;
                Null.setText(cont.toString());
            }
        });
        minus.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                cont = Integer.parseInt(Null.getText().toString()) - 1;
                Null.setText(cont.toString());
            }
        });
    }
}