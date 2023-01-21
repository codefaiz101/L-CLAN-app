package com.example.l_clan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.sql.Struct;
import android.app.Activity;

public class signup_page extends AppCompatActivity {
    Button gotologin,go2, vrfphn ;
    TextInputLayout fullname2,username2,email2,password2,phoneno2;
    FirebaseDatabase rootnode;
    DatabaseReference reference;

    public static Activity myActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);
        gotologin = findViewById(R.id.gotologin2);
        go2 = findViewById(R.id.go2);
        go2.setEnabled(false);
        fullname2 = findViewById(R.id.fullname2);
        username2 = findViewById(R.id.username2);
        email2 = findViewById(R.id.email2);
        phoneno2 = findViewById(R.id.phoneno2);
        password2 = findViewById(R.id.password2);
//        vrfphn = findViewById(R.id.vrfphn);
        gotologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signup_page.this,Dashboard.class);
                startActivity(intent);
            }
        });
    }
    private boolean validatefullname2(){
        String val = fullname2.getEditText().getText().toString();

        if (val.isEmpty()){
            fullname2.setError("field cannot be empty");
            return false;
        }
        else{
            fullname2.setError(null);
            fullname2.setErrorEnabled(false);
            return true;
        }
    }
    private boolean validateusername2(){
        String val = username2.getEditText().getText().toString();
        String whitespaces = "\\A\\w{4,20}\\z";

        if (val.isEmpty()){
            username2.setError("field cannot be empty");
            return false;
        }
        else if (val.length()>=15){
            username2.setError("minimum length 15 allowed");
            return false;
        }
        else if (!val.matches(whitespaces)){
            username2.setError("no whitespaces allowed");
            return false;
        }
        else{
            username2.setError(null);
            username2.setErrorEnabled(false);
            return true;
        }
    }
    private boolean validatemail2(){
        String val = email2.getEditText().getText().toString();
        String emailpattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

        if (val.isEmpty()){
            email2.setError("field cannot be empty");
            return false;
        }
        else if (!val.matches(emailpattern)){
            email2.setError("pls enter valid email");
            return  false;
        }
        else{
            email2.setError(null);
            email2.setErrorEnabled(false);
            return true;
        }
    }
    private boolean validatephoneno2(){
        String val = phoneno2.getEditText().getText().toString();

        if (val.isEmpty()){
            phoneno2.setError("field cannot be empty");
            return false;
        }
        else if (val.length()>10){
            phoneno2.setError("enter valid phone no");
            return false;
        }
        else if (val.length()<10){
            phoneno2.setError("enter valid phone no");
            return false;
        }
        else{
            phoneno2.setError(null);
            phoneno2.setErrorEnabled(false);
            return true;
        }
    }
    private boolean validatenamepassword2(){
        String val = password2.getEditText().getText().toString();
        String passwordVal = "^" +
//                "(?=.*[0-9])" +         //at least 1 digit
//                "(?=.*[a-z])" +         //at least 1 lower case letter
//                "(?=.*[A-Z])" +         //at least 1 upper case letter
//                "(?=.*[a-zA-Z])" +      //any letter
//                "(?=.*[@#$%^&+=])" +    //at least 1 special character
//                "\\A\\w{4,20}\\z" +           //no white spaces
                ".{4,}"               //at least 4 characters
//               +  "$";
        ;

        if (val.isEmpty()){
            password2.setError("field cannot be empty");
            return false;
        }
        else if (!val.matches(passwordVal)){
            password2.setError("password is too weak");
            return  false;
        }
        else{password2.setError(null);
            password2.setErrorEnabled(false);
            return true;
        }
    }

    public void verifyphone(View view){
        //if not validated  then return
        if (!validatefullname2() | !validateusername2() | !validatemail2() | !validatephoneno2() | !validatenamepassword2() ){
            return;
        }
        //goto phone verify
        String phoneno = phoneno2.getEditText().getText().toString();
        Intent intent = new Intent(signup_page.this,phnnovrf.class);
        intent.putExtra("phoneno",phoneno);
        startActivity(intent);
    }
    public void doneverify(View view){
        go2.setEnabled(true);
        Toast.makeText(this, "You can now register", Toast.LENGTH_SHORT).show();
    }
    public void registeruser(View view){
        //if not validated  then return
        if (!validatefullname2() | !validateusername2() | !validatemail2() | !validatephoneno2() | !validatenamepassword2() ){
            return;
        }
        //initialize all
        String fullname = fullname2.getEditText().getText().toString();
        String username = username2.getEditText().getText().toString();
        String email = email2.getEditText().getText().toString();
        String phoneno = phoneno2.getEditText().getText().toString();
        String password = password2.getEditText().getText().toString();

        //just declared rootnode
        rootnode = FirebaseDatabase.getInstance();
        reference = rootnode.getReference("users");

        //add to database
        UserHelperClass helperClass = new UserHelperClass(fullname,username,email,phoneno,password);
        reference.child(username).setValue(helperClass);

        //set feild null again
        fullname2.getEditText().setText(null);
        username2.getEditText().setText(null);
        email2.getEditText().setText(null);
        phoneno2.getEditText().setText(null);
        password2.getEditText().setText(null);
        //set "already have an account" text to login
        gotologin.setText("login");

        //show toast of success
        Toast.makeText(this, "successfully registered", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "now you can login", Toast.LENGTH_SHORT).show();

    }
}