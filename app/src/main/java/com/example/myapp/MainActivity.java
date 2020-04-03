package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MainActivity extends AppCompatActivity {
    private EditText emailEditText;
    private EditText passEditText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.btnlogin);

        emailEditText =(EditText)findViewById(R.id.txtusername);
        passEditText =(EditText)findViewById(R.id.txtpassword);
    }
    public void checklogin(View arg0) {
        final String email = emailEditText.getText().toString();
        if (!isValidEmail(email)) {
            emailEditText.setError("Email Tidak Valid");
        }
        final String pass = passEditText.getText().toString();
        if (!isValidPassword(pass)) {
            passEditText.setError("Password tidak boleh kosong / lebih atau sama dengan 4 karakter");
        }
        if (isValidEmail(email) && isValidPassword(pass)) {
            Toast.makeText(getApplicationContext(), "Anda berhasil login ",Toast.LENGTH_LONG).show();
            Intent ExplicitIntent=new Intent(MainActivity.this, Activity2.class);
            startActivity(ExplicitIntent);
        }
    }

    public boolean isValidPassword (String password) {
        if (password != null && password.length() >= 4) {
            return true;
        }
        return false;
    }
    public boolean isValidEmail (String email) {
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
