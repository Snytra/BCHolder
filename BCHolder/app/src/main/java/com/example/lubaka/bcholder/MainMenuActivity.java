package com.example.lubaka.bcholder;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainMenuActivity extends AppCompatActivity implements View.OnClickListener {

    Button welcomeText;
    Button profilePicture;
    Button cardsButton;
    Button searchButton;
    Button createButton;
    Button options;
    Button shareButton;
    Button logoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
        welcomeText = (Button) findViewById(R.id.welcomeText);
        welcomeText.setOnClickListener(this);

        profilePicture = (Button) findViewById(R.id.profilePicture);
        profilePicture.setOnClickListener(this);

        cardsButton = (Button) findViewById(R.id.cardsButton);
        cardsButton.setOnClickListener(this);

        searchButton = (Button) findViewById(R.id.searchButton);
        searchButton.setOnClickListener(this);

        createButton = (Button) findViewById(R.id.createButton);
        createButton.setOnClickListener(this);

        options = (Button) findViewById(R.id.options);
        options.setOnClickListener(this);

        shareButton = (Button) findViewById(R.id.shareButton);
        shareButton.setOnClickListener(this);

        logoButton = (Button) findViewById(R.id.logoButton);
        logoButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.profilePicture) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.cardsButton) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.searchButton) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.createButton) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.options) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.shareButton) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.logoButton) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}
