package com.example.challengetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickRegister(View view){
        TextView txtFirstName = findViewById(R.id.txtFirstName);
        TextView txtLastName =  findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);

        EditText editTxtFirst = findViewById(R.id.editFirstName);
        EditText editTxtLast = findViewById(R.id.editLastName);
        EditText editTxtEmail = findViewById(R.id.editEmail);

        txtFirstName.setText("First Name:" + editTxtFirst.getText().toString());
        txtLastName.setText("Last Name:" + editTxtLast.getText().toString());
        txtEmail.setText("Email:"+editTxtEmail.getText().toString());



    }
}