package com.example.foodies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class AccountDetails extends AppCompatActivity {

    private Student[] students = {new Student("sibusiso","madlala","mdlscf023","123")
            ,new Student("Sipho","Mpofu","mpfsip001","3223")};
    private Staff[] staff = {new Staff("Kgaugelo","Bopape","323232")};
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

        int i=0;
        for (Student student: students){

            if (student.equals(students[i])){

                Log.i("AccountDetails", student.getName() +" " +student.getSurname()+" has logged in");

            }
            i++;
        }

        int j=0;
        for (Staff staff1: staff){

            if (staff1.equals(staff[j])){

                Log.i("AccountDetails", "Staff "+staff1.getName() +" " +staff1.getSurname()+" has logged in");

            }

            j++;
        }




    }


}
