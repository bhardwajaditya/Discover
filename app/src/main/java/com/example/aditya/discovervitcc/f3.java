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


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link f3.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link f3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class f3 extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private String m;

    public f3() {
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
        View view= inflater.inflate(R.layout.fragment_f3, container, false);
        TextView i9=(TextView) view.findViewById(R.id.i9);
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1= new Intent(getActivity(),details.class);
                m="i";
                in1.putExtra("x",m);
                startActivity(in1);
            }
        });
        TextView i10=(TextView) view.findViewById(R.id.i10);
        i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1= new Intent(getActivity(),details.class);
                m="j";
                in1.putExtra("x",m);
                startActivity(in1);
            }
        });
        TextView i11=(TextView) view.findViewById(R.id.i11);
        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1= new Intent(getActivity(),details.class);
                m="k";
                in1.putExtra("x",m);
                startActivity(in1);
            }
        });
        TextView i12=(TextView) view.findViewById(R.id.i12);
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1= new Intent(getActivity(),details.class);
                m="l";
                in1.putExtra("x",m);
                startActivity(in1);
            }
        });
        return view;
    }
}