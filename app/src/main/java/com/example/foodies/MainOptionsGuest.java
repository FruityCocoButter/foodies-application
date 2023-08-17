package com.example.foodies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainOptionsGuest extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_options_guest);

        Button menuButton = (Button) findViewById(R.id.button2);
        menuButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), VendorInfo.class);
                view.getContext().startActivity(intent);
            }
        });

        Button infoButton = (Button) findViewById(R.id.button5);
        infoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), VendorMenu.class);
                view.getContext().startActivity(intent);
            }
        });
    }
}
