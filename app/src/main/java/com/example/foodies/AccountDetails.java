package com.example.foodies;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AccountDetails extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_details);
        EditText st_num = (EditText) findViewById(R.id.st_num);
        EditText pass_word = (EditText) findViewById(R.id.password);
        String person_number = st_num.getText().toString();
        String password = pass_word.getText().toString();
    }

    public void submitButtonHandler(View view){

    }
}
