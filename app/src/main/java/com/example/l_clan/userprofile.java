package com.example.l_clan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.google.firebase.auth.FirebaseAuth;

public class userprofile extends AppCompatActivity {
    TextView showusername;
    Button logout;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userprofile);
        logout = findViewById(R.id.logout);
        showusername = findViewById(R.id.showusername);
        mAuth = FirebaseAuth.getInstance();

        showusernamefun();
    }

    private void showusernamefun() {
        Intent intent = getIntent();
        String usernamefromintent = intent.getStringExtra("username2");
        showusername.setText(usernamefromintent);
    }
<<<<<<< HEAD
    public void startlearning(View view){
        Intent intent = new Intent(userprofile.this,ListDomainActivity.class);
=======

    public void startlearning(View view) {
        Intent intent = new Intent(userprofile.this, first_page.class);
>>>>>>> 378c04becd83ccddab0faa2b6668349f7a89ecc0
        startActivity(intent);
    }

    public void logout(View view) {
        mAuth.signOut();
        startActivity(new Intent(userprofile.this, Dashboard.class));
        finish();


    }
}