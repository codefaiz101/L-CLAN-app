package com.example.l_clan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;

public class userprofile extends AppCompatActivity {
    TextInputEditText showusername;
    Button logout;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userprofile);
        logout = findViewById(R.id.logout);
        showusername = findViewById(R.id.showusername);
        showuserdata();
    }

    private void showuserdata() {
        Intent intent = getIntent();
        String usernamefromintent = intent.getStringExtra("username2");
        showusername.setText(usernamefromintent);
    }
    public void startlearning(View view){
        Intent intent = new Intent(userprofile.this,ListDomainActivity.class);
        startActivity(intent);
    }
    public void logout(View view){
        mAuth.signOut();
        startActivity(new Intent(userprofile.this,Dashboard.class));

    }
}