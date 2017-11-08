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


public class f1 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private String m;


    public f1() {
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
        View view= inflater.inflate(R.layout.fragment_f1, container, false);
        TextView i1=(TextView) view.findViewById(R.id.i1);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1= new Intent(getActivity(),details.class);
                m="a";
                in1.putExtra("x",m);
                startActivity(in1);
            }
        });
        TextView i2=(TextView) view.findViewById(R.id.i2);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1= new Intent(getActivity(),details.class);
                m="b";
                in1.putExtra("x",m);
                startActivity(in1);
            }
        });
        TextView i3=(TextView) view.findViewById(R.id.i3);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1= new Intent(getActivity(),details.class);
                m="c";
                in1.putExtra("x",m);
                startActivity(in1);
            }
        });
        TextView i4=(TextView) view.findViewById(R.id.i4);
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1= new Intent(getActivity(),details.class);
                m="d";
                in1.putExtra("x",m);
                startActivity(in1);
            }
        });
        return view;
    }
}
