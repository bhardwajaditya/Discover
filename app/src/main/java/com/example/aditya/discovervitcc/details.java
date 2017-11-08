package com.example.aditya.discovervitcc;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import static com.example.aditya.discovervitcc.R.id.c1;

public class details extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap gmap;
    private String x,y,z;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Toolbar toolbar1 = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar1);
        CollapsingToolbarLayout ct=(CollapsingToolbarLayout)findViewById(R.id.toolbar_layout);
        TextView c2=(TextView)findViewById(R.id.c2);
        TextView c3=(TextView)findViewById(R.id.c3);
        TextView d1=(TextView)findViewById(R.id.d1);
        String i=getIntent().getStringExtra("x");
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(details.this);
        if(i.equals("a")){
            c2.setText("good");
            ct.setTitle("Zoo");

        }
        if(i.equals("b")){
            c2.setText("bad");
        }

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        gmap=googleMap;
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        googleMap.getUiSettings().setZoomGesturesEnabled(true);
        final LatLng TutorialsPoint = new LatLng(12.857931, 80.246068);
        Marker TP = googleMap.addMarker(new MarkerOptions()
                .position(TutorialsPoint).title("Mayajaal"));
    }
}
