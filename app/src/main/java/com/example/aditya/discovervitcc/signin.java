package com.example.aditya.discovervitcc;

import android.nfc.Tag;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import static com.example.aditya.discovervitcc.R.id.r1;
import static com.example.aditya.discovervitcc.R.id.signin;

public class signin extends AppCompatActivity {
    private Button b1,b2,b3;
    RelativeLayout r1,r2;
    private FirebaseAuth mAuth;
    EditText e1,e2,e3,e4,e5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        r1=(RelativeLayout)findViewById(R.id.r1);
        r2=(RelativeLayout)findViewById(R.id.r2);
        b1=(Button)findViewById(R.id.s1);
        b2=(Button)findViewById(R.id.signup);
        b3=(Button)findViewById(R.id.signin);
        mAuth = FirebaseAuth.getInstance();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r1.setVisibility(View.INVISIBLE);
                r2.setVisibility(View.VISIBLE);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registeruser();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signinusers();
            }
        });

    }

    public void registeruser(){
        mAuth = FirebaseAuth.getInstance();
        e1=(EditText)findViewById(R.id.email1);
        e2=(EditText)findViewById(R.id.pass1);
        e3=(EditText)findViewById(R.id.pass2);
        String email=e1.getText().toString();
        String password=e2.getText().toString();
        String password1=e3.getText().toString();
        if(TextUtils.isEmpty(email)){
            Toast.makeText(this,"Please enter email",Toast.LENGTH_LONG).show();
            return;
        }

        if(TextUtils.isEmpty(password)){
            Toast.makeText(this,"Please enter password",Toast.LENGTH_LONG).show();
            return;
        }


    mAuth.createUserWithEmailAndPassword(email, password)
    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
        @Override
        public void onComplete(@NonNull Task<AuthResult> task) {
            if(task.isSuccessful()){
                Toast.makeText(signin.this,"Account Created",Toast.LENGTH_LONG).show();
            }
            // If sign in fails, display a message to the user. If sign in succeeds
            // the auth state listener will be notified and logic to handle the
            // signed in user can be handled in the listener.
            if (!task.isSuccessful()) {
                Toast.makeText(signin.this, "Authentication failed.",
                        Toast.LENGTH_SHORT).show();
            }

            // ...
        }
    });}

    public void signinusers(){
        e4=(EditText)findViewById(R.id.email);
        e5=(EditText)findViewById(R.id.password);
        String email=e4.getText().toString();
        String password=e5.getText().toString();
        if(TextUtils.isEmpty(email)){
            Toast.makeText(this,"Please enter email",Toast.LENGTH_LONG).show();
            return;
        }

        if(TextUtils.isEmpty(password)){
            Toast.makeText(this,"Please enter password",Toast.LENGTH_LONG).show();
            return;
        }


        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(signin.this,"Signin complete",Toast.LENGTH_LONG).show();
                        }

                        // If sign in fails, display a message to the user. If sign in succeeds
                        // the auth state listener will be notified and logic to handle the
                        // signed in user can be handled in the listener.
                        if (!task.isSuccessful()) {
                            Toast.makeText(signin.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                        }

                        // ...
                    }
                });
    }
}
