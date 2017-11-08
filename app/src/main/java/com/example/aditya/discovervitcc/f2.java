package com.example.aditya.discovervitcc;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class f2 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private String m;


    public f2() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_f2, container, false);
        TextView i5=(TextView) view.findViewById(R.id.i5);
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1= new Intent(getActivity(),details.class);
                m="e";
                in1.putExtra("x",m);
                startActivity(in1);
            }
        });
        TextView i6=(TextView) view.findViewById(R.id.i6);
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1= new Intent(getActivity(),details.class);
                m="f";
                in1.putExtra("x",m);
                startActivity(in1);
            }
        });
        TextView i7=(TextView) view.findViewById(R.id.i7);
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1= new Intent(getActivity(),details.class);
                m="g";
                in1.putExtra("x",m);
                startActivity(in1);
            }
        });
        TextView i8=(TextView) view.findViewById(R.id.i8);
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1= new Intent(getActivity(),details.class);
                m="h";
                in1.putExtra("x",m);
                startActivity(in1);
            }
        });

        return view;
    }
}
