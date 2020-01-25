package com.example.manulapplication;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityTwo extends AppCompatActivity {

    private EditText loginEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        loginEditText = findViewById(R.id.et_login);
        passwordEditText = findViewById(R.id.et_password);
        Button signInButton = findViewById(R.id.btn_sign_in);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login = loginEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if (TextUtils.isEmpty(login)) {
                    loginEditText.setError("Cannot be empty!");
                    return;
                } else {
                    loginEditText.setError(null);
                }

                if (TextUtils.isEmpty(password)) {
                    passwordEditText.setError("Cannot be empty!");
                    return;
                } else {
                    passwordEditText.setError(null);
                }
                String text = "Login: " + login + " Password: " + password;
                Toast.makeText(MainActivityTwo.this, text, Toast.LENGTH_LONG).show();
            }
        });
    }
}