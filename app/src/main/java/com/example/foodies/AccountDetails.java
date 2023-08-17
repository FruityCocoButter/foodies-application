package com.example.foodies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class AccountDetails extends AppCompatActivity {
    private Student[] students;
    private Staff[] staff;
    /*
    private int num_students = 0;
    private int num_

     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_details);

    }

    public void submitButtonHandler(View view){
        Intent intent = new Intent(view.getContext(), MainOptions.class);
        view.getContext().startActivity(intent);
        EditText st_num = (EditText) findViewById(R.id.st_num);
        EditText pass_word = (EditText) findViewById(R.id.password);
        String person_number = st_num.getText().toString();
        String password = pass_word.getText().toString();
        Log.i("AccountDetails", person_number + " " + password);


    }
}
