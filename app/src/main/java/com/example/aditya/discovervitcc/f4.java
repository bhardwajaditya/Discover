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
public class f4 extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private String m;

    public f4() {
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
        View view= inflater.inflate(R.layout.fragment_f4, container, false);
        TextView i13=(TextView) view.findViewById(R.id.i13);
        i13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1= new Intent(getActivity(),details.class);
                m="m";
                in1.putExtra("x",m);
                startActivity(in1);
            }
        });
        TextView i14=(TextView) view.findViewById(R.id.i14);
        i14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1= new Intent(getActivity(),details.class);
                m="n";
                in1.putExtra("x",m);
                startActivity(in1);
            }
        });
        TextView i15=(TextView) view.findViewById(R.id.i15);
        i15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1= new Intent(getActivity(),details.class);
                m="o";
                in1.putExtra("x",m);
                startActivity(in1);
            }
        });
        TextView i16=(TextView) view.findViewById(R.id.i16);
        i16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1= new Intent(getActivity(),details.class);
                m="p";
                in1.putExtra("x",m);
                startActivity(in1);
            }
        });
        return view;
    }
}